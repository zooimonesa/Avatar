package mission;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import dbutil.ConnectionProvider;


public class MissionTimeRemain {
//	public static void userMissionProgress(String endDay, String mission) {
//		String sql = "UPDATE user_missions SET progress = ? WHERE mission = ? ";
//		try (Connection conn = ConnectionProvider.makeConnection();
//				PreparedStatement stmt = conn.prepareStatement(sql)) {
//			stmt.setString(1, endDay);
//			stmt.setString(2, mission);
//			stmt.executeUpdate();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static String userMissionEndDay(String mission) {
//		String sql = "SELECT * FROM user_missions WHERE mission = ?";
//		try (Connection conn = ConnectionProvider.makeConnection();
//				PreparedStatement stmt = conn.prepareStatement(sql)) {
//			stmt.setString(1, mission);
//			
//			try (ResultSet rs = stmt.executeQuery()) {
//				if (rs.next()) {
//					return rs.getString("progress");
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return sql;
//		
//	}	

	public static void main(String[] args) {
		
		missionSelect mis = new missionSelectImpl();
		// 현재 날짜/시간
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime dday = today.plusDays(7);
		String endDay = dday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		mis.userMissionProgress(endDay, "3시간걷기");
		
		String userDday = mis.userMissionEndDay("3시간걷기");
		System.out.println(userDday);
		
		int nowDay = today.getDayOfMonth();
		System.out.println(nowDay);
		
		
		int missionDday = Integer.valueOf(userDday.substring(8));
		System.out.println(missionDday);
		
		int userEndDay = missionDday - nowDay;
		System.out.println("D - " + userEndDay);
     
	}

}
        	


        
        
		
	
		
	

