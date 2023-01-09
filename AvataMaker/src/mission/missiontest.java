package mission;

public class missiontest {
	public static void main(String[] args) {
		
	missionSelect mis = new missionSelectImpl();
//	Missions m = mis.userMission(33, 1).get(0);
//	mis.userLog(33, "1시간동안 걷기", "수락");
//	mis.userLog(33, "2시간동안 걷기", "수락");
//	mis.userLog(33, "2시간동안 걷기", "포기");
//	mis.userLog(33, "1시간동안 걷기", "완료");
	mis.missionLog(33, "2시간동안 걷기", "완료");

//	System.out.println(mis.userLogResult(33).get(0));
	
	
	}
}
