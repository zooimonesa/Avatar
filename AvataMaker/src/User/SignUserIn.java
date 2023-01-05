package User;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import guis.SignUpFrame;
import guis.StartFrame;

public class SignUserIn {
	UserinfoService service = new UserinfoServiceImpl(new UserinfoRepositoryImpl());
	List<String> user = new ArrayList<>();

	public void MakeNewUser(String ID, String password, String nickname) {
		SignUpFrame suf = new SignUpFrame();

		try {
			int result = service.userin(ID, password, nickname);
			if (result > 0) {
				JOptionPane.showMessageDialog(null, "환영합니다!", "Message", JOptionPane.INFORMATION_MESSAGE);
				//suf.frame.dispose();
				//System.exit(0);
				
				
			} else if (result == UserinfoService.EMAIL_DUPLICATED) {
				JOptionPane.showMessageDialog(null, "계정이 이미있습니다,아이디와 닉네임을 변경해주세요", "Message",
						JOptionPane.ERROR_MESSAGE);

			}

		} catch (InputNotValidException f) {
			System.out.println(f.getMessage());
		} catch (DataIOException f) {
			f.getCause().printStackTrace();
			System.out.println("시스템 장애가 발생했습니다. 나중에 다시 시도해주세요.");
		}
	}
	
	public void DeleteUser() {
		
	
		GetInfo gi = new GetInfo();
		String id = gi.fmainid;
		
		int result = service.userout(id);
		
		
		System.out.println(result == 1 ? "삭제됨" : "삭제안됨");
	}
	
	

}
