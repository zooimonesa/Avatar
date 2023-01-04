
public class Userinfo { 
	private int user_pk;
	private String ID;
	private String password;
	private String nickname;
	
	@Override
	public String toString() {
		return "Userinfo [user_pk=" + user_pk + ", ID=" + ID + ", password=" + password + ", nickname=" + nickname + "]";
	}

	public int getUser_pk() {
		return user_pk;
	}

	public void setUser_pk(int user_pk) {
		this.user_pk = user_pk;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Userinfo(int user_pk, String iD, String password, String nickname) {
		super();
		this.user_pk = user_pk;
		ID = iD;
		this.password = password;
		this.nickname = nickname;
	}
	 
}
