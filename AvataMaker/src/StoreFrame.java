import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class StoreFrame {

   JFrame frame;

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               StoreFrame window = new StoreFrame();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   public StoreFrame() {
      initialize();
   }

   private void initialize() {
      frame = new JFrame();
      frame.getContentPane().setBackground(new Color(255, 255, 255));
      frame.setTitle("상점");
      frame.setBounds(100, 100, 815, 526);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.getContentPane().setLayout(null);

      ImageIcon 상점캐릭터 = new ImageIcon("농담곰_상점_기본.png");

      JButton btnNewButton_1 = new JButton("New button");
      btnNewButton_1.setBounds(324, 21, 90, 100);
      frame.getContentPane().add(btnNewButton_1);

      JButton btnNewButton_1_1 = new JButton("New button");
      btnNewButton_1_1.setBounds(324, 131, 90, 100);
      frame.getContentPane().add(btnNewButton_1_1);

      JButton btnNewButton_1_2 = new JButton("New button");
      btnNewButton_1_2.setBounds(324, 241, 90, 100);
      frame.getContentPane().add(btnNewButton_1_2);

      JButton btnNewButton_1_3 = new JButton("New button");
      btnNewButton_1_3.setBounds(324, 351, 90, 100);
      frame.getContentPane().add(btnNewButton_1_3);

      JButton btnNewButton_1_4 = new JButton("New button");
      btnNewButton_1_4.setBounds(426, 21, 90, 100);
      frame.getContentPane().add(btnNewButton_1_4);

      JButton btnNewButton_1_1_1 = new JButton("New button");
      btnNewButton_1_1_1.setBounds(426, 131, 90, 100);
      frame.getContentPane().add(btnNewButton_1_1_1);

      JButton btnNewButton_1_2_1 = new JButton("New button");
      btnNewButton_1_2_1.setBounds(426, 241, 90, 100);
      frame.getContentPane().add(btnNewButton_1_2_1);

      JButton btnNewButton_1_3_1 = new JButton("New button");
      btnNewButton_1_3_1.setBounds(426, 351, 90, 100);
      frame.getContentPane().add(btnNewButton_1_3_1);

      JButton btnNewButton_1_5 = new JButton("New button");
      btnNewButton_1_5.setBounds(528, 21, 90, 100);
      frame.getContentPane().add(btnNewButton_1_5);

      JButton btnNewButton_1_1_2 = new JButton("New button");
      btnNewButton_1_1_2.setBounds(528, 131, 90, 100);
      frame.getContentPane().add(btnNewButton_1_1_2);

      JButton btnNewButton_1_2_2 = new JButton("New button");
      btnNewButton_1_2_2.setBounds(528, 241, 90, 100);
      frame.getContentPane().add(btnNewButton_1_2_2);

      JButton btnNewButton_1_3_2 = new JButton("New button");
      btnNewButton_1_3_2.setBounds(528, 351, 90, 100);
      frame.getContentPane().add(btnNewButton_1_3_2);

      JButton btnNewButton_1_6 = new JButton("New button");
      btnNewButton_1_6.setBounds(630, 21, 90, 100);
      frame.getContentPane().add(btnNewButton_1_6);

      JButton btnNewButton_1_1_3 = new JButton("New button");
      btnNewButton_1_1_3.setBounds(630, 131, 90, 100);
      frame.getContentPane().add(btnNewButton_1_1_3);

      JButton btnNewButton_1_2_3 = new JButton("New button");
      btnNewButton_1_2_3.setBounds(630, 241, 90, 100);
      frame.getContentPane().add(btnNewButton_1_2_3);

      JButton btnNewButton_1_3_3 = new JButton("New button");
      btnNewButton_1_3_3.setBounds(630, 351, 90, 100);
      frame.getContentPane().add(btnNewButton_1_3_3);

      JButton 이전창버튼 = new JButton("이전으로");
      이전창버튼.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            frame.dispose();
         }
      });
      이전창버튼.setHorizontalAlignment(SwingConstants.TRAILING);
      이전창버튼.setBounds(732, 351, 55, 100);
      frame.getContentPane().add(이전창버튼);

      JLabel lblNewLabel = new JLabel(상점캐릭터);
      lblNewLabel.setBackground(Color.YELLOW);
      lblNewLabel.setBounds(12, 21, 300, 430);
      frame.getContentPane().add(lblNewLabel);
   }

}