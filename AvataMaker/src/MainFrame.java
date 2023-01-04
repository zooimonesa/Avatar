import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.Icon;

public class 메인화면프레임 {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					메인화면프레임 window = new 메인화면프레임();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public 메인화면프레임() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("메인화면");
		frame.setBounds(100, 100, 815, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ImageIcon 캐릭터 = new ImageIcon("농담곰_메인_기본.png"); //데이터베이스에서 꺼내는 메소드  //끌때 지우는 메소드//기본을 널로 설정
		ImageIcon 배경 = new ImageIcon("배경.png");
		ImageIcon 상의 = new ImageIcon("목도리.png");
		ImageIcon 체력 = new ImageIcon("능력치_체력.png");  // 능력치 기준으로 라벨로딸것 if 몇이상이면 몇개보임 이런식
		ImageIcon 지능 = new ImageIcon("능력치_지능.png");
		ImageIcon 재능 = new ImageIcon("능력치_재능.png");
		
		
		JLabel 닉네임라벨 = new JLabel("닉네임");   //데베받
		닉네임라벨.setBackground(new Color(255, 255, 255));
		닉네임라벨.setHorizontalAlignment(SwingConstants.CENTER);
		닉네임라벨.setBounds(315, 40, 424, 35);
		frame.getContentPane().add(닉네임라벨);
		
		JLabel lblNewLabel = new JLabel("스토리"); //데베받
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(40, 291, 150, 160);
		frame.getContentPane().add(lblNewLabel);

		JLabel 체력수치 = new JLabel(체력);  //데베받
		체력수치.setHorizontalAlignment(SwingConstants.CENTER);
		체력수치.setBounds(315, 85, 424, 35);
		frame.getContentPane().add(체력수치);

		JLabel 지능수치 = new JLabel(지능);
		지능수치.setHorizontalAlignment(SwingConstants.CENTER);
		지능수치.setBounds(315, 130, 424, 35);
		frame.getContentPane().add(지능수치);

		JLabel 재능수치 = new JLabel(재능);
		재능수치.setHorizontalAlignment(SwingConstants.CENTER);
		재능수치.setBounds(315, 175, 424, 35);
		frame.getContentPane().add(재능수치);


		JButton 미션버튼 = new JButton("미션");
		미션버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				미션선택프레임 미션선택프레임새창 = new 미션선택프레임();
				미션선택프레임새창.frame.setVisible(true); // 다음 프레임 띄우기
				미션선택프레임새창.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				미션선택프레임새창.frame.setResizable(false);

			}
		});
		미션버튼.setBounds(315, 291, 97, 50);
		frame.getContentPane().add(미션버튼);

		상점프레임 상점프레임새창 = new 상점프레임();

		JButton 상점버튼 = new JButton("상점");
		상점버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				상점프레임새창.frame.setVisible(true); // 다음 프레임 띄우기
				상점프레임새창.frame.setBounds(100, 100, 815, 526);
				상점프레임새창.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				상점프레임새창.frame.setResizable(false);

			}
		});
		상점버튼.setBounds(424, 291, 97, 50);
		frame.getContentPane().add(상점버튼);

		JButton 로그버튼 = new JButton("로그");
		로그버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				로그프레임 로그프레임새창 = new 로그프레임();
				로그프레임새창.frame.setVisible(true); // 다음 프레임 띄우기
				로그프레임새창.frame.setBounds(100, 100, 450, 550);
				로그프레임새창.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				로그프레임새창.frame.setResizable(false);
			}
		});
		로그버튼.setBounds(533, 291, 97, 50);
		frame.getContentPane().add(로그버튼);

		JButton 로그아웃버튼 = new JButton("로그아웃");
		로그아웃버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				시작프레임 시작프레임새창 = new 시작프레임();
				시작프레임새창.frmAlpha.setVisible(true); // 다음 프레임 띄우기
				시작프레임새창.frmAlpha.setLocationRelativeTo(null); // 창 중간에 나오게함
				시작프레임새창.frmAlpha.setResizable(false);
				frame.dispose();
			}
		});
		로그아웃버튼.setBounds(642, 291, 97, 50);
		frame.getContentPane().add(로그아웃버튼);

		JLabel 보유포인트 = new JLabel("포인트"); //데베받
		보유포인트.setHorizontalAlignment(SwingConstants.CENTER);
		보유포인트.setBounds(533, 351, 206, 100);
		frame.getContentPane().add(보유포인트);

		JLabel 캐릭터머리라벨 = new JLabel();
		캐릭터머리라벨.setBounds(40, 40, 150, 200);
		frame.getContentPane().add(캐릭터머리라벨);

		JLabel 캐릭터악세라벨 = new JLabel();
		캐릭터악세라벨.setBounds(40, 40, 150, 200);
		frame.getContentPane().add(캐릭터악세라벨);

		JLabel 캐릭터상의라벨 = new JLabel(상의);
		캐릭터상의라벨.setBounds(40, 40, 150, 200);
		frame.getContentPane().add(캐릭터상의라벨);

		JLabel 캐릭터라벨 = new JLabel(캐릭터);
		캐릭터라벨.setBounds(40, 40, 150, 200);
		frame.getContentPane().add(캐릭터라벨);
		
		JLabel 캐릭터배경라벨 = new JLabel(배경);
		캐릭터배경라벨.setBounds(40, 40, 150, 200);
		frame.getContentPane().add(캐릭터배경라벨);
	}
}
