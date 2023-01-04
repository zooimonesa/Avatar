package User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dbutil.ConnectionProvider;
 
public class UserinfoRepositoryImpl implements UserinfoRepository {
	@Override
	public int countByID(String ID) {
		String sql = "SELECT count(*) AS CNT FROM userinfo WHERE ID = ?";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, ID);
			
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return rs.getInt("CNT");
				}
			}
		} catch (SQLException e) {
			throw new DataIOException(e);
		}
		return 0;
	}

	@Override
	public Userinfo selectByID(String ID) {
		String sql = "SELECT user_pk, ID, password, nickname FROM userinfo WHERE ID = ?";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, ID);
			
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					int pkid = rs.getInt("user_pk");
					String id = rs.getString("ID");
					String password = rs.getString("password");
					String nickname = rs.getString("nickname");
					
					return new Userinfo(pkid, id, password, nickname);
				}
			}
		} catch (SQLException e) {
			throw new DataIOException(e);
		}
		return null;
	}

	@Override
	public int insert(String ID, String password, String nickname) {
		String insert = "INSERT INTO userinfo (ID, password, nickname) VALUES (?, ?, ?)";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt
					= conn.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
						) {
			stmt.setString(1, ID);
			stmt.setString(2, password);
			stmt.setString(3, nickname);
			
			stmt.executeUpdate();
			
			try (ResultSet rs = stmt.getGeneratedKeys()) {
				if(rs.next()) {
					return rs.getInt(1);
				}
			}
		} catch (SQLException e) {
			throw new DataIOException(e);
		}
		return 0;
	}

	@Override
	public int countBypk(int pkid, Connection conn) {
		String sql = "SELECT count(*) FROM userinfo WHERE user_pk = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, pkid);
			
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return rs.getInt(1);
				}
			}
		} catch (SQLException e) {
			throw new DataIOException(e);
		}
		return 0;
	}

	@Override
	public int move(int pkid, Connection conn) {
		String sql = "INSERT INTO userinfo_inactive (user_pk, ID, password, nickname,point, health, intelligence, talent )"
				+ " SELECT * FROM userinfo WHERE user_pk = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, pkid);
			
			return stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DataIOException(e);
		}
	}

	@Override
	public int delete(int pkid, Connection conn) {
		String sql = "DELETE FROM userinfo WHERE user_pk = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, pkid);
			
			return stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DataIOException(e);
		}
	}

}












