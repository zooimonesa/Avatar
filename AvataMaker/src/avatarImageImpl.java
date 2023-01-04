
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

	@Override
	public void folderMaker() {
		String path = "D:\\소유아바타 이미지"; 
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
 	

	@Override
	public Path selectEncodedImage(int id) {
		String sql = "SELECT * FROM avatar_user WHERE  user_pk = ?";
		ResultSet rs = null;
		List<byte[]> images = new ArrayList<>();
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			while (rs.next()) {
				String encode = rs.getString("equip");
				String ename = rs.getString("ename");

				System.out.println(ename);

				byte[] decode = decodeBase64(encode);
				images.add(decode);
				try {
					Files.write(Paths.get("D:\\소유아바타 이미지\\" + ename), decode);
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

	@Override
	public byte[] decodeBase64(String encode) {
		return Base64.getDecoder().decode(encode);
	}

	@Override
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

	@Override
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

}
