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

public class SignUpFrame {
 
   JFrame frame;
   private JTextField idTextField;
   private JPasswordField passwordTextField;
   private JTextField nickNameTextField;

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               SignUpFrame window = new SignUpFrame();
               window.frame.setVisible(true);
            } catch (Exception e) {import java.awt.EventQueue;
            import java.awt.event.ActionEvent;
            import java.awt.event.ActionListener;
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
            import java.awt.event.KeyAdapter;
            import java.awt.event.KeyEvent;

            public class StartFrame {
            	public JFrame frmAlpha;
            	private JTextField id;
            	private JPasswordField passWord;

            	public StartFrame() {
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
            		JLabel mainImage = new JLabel(메인);
            		mainImage.setBounds(12, 10, 505, 259);
            		frmAlpha.getContentPane().add(mainImage);

            		id = new JTextField();
            		id.setBounds(164, 307, 205, 21);
            		frmAlpha.getContentPane().add(id);
            		id.setColumns(10);

            		passWord = new JPasswordField();
            		passWord.addKeyListener(new KeyAdapter() {
            			@Override
            			public void keyPressed(KeyEvent e) {
            				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
            				MainFrame mainFrame = new MainFrame();
            				mainFrame.frame.setVisible(true); // 다음 프레임 띄우기
            				mainFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
            				mainFrame.frame.setResizable(false);
            				frmAlpha.setVisible(false);
            				}
            			}
            		});
            		
            		passWord.setBounds(164, 350, 205, 21);
            		frmAlpha.getContentPane().add(passWord);
            		passWord.setColumns(10);

            		SignUpFrame signUpFrame = new SignUpFrame();
            		JButton signUp = new JButton("회원가입");
            		signUp.addActionListener(new ActionListener() {
            			public void actionPerformed(ActionEvent e) {
            				signUpFrame.frame.setVisible(true); // 다음 프레임 띄우기
            				signUpFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
            				signUpFrame.frame.setResizable(false);
            			}
            		});
            		signUp.setBounds(12, 412, 130, 23);
            		frmAlpha.getContentPane().add(signUp);

            		JButton logInButton = new JButton("로그인");
            		logInButton.addActionListener(new ActionListener() {
            			public void actionPerformed(ActionEvent e) {
            				MainFrame mainFrame = new MainFrame();
            				mainFrame.frame.setVisible(true); // 다음 프레임 띄우기
            				mainFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
            				mainFrame.frame.setResizable(false);
            				frmAlpha.setVisible(false);

            			}
            		});
            		
            		logInButton.setBounds(204, 412, 130, 23);
            		frmAlpha.getContentPane().add(logInButton);

            		JButton exit = new JButton("종료");
            		exit.addActionListener(new ActionListener() {
            			public void actionPerformed(ActionEvent e) {
            				System.exit(0);
            			}
            		});
            		
            		exit.setBounds(387, 412, 130, 23);
            		frmAlpha.getContentPane().add(exit);

            		JLabel idLabel = new JLabel("아이디");
            		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
            		idLabel.setBounds(85, 310, 57, 15);
            		frmAlpha.getContentPane().add(idLabel);

            		JLabel passWordLabel = new JLabel("비밀번호");
            		passWordLabel.setHorizontalAlignment(SwingConstants.CENTER);
            		passWordLabel.setBounds(85, 353, 57, 15);
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
            import javax.swing.JButton;
            import javax.swing.JFrame;
            import javax.swing.JLabel;
            import javax.swing.JPasswordField;
            import javax.swing.JTextField;
            import javax.swing.SwingConstants;
            import java.awt.Color;

            public class SignUpFrame {

            	JFrame frame;
            	private JTextField idTextField;
            	private JPasswordField passwordTextField;
            	private JTextField nickNameTextField;

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
            	}

            	private void initialize() {
            		frame = new JFrame();
            		frame.getContentPane().setBackground(new Color(255, 255, 255));

            		frame.setTitle("회원가입");
            		frame.setBounds(100, 100, 450, 445);
            		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            		frame.getContentPane().setLayout(null);
            		frame.setResizable(false);

            		JLabel signUpLabel = new JLabel("회원가입");
            		signUpLabel.setBounds(183, 10, 57, 15);
            		frame.getContentPane().add(signUpLabel);

            		JLabel idLabel = new JLabel("아이디");
            		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
            		idLabel.setBounds(37, 44, 77, 15);
            		frame.getContentPane().add(idLabel);

            		JLabel passwordLabel = new JLabel("비밀번호");
            		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
            		passwordLabel.setBounds(37, 69, 77, 15);
            		frame.getContentPane().add(passwordLabel);

            		JLabel nickNameLabel = new JLabel("닉네임");
            		nickNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
            		nickNameLabel.setBounds(37, 119, 77, 15);
            		frame.getContentPane().add(nickNameLabel);

            		idTextField = new JTextField();
            		idTextField.setBounds(126, 41, 133, 21);
            		frame.getContentPane().add(idTextField);
            		idTextField.setColumns(10);

            		passwordTextField = new JPasswordField();
            		passwordTextField.setColumns(10);
            		passwordTextField.setBounds(126, 66, 132, 21);
            		frame.getContentPane().add(passwordTextField);

            		nickNameTextField = new JTextField();
            		nickNameTextField.setColumns(10);
            		nickNameTextField.setBounds(126, 116, 133, 21);
            		frame.getContentPane().add(nickNameTextField);

            		JButton idDoubleCheckButton = new JButton("아이디 중복 확인");
            		idDoubleCheckButton.setBounds(294, 40, 128, 23);
            		frame.getContentPane().add(idDoubleCheckButton);

            		JButton nickNameDoubleCheckButton = new JButton("닉네임 중복 확인");
            		nickNameDoubleCheckButton.setBounds(294, 115, 128, 23);
            		frame.getContentPane().add(nickNameDoubleCheckButton);

            		JButton signUpButton = new JButton("가입하기");
            		signUpButton.setBounds(95, 373, 97, 23);
            		frame.getContentPane().add(signUpButton);

            		JButton cancelButton = new JButton("취소하기");
            		cancelButton.addActionListener(new ActionListener() {
            			public void actionPerformed(ActionEvent e) {
            				frame.dispose();
            			}
            		});
            		cancelButton.setBounds(234, 373, 97, 23);
            		frame.getContentPane().add(cancelButton);
            	}
            }

               e.printStackTrace();
            }
         }
      });
   }

   public SignUpFrame() {
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

      JLabel signUpLabel = new JLabel("회원가입");
      signUpLabel.setBounds(183, 10, 57, 15);
      frame.getContentPane().add(signUpLabel);

      JLabel idLabel = new JLabel("아이디");
      idLabel.setHorizontalAlignment(SwingConstants.CENTER);
      idLabel.setBounds(37, 44, 77, 15);
      frame.getContentPane().add(idLabel);

      JLabel passwordLabel = new JLabel("비밀번호");
      passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
      passwordLabel.setBounds(37, 69, 77, 15);
      frame.getContentPane().add(passwordLabel);

      JLabel nickNameLabel = new JLabel("닉네임");
      nickNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
      nickNameLabel.setBounds(37, 119, 77, 15);
      frame.getContentPane().add(nickNameLabel);

      idTextField = new JTextField();
      idTextField.setBounds(126, 41, 133, 21);
      frame.getContentPane().add(idTextField);
      idTextField.setColumns(10);

      passwordTextField = new JPasswordField();
      passwordTextField.setColumns(10);
      passwordTextField.setBounds(126, 66, 132, 21);
      frame.getContentPane().add(passwordTextField);

      nickNameTextField = new JTextField();
      nickNameTextField.setColumns(10);
      nickNameTextField.setBounds(126, 116, 133, 21);
      frame.getContentPane().add(nickNameTextField);

      JButton idDoubleCheckButton = new JButton("아이디 중복 확인");
      idDoubleCheckButton.setBounds(294, 40, 128, 23);
      frame.getContentPane().add(idDoubleCheckButton);

      JButton nickNameDoubleCheckButton = new JButton("닉네임 중복 확인");
      nickNameDoubleCheckButton.setBounds(294, 115, 128, 23);
      frame.getContentPane().add(nickNameDoubleCheckButton);

      JButton signUpButton = new JButton("가입하기");
      signUpButton.setBounds(95, 373, 97, 23);
      frame.getContentPane().add(signUpButton);

      JButton cancelButton = new JButton("취소하기");
      cancelButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            frame.dispose();
         }
      });
      cancelButton.setBounds(234, 373, 97, 23);
      frame.getContentPane().add(cancelButton);
   }
}