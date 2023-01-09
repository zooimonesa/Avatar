package guis;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import User.GetInfo;
import mission.Missions;
import mission.missionSelect;
import mission.missionSelectImpl;

import java.awt.Color;
import java.awt.Cursor;

public class MissionListFrame {
	
	JFrame frame;
	
	String text1;
	String text2;
	String text3;

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
//		int user_pk = 33;
		

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
		JLabel oneDayMissionLabel1 = new JLabel("< 일일 미션 > ");
		oneDayMissionLabel1.setBounds(25, 0, 250, 68);
		oneDayMissionPanel1.add(oneDayMissionLabel1);
		
		JLabel oneDayMissionLabel2 = new JLabel("< 일일 미션 > ");
		oneDayMissionLabel2.setBounds(25, 0, 250, 68);
		oneDayMissionPanel2.add(oneDayMissionLabel2);
		
		JLabel oneWeekMissionLabel = new JLabel("< 주간 미션 > ");
		oneWeekMissionLabel.setBounds(25, 0, 250, 68);
		oneWeekMissionPanel.add(oneWeekMissionLabel);
		
		
		// 미션 설정
		if(mis.getSelectMission(user_pk, selectB, 1).isEmpty()) {
			Missions m1 = mis.RandomMission(selectB, 1);
			Missions m2 = mis.RandomMission(selectB, 1);
			while(m2.equals(m1)) {
				m2 = mis.RandomMission(selectB, 1);
			}
			Missions m3 = mis.RandomMission(selectB, 7);
			mis.setSelectMission(user_pk, m1);
			mis.setSelectMission(user_pk, m2);
			mis.setSelectMission(user_pk, m3);			
		}
		
		
		// 미션 내용 불러오기
		JLabel oneDayMissionLabel1_T = new JLabel();
		text1 = mis.getSelectMission(user_pk, selectB, 1).get(0).getMission();
//		text1 = mis.RandomMission(selectB, 1).getMission();
		oneDayMissionLabel1_T.setText(text1);
		oneDayMissionLabel1_T.setBounds(20, 20, 250, 68);
		oneDayMissionPanel1.add(oneDayMissionLabel1_T);
		
		JLabel oneDayMissionLabel2_T = new JLabel();
		text2 = mis.getSelectMission(user_pk, selectB, 1).get(1).getMission();
//		text2 = mis.RandomMission(selectB, 1).getMission();
		oneDayMissionLabel2_T.setText(text2);
		oneDayMissionLabel2_T.setBounds(20, 20, 250, 68);
		oneDayMissionPanel2.add(oneDayMissionLabel2_T);
		
		JLabel oneWeekMissionLabel1_T = new JLabel();
		text3 = mis.getSelectMission(user_pk, selectB, 7).get(0).getMission();
//		text3 = mis.RandomMission(selectB, 7).getMission();
		oneWeekMissionLabel1_T.setText(text3);
		oneWeekMissionLabel1_T.setBounds(20, 20, 250, 68);
		oneWeekMissionPanel.add(oneWeekMissionLabel1_T);
		
		
		JLabel refreshNoticelbl = new JLabel("* 미션 새로고침시 5Point 차감됩니다.");
		refreshNoticelbl.setBounds(40, 290, 300, 50);
		frame.getContentPane().add(refreshNoticelbl);
		
		JLabel userPointlbl_1 = new JLabel("잔여 포인트 : ");
		userPointlbl_1.setBounds(45, 330, 200, 50);
		frame.getContentPane().add(userPointlbl_1);
		
