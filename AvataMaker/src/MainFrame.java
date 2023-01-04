import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class MainFrame {

	JFrame frame;
	private LineBorder bb = new LineBorder(Color.black, 1, true);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
					window.frame.setResizable(false);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("메인화면");
		frame.setBounds(100, 100, 815, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ImageIcon 캐릭터 = new ImageIcon("농담곰_메인_기본.png");
		ImageIcon 배경 = new ImageIcon("배경.png");
		ImageIcon 상의 = new ImageIcon("목도리.png");
		ImageIcon 체력 = new ImageIcon("능력치_체력.png");
		ImageIcon 지능 = new ImageIcon("능력치_지능.png");
		ImageIcon 재능 = new ImageIcon("능력치_재능.png");

		JLabel nickNameLabel = new JLabel("닉네임");
		nickNameLabel.setBackground(new Color(255, 255, 255));
		nickNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nickNameLabel.setBounds(315, 40, 424, 35);
		frame.getContentPane().add(nickNameLabel);

		JLabel storyLabel = new JLabel("스토리");
		storyLabel.setBackground(new Color(192, 192, 192));
		storyLabel.setVerticalAlignment(SwingConstants.TOP);
		storyLabel.setHorizontalAlignment(SwingConstants.LEFT);
		storyLabel.setBorder(bb);
		storyLabel.setBounds(40, 291, 150, 160);
		frame.getContentPane().add(storyLabel);

		JLabel healthPoint = new JLabel(체력);
		healthPoint.setHorizontalAlignment(SwingConstants.CENTER);
		healthPoint.setBounds(315, 85, 424, 35);
		frame.getContentPane().add(healthPoint);

		JLabel intPoint = new JLabel(지능);
		intPoint.setHorizontalAlignment(SwingConstants.CENTER);
		intPoint.setBounds(315, 130, 424, 35);
		frame.getContentPane().add(intPoint);

		JLabel giftPoint = new JLabel(재능);
		giftPoint.setHorizontalAlignment(SwingConstants.CENTER);
		giftPoint.setBounds(315, 175, 424, 35);
		frame.getContentPane().add(giftPoint);

		JButton missionPoint = new JButton("미션");
		missionPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MissionChoiceFrame missionChoiceFrame = new MissionChoiceFrame();
				missionChoiceFrame.frame.setVisible(true); // 다음 프레임 띄우기
				missionChoiceFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				missionChoiceFrame.frame.setResizable(false);

			}
		});
		missionPoint.setBounds(315, 291, 97, 50);
		frame.getContentPane().add(missionPoint);

		JButton storePoint = new JButton("상점");
		storePoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StoreFrame storeFrame = new StoreFrame();
				storeFrame.frame.setVisible(true); // 다음 프레임 띄우기
				storeFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				storeFrame.frame.setResizable(false);

			}
		});
		storePoint.setBounds(424, 291, 97, 50);
		frame.getContentPane().add(storePoint);

		JButton logButton = new JButton("로그");
		logButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogFrame logFrame = new LogFrame();
				logFrame.frame.setVisible(true); // 다음 프레임 띄우기
				logFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				logFrame.frame.setResizable(false);
			}
		});
		logButton.setBounds(533, 291, 97, 50);
		frame.getContentPane().add(logButton);

		JButton logOutButton = new JButton("로그아웃");
		logOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "로그아웃하시겠습니까?", "로그아웃창", JOptionPane.YES_NO_OPTION); // 로그아웃
																														// 다이얼로그
				if (answer == JOptionPane.YES_OPTION) { // 사용자가 yes를 눌렀을 경우
					StartFrame startFrame = new StartFrame();
					startFrame.frmAlpha.setVisible(true);
					startFrame.frmAlpha.setLocationRelativeTo(null); // 창 중간에 나오게함
					startFrame.frmAlpha.setResizable(false);
					frame.dispose();
				} else { // 사용자가 Yes 이외의 값을 눌렀을 경우

				}
			}
		});
		logOutButton.setBounds(642, 291, 97, 50);
		frame.getContentPane().add(logOutButton);

		JButton deleteUserInfo = new JButton("회원탈퇴");
		deleteUserInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("회원탈퇴")) { // 회원탈퇴 버튼 ====================================
					while (true) {

						String deleteInfo = JOptionPane.showInputDialog(null, "회원탈퇴를 원하시면 '지금탈퇴'를 입력하세요. ", "회원탈퇴",
								JOptionPane.OK_CANCEL_OPTION);

						if (deleteInfo.equals("지금탈퇴")) {

							// 회원탈퇴메소드넣기

							JOptionPane.showMessageDialog(null, "회원탈퇴되었습니다. 로그인창으로 이동합니다.", "회원탈퇴",
									JOptionPane.WARNING_MESSAGE);

							StartFrame startFrame = new StartFrame();
							startFrame.frmAlpha.setVisible(true);
							startFrame.frmAlpha.setLocationRelativeTo(null); // 창 중간에 나오게함
							startFrame.frmAlpha.setResizable(false);
							frame.dispose();

							break;

						} else if (!deleteInfo.equals("지금탈퇴")) {
							JOptionPane.showMessageDialog(null, "잘못입력하셨습니다.", "회원탈퇴", JOptionPane.PLAIN_MESSAGE);
						} 
					}
				}
//					else if (e.getActionCommand().equals("확인")) {
//					int result = JOptionPane.showConfirmDialog(null, "프로그램을 종료하시 것습니까?", "제목",
//							JOptionPane.OK_CANCEL_OPTION);
//
//					System.out.printf("%d\n", result);
//					if (result == 0) { // OK=0 , Cancel=2 리턴
//						System.exit(0);
//					}
//				} else {
//					JOptionPane.showMessageDialog(null, "회원탈퇴되었습니다. 로그인창으로 이동합니다.", "회원탈퇴", JOptionPane.WARNING_MESSAGE);
//				}
			}

		});
		deleteUserInfo.setBounds(642, 401, 97, 50);
		frame.getContentPane().add(deleteUserInfo);

		JLabel userPointLabel = new JLabel("포인트:");
		userPointLabel.setHorizontalAlignment(SwingConstants.LEFT);
		userPointLabel.setBounds(533, 351, 97, 50);
		frame.getContentPane().add(userPointLabel);

		JLabel charHeadLabel = new JLabel();
		charHeadLabel.setBounds(40, 40, 150, 200);
		frame.getContentPane().add(charHeadLabel);

		JLabel charAccLabel = new JLabel();
		charAccLabel.setBounds(40, 40, 150, 200);
		frame.getContentPane().add(charAccLabel);

		JLabel charTopLabel = new JLabel(상의);
		charTopLabel.setBounds(40, 40, 150, 200);
		frame.getContentPane().add(charTopLabel);

		JLabel userCharLabel = new JLabel(캐릭터);
		userCharLabel.setBounds(40, 40, 150, 200);
		frame.getContentPane().add(userCharLabel);

		JLabel charBackgroundLabel = new JLabel(배경);
		charBackgroundLabel.setBounds(40, 40, 150, 200);
		userCharLabel.setBorder(bb);
		frame.getContentPane().add(charBackgroundLabel);

		JLabel userPointLabel_1 = new JLabel("~~포인트");
		userPointLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		userPointLabel_1.setBounds(642, 351, 97, 50);
		frame.getContentPane().add(userPointLabel_1);
	}
}
