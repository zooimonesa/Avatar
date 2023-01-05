package User;

import java.sql.Connection;
 
public interface UserinfoRepository {
	 int countByID(String ID);
	 Userinfo selectByID(String ID);
	 int insert(String ID, String password, String nickname);
	 
	 int countBypk(String ID,Connection conn);  //고쳐야함
	 int move(String ID, Connection conn);
	 int delete(String ID, Connection conn);
}
