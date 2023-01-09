package mission;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dbutil.ConnectionProvider;

public class missionSelectImpl implements missionSelect{	
	//미션 랜덤 뽑기, 새로고침
	@Override
	public Missions RandomMission(String c, int t) {
		Random random = new Random();
		int num = 0;
		if(t == 1) {
			num = random.nextInt(20);
		} else if(t == 7) {
			num = random.nextInt(12);
		}
		String sql = "SELECT * from missions where classify = ? and term = ?";
		List<Missions> list = new ArrayList<>();
		try(Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, c);
			pstmt.setInt(2, t);
			
			try(ResultSet rs = pstmt.executeQuery()) {
				while(rs.next()) {
					int mission_id = rs.getInt("mission_id");
					String classify = rs.getString("classify");
					String mission = rs.getString("mission");
					int term = rs.getInt("term");
					
					list.add(new Missions(mission_id,classify,mission,term));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list.get(num);
	}

	// 미션 선택지 꺼내오기
	@Override
	public List<Missions> getSelectMission(int user_pk, String cl, int t) {
		String sql = "SELECT * from user_select where user_pk = ? and term = ? and classify = ?";
		List<Missions> list = new ArrayList<>();
		try(Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, user_pk);
			pstmt.setInt(2, t);
			pstmt.setString(3, cl);
			try(ResultSet rs = pstmt.executeQuery()) {
				while(rs.next()) {
					int mission_id = rs.getInt("mission_id");
					String classify = rs.getString("classify");
					String mission = rs.getString("mission");
					int term = rs.getInt("term");
					
					list.add(new Missions(mission_id,classify,mission,term));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// 미션 선택지 저장하기
	@Override
	public void setSelectMission(int user_pk, Missions m) {
		String sql = "INSERT INTO user_select (user_pk,mission_id,classify,mission,term) values (?,?,?,?,?)";
		try(Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, user_pk);
			pstmt.setInt(2, m.getMission_id());
			pstmt.setString(3, m.getClassify());
			pstmt.setString(4, m.getMission());
			pstmt.setInt(5, m.getTerm());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// 미션 선택지 업데이트
	@Override
	public void updateSelectMission(int user_pk, String mission, Missions m) {
		String sql = "UPDATE user_select SET mission_id = ?, classify = ?, mission = ?, term = ? where mission = ? and user_pk = ?";
		try(Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, m.getMission_id());
			pstmt.setString(2, m.getClassify());
			pstmt.setString(3, m.getMission());
			pstmt.setInt(4, m.getTerm());
			pstmt.setString(5, mission);
			pstmt.setInt(6, user_pk);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	// 미션 몇갠지 확인
	@Override
	public boolean checkMission(int user_pk, int term) {
		String sql = "SELECT count(*) as cnt from user_missions where user_pk = ? and term = ?";
		try(Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, user_pk);
			pstmt.setInt(2, term);
			try(ResultSet rs = pstmt.executeQuery()) {
				if(rs.next()) {
					int cnt = rs.getInt("cnt");
					if(term == 1 && cnt < 6 ) {
						return true;
					} else if (term == 7 && cnt < 3) {
						return true;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// 수락한 미션 테이블에 넣기
	@Override
	public int insertMission(int user_pk, String classify, String mission, int term) {
		String sql = "INSERT INTO user_missions(user_pk,classify,mission,term)"
				+ "values (?,?,?,?)";
		try(Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, user_pk);
			pstmt.setString(2, classify);
			pstmt.setString(3, mission);
			pstmt.setInt(4, term);

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	
	// 미션 라벨에 나타내기
	@Override
	public List<Missions> userMission(int user_pk, int t) {
		String sql = "SELECT * from user_missions where user_pk = ? and term = ?";
		List<Missions> list = new ArrayList<>();
		try(Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, user_pk);
			pstmt.setInt(2, t);
			
			try(ResultSet rs = pstmt.executeQuery()){
				while(rs.next()) {
					int mission_id = rs.getInt("mission_id");
					String classify = rs.getString("classify");
					String mission = rs.getString("mission");
					int term = rs.getInt("term");
					
					list.add(new Missions(mission_id, classify, mission, term));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 달성한 미션 포인트,스텟 올리기(테이블 빼내기) + ******cancelMission같이 써야함******
	@Override
	public void successMission(int user_pk, int term, String classify) {
		String sql = "UPDATE userinfo SET point = point + ?, "
				+ "health = health + ?, intelligence = intelligence + ?, talent = talent + ? "
				+ "where user_pk = ?";
		try(Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			if(term == 1) {
				pstmt.setInt(1, 10);				
				if (classify.equals("운동")) {
					pstmt.setInt(2, 100);
					pstmt.setInt(3, 0);
					pstmt.setInt(4, 0);
				}else if (classify.equals("공부")) {
					pstmt.setInt(2, 0);
					pstmt.setInt(3, 100);
					pstmt.setInt(4, 0);
				}else if (classify.equals("취미")) {
					pstmt.setInt(2, 0);
					pstmt.setInt(3, 0);
					pstmt.setInt(4, 100);
				}
			}else if(term == 7) {
				pstmt.setInt(1, 100);
				if (classify.equals("운동")) {
					pstmt.setInt(2, 200);
					pstmt.setInt(3, 0);
					pstmt.setInt(4, 0);
				}else if (classify.equals("공부")) {
					pstmt.setInt(2, 0);
					pstmt.setInt(3, 200);
					pstmt.setInt(4, 0);
				}else if (classify.equals("취미")) {
					pstmt.setInt(2, 0);
					pstmt.setInt(3, 0);
					pstmt.setInt(4, 200);
				}
			}
			pstmt.setInt(5, user_pk);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	// 미션포기(테이블에 빼내기)
	@Override
	public void cancelMission(int user_pk, String mission) {
		String sql = "delete from user_missions where mission = ? and user_pk = ?";
		try(Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, mission);
			pstmt.setInt(2, user_pk);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// 종목확인
	@Override
	public String getClassify(String mission) {
		String sql = "select classify from user_missions where mission = ?";
		try(Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, mission);
			try(ResultSet rs = pstmt.executeQuery()) {
				if(rs.next()) {
					return rs.getString("classify");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
		}
		return null;
	}

	// 포인트 빼기
	@Override
	public void usePoint(int user_pk, int point) {
		String sql = "UPDATE userinfo SET point = point - ? where user_pk = ?";
		try(Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, point);
			pstmt.setInt(2, user_pk);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 포인트 확인하기
	@Override
	public boolean checkPoint(int user_pk, int p) {
		String sql = "SELECT user_pk, point FROM userinfo WHERE user_pk = ? ";
		
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)){
				stmt.setInt(1, user_pk);
			
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					int point = rs.getInt("point");
					if (point - p >= 0) {
						return true;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	

	// 진행중인미션 db에 progress입력하기
	public void userMissionProgress(int user_pk, String mission) {
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime dday = today.plusDays(7);
		String endDay = dday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		String sql = "UPDATE user_missions SET progress = ? WHERE mission = ? and user_pk = ?";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, endDay);
			stmt.setString(2, mission);
			stmt.setInt(3, user_pk);
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	// 미션종료 날짜 Dday로 알려주기
	public String userMissionEndDay(int user_pk, String mission) {
		String sql = "SELECT * FROM user_missions WHERE mission = ? and user_pk = ?";
		String userDday = null;
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, mission);
			stmt.setInt(2, user_pk);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					userDday = rs.getString("progress");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		LocalDateTime today = LocalDateTime.now();
		int nowDay = today.getDayOfMonth();
		int missionDday = Integer.valueOf(userDday.substring(8));
		int userEndDay = missionDday - nowDay;
		String m_Dday = "D - " + userEndDay;
		
		return m_Dday;
		
	}

	// 미션 로그 데이터 생성하기
	@Override
	public void missionLog(int user_pk, String mission, String state) {
		String sql = "INSERT INTO user_log (user_pk, date, mission, state) "
				+ "VALUES (?,?,?,?,?)";
		LocalDateTime today = LocalDateTime.now();
		String day = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setInt(1, user_pk);
			stmt.setString(2, day);
			stmt.setString(3, mission);
			stmt.setString(4, state);
			
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



	// 유저 로그데이터 보여주기
	@Override
	public List<String> userLogResult(int user_pk) {
		List<String> list = new ArrayList<>();
		String sql = "SELECT * FROM user_log WHERE user_pk = ?";
		
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, user_pk);
			
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					
				String date = rs.getString("date");
				String mission = rs.getString("mission");
				String state = rs.getString("state");
					
				String result = "[" + date + "] " + mission + "을 " + state + "했습니다.\n"; 
				list.add(result);
				
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}














}
