package User;

public interface UserinfoService {
	int INPUT_NOT_VALID = -1; 
	int EMAIL_DUPLICATED = -2;
	
	int userin(String ID, String password, String nickname);
	int userout(int pkid);
}
