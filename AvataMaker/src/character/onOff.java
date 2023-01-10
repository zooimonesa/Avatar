package character;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dbutil.ConnectionProvider;
import guis.MainFrame;

public class onOff {

	MainFrame mf = new MainFrame();

	public List<String> avatarGet(int user_pk) { // 태현추가
		String sql = "SELECT `ename` from avatar_user WHERE   user_pk = ? ";// 태현고침
		ResultSet rs = null;
		List<String> list = new ArrayList<>();

		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, user_pk);

			rs = stmt.executeQuery();

			while (rs.next()) {
				String ename = rs.getString("ename");
				list.add(ename);

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
		return list;
	}

	
	public List<String> storeAvatarGet() { // 태현추가
		String sql = "SELECT `name` from avatar_store ";// 태현고침
		ResultSet rs = null;
		List<String> list = new ArrayList<>();

		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			

			rs = stmt.executeQuery();

			while (rs.next()) {
				String ename = rs.getString("name");
				list.add(ename);

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
		return list;
	}

	
	
	
	
	
	public String findGetAva(String ava) {// 아바타를 흐리게

		if (avatarGet(mf.user_pk).contains(ava)) {
			ava = "흐린".concat(ava);
			
		}else {
			ava = "버튼".concat(ava);
		}
		
		return ava;
	}

	public String SeeAva(String ava) {// 아바타를 흐리게

		if (avatarGet(mf.user_pk).contains(ava)) {
			ava = "미리보기_".concat(ava);

		}
		return ava;
	}

	public boolean doYouAva(String ava) { // 아바타가있으면 구입막음
		if (avatarGet(mf.user_pk).contains(ava)) {
			return false;
		}
		return true;
	}

	public boolean doYouDonAva(String ava) { // 아바타가없으면 착용막음
		if (avatarGet(mf.user_pk).contains(ava)) {
			return true;
		}
		return false;
	}

	 public  List<String> mainOnOff(List<String> user, List<String> store) {

	        
	        

	        Set<String> common = new HashSet<>(user);
	        common.retainAll(store);
	        System.out.println(common);

	        // Set to List
	        List<String> commonList = new ArrayList<>(common);
	        System.out.println(commonList);
	        
	        for (int i = 0; i < commonList.size(); i++) {
	        	commonList.set(i,"흐린".concat(commonList.get(i)));
				
			}
	        
	        
	        
	        return commonList;
	    }
	
	 
	 
	
}
