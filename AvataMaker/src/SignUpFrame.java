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