package guis;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import User.GetInfo;
import mission.missionSelect;
import mission.missionSelectImpl;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LogFrame {
	GetInfo mf = new GetInfo();
	String mainnickname = mf.fmainnickname;
	int user_pk = mf.fuserpk;
	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogFrame window = new LogFrame();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LogFrame() {
		initialize();
	}

	private void initialize() {
		missionSelect mis = new missionSelectImpl();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("로그");
	
		frame.setBounds(100, 100, 450, 550);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel logTextLabel = new JLabel(mainnickname + "의 로그");
		logTextLabel.setVerticalAlignment(SwingConstants.TOP);
		logTextLabel.setHorizontalAlignment(SwingConstants.LEFT);
		logTextLabel.setBounds(12, 10, 100, 100);
		frame.getContentPane().add(logTextLabel);
		
		List<String> log = mis.userLogResult(user_pk);
		JLabel userLogLabel = new JLabel();
		for(int i = 0; i < log.size(); i++) {
			userLogLabel.setText(log.get(i));
		}
		userLogLabel.setBounds(12, 50, 403, 410);
		frame.getContentPane().add(userLogLabel);
		
		JButton 닫기버튼 = new JButton("닫기");
		닫기버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mainFrame = new MainFrame();  // hj 메인 나오게================
				mainFrame.frame.setVisible(true);
				mainFrame.frame.setLocationRelativeTo(null); 
				mainFrame.frame.setResizable(false);  // =====================
				frame.dispose();
			}
		});
		닫기버튼.setBounds(291, 430, 124, 71);
		frame.getContentPane().add(닫기버튼);
	}
}
