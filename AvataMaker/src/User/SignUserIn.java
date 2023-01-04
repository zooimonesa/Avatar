package User;
import guis.SignUpFrame;

public class SignUserIn {
	UserinfoService service = new UserinfoServiceImpl(new UserinfoRepositoryImpl());
	SignUpFrame suf = new SignUpFrame();

	public void MakeNewUser(String ID,String password,String nickname) {

		 

		try {
			int result = service.userin(ID, password, nickname);
			if (result > 0) {
				System.out.println("회원가입 성공. 당신의 아이디는 " + result);
			} else if (result == UserinfoService.EMAIL_DUPLICATED) {
				System.out.println("아이디가 중복되었습니다.");
			}

		} catch (InputNotValidException f) {
			System.out.println(f.getMessage());
		} catch (DataIOException f) {
			f.getCause().printStackTrace();
			System.out.println("시스템 장애가 발생했습니다. 나중에 다시 시도해주세요.");
		}
	}
}
