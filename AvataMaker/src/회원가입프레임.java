import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class 회원가입프레임 {

	JFrame frame;
	private JTextField 아이디텍스트필드;
	private JPasswordField 비밀번호텍스트필드;
	private JTextField 닉네임텍스트필드;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					회원가입프레임 window = new 회원가입프레임();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public 회원가입프레임() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));

		frame.setTitle("회원가입");
		frame.setBounds(100, 100, 450, 445);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		JLabel 회원가입라벨 = new JLabel("회원가입");
		회원가입라벨.setBounds(183, 10, 57, 15);
		frame.getContentPane().add(회원가입라벨);

		JLabel 아이디라벨 = new JLabel("아이디");
		아이디라벨.setHorizontalAlignment(SwingConstants.CENTER);
		아이디라벨.setBounds(37, 44, 77, 15);
		frame.getContentPane().add(아이디라벨);

		JLabel 비밀번호라벨 = new JLabel("비밀번호");
		비밀번호라벨.setHorizontalAlignment(SwingConstants.CENTER);
		비밀번호라벨.setBounds(37, 69, 77, 15);
		frame.getContentPane().add(비밀번호라벨);

		JLabel 닉네임라벨 = new JLabel("닉네임");
		닉네임라벨.setHorizontalAlignment(SwingConstants.CENTER);
		닉네임라벨.setBounds(37, 119, 77, 15);
		frame.getContentPane().add(닉네임라벨);

		아이디텍스트필드 = new JTextField();
		아이디텍스트필드.setBounds(126, 41, 133, 21);
		frame.getContentPane().add(아이디텍스트필드);
		아이디텍스트필드.setColumns(10);

		비밀번호텍스트필드 = new JPasswordField();
		비밀번호텍스트필드.setColumns(10);
		비밀번호텍스트필드.setBounds(126, 66, 132, 21);
		frame.getContentPane().add(비밀번호텍스트필드);

		닉네임텍스트필드 = new JTextField();
		닉네임텍스트필드.setColumns(10);
		닉네임텍스트필드.setBounds(126, 116, 133, 21);
		frame.getContentPane().add(닉네임텍스트필드);

		JButton 아이디중복확인버튼 = new JButton("아이디 중복 확인");
		아이디중복확인버튼.setBounds(294, 40, 128, 23);
		frame.getContentPane().add(아이디중복확인버튼);

		JButton 닉네임중복확인버튼 = new JButton("닉네임 중복 확인");
		닉네임중복확인버튼.setBounds(294, 115, 128, 23);
		frame.getContentPane().add(닉네임중복확인버튼);

		JButton 가입하기버튼 = new JButton("가입하기");
		가입하기버튼.setBounds(95, 373, 97, 23);
		frame.getContentPane().add(가입하기버튼);

		JButton 취소하기버튼 = new JButton("취소하기");
		취소하기버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		취소하기버튼.setBounds(234, 373, 97, 23);
		frame.getContentPane().add(취소하기버튼);
	}
}
