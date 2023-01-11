package guis;


import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import User.GetInfo;
import mission.Missions;
import mission.missionSelect;
import mission.missionSelectImpl;
import java.awt.Font;

public class UserOwnMissionListFrame {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserOwnMissionListFrame window = new UserOwnMissionListFrame();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserOwnMissionListFrame() {
		initialize();
		customcursor();
	}

	public void customcursor() { // 마우스포인터 ====================================

		Toolkit tk = Toolkit.getDefaultToolkit();
		Image cursorimage = tk.getImage("대형견_커서.png");
		Point point = new Point(0, 0);
		Cursor cursor = tk.createCustomCursor(cursorimage, point, "haha");
		frame.setCursor(cursor);
	} // =======================================================

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		missionSelect mis = new missionSelectImpl();
		GetInfo mf = new GetInfo();
		int user_pk = mf.fuserpk;
//		int user_pk = 1;

		frame = new JFrame();
		frame.setTitle("보유미션");
		frame.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);

<<<<<<< HEAD
		JLabel lblNewLabel = new JLabel("보유미션");
		lblNewLabel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
=======
		JLabel lblNewLabel = new JLabel("<보유미션>");
		lblNewLabel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 20));
>>>>>>> branch 'master' of https://github.com/zooimonesa/Avatar.git
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(180, 5, 100, 30);
		frame.getContentPane().add(lblNewLabel);

		JPanel oneDayMissionPanel = new JPanel(); // 일일미션패널 ====================================================
		oneDayMissionPanel.setBackground(new Color(255, 255, 255));
		oneDayMissionPanel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		oneDayMissionPanel.setToolTipText("");
		oneDayMissionPanel
				.setBorder(new TitledBorder(null, "일일미션", TitledBorder.LEADING, TitledBorder.TOP, new Font("경기천년제목 Bold", Font.PLAIN, 15), null)); // 폰트 변경 ===========================


		oneDayMissionPanel.setBounds(6, 33, 443, 258);
		frame.getContentPane().add(oneDayMissionPanel);
		oneDayMissionPanel.setLayout(null);

		JLabel[] dailyMission = new JLabel[6]; // 일일미션라벨배열
		JLabel[] dailyMissionT = new JLabel[6]; // 일일미션텍스트라벨배열
		JButton[] dailyMissionclear = new JButton[6]; // 일일미션달성버튼배열
		JButton[] dailyMissionGiveUp = new JButton[6]; // 일일미션포기버튼배열

		int dailyY = 17; // 일일미션라벨, 달성, 포기버튼 y좌표고정 + 40씩
		for (int i = 0; i < 6; i++) {

			dailyMission[i] = new JLabel((i + 1) + " : "); // 일일미션라벨
<<<<<<< HEAD
			dailyMission[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 13)); // 폰트 추가 ======================================
			dailyMission[i].setBounds(10, dailyY, 280, 30);
=======
			dailyMission[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
			dailyMission[i].setBounds(15, dailyY, 280, 30);
>>>>>>> branch 'master' of https://github.com/zooimonesa/Avatar.git
			oneDayMissionPanel.add(dailyMission[i]);

			dailyMissionT[i] = new JLabel();
			dailyMissionT[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 13)); // 폰트 추가 ======================================
			try {
				if (mis.userMission(user_pk, 1).get(i) != null) {
					String text = mis.userMission(user_pk, 1).get(i).getMission();
					dailyMissionT[i].setText(text);
				}
			} catch (IndexOutOfBoundsException e) {
				dailyMissionT[i].setText("");
			}
<<<<<<< HEAD

			dailyMissionT[i].setBounds(35, dailyY, 280, 30);
			oneDayMissionPanel.add(dailyMissionT[i]);
=======
			
			dailyMissionTs[i].setBounds(40, dailyY, 280, 30);
			dailyMissionTs[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 13));
			oneDayMissionPanel.add(dailyMissionTs[i]);
