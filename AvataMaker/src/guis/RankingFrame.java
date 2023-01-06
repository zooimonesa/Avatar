package guis;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class RankingFrame {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RankingFrame window = new RankingFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RankingFrame() {
		initialize();
	}
	
	
	
	
	
	
	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("랭킹");
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("뒤로가기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mainFrame = new MainFrame();
				mainFrame.frame.setVisible(true);
				mainFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				mainFrame.frame.setResizable(false);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(166, 428, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new TitledBorder(null, "체력랭킹", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(6, 33, 416, 92);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1등");
		lblNewLabel.setBounds(6, 17, 57, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2등");
		lblNewLabel_1.setBounds(6, 42, 57, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3등");
		lblNewLabel_2.setBounds(6, 67, 57, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		lblNewLabel_5.setBounds(75, 17, 190, 15);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("점수");
		lblNewLabel_6.setBounds(277, 17, 57, 15);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("점수");
		lblNewLabel_6_1.setBounds(277, 42, 57, 15);
		panel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		lblNewLabel_5_1.setBounds(75, 42, 190, 15);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("점수");
		lblNewLabel_6_2.setBounds(277, 67, 57, 15);
		panel.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		lblNewLabel_5_2.setBounds(75, 67, 190, 15);
		panel.add(lblNewLabel_5_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "지능랭킹", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(6, 135, 416, 92);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("1등");
		lblNewLabel_3.setBounds(6, 17, 57, 15);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("2등");
		lblNewLabel_1_1.setBounds(6, 42, 57, 15);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("3등");
		lblNewLabel_2_1.setBounds(6, 67, 57, 15);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_6_3 = new JLabel("점수");
		lblNewLabel_6_3.setBounds(277, 17, 57, 15);
		panel_1.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_5_3 = new JLabel("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		lblNewLabel_5_3.setBounds(75, 17, 190, 15);
		panel_1.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_6_4 = new JLabel("점수");
		lblNewLabel_6_4.setBounds(277, 42, 57, 15);
		panel_1.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_5_4 = new JLabel("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		lblNewLabel_5_4.setBounds(75, 42, 190, 15);
		panel_1.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_6_5 = new JLabel("점수");
		lblNewLabel_6_5.setBounds(277, 67, 57, 15);
		panel_1.add(lblNewLabel_6_5);
		
		JLabel lblNewLabel_5_5 = new JLabel("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		lblNewLabel_5_5.setBounds(75, 67, 190, 15);
		panel_1.add(lblNewLabel_5_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(null, "재능랭킹", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(6, 237, 416, 92);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_4 = new JLabel("1등");
		lblNewLabel_4.setBounds(6, 17, 57, 15);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_2 = new JLabel("2등");
		lblNewLabel_1_2.setBounds(6, 42, 57, 15);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("3등");
		lblNewLabel_2_2.setBounds(6, 67, 57, 15);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_6_6 = new JLabel("점수");
		lblNewLabel_6_6.setBounds(277, 17, 57, 15);
		panel_2.add(lblNewLabel_6_6);
		
		JLabel lblNewLabel_5_6 = new JLabel("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		lblNewLabel_5_6.setBounds(75, 17, 190, 15);
		panel_2.add(lblNewLabel_5_6);
		
		JLabel lblNewLabel_6_7 = new JLabel("점수");
		lblNewLabel_6_7.setBounds(277, 42, 57, 15);
		panel_2.add(lblNewLabel_6_7);
		
		JLabel lblNewLabel_5_7 = new JLabel("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		lblNewLabel_5_7.setBounds(75, 42, 190, 15);
		panel_2.add(lblNewLabel_5_7);
		
		JLabel lblNewLabel_6_8 = new JLabel("점수");
		lblNewLabel_6_8.setBounds(277, 67, 57, 15);
		panel_2.add(lblNewLabel_6_8);
		
		JLabel lblNewLabel_5_8 = new JLabel("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		lblNewLabel_5_8.setBounds(75, 67, 190, 15);
		panel_2.add(lblNewLabel_5_8);
	}
}
