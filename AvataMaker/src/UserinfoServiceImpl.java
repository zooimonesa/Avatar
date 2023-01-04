 
import java.sql.Connection;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dbutil.ConnectionProvider;


public class UserinfoServiceImpl implements UserinfoService {
	
	private UserinfoRepository repo;
	public UserinfoServiceImpl(UserinfoRepository repo) {
		super();
		this.repo = repo;
	}
	
	//아이디 만들기
	private boolean verifyID(String ID) {
		if (ID == null || ID.isEmpty()) {
			return false;
		}
		if (ID.length() > 60) {
			return false;
		}
		
		Pattern p = Pattern.compile("[a-z0-9]{1,15}");
		Matcher m = p.matcher(ID);
		if (!m.matches()) {
			return false;
		}
		return true;
	}

	 //비밀번호 만들기
	public boolean verifyPassword(String password) {
		if (password == null || password.isEmpty()) {
			return false;
		}
		if (password.length() > 15) {
			return false;
		}
		
		Pattern p = Pattern.compile("[a-zA-Z0-9]{1,15}");
		Matcher m = p.matcher(password);
		if (!m.matches()) {
			return false;
		}
		return true;
	}
	//닉네임 만들기
	public boolean verifyNickname(String nickname) {
		if (nickname == null || nickname.isEmpty()) {
			return false;
		}
		if (nickname.length() > 15) {
			return false;
		}
		
		Pattern p = Pattern.compile("[a-zA-Zㄱ-힣]{1,15}");
		Matcher m = p.matcher(nickname);
		if (!m.matches()) {
			return false;
		}
		return true;
	}
	
	@Override
	public int userin(String ID, String password, String nickname) throws DataIOException {
		if (!verifyID(ID)) {
			throw new InputNotValidException("이메일 서식을 확인해주세요.");
		}
		if (!verifyPassword(password)) {
			throw new InputNotValidException("이름은 영문자 또는 한글로 15자 미만이여야합니다.");
		}
		if ( !verifyNickname(nickname)) {
			throw new InputNotValidException("이름은 영문자 또는 한글로 15자 미만이여야합니다.");
		}
		
		if (repo.countByID(ID) == 1) {
			return EMAIL_DUPLICATED;
		}
		return repo.insert(ID, password, nickname);
	}

	@Override
	public int userout(int pkid) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.makeConnection();
			conn.setAutoCommit(false);
			
			int count = repo.countBypk(pkid, conn);
			if (count > 0) {
				int move = repo.move(pkid, conn);
				int result = repo.delete(pkid, conn);
				conn.commit();
				
				return result;
			}
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			ConnectionProvider.closeConnection(conn);
		}
		return 0;
	}
}







