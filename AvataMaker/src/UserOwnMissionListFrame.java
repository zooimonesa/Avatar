import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

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
	}

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
		
		JPanel oneDayMissionPanel = new JPanel();  // 일일미션패널 ====================================================
		oneDayMissionPanel.setBackground(new Color(255, 255, 255));
		oneDayMissionPanel.setToolTipText("");
		oneDayMissionPanel.setBorder(new TitledBorder(null, "일일미션", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		oneDayMissionPanel.setBounds(6, 33, 443, 258);
		frame.getContentPane().add(oneDayMissionPanel);
		oneDayMissionPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("1번 미션");
		lblNewLabel_1.setBounds(6, 17, 280, 30);
		oneDayMissionPanel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("달성");
		btnNewButton.setBounds(311, 17, 57, 30);
		oneDayMissionPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("포기");
		btnNewButton_1.setBounds(380, 17, 57, 30);
		oneDayMissionPanel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2번 미션");
		lblNewLabel_1_1.setBounds(6, 57, 280, 30);
		oneDayMissionPanel.add(lblNewLabel_1_1);
		
		JButton btnNewButton_2 = new JButton("달성");
		btnNewButton_2.setBounds(311, 57, 57, 30);
		oneDayMissionPanel.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("포기");
		btnNewButton_1_1.setBounds(380, 57, 57, 30);
		oneDayMissionPanel.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("3번 미션");
		lblNewLabel_1_2.setBounds(6, 97, 280, 30);
		oneDayMissionPanel.add(lblNewLabel_1_2);
		
		JButton btnNewButton_3 = new JButton("달성");
		btnNewButton_3.setBounds(311, 97, 57, 30);
		oneDayMissionPanel.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("포기");
		btnNewButton_1_2.setBounds(380, 97, 57, 30);
		oneDayMissionPanel.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("4번 미션");
		lblNewLabel_1_3.setBounds(6, 137, 280, 30);
		oneDayMissionPanel.add(lblNewLabel_1_3);
		
		JButton btnNewButton_4 = new JButton("달성");
		btnNewButton_4.setBounds(311, 137, 57, 30);
		oneDayMissionPanel.add(btnNewButton_4);
		
		JButton btnNewButton_1_3 = new JButton("포기");
		btnNewButton_1_3.setBounds(380, 137, 57, 30);
		oneDayMissionPanel.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("5번 미션");
		lblNewLabel_1_4.setBounds(6, 177, 280, 30);
		oneDayMissionPanel.add(lblNewLabel_1_4);
		
		JButton btnNewButton_5 = new JButton("달성");
		btnNewButton_5.setBounds(311, 177, 57, 30);
		oneDayMissionPanel.add(btnNewButton_5);
		
		JButton btnNewButton_1_4 = new JButton("포기");
		btnNewButton_1_4.setBounds(380, 177, 57, 30);
		oneDayMissionPanel.add(btnNewButton_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("6번 미션");
		lblNewLabel_1_5.setBounds(6, 217, 280, 30);
		oneDayMissionPanel.add(lblNewLabel_1_5);
		
		JButton btnNewButton_6 = new JButton("달성");
		btnNewButton_6.setBounds(311, 217, 57, 30);
		oneDayMissionPanel.add(btnNewButton_6);
		
		JButton btnNewButton_1_5 = new JButton("포기");
		btnNewButton_1_5.setBounds(380, 217, 57, 30);
		oneDayMissionPanel.add(btnNewButton_1_5);
		
		JPanel oneWeekMissionPanel = new JPanel(); // 주간미션패널 ===================================================
		oneWeekMissionPanel.setBackground(new Color(255, 255, 255));
		oneWeekMissionPanel.setBorder(new TitledBorder(null, "주간미션", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		oneWeekMissionPanel.setBounds(6, 301, 443, 142);
		frame.getContentPane().add(oneWeekMissionPanel);
		oneWeekMissionPanel.setLayout(null);
		
		JLabel lblNewLabel_1_6 = new JLabel("7번 미션");
		lblNewLabel_1_6.setBounds(6, 17, 280, 30);
		oneWeekMissionPanel.add(lblNewLabel_1_6);
		
		JButton btnNewButton_7 = new JButton("달성");
		btnNewButton_7.setBounds(311, 17, 57, 30);
		oneWeekMissionPanel.add(btnNewButton_7);
		
		JButton btnNewButton_1_6 = new JButton("포기");
		btnNewButton_1_6.setBounds(380, 17, 57, 30);
		oneWeekMissionPanel.add(btnNewButton_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("8번 미션");
		lblNewLabel_1_7.setBounds(6, 57, 280, 30);
		oneWeekMissionPanel.add(lblNewLabel_1_7);
		
		JButton btnNewButton_8 = new JButton("달성");
		btnNewButton_8.setBounds(311, 57, 57, 30);
		oneWeekMissionPanel.add(btnNewButton_8);
		
		JButton btnNewButton_1_7 = new JButton("포기");
		btnNewButton_1_7.setBounds(380, 57, 57, 30);
		oneWeekMissionPanel.add(btnNewButton_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("9번 미션");
		lblNewLabel_1_8.setBounds(6, 97, 280, 30);
		oneWeekMissionPanel.add(lblNewLabel_1_8);
		
		JButton btnNewButton_9 = new JButton("달성");
		btnNewButton_9.setBounds(311, 97, 57, 30);
		oneWeekMissionPanel.add(btnNewButton_9);
		
		JButton btnNewButton_1_8 = new JButton("포기");
		btnNewButton_1_8.setBounds(380, 97, 57, 30);
		oneWeekMissionPanel.add(btnNewButton_1_8);
		
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