>>>>>>> branch 'master' of https://github.com/zooimonesa/Avatar.git

			dailyMissionclear[i] = new JButton("완료"); // 일일미션달성버튼
<<<<<<< HEAD
			dailyMissionclear[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15)); // 폰트 추가 ======================================
=======
			dailyMissionclear[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
			dailyMissionclear[i].setBackground(new Color(240, 250, 255));
>>>>>>> branch 'master' of https://github.com/zooimonesa/Avatar.git
			dailyMissionclear[i].setActionCommand(String.valueOf(i));
			dailyMissionclear[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String command = e.getActionCommand();
					String state = "완료";
					int num = Integer.valueOf(command);
					String mission = dailyMissionT[num].getText();
					mf.SetUserAll(mf.fmainid);// 태현고침
					if (!dailyMissionT[num].getText().isEmpty()) {
						if (mis.getClassify(mission).equals("운동")) {
							JOptionPane.showMessageDialog(null, "미션완료 \n 10Point와 체력 100을 획득하였습니다. ", "미션 완료",
									JOptionPane.INFORMATION_MESSAGE);
						} else if (mis.getClassify(mission).equals("공부")) {
							JOptionPane.showMessageDialog(null, "미션완료 \n 10Point와 지능 100을 획득하였습니다. ", "미션 완료",
									JOptionPane.INFORMATION_MESSAGE);
						} else if (mis.getClassify(mission).equals("취미")) {
							JOptionPane.showMessageDialog(null, "미션완료 \n 10Point와 재능 100을 획득하였습니다. ", "미션 완료",
									JOptionPane.INFORMATION_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(null, "등록 된 미션이 없습니다. ", "오류", JOptionPane.ERROR_MESSAGE);
					}

					if (!dailyMissionT[num].getText().isEmpty()) {
						mis.successMission(user_pk, 1, mis.getClassify(mission));
						mis.cancelMission(user_pk, mission);
						mis.missionLog(user_pk, mission, state);
						dailyMissionT[num].setText("");
					}
				}
			});
			dailyMissionclear[i].setBounds(310, dailyY, 60, 30);
			oneDayMissionPanel.add(dailyMissionclear[i]);

			dailyMissionGiveUp[i] = new JButton("포기"); // 일일미션포기버튼
<<<<<<< HEAD
			dailyMissionGiveUp[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15)); // 폰트 추가 ======================================
=======
			dailyMissionGiveUp[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
			dailyMissionGiveUp[i].setBackground(new Color(240, 250, 255));
>>>>>>> branch 'master' of https://github.com/zooimonesa/Avatar.git
			// 몇번째 버튼을 선택했는지 정보를 들고 있음
			dailyMissionGiveUp[i].setActionCommand(String.valueOf(i));
			dailyMissionGiveUp[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String command = e.getActionCommand();
					String state = "포기";
					int num = Integer.valueOf(command);
					if (!dailyMissionT[num].getText().isEmpty()) {
						String mission = dailyMissionT[num].getText();
						mis.cancelMission(user_pk, mission);
						mis.missionLog(user_pk, mission, state);
						dailyMissionT[num].setText("");
					}
				}
			});
			dailyMissionGiveUp[i].setBounds(375, dailyY, 60, 30);
			oneDayMissionPanel.add(dailyMissionGiveUp[i]);

			dailyY += 40;
		}

		JPanel oneWeekMissionPanel = new JPanel(); // 주간미션패널 ===================================================
		oneWeekMissionPanel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		oneWeekMissionPanel.setBackground(new Color(255, 255, 255));
		oneWeekMissionPanel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		oneWeekMissionPanel
		.setBorder(new TitledBorder(null, "주간미션", TitledBorder.LEADING, TitledBorder.TOP, new Font("경기천년제목 Bold", Font.PLAIN, 15), null));
		oneWeekMissionPanel.setBounds(6, 301, 443, 142);
		frame.getContentPane().add(oneWeekMissionPanel);
		oneWeekMissionPanel.setLayout(null);

		JLabel weeklyMission[] = new JLabel[3]; // 주간미션라벨
		JLabel weeklyMissionT[] = new JLabel[3];
		JLabel weeklyMissionDday[] = new JLabel[3];
		JButton weeklyMissionClear[] = new JButton[3]; // 주간미션달성버튼
		JButton weeklyMissionGiveUp[] = new JButton[3]; // 주간미션포기버튼

		int weeklyY = 17; // 주간미션라벨 y좌표고정 + 40씩
		for (int i = 0; i < 3; i++) {
			weeklyMission[i] = new JLabel((i + 1) + " : "); // 주간미션라벨
<<<<<<< HEAD
			weeklyMission[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 13)); // 폰트 추가 ======================================
			weeklyMission[i].setBounds(10, weeklyY, 280, 30);
