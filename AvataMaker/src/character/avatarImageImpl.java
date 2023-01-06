package character;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import dbutil.ConnectionProvider;

public class avatarImageImpl implements avatarImage {

	@Override // 이미지 저장하는 폴더 만드는 메소드
	public void folderMaker(String folderName) {
		String path = "D:\\" +  folderName ; 
		File Folder = new File(path);
		if (!Folder.exists()) {
			try {
				Folder.mkdir(); 
				System.out.println("폴더가 생성되었습니다.");
			} catch (Exception e) {
				e.getStackTrace();
			}
		} else {
			System.out.println("이미 폴더가 생성되어 있습니다.");
		}
	}
	@Override // 유저가 소유하고 있는 이미지 모두 저장하는 메소드
	public Path selectEncodedImage() {
		String sql = "SELECT * FROM avatar_store ";
		ResultSet rs = null;
		List<byte[]> images = new ArrayList<>();
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			rs = stmt.executeQuery();
			while (rs.next()) {
				String encode = rs.getString("equip");
				String ename = rs.getString("name");

				System.out.println(ename);

				byte[] decode = decodeBase64(encode);
				images.add(decode);
				try {
					Files.write(Paths.get("D:\\아바타이미지폴더\\" + ename), decode);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {

					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override // encode화 시킨 바이트 들을 배열에 넣어주는 메소드
	public byte[] decodeBase64(String encode) {
		return Base64.getDecoder().decode(encode);
	}

	@Override // insert문 만들어서 db에 소유 이미지 넣어주는 메소드
	public void insertEncode(String encode) {
		String sql = "INSERT INTO avatar_user ( user_pk, `type`, ename, equip, `using`) VALUES (?, ?, ?, ?, ?)";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, 1);
			stmt.setString(2, "상의");
			stmt.setString(3, "썬글라스.png");
			stmt.setString(4, encode);
			stmt.setInt(5, 1);

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override // 이미지 encode화 시켜주는 메소드
	public byte[] imageEncode() {
		Path image = Paths.get("D:\\썬글라스.png");
		byte[] bytes = null;
		try {
			bytes = Files.readAllBytes(image);
			String encode = Base64.getEncoder().encodeToString(bytes);
			insertEncode(encode);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return bytes;
	}

	@Override // 아바타 db에서 옷 상태 변경
	public int avatarTakeOnOff(int onOff, int user_pk, String onOffEname , String type) {
		String sql = "UPDATE avatar_user SET `using` = ? WHERE user_pk = ? AND `ename` = ?";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, onOff);
			stmt.setInt(2, user_pk);
			stmt.setString(3,avatarOnFinding(user_pk, type) );
			int rs = stmt.executeUpdate();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	 
	@Override // 같은 부위에 착용하고 있는거 확인하기
	public String avatarOnFinding(int user_pk, String type) {
		String sql = "SELECT `ename` from avatar_user WHERE   user_pk = ?  AND  `type` = ? AND `using` = 1   ; ";
		ResultSet rs = null;

		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, user_pk);
			stmt.setString(2, type);
			rs = stmt.executeQuery();
			
			while (rs.next()) {
			 String ename = rs.getString("ename");
			 return ename;
			 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	
	
	
	
	
	
	@Override // 상점에서 산거 복사 해서 내 db에 넣기
	public int insertCopy(String nickname, String avatarName) {
		String sql = "INSERT INTO avatar_user ( user_pk, `type`, ename, equip, story, `using`)  "
				+ " SELECT (SELECT user_pk FROM userinfo WHERE nickname= ?), "
				+ "`type`,`name`, equip , story, 0 FROM avatar_store WHERE `name` = ?; ";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, nickname);
			stmt.setString(2, avatarName);
			int rs = stmt.executeUpdate();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public Path takeOnEncodedImage(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void avatarOff(String ename) {
		// TODO Auto-generated method stub
		
	}
	@Override // 아바타 착용했는지 확인 후 장착 해제
	public int avatarTakeOff(int user_pk, String type) {
		String sql = "UPDATE avatar_user SET `using` = 0 WHERE user_pk = ? AND `ename` = ?";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setInt(1, user_pk);
			stmt.setString(2,avatarOnFinding(user_pk, type) );
			int rs = stmt.executeUpdate();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
//	@Override // 가지고 있는 이미지 중에서 착용중인 것들만 불러오기 (대표이미지 불러올때 쓸거임)
//	public Path takeOnEncodedImage(int id) {
//		String sql = "SELECT * FROM avatar_user WHERE  user_pk = ? AND `using` = 1;";
//		ResultSet rs = null;
//		List<byte[]> images = new ArrayList<>();
//		try (Connection conn = ConnectionProvider.makeConnection();
//				PreparedStatement stmt = conn.prepareStatement(sql)) {
//			stmt.setInt(1, id);
//			rs = stmt.executeQuery();
//			while (rs.next()) {
//				String encode = rs.getString("equip");
//				String ename = rs.getString("ename");
//
//				System.out.println(ename);
//
//				byte[] decode = decodeBase64(encode);
//				images.add(decode);
//				try {
//					Files.write(Paths.get("D:\\소유아바타 이미지\\착용아바타\\" + ename), decode);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if (rs != null) {
//				try {
//
//					rs.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		return null;
//	}

	
	
	
	
	//착용한 아바타 해제하기 (하나하나 해제할때 사용)
//	public void avatarOff(String ename) {
//		File file = new File("D:\\소유아바타 이미지\\착용아바타\\" + ename);
//
//		if (file.exists()) {
//			if (file.delete()) {
//				System.out.println("파일삭제 성공");
//			} else {
//				System.out.println("파일삭제 실패");
//			}
//		} else {
//			System.out.println("파일이 존재하지 않습니다.");
//		}
//
//	}
	
	
	
	
	

}
