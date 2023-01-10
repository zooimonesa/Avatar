package guis;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import User.GetInfo;
import mission.Missions;
import mission.missionSelect;
import mission.missionSelectImpl;
import sun.tools.jar.resources.jar;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MissionListFrame {
   
   JFrame frame;
   
   String text1;
   String text2;
   String text3;

private JCheckBox term1;

private JCheckBox term7;

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               // 이 class에서만 열때 운동으로 열림
               MissionListFrame window = new MissionListFrame("운동");
               window.frame.setVisible(true);
               window.frame.setLocationRelativeTo(null);
               window.frame.setResizable(false);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   public MissionListFrame(String selectB) {
      initialize(selectB);
      customcursor();
   }
   public void customcursor() { // 마우스포인터 ====================================
      
      Toolkit tk = Toolkit.getDefaultToolkit();
      Image cursorimage = tk.getImage("대형견_커서.png");
      Point point = new Point(0, 0);
      Cursor cursor = tk.createCustomCursor(cursorimage, point, "haha");
      frame.setCursor(cursor);
   } // =======================================================

   private void initialize(String selectB) {
      // 인터페이스 불러오기
      missionSelect mis = new missionSelectImpl();
      GetInfo mf = new GetInfo();
      int user_pk = mf.fuserpk;
//      int user_pk = 33;
      

      frame = new JFrame();
      frame.getContentPane().setBackground(new Color(255, 255, 255));
      frame.setTitle("미션");
      frame.setBounds(100, 100, 490, 450);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JPanel oneDayMissionPanel1 = new JPanel();
      oneDayMissionPanel1.setBackground(new Color(255, 255, 255));
      oneDayMissionPanel1.setBorder(new LineBorder(new Color(0, 0, 0)));
      oneDayMissionPanel1.setBounds(37, 22, 404, 88);
      frame.getContentPane().add(oneDayMissionPanel1);
      oneDayMissionPanel1.setLayout(null);
      
      JPanel oneDayMissionPanel2 = new JPanel();
      oneDayMissionPanel2.setLayout(null);
      oneDayMissionPanel2.setBorder(new LineBorder(new Color(0, 0, 0)));
      oneDayMissionPanel2.setBackground(Color.WHITE);
      oneDayMissionPanel2.setBounds(37, 120, 404, 88);
      frame.getContentPane().add(oneDayMissionPanel2);
      
      JPanel oneWeekMissionPanel = new JPanel();
      oneWeekMissionPanel.setLayout(null);
      oneWeekMissionPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
      oneWeekMissionPanel.setBackground(Color.WHITE);
      oneWeekMissionPanel.setBounds(37, 218, 404, 88);
      frame.getContentPane().add(oneWeekMissionPanel);
      
      
      // 미션이름 레이블 적용
      JLabel oneDayMissionLabel1 = new JLabel("< 개인 미션 > ");
      oneDayMissionLabel1.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
      oneDayMissionLabel1.setHorizontalAlignment(SwingConstants.CENTER);
      oneDayMissionLabel1.setBounds(60, 0, 291, 26);
      oneDayMissionPanel1.add(oneDayMissionLabel1);
      
      JLabel oneDayMissionLabel2 = new JLabel("< 일일 미션 > ");
      oneDayMissionLabel2.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
      oneDayMissionLabel2.setHorizontalAlignment(SwingConstants.CENTER);
      oneDayMissionLabel2.setBounds(60, 0, 291, 26);
      oneDayMissionPanel2.add(oneDayMissionLabel2);
      
      JLabel oneWeekMissionLabel = new JLabel("< 주간 미션 > ");
      oneWeekMissionLabel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
      oneWeekMissionLabel.setHorizontalAlignment(SwingConstants.CENTER);
      oneWeekMissionLabel.setBounds(60, 0, 291, 26);
      oneWeekMissionPanel.add(oneWeekMissionLabel);
      
      
      // 미션 설정
      if(mis.getSelectMission(user_pk, selectB, 1).isEmpty()) {
    	 Missions m1 = Noduplicate(user_pk, selectB, 1);
         Missions m2 = Noduplicate(user_pk, selectB, 7);
         mis.setSelectMission(user_pk, m1);
         mis.setSelectMission(user_pk, m2);
      }
      
      
      // 미션 내용 불러오기
      JTextField oneDayMissionLabel1_T = new JTextField();
      oneDayMissionLabel1_T.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 12));
      text1 = "미션을 입력하세요.";
      
      
      oneDayMissionLabel1_T.setText(text1);
      oneDayMissionLabel1_T.setForeground(Color.gray);
      oneDayMissionLabel1_T.setBounds(20, 25, 250, 40);
      oneDayMissionLabel1_T.addMouseListener(new MouseListener() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			oneDayMissionLabel1_T.setText("");
		}
		@Override
		public void mouseEntered(MouseEvent e) {
		}
		@Override
		public void mouseExited(MouseEvent e) {
		}
		@Override
		public void mousePressed(MouseEvent e) {
		}
		@Override
		public void mouseReleased(MouseEvent e) {
		}
      });
      oneDayMissionPanel1.add(oneDayMissionLabel1_T);
      
      term1 = new JCheckBox("1일");
      term1.setBounds(280, 25, 50, 20); 
      term1.setBackground(Color.WHITE);
      oneDayMissionPanel1.add(term1);

      term7 = new JCheckBox("7일");
      term7.setBounds(280, 45, 50, 20); 
      term7.setBackground(Color.WHITE);
      oneDayMissionPanel1.add(term7);
      
      ButtonGroup bg = new ButtonGroup();
      bg.add(term1);
      bg.add(term7);
      
      
      term1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int term = 0;
			if(term1.isSelected()) {
				term = 1;
			}
		}
	});
      term7.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int term = 0;
			if(term7.isSelected()) {
				term = 7;
			}
		}
	});
      
     
      
      JLabel oneDayMissionLabel2_T = new JLabel();
      oneDayMissionLabel2_T.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 12));
      text2 = mis.getSelectMission(user_pk, selectB, 1).get(0).getMission();
      oneDayMissionLabel2_T.setText(text2);
      oneDayMissionLabel2_T.setBounds(20, 25, 250, 40);
      oneDayMissionPanel2.add(oneDayMissionLabel2_T);
      
      JLabel oneWeekMissionLabel1_T = new JLabel();
      oneWeekMissionLabel1_T.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 12));
      text3 = mis.getSelectMission(user_pk, selectB, 7).get(0).getMission();
      oneWeekMissionLabel1_T.setText(text3);
      oneWeekMissionLabel1_T.setBounds(20, 25, 250, 40);
      oneWeekMissionPanel.add(oneWeekMissionLabel1_T);
      
      
      JLabel refreshNoticelbl = new JLabel("* 미션 새로고침시 5Point 차감됩니다.");
      refreshNoticelbl.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 13));
      refreshNoticelbl.setBounds(40, 290, 300, 50);
      frame.getContentPane().add(refreshNoticelbl);
      
      JLabel userPointlbl_1 = new JLabel("잔여 포인트 : ");
      userPointlbl_1.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 13));
      userPointlbl_1.setBounds(45, 330, 200, 50);
      frame.getContentPane().add(userPointlbl_1);
      
      JLabel userPointlbl_2 = new JLabel();
      userPointlbl_2.setText(String.valueOf(mf.fmainpoint));
      userPointlbl_2.setBounds(130, 330, 100, 50);
      frame.getContentPane().add(userPointlbl_2);
      
      
      // 이전버튼 생성
      JButton previousButton = new JButton("이전 화면으로");
      previousButton.setForeground(new Color(255, 255, 255));
      previousButton.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
      previousButton.setBackground(new Color(0, 128, 255));
      previousButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            frame.dispose();
         }
      });
      previousButton.setBounds(300, 330, 140, 50);
      frame.getContentPane().add(previousButton);
      
      
      // 선택하기 or 새로고침 눌렀을때 변화
      JButton oneDayMissionChoiceButton1 = new JButton();
      oneDayMissionChoiceButton1.setIcon(convertToIcon("체크.PNG", 50, 50));
      oneDayMissionChoiceButton1.addActionListener(new ActionListener() {
    	  @Override
    	  public void actionPerformed(ActionEvent e) {
    		String state = "수락";
    		  
    		  
    		  if(mis.checkMission(user_pk, 1)) {
    			  if(!oneDayMissionLabel2_T.getText().isEmpty() && !oneDayMissionLabel1_T.getText().equals("")) {
    				  // 미션 등록
    				  mis.insertMission(user_pk, selectB, oneDayMissionLabel1_T.getText(), 1);
    				  mis.missionLog(user_pk, oneDayMissionLabel1_T.getText(), state);
    				  JOptionPane.showMessageDialog(null, "미션 등록 완료 ", "미션 시작", JOptionPane.INFORMATION_MESSAGE);   
    				  // 새로운 미션
    				  oneDayMissionLabel1_T.setText(text1);
    			  } else {
    				  JOptionPane.showMessageDialog(null, "미션내용을 입력해주세요.", "오류", JOptionPane.ERROR_MESSAGE);
    			  }
    		  } else {
    			  JOptionPane.showMessageDialog(null, "미션이 이미 가득 차있습니다.", "오류", JOptionPane.ERROR_MESSAGE);
    		  }
    	  }
      });
      oneDayMissionChoiceButton1.setBounds(340, 25, 40, 40);
      oneDayMissionPanel1.add(oneDayMissionChoiceButton1);
      
      
      // 두번째 선택하기 or 새로고침 눌렀을때 변화
      JButton oneDayMissionChoiceButton2 = new JButton();
      oneDayMissionChoiceButton2.setIcon(convertToIcon("체크.PNG", 50, 50));
      oneDayMissionChoiceButton2.addActionListener(new ActionListener() {
    	  @Override
    	  public void actionPerformed(ActionEvent arg0) {
    		  String state = "수락";
    		  if(mis.checkMission(user_pk, 1)) {
    			  if(mis.insertMission(user_pk, selectB, text2, 1) > 0) {
    				  // 미션등록
    				  mis.missionLog(user_pk, text2, state);
    				  JOptionPane.showMessageDialog(null, "미션 등록 완료 ", "미션 시작", JOptionPane.INFORMATION_MESSAGE);
    				  // 새로운 미션
    				  Missions m1 = Noduplicate(user_pk, selectB, 1); 
    				  mis.deleteSelectMission(user_pk, text2);
    				  mis.setSelectMission(user_pk, m1);
    				  text2 = m1.getMission();
    				  oneDayMissionLabel2_T.setText(text2);
    			  } else {
    				  JOptionPane.showMessageDialog(null, "이미 수락한 미션입니다.", "오류", JOptionPane.ERROR_MESSAGE);
    			  }
    		  } else {
    			  JOptionPane.showMessageDialog(null, "미션이 이미 가득 차있습니다.", "오류", JOptionPane.ERROR_MESSAGE);
    		  }               
    	  }
      });
      oneDayMissionChoiceButton2.setBounds(340, 25, 40, 40);
      oneDayMissionPanel2.add(oneDayMissionChoiceButton2);
      
      // 두번째 새로고침
      JButton oneDayMissionRefreshButton2 = new JButton();
      oneDayMissionRefreshButton2.setIcon(convertToIcon("새로고침.PNG", 40, 40));
      oneDayMissionRefreshButton2.addActionListener(new ActionListener( ) {
    	  @Override
    	  public void actionPerformed(ActionEvent e) {
    		  if (mis.checkPoint(user_pk, 5)) {
    			  //포인트 변경
    			  mis.usePoint(user_pk, 5);
    			  mf.SetUserAll(mf.fmainid);
    			  userPointlbl_2.setText(String.valueOf(mf.fmainpoint));
    			  // 미션바꾸기
    			  Missions m1 = Noduplicate(user_pk, selectB, 1);
    			  while(text2.equals(m1.getMission())) {
    				  m1 = Noduplicate(user_pk, selectB, 1);
    			  }
    			  mis.deleteSelectMission(user_pk, text2);
    			  mis.setSelectMission(user_pk, m1);
    			  text2 = m1.getMission();
    			  oneDayMissionLabel2_T.setText(text2);
    		  } else {
    			  JOptionPane.showMessageDialog(null, "포인트가 부족합니다", "알림창", JOptionPane.ERROR_MESSAGE);
    		  }
    	  }
      });
      oneDayMissionRefreshButton2.setBounds(290, 25, 40, 40);
      oneDayMissionPanel2.add(oneDayMissionRefreshButton2);
      
      
      // 세번째 선택하기 or 새로고침 눌렀을 때 변화
      JButton oneWeekMissionChoiceButton = new JButton();
      oneWeekMissionChoiceButton.setIcon(convertToIcon("체크.PNG", 50, 50));
      oneWeekMissionChoiceButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String state = "수락";
            if(mis.checkMission(user_pk, 7)) {
               if(mis.insertMission(user_pk, selectB, text3, 7) > 0) {
                  // 미션 등록
                  mis.missionLog(user_pk, text3, state);
                  mis.userMissionProgress(user_pk, text3);
                  JOptionPane.showMessageDialog(null, "미션 등록 완료 ", "미션 시작", JOptionPane.INFORMATION_MESSAGE);
                  // 새로운 미션
                  Missions m2 = Noduplicate(user_pk, selectB, 7);
                  mis.deleteSelectMission(user_pk, text3);
                  mis.setSelectMission(user_pk, m2);
                  text3 = m2.getMission();
                  oneWeekMissionLabel1_T.setText(text3);
               } else {
                  JOptionPane.showMessageDialog(null, "이미 수락한 미션입니다.", "오류", JOptionPane.ERROR_MESSAGE);
               }
            } else {
               JOptionPane.showMessageDialog(null, "미션이 이미 가득 차있습니다.", "오류", JOptionPane.ERROR_MESSAGE);
            }
         }
      });
      oneWeekMissionChoiceButton.setBounds(340, 25, 40, 40);
      oneWeekMissionPanel.add(oneWeekMissionChoiceButton);
      
      // 세번째 새로고침
      JButton oneWeekMissionRefreshButton = new JButton();
      oneWeekMissionRefreshButton.setIcon(convertToIcon("새로고침.PNG", 40, 40));
      oneWeekMissionRefreshButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            if (mis.checkPoint(user_pk, 5)) {
               // 포인트 사용
               mis.usePoint(user_pk, 5);
               mf.SetUserAll(mf.fmainid);
               userPointlbl_2.setText(String.valueOf(mf.fmainpoint));
               // 미션변경
               Missions m2 = Noduplicate(user_pk, selectB, 7);
               while(text3.equals(m2.getMission())) {
            	   m2 = Noduplicate(user_pk, selectB, 7);
               }
               mis.deleteSelectMission(user_pk, text3);
               mis.setSelectMission(user_pk, m2);
               text3 = m2.getMission();
               oneWeekMissionLabel1_T.setText(text3);
            } else {
               JOptionPane.showMessageDialog(null, "포인트가 부족합니다", "알림창", JOptionPane.ERROR_MESSAGE);
            }
         }
      });
      oneWeekMissionRefreshButton.setBounds(290, 25, 40, 40);
      oneWeekMissionPanel.add(oneWeekMissionRefreshButton);
   }   
   
   public ImageIcon convertToIcon(String name, int width, int height) {
      String imageName = name;
      Toolkit kit = Toolkit.getDefaultToolkit();
      ClassLoader classLoader = getClass().getClassLoader();
      Image image = kit.getImage(classLoader.getResource(imageName));
      image = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
      ImageIcon icon = new ImageIcon(image);
      return icon;
   }
   
   public Missions Noduplicate(int user_pk, String selectB, int term) {
	 missionSelect mis = new missionSelectImpl();
	 Missions m1 = mis.RandomMission(selectB, term);
	 List<Missions> list = new ArrayList<>(mis.userMission(user_pk, term));
  	 for (int i = 0; i < list.size(); i++) {
  		 if(list.get(i).getMission().equals(m1.getMission())) {
  			 m1 = mis.RandomMission(selectB, term);
  			 i = 0;
  		 	}
		}
  	 return m1;
   }
   
}