=======
			weeklyMission[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
			weeklyMission[i].setBounds(15, weeklyY, 280, 30);
>>>>>>> branch 'master' of https://github.com/zooimonesa/Avatar.git
			oneWeekMissionPanel.add(weeklyMission[i]);

<<<<<<< HEAD
			weeklyMissionT[i] = new JLabel();
			weeklyMissionT[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 13)); // 폰트 추가 ======================================
=======
			weeklyMissionTs[i] = new JLabel();
			weeklyMissionTs[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 13));
>>>>>>> branch 'master' of https://github.com/zooimonesa/Avatar.git
			try {
				if (mis.userMission(user_pk, 7).get(i) != null) {
					String text = mis.userMission(user_pk, 7).get(i).getMission();
					weeklyMissionT[i].setText(text);
				}
			} catch (IndexOutOfBoundsException e) {
				weeklyMissionT[i].setText("");
			}
<<<<<<< HEAD
			weeklyMissionT[i].setBounds(35, weeklyY, 280, 30);
			oneWeekMissionPanel.add(weeklyMissionT[i]);
=======
			weeklyMissionTs[i].setBounds(40, weeklyY, 280, 30);
			oneWeekMissionPanel.add(weeklyMissionTs[i]);
			
			weeklyMissionDdays[i] = new JLabel();
			weeklyMissionDdays[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 13));
			weeklyMissionDdays[i].setBounds(260, weeklyY, 280, 30);
			oneWeekMissionPanel.add(weeklyMissionDdays[i]);
>>>>>>> branch 'master' of https://github.com/zooimonesa/Avatar.git

