package character;
import java.nio.file.Path;

public interface avatarImage {
	//이미지 저장하는 폴더 만드는 메소드
	// 이미지 저장 폴더 만들어주는 메소드
	 void folderMaker();
	
	//유저가 소유하고 있는 이미지 모두 저장하는 메소드
	 Path selectEncodedImage(int id) ;
	
	 
	//encode화 시킨 바이트 들을 배열에 넣어주는 메소드
	 byte[] decodeBase64(String encode);
	 
	//insert문 만들어서 db에 소유 이미지 넣어주는 메소드
	 void insertEncode(String encode);
	 
	 
	 //이미지 encode화 시켜주는 메소드
	 byte[] imageEncode();
	 
 
	 
	 
//	// 이미지 순서(자리) 잡아주는 메소드
//	void imagePosition(String imageName);
//	//p.setComponentZOrder(변수이름, 1 이미지 순서); (이미지 레이어 지정 해주는 메소드)
//	
//	
//	
//	//이미지 교체 메소드
//	void imageChange(/*지울 이미지, 새로 넣을 이미지 */);
//	
//	//데이터 베이스에는 incode로 존재하는 byte가 존재한다.
//	//기존에 가지고 있던 이미지 값을 바꾸고 새로 선택한 이미지 값으로 변경
//	//
//	//착용 부위가 중복인지 확인 후 중복이 아니라면 넣고 중복이라면 기존에 있던 이미지 빼고 넣기
//	//바꾸면 update를 통해서 착용 여부 바꿔줘야함.
//	//
//	
//	
//	//이미지 스토리 불러오기
//	void imageStory(String story);
//	
}
	