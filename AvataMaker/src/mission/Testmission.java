package mission;


public class Testmission {
	public static void main(String[] args) {
		missionSelect mis = new missionSelectImpl();
		
//		System.out.println(mis.RandomMission("운동", 1).get(1));
		Missions m = mis.RandomMission("운동", 1);
		System.out.println(m);
		
//		mis.insertMission(5, m.getMission(), m.getTerm());
		
		System.out.println(mis.userMission(1, m.getTerm()));
		
//		mis.successMission(3, m.getTerm(), m.getClassify());
		
//		mis.cancelMission(m.getMission());
		
//		mis.usePoint(3, 50);
		
//		System.out.println(mis.userMissionEndDay("유산소운동 1시간씩 매일 하기 "));
		
//		String nu = "";
//		System.out.println(nu == null);
		
//		Missions m1 = mis.userMission(34, 1).get(0);
//		System.out.println(m1);
//		System.out.println(mis.userMission(34, 1));
//		System.out.println(mis.userMission(34, 1).contains(m1));
//		for (Missions m2 : mis.userMission(34, 1)) {
//			if(m2.getMission().equals(m1.getMission())) {
//				System.out.println(true);
//			} else {
//				System.out.println(false);
//			}
//		}
		String d = "D - 2";
		String d1 = "D - 1";
		
		System.out.println(d.contains("2"));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
