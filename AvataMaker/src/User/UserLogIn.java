package User;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbutil.ConnectionProvider;
import guis.MainFrame;
import guis.StartFrame;

public class UserLogIn {
	public String ruid;
	
	 

	public void CompareUser(String uid, String upw) {
		StartFrame sf = new StartFrame();

		boolean rightID = false;
		System.out.println(uid);
		String sql = "SELECT * FROM userinfo";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {

					String id = rs.getString("ID");
					String pw = rs.getString("password");
					if (id.equals(uid) && pw.equals(upw)) {
						
						UserGet(uid);
						ruid = uid;
						
						MainFrame mainFrame = new MainFrame();
						mainFrame.frame.setVisible(true); // 다음 프레임 띄우기
						mainFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
						mainFrame.frame.setResizable(false);
						sf.frmAlpha.setVisible(false);
						rightID = true;
						break;
					}

				}

			}
		} catch (SQLException e) {
			throw new DataIOException(e);
		}

	}

	public void UserGet(String ID) {
		GetInfo mf = new GetInfo();
		String find = "SELECT * FROM userinfo WHERE ID = ?";
		List<String> userget = new ArrayList<>();
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(find);) {
			stmt.setString(1, ID);
			try (ResultSet rs = stmt.executeQuery();) {

				while (rs.next()) {
					String id = rs.getString("id");
					String nickname = rs.getString("nickname");
					String point = Integer.toString(rs.getInt("point"));
					String health = Integer.toString(rs.getInt("health"));
					String intelli = Integer.toString(rs.getInt("intelligence"));
					String talent = Integer.toString(rs.getInt("talent"));
					String upk = Integer.toString(rs.getInt("user_pk"));
					userget.add(id);
					userget.add(nickname);
					userget.add(point);
					userget.add(health);
					userget.add(intelli);
					userget.add(talent);
					userget.add(upk);
					
					mf.fmainid = userget.get(0);
					mf.fmainnickname = userget.get(1);
					mf.fmainpoint = Integer.parseInt(userget.get(2));
					mf.fmainhealth = Integer.parseInt(userget.get(3));
					mf.fmainintelligence = Integer.parseInt(userget.get(4));
					mf.fmaintalent = Integer.parseInt(userget.get(5));
					mf.fuserpk = Integer.parseInt(userget.get(6));
					
					
					// System.out.println(userget);

					

				}

			}
		} catch (SQLException e) {
			System.out.println("예:외");
			throw new DataIOException(e);
		}
		 
	}

	 

//	public static void main(String[] args) {
//		UserGet("aa");
//
//		// PullUserinfo("aa");
//
//	}

}
