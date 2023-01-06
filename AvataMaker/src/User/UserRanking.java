package User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbutil.ConnectionProvider;

public class UserRanking {
	public List<String> hnlist = new ArrayList<>();
	public List<Integer> hslist = new ArrayList<>();
	public List<String> inlist = new ArrayList<>();
	public List<Integer> islist = new ArrayList<>();
	public List<String> tnlist = new ArrayList<>();
	public List<Integer> tslist = new ArrayList<>();

	public void Hrank() {
		String sql = "Select nickname, health FROM userinfo ORDER BY health desc ";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {

					String nickname = rs.getString("nickname");
					int health = rs.getInt("health");

					hnlist.add(nickname);
					hslist.add(health);

					// System.out.println(nickname+","+ health);

				}
			}
		} catch (SQLException e) {
			throw new DataIOException(e);
		}

	}

	public void Irank() {
		String sql = "Select nickname, intelligence FROM userinfo ORDER BY intelligence desc ";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {

					String nickname = rs.getString("nickname");
					int intelligence = rs.getInt("intelligence");

					inlist.add(nickname);
					islist.add(intelligence);

				}
			}
		} catch (SQLException e) {
			throw new DataIOException(e);
		}

	}

	public void Trank() {
		String sql = "Select nickname, talent FROM userinfo ORDER BY talent desc ";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {

					String nickname = rs.getString("nickname");
					int talent = rs.getInt("talent");

					tnlist.add(nickname);
					tslist.add(talent);

				}
			}
		} catch (SQLException e) {
			throw new DataIOException(e);
		}

	}
	
	 

}
