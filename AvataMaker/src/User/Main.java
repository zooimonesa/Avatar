package User;

import java.util.Scanner;
import java.util.regex.Pattern;

// 간단한 입력(콘솔 입력) 

// 1. 회원가입

// 2. 회원탈퇴

public class Main {
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UserinfoService service = new UserinfoServiceImpl(new UserinfoRepositoryImpl());

		System.out.println("1. 회원가입 / 2. 회원탈퇴");
		int input = scan.nextInt();
		scan.nextLine();
		
		if (input == 1) {
			System.out.println("아이디, 비번, 닉네임");
			String ID = scan.nextLine();
			String password = scan.nextLine();
			String nickname = scan.nextLine();
			
			
			try {
				int result = service.userin(ID, password, nickname);
				if (result > 0) {
					System.out.println("회원가입 성공. 당신의 아이디는 " + result);
				} else if (result == UserinfoService.EMAIL_DUPLICATED) {
					System.out.println("이메일이 중복되었습니다.");
				}
 
			} catch(InputNotValidException e) {
				System.out.println(e.getMessage());
			} catch (DataIOException e) {
				e.getCause().printStackTrace();
				System.out.println("시스템 장애가 발생했습니다. 나중에 다시 시도해주세요.");
			}
		} else if (input == 2) {
			System.out.println("아이디 번호 입력");
			int id = scan.nextInt();
			
			int result = service.userout(id);
			
			System.out.println(result == 1 ? "삭제됨" : "삭제안됨");
		}
	}
}






