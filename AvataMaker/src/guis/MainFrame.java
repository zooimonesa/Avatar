package guis;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
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
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import User.GetInfo;

import javax.swing.JPanel;

public class MainFrame {
	
	   GetInfo mf = new GetInfo();
	   int user_pk = mf.fuserpk;
	   String mainid = mf.fmainid; // 태현
	   String mainnickname = mf.fmainnickname;

	   public void name() {
		   mf.SetUserAll(mainid);
	   }
	   int mainpoint = mf.fmainpoint;
	   int mainhealth = mf.fmainhealth;
	   int mainintelligence = mf.fmainintelligence;
	   int maintalent = mf.fmaintalent;
	   


   public JFrame frame;
   private LineBorder bb = new LineBorder(Color.black, 1, true);

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               MainFrame window = new MainFrame();
               window.frame.setVisible(true);
               window.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
               window.frame.setResizable(false);

            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   public MainFrame() {
      initialize();
      customcursor();
   }

   public void customcursor() { // 마우스포인터 ====================================

      Toolkit tk = Toolkit.getDefaultToolkit();
      Image cursorimage = tk.getImage("마우스포인터_1.png");
      Point point = new Point(20, 20);
      Cursor cursor = tk.createCustomCursor(cursorimage, point, "haha");
      frame.setCursor(cursor);
   } // =======================================================

   private void initialize() {
      frame = new JFrame();
      frame.getContentPane().setBackground(new Color(255, 255, 255));
      frame.setTitle("메인화면");
      frame.setBounds(100, 100, 815, 526);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);

      ImageIcon 캐릭터 = new ImageIcon("농담곰_메인_기본.png");
      ImageIcon 배경 = new ImageIcon("배경.png");
      ImageIcon 상의 = new ImageIcon("목도리.png");
      ImageIcon 능력치바 = new ImageIcon("능력치바.png");
      ImageIcon 체력1 = new ImageIcon("체력_1.png");
      ImageIcon 체력0 = new ImageIcon("체력_0.png");
      ImageIcon 지능1 = new ImageIcon("지능_1.png");
      ImageIcon 지능0 = new ImageIcon("지능_0.png");
      ImageIcon 재능1 = new ImageIcon("재능_1.png");
      ImageIcon 재능0 = new ImageIcon("재능_0.png");

      JLabel nickNameLabel = new JLabel(mainnickname);
      nickNameLabel.setBackground(new Color(255, 255, 255));
      nickNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
      nickNameLabel.setBounds(315, 40, 424, 35);
      frame.getContentPane().add(nickNameLabel);

      JLabel storyLabel = new JLabel("스토리");
      storyLabel.setBackground(new Color(255, 255, 255));
      storyLabel.setVerticalAlignment(SwingConstants.TOP);
      storyLabel.setHorizontalAlignment(SwingConstants.LEFT);
      storyLabel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
      storyLabel.setBounds(40, 291, 150, 160);
      frame.getContentPane().add(storyLabel);

      JPanel healthPointPanel = new JPanel(); // 체력패널
      healthPointPanel.setBounds(315, 85, 424, 35);
      frame.getContentPane().add(healthPointPanel);
      healthPointPanel.setLayout(null);

      JPanel intPointPanel = new JPanel(); // 지능패널
      intPointPanel.setBounds(315, 130, 424, 35);
      frame.getContentPane().add(intPointPanel);
      intPointPanel.setLayout(null);

      JPanel giftPointPanel = new JPanel(); // 재능패널
      giftPointPanel.setBounds(315, 175, 424, 35);
      frame.getContentPane().add(giftPointPanel);
      giftPointPanel.setLayout(null);

      int statPointX = 20; // x좌표고정
      JLabel healthPoint[] = new JLabel[10];
      JLabel intPoint[] = new JLabel[10];
      JLabel giftPoint[] = new JLabel[10];

