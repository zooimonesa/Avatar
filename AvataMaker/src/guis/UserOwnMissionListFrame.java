package guis;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import mission.missionSelect;
import mission.missionSelectImpl;

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
		Image cursorimage = tk.getImage("마우스포인터_1.png");
		Point point = new Point(20, 20);
		Cursor cursor = tk.createCustomCursor(cursorimage, point, "haha");
		frame.setCursor(cursor);
	} // =======================================================

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {		
		frame = new JFrame();
		frame.setTitle("보유미션");
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("보유미션");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(187, 10, 73, 30);
		frame.getContentPane().add(lblNewLabel);

		JPanel oneDayMissionPanel = new JPanel(); // 일일미션패널 ====================================================
		oneDayMissionPanel.setBackground(new Color(255, 255, 255));
		oneDayMissionPanel.setToolTipText("");
		oneDayMissionPanel
				.setBorder(new TitledBorder(null, "일일미션", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		oneDayMissionPanel.setBounds(6, 33, 443, 258);
		frame.getContentPane().add(oneDayMissionPanel);
		oneDayMissionPanel.setLayout(null);

		JLabel[] dailyMission = new JLabel[6]; // 일일미션라벨배열
		JButton[] dailyMissionclear = new JButton[6]; // 일일미션달성버튼배열
		JButton[] dailyMissionGiveUp = new JButton[6]; // 일일미션포기버튼배열

		int dailyY = 17; // 일일미션라벨, 달성, 포기버튼 y좌표고정 + 40씩
		for (int i = 0; i < 6; i++) {

			dailyMission[i] = new JLabel("미션" + (i + 1) + " : "); // 일일미션라벨
			dailyMission[i].setBounds(6, dailyY, 280, 30);
			oneDayMissionPanel.add(dailyMission[i]);

			dailyMissionclear[i] = new JButton("달성"); // 일일미션달성버튼
			dailyMissionclear[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("일일달성");
				}
			});
			dailyMissionclear[i].setBounds(311, dailyY, 57, 30);
			oneDayMissionPanel.add(dailyMissionclear[i]);

			dailyMissionGiveUp[i] = new JButton("포기"); // 일일미션포기버튼
			dailyMissionGiveUp[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("일일포기");
				}
			});
			dailyMissionGiveUp[i].setBounds(380, dailyY, 57, 30);
			oneDayMissionPanel.add(dailyMissionGiveUp[i]);

			dailyY += 40;
		}

		JPanel oneWeekMissionPanel = new JPanel(); // 주간미션패널 ===================================================
		oneWeekMissionPanel.setBackground(new Color(255, 255, 255));
		oneWeekMissionPanel
				.setBorder(new TitledBorder(null, "주간미션", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		oneWeekMissionPanel.setBounds(6, 301, 443, 142);
		frame.getContentPane().add(oneWeekMissionPanel);
		oneWeekMissionPanel.setLayout(null);

		JLabel weeklyMission[] = new JLabel[3]; // 주간미션라벨
		JLabel weeklyMissionDday[] = new JLabel[3];
		JButton weeklyMissionClear[] = new JButton[3]; // 주간미션달성버튼
		JButton weeklyMissionGiveUp[] = new JButton[3]; // 주간미션포기버튼
		
		missionSelect mis = new missionSelectImpl();
		

		int weeklyY = 17; // 주간미션라벨 y좌표고정 + 40씩
		for (int i = 0; i < 3; i++) {
			weeklyMission[i] = new JLabel("미션" + (i + 1) + " : " ); // 주간미션라벨
			weeklyMission[i].setBounds(6, weeklyY, 280, 30);
			weeklyMissionDday[i] = new JLabel(mis.userMissionEndDay("1시간동안 걷기"));
			weeklyMissionDday[i].setBounds(280, weeklyY, 280, 30);
			oneWeekMissionPanel.add(weeklyMission[i]);
			oneWeekMissionPanel.add(weeklyMissionDday[i]);

			weeklyMissionClear[i] = new JButton("달성"); // 주간미션달성버튼
			weeklyMissionClear[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("주간달성");
				}
			});
			weeklyMissionClear[i].setBounds(311, weeklyY, 57, 30);
			oneWeekMissionPanel.add(weeklyMissionClear[i]);

			weeklyMissionGiveUp[i] = new JButton("포기"); // 주간미션포기버튼
			weeklyMissionGiveUp[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("주간포기");
				}
			});
			weeklyMissionGiveUp[i].setBounds(380, weeklyY, 57, 30);
			oneWeekMissionPanel.add(weeklyMissionGiveUp[i]);

			weeklyY += 40;
		}

		JButton btnNewButton_10 = new JButton("닫기");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_10.setBounds(175, 473, 117, 23);
		frame.getContentPane().add(btnNewButton_10);
		frame.setBounds(100, 100, 471, 545);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
