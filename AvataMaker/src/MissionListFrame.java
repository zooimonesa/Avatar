import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class MissionListFrame {

   JFrame frame;

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               MissionListFrame window = new MissionListFrame();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   public MissionListFrame() {
      initialize();
   }

   private void initialize() {
      frame = new JFrame();
      frame.getContentPane().setBackground(new Color(255, 255, 255));
      frame.setTitle("미션");
      frame.setBounds(100, 100, 450, 450);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JLabel oneDayMissionLabel1 = new JLabel("하루미션~~");
      oneDayMissionLabel1.setBounds(55, 30, 250, 50);
      frame.getContentPane().add(oneDayMissionLabel1);
      
      JLabel oneDayMissionLabel2 = new JLabel("하루미션~~");
      oneDayMissionLabel2.setBounds(55, 124, 250, 50);
      frame.getContentPane().add(oneDayMissionLabel2);
      
      JLabel oneWeekMissionLabel = new JLabel("일주일 미션~~");
      oneWeekMissionLabel.setBounds(55, 218, 250, 50);
      frame.getContentPane().add(oneWeekMissionLabel);
      
      
      JButton previousButton = new JButton("이전으로");
      previousButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            frame.dispose();
         }
      });
      previousButton.setBounds(161, 332, 140, 50);
      frame.getContentPane().add(previousButton);
      
      JButton oneDayMissionChoiceButton1 = new JButton("선택하기");
      oneDayMissionChoiceButton1.setBounds(325, 30, 97, 23);
      frame.getContentPane().add(oneDayMissionChoiceButton1);
      
      JButton oneDayMissionRefreshButton1 = new JButton("새로고침");
      oneDayMissionRefreshButton1.setBounds(325, 61, 97, 23);
      frame.getContentPane().add(oneDayMissionRefreshButton1);
      
      JButton oneDayMissionChoiceButton2 = new JButton("선택하기");
      oneDayMissionChoiceButton2.setBounds(325, 124, 97, 23);
      frame.getContentPane().add(oneDayMissionChoiceButton2);
      
      JButton oneDayMissionRefreshButton2 = new JButton("새로고침");
      oneDayMissionRefreshButton2.setBounds(325, 155, 97, 23);
      frame.getContentPane().add(oneDayMissionRefreshButton2);
      
      JButton oneWeekMissionChoiceButton = new JButton("선택하기");
      oneWeekMissionChoiceButton.setBounds(325, 218, 97, 23);
      frame.getContentPane().add(oneWeekMissionChoiceButton);
      
      JButton oneWeekMissionRefreshButton = new JButton("새로고침");
      oneWeekMissionRefreshButton.setBounds(325, 249, 97, 23);
      frame.getContentPane().add(oneWeekMissionRefreshButton);
   }
}