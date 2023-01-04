package mission;

public class Missions {
	private int mission_id;
	private String classify;
	private String mission;
	private int term;
	public Missions(int mission_id, String classify, String mission, int term) {
		this.mission_id = mission_id;
		this.classify = classify;
		this.mission = mission;
		this.term = term;
	}

	public int getMission_id() {
		return mission_id;
	}
	public void setMission_id(int mission_id) {
		this.mission_id = mission_id;
	}
	public String getClassify() {
		return classify;
	}
	public void setClassify(String classify) {
		this.classify = classify;
	}
	public String getMission() {
		return mission;
	}
	public void setMission(String mission) {
		this.mission = mission;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	@Override
	public String toString() {
		return "Missions [mission_id=" + mission_id + ", classify=" + classify + ", mission=" + mission + ", term="
				+ term + "]\n";
	}
	
	
}