		JLabel userPointlbl_2 = new JLabel();
		userPointlbl_2.setText(String.valueOf(mf.fmainpoint));
		userPointlbl_2.setBounds(130, 330, 100, 50);
		frame.getContentPane().add(userPointlbl_2);
		
		
		// 이전버튼 생성
		JButton previousButton = new JButton("이전 화면으로");
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
			public void actionPerformed(ActionEvent arg0) {
				if(mis.checkMission(user_pk, 1)) {
					if(mis.insertMission(user_pk, text1, 1) > 0) {
						mis.insertMission(user_pk, text1, 1);
						JOptionPane.showMessageDialog(null, "미션 등록 완료 ", "미션 시작", JOptionPane.INFORMATION_MESSAGE);											
					} else {
						JOptionPane.showMessageDialog(null, "이미 수락한 미션입니다.", "오류", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "미션이 이미 가득 차있습니다.", "오류", JOptionPane.ERROR_MESSAGE);
				}					
			}
		});
		oneDayMissionChoiceButton1.setBounds(290, 25, 40, 40);
		oneDayMissionPanel1.add(oneDayMissionChoiceButton1);
		
		JButton oneDayMissionRefreshButton1 = new JButton();
		oneDayMissionRefreshButton1.setIcon(convertToIcon("새로고침.PNG", 40, 40));
		oneDayMissionRefreshButton1.addActionListener(new ActionListener( ) {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (mis.checkPoint(user_pk, 5)) {
					mis.usePoint(user_pk, 5);
					mf.SetUserAll(mf.fmainid);
					userPointlbl_2.setText(String.valueOf(mf.fmainpoint));
					Missions m1 = mis.RandomMission(selectB, 1); 
					mis.updateSelectMission(user_pk, text1, m1);
					String updateT = m1.getMission();
//					String updateT = mis.RandomMission(selectB, 1).getMission();
					oneDayMissionLabel1_T.setText(updateT);
				} else {
					JOptionPane.showMessageDialog(null, "포인트가 부족합니다", "알림창", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		oneDayMissionRefreshButton1.setBounds(340, 25, 40, 40);
		oneDayMissionPanel1.add(oneDayMissionRefreshButton1);
		
		
		// 두번째 선택하기 or 새로고침 눌렀을때 변화
		JButton oneDayMissionChoiceButton2 = new JButton();
		oneDayMissionChoiceButton2.setIcon(convertToIcon("체크.PNG", 50, 50));
		oneDayMissionChoiceButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(mis.checkMission(user_pk, 1)) {
					if(mis.insertMission(user_pk, text2, 1) > 0) {
						mis.insertMission(user_pk, text2, 1);
						JOptionPane.showMessageDialog(null, "미션 등록 완료 ", "미션 시작", JOptionPane.INFORMATION_MESSAGE);											
					} else {
						JOptionPane.showMessageDialog(null, "이미 수락한 미션입니다.", "오류", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "미션이 이미 가득 차있습니다.", "오류", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		oneDayMissionChoiceButton2.setBounds(290, 25, 40, 40);
		oneDayMissionPanel2.add(oneDayMissionChoiceButton2);
		
		JButton oneDayMissionRefreshButton2 = new JButton();
		oneDayMissionRefreshButton2.setIcon(convertToIcon("새로고침.PNG", 40, 40));
		oneDayMissionRefreshButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (mis.checkPoint(user_pk, 5)) {
					mis.usePoint(user_pk, 5);
					mf.SetUserAll(mf.fmainid);
					userPointlbl_2.setText(String.valueOf(mf.fmainpoint));
					Missions m2 = mis.RandomMission(selectB, 1); 
					mis.updateSelectMission(user_pk, text2, m2);
					String updateT2 = m2.getMission();
//					String updateT2 = mis.RandomMission(selectB, 1).getMission();
					oneDayMissionLabel2_T.setText(updateT2);
				} else {
					JOptionPane.showMessageDialog(null, "포인트가 부족합니다", "알림창", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		oneDayMissionRefreshButton2.setBounds(340, 25, 40, 40);
		oneDayMissionPanel2.add(oneDayMissionRefreshButton2);
		
		
		// 세번째 선택하기 or 새로고침 눌렀을 때 변화
		JButton oneWeekMissionChoiceButton = new JButton();
		oneWeekMissionChoiceButton.setIcon(convertToIcon("체크.PNG", 50, 50));
		oneWeekMissionChoiceButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(mis.checkMission(user_pk, 7)) {
					if(mis.insertMission(user_pk, text3, 7) > 0) {
						mis.insertMission(user_pk, text3, 7);
						mis.userMissionProgress(user_pk, text3);
						JOptionPane.showMessageDialog(null, "미션 등록 완료 ", "미션 시작", JOptionPane.INFORMATION_MESSAGE);					
					} else {
						JOptionPane.showMessageDialog(null, "이미 수락한 미션입니다.", "오류", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "미션이 이미 가득 차있습니다.", "오류", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		oneWeekMissionChoiceButton.setBounds(290, 25, 40, 40);
		oneWeekMissionPanel.add(oneWeekMissionChoiceButton);
		
		JButton oneWeekMissionRefreshButton = new JButton();
		oneWeekMissionRefreshButton.setIcon(convertToIcon("새로고침.PNG", 40, 40));
		oneWeekMissionRefreshButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (mis.checkPoint(user_pk, 5)) {
					mis.usePoint(user_pk, 5);
					mf.SetUserAll(mf.fmainid);
					userPointlbl_2.setText(String.valueOf(mf.fmainpoint));
					Missions m3 = mis.RandomMission(selectB, 7); 
					mis.updateSelectMission(user_pk, text3, m3);
					String updateT3 = m3.getMission();
//					String updateT3 = mis.RandomMission(selectB, 7).getMission();
					oneWeekMissionLabel1_T.setText(updateT3);
				} else {
					JOptionPane.showMessageDialog(null, "포인트가 부족합니다", "알림창", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		oneWeekMissionRefreshButton.setBounds(340, 25, 40, 40);
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
}
