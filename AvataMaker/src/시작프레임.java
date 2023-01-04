import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class 시작프레임 {
	public JFrame frmAlpha;
	private JTextField 아이디;
	private JPasswordField 패스워드;

	public 시작프레임() {
		initialize();
	}

	private void initialize() {
		
		
		frmAlpha = new JFrame();
		frmAlpha.getContentPane().setBackground(new Color(255, 255, 255));
		frmAlpha.setTitle("프로젝트 다마고치 alpha_0.00");
		frmAlpha.setBounds(100, 100, 545, 507);
		frmAlpha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlpha.getContentPane().setLayout(null);

		ImageIcon 메인 = new ImageIcon("메인예시원본.gif");
		JLabel 메인이미지 = new JLabel(메인);
		메인이미지.setForeground(UIManager.getColor("Button.focus"));
		메인이미지.setBackground(new Color(0, 0, 0));
		메인이미지.setBounds(12, 10, 505, 259);
		frmAlpha.getContentPane().add(메인이미지);

		아이디 = new JTextField();
		아이디.setBounds(164, 307, 205, 21);
		frmAlpha.getContentPane().add(아이디);
		아이디.setColumns(10);
		

		패스워드 = new JPasswordField();
		패스워드.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER   ) {
					
				/*아이디와 패스워드를 스트링으로 변환 후 데이터와 비교
				 if(아이디 비밀번호가 데베에 있으면  아래구문 실행) */
					
				메인화면프레임 메인화면프레임새창 = new 메인화면프레임();
				메인화면프레임새창.frame.setVisible(true); // 다음 프레임 띄우기
				메인화면프레임새창.frame.setBounds(100, 100, 815, 526);
				메인화면프레임새창.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				메인화면프레임새창.frame.setResizable(false);
				frmAlpha.setVisible(false);
				/*엘스면  경고문*/
				}
			}
		});
		
		패스워드.setBounds(164, 350, 205, 21);
		frmAlpha.getContentPane().add(패스워드);
		패스워드.setColumns(10);

		회원가입프레임 회원가입새창 = new 회원가입프레임();
		JButton 회원가입 = new JButton("회원가입");
		회원가입.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				회원가입새창.frame.setVisible(true); // 다음 프레임 띄우기
				회원가입새창.frame.setBounds(100, 100, 450, 445);
				회원가입새창.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
			}
		});
		회원가입.setBounds(12, 412, 130, 23);
		frmAlpha.getContentPane().add(회원가입);

		JButton 로그인 = new JButton("로그인");
		로그인.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*아이디와 패스워드를 스트링으로 변환 후 데이터와 비교
				 if(아이디 비밀번호가 데베에 있으면  아래구문 실행) */
					
				메인화면프레임 메인화면프레임새창 = new 메인화면프레임();
				메인화면프레임새창.frame.setVisible(true); // 다음 프레임 띄우기
				메인화면프레임새창.frame.setBounds(100, 100, 815, 526);
				메인화면프레임새창.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				메인화면프레임새창.frame.setResizable(false);
				frmAlpha.setVisible(false);
				
				/*엘스면 경고문*/

			}
		});
		로그인.setBounds(204, 412, 130, 23);
		frmAlpha.getContentPane().add(로그인);

		JButton 종료 = new JButton("종료");
		종료.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		종료.setBounds(387, 412, 130, 23);
		frmAlpha.getContentPane().add(종료);

		JLabel 아이디라벨 = new JLabel("아이디");
		아이디라벨.setHorizontalAlignment(SwingConstants.CENTER);
		아이디라벨.setBounds(85, 310, 57, 15);
		frmAlpha.getContentPane().add(아이디라벨);

		JLabel 비밀번호라벨 = new JLabel("비밀번호");
		비밀번호라벨.setHorizontalAlignment(SwingConstants.CENTER);
		비밀번호라벨.setBounds(85, 353, 57, 15);
		frmAlpha.getContentPane().add(비밀번호라벨);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					시작프레임 window = new 시작프레임();
					window.frmAlpha.setVisible(true);
					window.frmAlpha.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}