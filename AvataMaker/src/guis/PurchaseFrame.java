package guis;


 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class PurchaseFrame {

   JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               PurchaseFrame window = new PurchaseFrame();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   public PurchaseFrame() {
      initialize();
   }

   private void initialize() {
      frame = new JFrame();
      frame.getContentPane().setBackground(new Color(255, 255, 255));
      frame.setBackground(new Color(255, 255, 255));
      frame.setBounds(100, 100, 417, 489);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      ImageIcon baseStoreChar = new ImageIcon("농담곰_상점_미리보기.png");
      ImageIcon charEquipMent = new ImageIcon("목도리_상점_미리보기.png");
      
      
      JButton previousButton = new JButton("이전으로");
      previousButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            frame.dispose();
         }
      });
      previousButton.setBounds(12, 417, 97, 23);
      frame.getContentPane().add(previousButton);
      
      JButton buyButton = new JButton("구입하기");
      buyButton.setBounds(292, 417, 97, 23);
      frame.getContentPane().add(buyButton);
      
      JToggleButton equip_unequipButton = new JToggleButton("착용하기");
      equip_unequipButton.setBounds(121, 417, 159, 23);
      frame.getContentPane().add(equip_unequipButton);
      
      JLabel price = new JLabel("가격 ~~포인트");
      price.setHorizontalAlignment(SwingConstants.CENTER);
      price.setBounds(121, 10, 159, 42);
      frame.getContentPane().add(price);
      
      
      
      
      
      
      
      JLabel wearChar = new JLabel(charEquipMent);
      wearChar.setBounds(0, 0, 400, 450);
      frame.getContentPane().add(wearChar);
      
      JLabel baseChar = new JLabel(baseStoreChar);
      baseChar.setBounds(0, 0, 400, 450);
      frame.getContentPane().add(baseChar);
   }
}