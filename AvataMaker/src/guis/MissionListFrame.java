package guis;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import User.GetInfo;
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
		Image cursorimage = tk.getImage("마우스포인터_1.png");
		Point point = new Point(20, 20);
		Cursor cursor = tk.createCustomCursor(cursorimage, point, "haha");
		frame.setCursor(cursor);
	} // =======================================================

	private void initialize(String selectB) {
		// 인터페이스 불러오기
		missionSelect mis = new missionSelectImpl();
		GetInfo mf = new GetInfo();
		
		int user_pk = 7;
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("미션");
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// 미션이름 레이블 적용
		JLabel oneDayMissionLabel1 = new JLabel("< 일일 미션 > ");
		oneDayMissionLabel1.setBounds(50, 20, 250, 50);
		frame.getContentPane().add(oneDayMissionLabel1);
		
		JLabel oneDayMissionLabel2 = new JLabel("< 일일 미션 > ");
		oneDayMissionLabel2.setBounds(50, 110, 250, 50);
		frame.getContentPane().add(oneDayMissionLabel2);
		
		JLabel oneWeekMissionLabel = new JLabel("< 주간 미션 > ");
		oneWeekMissionLabel.setBounds(50, 210, 250, 50);
		frame.getContentPane().add(oneWeekMissionLabel);
		
		
		// 미션 내용 불러오기
		JLabel oneDayMissionLabel1_T = new JLabel();
		text1 = mis.RandomMission(selectB, 1).getMission(); 
		oneDayMissionLabel1_T.setText(text1);
		oneDayMissionLabel1_T.setBounds(50, 50, 250, 50);
		frame.getContentPane().add(oneDayMissionLabel1_T);
		
		JLabel oneDayMissionLabel2_T = new JLabel();
		text2 = mis.RandomMission(selectB, 1).getMission();
		oneDayMissionLabel2_T.setText(text2);
		oneDayMissionLabel2_T.setBounds(50, 140, 250, 50);
		frame.getContentPane().add(oneDayMissionLabel2_T);
		
		JLabel oneWeekMissionLabel1_T = new JLabel();
		text3 = mis.RandomMission(selectB, 7).getMission();
		oneWeekMissionLabel1_T.setText(text3);
		oneWeekMissionLabel1_T.setBounds(50, 240, 250, 50);
		frame.getContentPane().add(oneWeekMissionLabel1_T);
		
		
		// 이전버튼 생성
		JButton previousButton = new JButton("이전으로");
		previousButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		previousButton.setBounds(161, 332, 140, 50);
		frame.getContentPane().add(previousButton);
		
		
		// 선택하기 or 새로고침 눌렀을때 변화
		JButton oneDayMissionChoiceButton1 = new JButton("선택하기");
		oneDayMissionChoiceButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				mis.insertMission(user_pk, text1, 1);
			}
		});
		oneDayMissionChoiceButton1.setBounds(300, 30, 97, 23);
		frame.getContentPane().add(oneDayMissionChoiceButton1);
		
		JButton oneDayMissionRefreshButton1 = new JButton("새로고침");
		oneDayMissionRefreshButton1.addActionListener(new ActionListener( ) {
			@Override
			public void actionPerformed(ActionEvent e) {
				text1 = mis.RandomMission(selectB, 1).getMission();
				oneDayMissionLabel1_T.setText(text1);
				mis.usePoint(user_pk, 5);
			}
		});
		oneDayMissionRefreshButton1.setBounds(300, 61, 97, 23);
		frame.getContentPane().add(oneDayMissionRefreshButton1);
		
		
		// 두번째 선택하기 or 새로고침 눌렀을때 변화
		JButton oneDayMissionChoiceButton2 = new JButton("선택하기");
		oneDayMissionChoiceButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mis.insertMission(user_pk, text2, 1);
			}
		});
		oneDayMissionChoiceButton2.setBounds(300, 124, 97, 23);
		frame.getContentPane().add(oneDayMissionChoiceButton2);
		
		JButton oneDayMissionRefreshButton2 = new JButton("새로고침");
		oneDayMissionRefreshButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text2 = mis.RandomMission(selectB, 1).getMission();
				oneDayMissionLabel2_T.setText(text2);
				mis.usePoint(user_pk, 5);
			}
		});
		oneDayMissionRefreshButton2.setBounds(300, 155, 97, 23);
		frame.getContentPane().add(oneDayMissionRefreshButton2);
		
		
		// 세번째 선택하기 or 새로고침 눌렀을 때 변화
		JButton oneWeekMissionChoiceButton = new JButton("선택하기");
		oneWeekMissionChoiceButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mis.insertMission(user_pk, text3, 7);
			}
		});
		oneWeekMissionChoiceButton.setBounds(300, 225, 97, 23);
		frame.getContentPane().add(oneWeekMissionChoiceButton);
		
		JButton oneWeekMissionRefreshButton = new JButton("새로고침");
		oneWeekMissionRefreshButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text3 = mis.RandomMission(selectB, 7).getMission();
				oneWeekMissionLabel1_T.setText(text3);
				mis.usePoint(user_pk, 5);
			}
		});
		oneWeekMissionRefreshButton.setBounds(300, 255, 97, 23);
		frame.getContentPane().add(oneWeekMissionRefreshButton);
	}	
}
