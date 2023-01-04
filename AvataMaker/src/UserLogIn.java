import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbutil.ConnectionProvider;

public class UserLogIn {

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

}
