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
 
public class StartFrame {
   public JFrame frmAlpha;
   private JTextField id;
   private JPasswordField passWord;

   public StartFrame() {
      initialize();
   }

   private void initialize() {
      
      
      frmAlpha = new JFrame();import java.awt.Color;
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
      frmAlpha.getContentPane().setBackground(new Color(255, 255, 255));
      frmAlpha.setTitle("프로젝트 다마고치 alpha_0.00");
      frmAlpha.setBounds(100, 100, 545, 507);
      frmAlpha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frmAlpha.getContentPane().setLayout(null);

      ImageIcon 메인 = new ImageIcon("메인예시원본.gif");
      JLabel mainImage = new JLabel(메인);
      mainImage.setForeground(UIManager.getColor("Button.focus"));
      mainImage.setBackground(new Color(0, 0, 0));
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
            mainFrame.frame.setBounds(100, 100, 815, 526);
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
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }
}