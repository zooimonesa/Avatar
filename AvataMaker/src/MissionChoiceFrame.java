import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MissionChoiceFrame {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MissionChoiceFrame window = new MissionChoiceFrame();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MissionChoiceFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBackground(Color.WHITE);
		frame.setTitle("미션");
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton exerciseButton = new JButton("운동");
		exerciseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MissionListFrame 미션프레임새창 = new MissionListFrame();
				미션프레임새창.frame.setVisible(true);
				미션프레임새창.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				미션프레임새창.frame.setResizable(false);
			}
		});
		exerciseButton.setBounds(30, 30, 370, 80);
		frame.getContentPane().add(exerciseButton);

		JButton studyButton = new JButton("공부");
		studyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MissionListFrame missionListFrame = new MissionListFrame();
				missionListFrame.frame.setVisible(true);
				missionListFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				missionListFrame.frame.setResizable(false);
			}
		});
		studyButton.setBounds(30, 120, 370, 80);
		frame.getContentPane().add(studyButton);

		JButton hobbyButton = new JButton("취미");
		hobbyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MissionListFrame missionListFrame = new MissionListFrame();
				missionListFrame.frame.setVisible(true);
				missionListFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				missionListFrame.frame.setResizable(false);
			}
		});
		hobbyButton.setBounds(30, 210, 370, 80);
		frame.getContentPane().add(hobbyButton);
		
		JButton userOwnMissionButton = new JButton("보유미션보기");
		userOwnMissionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserOwnMissionListFrame userOwnMissionListFrame = new UserOwnMissionListFrame();
				userOwnMissionListFrame.frame.setVisible(true); // 다음 프레임 띄우기
				userOwnMissionListFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				userOwnMissionListFrame.frame.setResizable(false);
				
			}
		});
		userOwnMissionButton.setBounds(30, 317, 122, 53);
		frame.getContentPane().add(userOwnMissionButton);
		
		JButton previousButton = new JButton("이전으로");
		previousButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		previousButton.setBounds(278, 317, 122, 53);
		frame.getContentPane().add(previousButton);
	}

}
