package mission;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MissionTimeRemain {
	public static void main(String[] args) {
		
		missionSelect mis = new missionSelectImpl();
		// 현재 날짜/시간
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime dday = today.plusDays(7);
		String endDay = dday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		mis.userMissionProgress(endDay, "30분동안 빠르게 걷기");
		
		
		System.out.println(mis.userMissionEndDay("1시간동안 걷기"));
     
	}

}
        	


        
        
		
	
		
	

