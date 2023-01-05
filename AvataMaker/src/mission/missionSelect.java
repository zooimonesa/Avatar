package mission;
import java.util.List;

public interface missionSelect {
	//미션 랜덤 뽑기, 새로고침
	List<Missions> RandomMission(String classify, int term);
	// 수락한 미션 테이블에 넣기
	void insertMission(int user_pk, String mission, int term);
	
	// 미션 라벨에 나타내기
	List<String> userMission(int user_pk, int term);
	// 달성한 미션 포인트,스텟 올리기(테이블 빼내기)
	void successMission(int user_pk, int term, String classify);
	// 미션포기(테이블에 빼내기)
	void cancelMission(String mission);
	
	//포인트 빼기
	public void usePoint(int user_pk, int point);
	
	// 진행중인미션 db에 progress입력하기
	void userMissionProgress(String endDay, String mission);
	
	// 미션종료 날짜 가져오기
	String userMissionEndDay(String mission);
	
}
