package User;

import java.sql.Connection;
 
public interface UserinfoRepository {
	 int countByID(String ID);
	 Userinfo selectByID(String ID);
	 int insert(String ID, String password, String nickname);
	 
	 int countBypk(int pkid,Connection conn);  //고쳐야함
	 int move(int pkid, Connection conn);
	 int delete(int pkid, Connection conn);
}
