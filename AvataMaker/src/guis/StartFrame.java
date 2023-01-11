package guis;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import User.UserLogIn;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

public class StartFrame {
	public JFrame frmAlpha;
	private JTextField id;
	private JPasswordField passWord;
	private static Clip clip; // 배경음악 

	String userid; // 태현추가
	String userpw; // 태현추가

	public StartFrame() {
		initialize();
		audio(); // 배경음악
		customcursor(); // 마우스 포인터
	}

	public void customcursor() { // 마우스포인터 ====================================

		Toolkit tk = Toolkit.getDefaultToolkit();
		Image cursorimage = tk.getImage("대형견_커서.png");
		Point point = new Point(0, 0);
		Cursor cursor = tk.createCustomCursor(cursorimage, point, "haha");
		frmAlpha.setCursor(cursor);
	} // =======================================================

	public static void audio() { // 배경음악 =========================================
		try {
			File file = new File("헤네시스.wav");
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			// clip.loop(Clip.LOOP_CONTINUOUSLY);
			clip.start();
		} catch (Exception e) {

		}
	} // =========================================================================

	private void initialize() {

		frmAlpha = new JFrame();
		frmAlpha.getContentPane().setBackground(new Color(255, 255, 255));
		frmAlpha.setTitle("프로젝트 다마고치 alpha_0.00");
		frmAlpha.setBounds(100, 100, 545, 507);
		frmAlpha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlpha.getContentPane().setLayout(null);
		
		ImageIcon 로그인버튼 = new ImageIcon("로그인_시작.png");
		ImageIcon 회원가입버튼 = new ImageIcon("회원가입_시작.png");
		ImageIcon 종료하기버튼 = new ImageIcon("종료하기_시작.png");
		
		
		ImageIcon 메인 = new ImageIcon("메인예시원본.gif");
		JLabel mainImage = new JLabel(메인);
		mainImage.setBounds(12, 0, 505, 300);
		frmAlpha.getContentPane().add(mainImage);

		id = new JTextField();
		id.setBounds(200, 310, 180, 25);
		frmAlpha.getContentPane().add(id);
		id.setColumns(10);

		passWord = new JPasswordField();
		passWord.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {

					UserLogIn uli = new UserLogIn();
					userid = id.getText(); // 태현추가
					userpw = passWord.getText(); // 태현추가
					System.out.println(userid + userpw);

					uli.CompareUser(userid, userpw);

//					MainFrame mainFrame = new MainFrame();
//					mainFrame.frame.setVisible(true); // 다음 프레임 띄우기
//					mainFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
//					mainFrame.frame.setResizable(false);
//					frmAlpha.setVisible(false);

					if (uli.count == 1) {// 바뀌

						frmAlpha.setVisible(false);
					}
					clip.stop();
				}
			}
		});

		UIManager.put("OptionPane.messageFont", (new Font("경기천년제목 Bold", Font.PLAIN, 15)));
	    UIManager.put("OptionPane.buttonFont", (new Font("경기천년제목 Bold", Font.PLAIN, 15)));
	      
		passWord.setBounds(200, 350, 180, 25);
		frmAlpha.getContentPane().add(passWord);
		passWord.setColumns(10);

		SignUpFrame signUpFrame = new SignUpFrame();
		JButton signUp = new JButton(회원가입버튼);
		signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signUpFrame.frame.setVisible(true); // 다음 프레임 띄우기
				signUpFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				signUpFrame.frame.setResizable(false);
			}
		});
		signUp.setBorderPainted(false);
		signUp.setBounds(12, 412, 130, 30);
		frmAlpha.getContentPane().add(signUp);

		JButton logInButton = new JButton(로그인버튼);
		logInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogIn uli = new UserLogIn();
				userid = id.getText(); // 태현추가
				userpw = passWord.getText(); // 태현추가
				System.out.println(userid + userpw);

				uli.CompareUser(userid, userpw);
				clip.stop();

//				MainFrame mainFrame = new MainFrame();
//				mainFrame.frame.setVisible(true); // 다음 프레임 띄우기
//				mainFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
//				mainFrame.frame.setResizable(false);
				if (uli.count == 1) {//바뀌
					
					frmAlpha.setVisible(false);
				}
			}
		});
		logInButton.setBorderPainted(false);
		logInButton.setBounds(204, 412, 130, 30);
		frmAlpha.getContentPane().add(logInButton);

		JButton exit = new JButton(종료하기버튼);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "종료창", JOptionPane.YES_NO_OPTION); // 프로그램
																													// 종료
																													// 다이얼로그
				if (answer == JOptionPane.YES_OPTION) { // 사용자가 yes를 눌렀을 경우
					System.exit(0);
				} else { // 사용자가 Yes 이외의 값을 눌렀을 경우

				}
			}
		});
		exit.setBorderPainted(false);
		exit.setBounds(387, 412, 130, 30);
		frmAlpha.getContentPane().add(exit);

		JLabel idLabel = new JLabel("아이디");
		idLabel.setBackground(new Color(255, 255, 255));
		idLabel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 20));
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setBounds(102, 313, 79, 21);
		frmAlpha.getContentPane().add(idLabel);

		JLabel passWordLabel = new JLabel("비밀번호");
		passWordLabel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 20));
		passWordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passWordLabel.setBounds(110, 352, 79, 21);
		frmAlpha.getContentPane().add(passWordLabel);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame window = new StartFrame();
					window.frmAlpha.setVisible(true);
					window.frmAlpha.setLocationRelativeTo(null);
					window.frmAlpha.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}