      for (int i = 0; i < 10; i++) { // 능력치 조절 라벨 =============================================================
         healthPoint[i] = new JLabel(체력1); // 체력있음
//         healthPoint[i] = new JLabel(); // 체력없음
         healthPoint[i].setBounds(statPointX, 8, 21, 19);
         healthPointPanel.add(healthPoint[i]);

         intPoint[i] = new JLabel(지능1); // 지능있음
//         intPoint[i] = new JLabel(); // 지능없음
         intPoint[i].setBounds(statPointX, 8, 21, 19);
         intPointPanel.add(intPoint[i]);

         giftPoint[i] = new JLabel(재능1); // 재능있음
//         giftPoint[i] = new JLabel(); // 재능없음
         giftPoint[i].setBounds(statPointX, 8, 21, 19);
         giftPointPanel.add(giftPoint[i]);

         statPointX += 40;

      } // =================================================================================

      JLabel healthPointBorder = new JLabel(능력치바);
      healthPointBorder.setBounds(0, 0, 424, 35);
      healthPointPanel.add(healthPointBorder);
      healthPointBorder.setHorizontalAlignment(SwingConstants.CENTER);

      JLabel intPointBoder = new JLabel(능력치바);
      intPointBoder.setBounds(0, 0, 424, 35);
      intPointPanel.add(intPointBoder);
      intPointBoder.setHorizontalAlignment(SwingConstants.CENTER);

      JLabel giftPointBoder = new JLabel(능력치바);
      giftPointBoder.setBounds(0, 0, 424, 35);
      giftPointPanel.add(giftPointBoder);
      giftPointBoder.setHorizontalAlignment(SwingConstants.CENTER);

      JButton missionPoint = new JButton("미션");
      missionPoint.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            MissionChoiceFrame missionChoiceFrame = new MissionChoiceFrame();
            missionChoiceFrame.frame.setVisible(true); // 다음 프레임 띄우기
            missionChoiceFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
            missionChoiceFrame.frame.setResizable(false);
            frame.dispose();

         }
      });
      missionPoint.setBounds(315, 291, 97, 50);
      frame.getContentPane().add(missionPoint);

      JButton storePoint = new JButton("상점");
      storePoint.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            StoreFrame storeFrame = new StoreFrame();
            storeFrame.frame.setVisible(true); // 다음 프레임 띄우기
            storeFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
            storeFrame.frame.setResizable(false);

         }
      });
      storePoint.setBounds(424, 291, 97, 50);
      frame.getContentPane().add(storePoint);

      JButton logButton = new JButton("로그");
      logButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            LogFrame logFrame = new LogFrame();
            logFrame.frame.setVisible(true); // 다음 프레임 띄우기
            logFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
            logFrame.frame.setResizable(false);
         }
      });
      logButton.setBounds(533, 291, 97, 50);
      frame.getContentPane().add(logButton);

      JButton logOutButton = new JButton("로그아웃");
      logOutButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            int answer = JOptionPane.showConfirmDialog(null, "로그아웃하시겠습니까?", "로그아웃창", JOptionPane.YES_NO_OPTION); // 로그아웃
            // 다이얼로그
            if (answer == JOptionPane.YES_OPTION) { // 사용자가 yes를 눌렀을 경우
               StartFrame startFrame = new StartFrame();
               startFrame.frmAlpha.setVisible(true);
               startFrame.frmAlpha.setLocationRelativeTo(null); // 창 중간에 나오게함
               startFrame.frmAlpha.setResizable(false);
               frame.dispose();
            } else { // 사용자가 Yes 이외의 값을 눌렀을 경우

            }
         }
      });
      logOutButton.setBounds(642, 291, 97, 50);
      frame.getContentPane().add(logOutButton);

      JButton deleteUserInfo = new JButton("회원탈퇴");
      deleteUserInfo.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("회원탈퇴")) { // 회원탈퇴 버튼 ====================================
               while (true) {

                  String deleteInfo = JOptionPane.showInputDialog(null, "회원탈퇴를 원하시면 '지금탈퇴'를 입력하세요. ", "회원탈퇴",
                        JOptionPane.OK_CANCEL_OPTION);

                  if (deleteInfo.equals("지금탈퇴")) {

                     // 회원탈퇴메소드넣기

                     JOptionPane.showMessageDialog(null, "회원탈퇴되었습니다. 로그인창으로 이동합니다.", "회원탈퇴",
                           JOptionPane.WARNING_MESSAGE);

                     StartFrame startFrame = new StartFrame();
                     startFrame.frmAlpha.setVisible(true);
                     startFrame.frmAlpha.setLocationRelativeTo(null); // 창 중간에 나오게함
                     startFrame.frmAlpha.setResizable(false);
                     frame.dispose();

                     break;

                  } else if (!deleteInfo.equals("지금탈퇴")) {
                     JOptionPane.showMessageDialog(null, "잘못입력하셨습니다.", "회원탈퇴", JOptionPane.PLAIN_MESSAGE);
                  }
               }
            }