<<<<<<< HEAD
			weeklyMissionDday[i] = new JLabel();
			weeklyMissionDday[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 13)); // 폰트 추가 ======================================
			weeklyMissionDday[i].setBounds(270, weeklyY, 280, 30);
			oneWeekMissionPanel.add(weeklyMissionDday[i]);

			weeklyMissionClear[i] = new JButton("완료"); // 주간미션달성버튼
			weeklyMissionClear[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15)); // 폰트 추가 ======================================
			// 버튼 락 걸기
			if (!weeklyMissionT[i].getText().isEmpty()) {
				if (mis.userMissionEndDay(user_pk, weeklyMissionT[i].getText()).contains("D - -")) {
=======
			weeklyMissionClears[i] = new JButton("완료"); // 주간미션달성버튼
			weeklyMissionClears[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
			weeklyMissionClears[i].setBackground(new Color(240, 250, 255));
			
			if(!weeklyMissionTs[i].getText().isEmpty()) {
				if(mis.userMissionEndDay(user_pk, weeklyMissionTs[i].getText()).contains("D - -")) {
>>>>>>> branch 'master' of https://github.com/zooimonesa/Avatar.git
					// 지나간 미션 없애기
					mis.cancelMission(user_pk, weeklyMissionT[i].getText());
					initialize();
				} else {
					weeklyMissionDday[i].setText(mis.userMissionEndDay(user_pk, weeklyMissionT[i].getText()));
					weeklyMissionClear[i].setEnabled(false);
				}
			}
			// 버튼 락 열기
			if (weeklyMissionDday[i].getText().equals("D - 0")) {
				weeklyMissionClear[i].setEnabled(true);
			}

			weeklyMissionClear[i].setActionCommand(String.valueOf(i));
			weeklyMissionClear[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String command = e.getActionCommand();
					int num = Integer.valueOf(command);
					mf.SetUserAll(mf.fmainid);// 태현고침
					String mission = weeklyMissionT[num].getText();
					String state = "완료";
					if (!weeklyMissionT[num].getText().isEmpty()) {
						if (mis.getClassify(mission).equals("운동")) {
							JOptionPane.showMessageDialog(null, "미션완료 \n 100Point와 체력 200을 획득하였습니다. ", "미션 완료",
									JOptionPane.INFORMATION_MESSAGE);
						} else if (mis.getClassify(mission).equals("공부")) {
							JOptionPane.showMessageDialog(null, "미션완료 \n 100Point와 지능 200을 획득하였습니다. ", "미션 완료",
									JOptionPane.INFORMATION_MESSAGE);
						} else if (mis.getClassify(mission).equals("취미")) {
							JOptionPane.showMessageDialog(null, "미션완료 \n 100Point와 재능 200을 획득하였습니다. ", "미션 완료",
									JOptionPane.INFORMATION_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(null, "등록 된 미션이 없습니다. ", "오류", JOptionPane.ERROR_MESSAGE);
					}

					if (!weeklyMissionT[num].getText().isEmpty()) {
						mis.successMission(user_pk, 7, mis.getClassify(mission));
						mis.cancelMission(user_pk, mission);
						mis.missionLog(user_pk, mission, state);
						weeklyMissionT[num].setText("");
						weeklyMissionDday[num].setText("");
					}
				}
			});
			weeklyMissionClear[i].setBounds(310, weeklyY, 60, 30);
			oneWeekMissionPanel.add(weeklyMissionClear[i]);

			weeklyMissionGiveUp[i] = new JButton("포기"); // 주간미션포기버튼
<<<<<<< HEAD
			weeklyMissionGiveUp[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15)); // 폰트 추가 ======================================
=======
			weeklyMissionGiveUp[i].setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
			weeklyMissionGiveUp[i].setBackground(new Color(240, 250, 255));
>>>>>>> branch 'master' of https://github.com/zooimonesa/Avatar.git
			weeklyMissionGiveUp[i].setActionCommand(String.valueOf(i));
			weeklyMissionGiveUp[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String command = e.getActionCommand();
					int num = Integer.valueOf(command);
					String state = "포기";
					if (!weeklyMissionT[num].getText().isEmpty()) {
						String mission = weeklyMissionT[num].getText();
						mis.cancelMission(user_pk, mission);
						mis.missionLog(user_pk, mission, state);
						weeklyMissionT[num].setText("");
						weeklyMissionDday[num].setText("");
					}
				}
			});
			weeklyMissionGiveUp[i].setBounds(375, weeklyY, 60, 30);
			oneWeekMissionPanel.add(weeklyMissionGiveUp[i]);

			weeklyY += 40;
		}

		JButton btnNewButton_10 = new JButton("닫기");
<<<<<<< HEAD
		btnNewButton_10.setForeground(new Color(255, 255, 255));
		btnNewButton_10.setBackground(new Color(0, 128, 255));
=======
		btnNewButton_10.setBackground(new Color(200, 230, 250));
>>>>>>> branch 'master' of https://github.com/zooimonesa/Avatar.git
		btnNewButton_10.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
<<<<<<< HEAD
		btnNewButton_10.setBounds(170, 473, 117, 23);
=======
		btnNewButton_10.setBounds(170, 460, 117, 23);
>>>>>>> branch 'master' of https://github.com/zooimonesa/Avatar.git
		frame.getContentPane().add(btnNewButton_10);
		frame.setBounds(100, 100, 471, 545);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
