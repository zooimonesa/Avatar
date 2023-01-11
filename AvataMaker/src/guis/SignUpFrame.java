package guis;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import User.SignUserIn;

import java.awt.Color;
import java.awt.Cursor;

public class SignUpFrame {

	public JFrame frame;
	private JTextField idTextField;
	private JPasswordField passwordTextField;
	private JTextField nickNameTextField;
	String newId;//태현추가
	String newPw; 
	String newNn; 
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpFrame window = new SignUpFrame();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SignUpFrame() {
		initialize();
		customcursor();
	}
	
	public void customcursor() { // 마우스포인터 ====================================
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image cursorimage = tk.getImage("대형견_커서.png");
		Point point = new Point(0, 0);
		Cursor cursor = tk.createCustomCursor(cursorimage, point, "haha");
		frame.setCursor(cursor);
	} // =======================================================

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		
		ImageIcon 회원가입버튼 = new ImageIcon("src/image/회원가입버튼.png");
		ImageIcon 취소하기버튼 = new ImageIcon("src/image/취소하기버튼.png");

		frame.setTitle("회원가입");
		frame.setBounds(100, 100, 450, 445);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		JLabel signUpLabel = new JLabel("회원가입");
		signUpLabel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 20));
		signUpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		signUpLabel.setBounds(126, 10, 174, 39);
		frame.getContentPane().add(signUpLabel);

		JLabel idLabel = new JLabel("아이디");
		idLabel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 12));
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setBounds(37, 62, 77, 15);
		frame.getContentPane().add(idLabel);

		JLabel passwordLabel = new JLabel("비밀번호");
		passwordLabel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 12));
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setBounds(37, 141, 77, 15);
		frame.getContentPane().add(passwordLabel);

		JLabel nickNameLabel = new JLabel("닉네임");
		nickNameLabel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 12));
		nickNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nickNameLabel.setBounds(37, 224, 77, 15);
		frame.getContentPane().add(nickNameLabel);

		idTextField = new JTextField();
		idTextField.setBounds(126, 59, 174, 21);
		frame.getContentPane().add(idTextField);
		idTextField.setColumns(10);

		passwordTextField = new JPasswordField();
		passwordTextField.setColumns(10);
		passwordTextField.setBounds(126, 138, 174, 21);
		frame.getContentPane().add(passwordTextField);

		nickNameTextField = new JTextField();
		nickNameTextField.setColumns(10);
		nickNameTextField.setBounds(126, 221, 174, 21);
		frame.getContentPane().add(nickNameTextField); 

		 
		 
		JButton signUpButton = new JButton(회원가입버튼);
		signUpButton.setBounds(95, 373, 97, 23);
		frame.getContentPane().add(signUpButton);
		signUpButton.addActionListener(new ActionListener() { //태현추가
			public void actionPerformed(ActionEvent e) {
				SignUserIn sui = new SignUserIn();
				
				newId = idTextField.getText();
				newPw = passwordTextField.getText();
				newNn = nickNameTextField.getText();
				
				int dispose = sui.MakeNewUser(newId, newPw, newNn);
				
				if(dispose == 1) {
					frame.dispose();
				}
				
			}
		});

		JButton cancelButton = new JButton(취소하기버튼);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		cancelButton.setBounds(234, 373, 97, 23);
		frame.getContentPane().add(cancelButton);
		
		JLabel lblNewLabel = new JLabel("* 아이디는 영소문자 숫자조합 15자 이하로 만들어 주세요.");
		lblNewLabel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 12));
		lblNewLabel.setBounds(37, 90, 357, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("* 비밀번호는는 영대소문자 숫자조합 15자 이하로 만들어 주세요.");
		lblNewLabel_1.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(37, 169, 367, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("* 닉네임은 특수문자를 제외한 15자 이내로 만들어 주세요.");
		lblNewLabel_1_1.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(37, 249, 367, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
	}
}