//               else if (e.getActionCommand().equals("확인")) {
//               int result = JOptionPane.showConfirmDialog(null, "프로그램을 종료하시 것습니까?", "제목",
//                     JOptionPane.OK_CANCEL_OPTION);
//
//               System.out.printf("%d\n", result);
//               if (result == 0) { // OK=0 , Cancel=2 리턴
//                  System.exit(0);
//               }
//            } else {
//               JOptionPane.showMessageDialog(null, "회원탈퇴되었습니다. 로그인창으로 이동합니다.", "회원탈퇴", JOptionPane.WARNING_MESSAGE);
//            }
         }

      });
      deleteUserInfo.setBounds(642, 401, 97, 50);
      frame.getContentPane().add(deleteUserInfo);

      JLabel userPointLabel = new JLabel("포인트:");
      userPointLabel.setHorizontalAlignment(SwingConstants.LEFT);
      userPointLabel.setBounds(533, 351, 97, 50);
      frame.getContentPane().add(userPointLabel);

      JLabel charHeadLabel = new JLabel();
      charHeadLabel.setBounds(40, 40, 150, 200);
      frame.getContentPane().add(charHeadLabel);

      JLabel charAccLabel = new JLabel();
      charAccLabel.setBounds(40, 40, 150, 200);
      frame.getContentPane().add(charAccLabel);

      JLabel charTopLabel = new JLabel(상의);
      charTopLabel.setBounds(40, 40, 150, 200);
      frame.getContentPane().add(charTopLabel);

      JLabel userCharLabel = new JLabel(캐릭터);
      userCharLabel.setBounds(40, 40, 150, 200);
      frame.getContentPane().add(userCharLabel);

      JLabel charBackgroundLabel = new JLabel(배경);
      charBackgroundLabel.setBounds(40, 40, 150, 200);
      userCharLabel.setBorder(bb);
      frame.getContentPane().add(charBackgroundLabel);

      JLabel userPointLabel_1 = new JLabel(Integer.toString(mainpoint));
      userPointLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
      userPointLabel_1.setBounds(642, 351, 97, 50);
      frame.getContentPane().add(userPointLabel_1);

      JLabel healthPointLabel = new JLabel("체력");
      healthPointLabel.setHorizontalAlignment(SwingConstants.CENTER);
      healthPointLabel.setBounds(246, 85, 57, 35);
      frame.getContentPane().add(healthPointLabel);

      JLabel intPointLabel = new JLabel("지능");
      intPointLabel.setHorizontalAlignment(SwingConstants.CENTER);
      intPointLabel.setBounds(246, 130, 57, 35);
      frame.getContentPane().add(intPointLabel);

      JLabel giftPointLabel = new JLabel("재능");
      giftPointLabel.setHorizontalAlignment(SwingConstants.CENTER);
      giftPointLabel.setBounds(246, 175, 57, 35);
      frame.getContentPane().add(giftPointLabel);

//      ImageIcon mainBackGround = new ImageIcon("메인배경화면예시.png");
//      JLabel lblNewLabel = new JLabel(mainBackGround);
//      lblNewLabel.setBounds(0, 0, 799, 487);
//      frame.getContentPane().add(lblNewLabel);
   }
}