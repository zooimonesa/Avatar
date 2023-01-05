package User;

 
import java.sql.Connection;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

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
			throw new InputNotValidException("아이디는 영소문자 또는 숫자 조합의 15자이하로 가능.");
			//JOptionPane.showMessageDialog(null,"아이디는 영소문자 또는 숫자 조합의 15자이하로 가능.", "Message", JOptionPane.ERROR_MESSAGE);
		}
		else if (!verifyPassword(password)) {
			throw new InputNotValidException("비번은 영문자 또는 한글로 15자 미만이여야합니다.");
			//JOptionPane.showMessageDialog(null, "비번은 영문자 또는 숫자 조합의 15자 미만이여야합니다.", "Message", JOptionPane.ERROR_MESSAGE);
		}
		else if ( !verifyNickname(nickname)) {
			throw new InputNotValidException("닉네임은 영문자 또는 한글의 15자 이하로 가능 .");
			//JOptionPane.showMessageDialog(null,"닉네임은 영문자 또는 한글의 15자 이하로 가능 .", "Message", JOptionPane.ERROR_MESSAGE);
		}
		
		else if (repo.countByID(ID) == 1) {
			JOptionPane.showMessageDialog(null, "사용가능한 닉네임입니다", "Message", JOptionPane.INFORMATION_MESSAGE); 
			return EMAIL_DUPLICATED;
		}
		return repo.insert(ID, password, nickname);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public int userout(String ID) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.makeConnection();
			conn.setAutoCommit(false);
			
			int count = repo.countBypk(ID, conn);
			if (count > 0) {
				int move = repo.move(ID, conn);
				int result = repo.delete(ID, conn);
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







