package guis;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import User.UserRanking;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

public class RankingFrame {
	UserRanking ur = new UserRanking();
	JFrame frame;

	public void GetUserRank() {
		ur.Hrank();
		ur.Irank();
		ur.Trank();
	}

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
		customcursor();
	}

	public void customcursor() { // 마우스포인터 ====================================

		Toolkit tk = Toolkit.getDefaultToolkit();
		Image cursorimage = tk.getImage("src/image/대형견_커서.png");
		Point point = new Point(0, 0);
		Cursor cursor = tk.createCustomCursor(cursorimage, point, "haha");
		frame.setCursor(cursor);
	} // =======================================================
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("랭킹");
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
		JButton btnNewButton = new JButton("이전화면");
		btnNewButton.setBackground(new Color(200, 230, 250));
		btnNewButton.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mainFrame = new MainFrame();
				mainFrame.frame.setVisible(true);
				mainFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				mainFrame.frame.setResizable(false);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(159, 395, 120, 35);
		frame.getContentPane().add(btnNewButton);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new TitledBorder(null, "체력랭킹", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		((javax.swing.border.TitledBorder) panel.getBorder()).setTitleFont(new Font("경기천년제목 Bold", Font.PLAIN, 19));
		panel.setBounds(10, 20, 416, 105);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		GetUserRank();
		String Hone = ur.hnlist.get(0);
		String Htwo = ur.hnlist.get(1);
		String Hthree = ur.hnlist.get(2);
		String H1s = Integer.toString(ur.hslist.get(0));
		String H2s = Integer.toString(ur.hslist.get(1));
		String H3s = Integer.toString(ur.hslist.get(2));

		String Ione = ur.inlist.get(0);
		String Itwo = ur.inlist.get(1);
		String Ithree = ur.inlist.get(2);
		String I1s = Integer.toString(ur.islist.get(0));
		String I2s = Integer.toString(ur.islist.get(1));
		String I3s = Integer.toString(ur.islist.get(2));

		String Tone = ur.tnlist.get(0);
		String Ttwo = ur.tnlist.get(1);
		String Tthree = ur.tnlist.get(2);
		String T1s = Integer.toString(ur.tslist.get(0));
		String T2s = Integer.toString(ur.tslist.get(1));
		String T3s = Integer.toString(ur.tslist.get(2));

		
		JLabel lblNewLabel = new JLabel("1등   - ");
		lblNewLabel.setBounds(20, 25, 57, 15);
		lblNewLabel.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		panel.add(lblNewLabel);

		
		JLabel lblNewLabel_1 = new JLabel("2등   - ");
		lblNewLabel_1.setBounds(20, 50, 57, 15);
		lblNewLabel_1.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		panel.add(lblNewLabel_1);

		
		JLabel lblNewLabel_2 = new JLabel("3등   - ");
		lblNewLabel_2.setBounds(20, 75, 57, 15);
		lblNewLabel_2.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_5 = new JLabel(Hone);
		lblNewLabel_5.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(75, 25, 190, 15);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_5_1 = new JLabel(Htwo);
		lblNewLabel_5_1.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(75, 50, 190, 15);
		panel.add(lblNewLabel_5_1);

		JLabel lblNewLabel_5_2 = new JLabel(Hthree);
		lblNewLabel_5_2.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_5_2.setBounds(75, 75, 190, 15);
		panel.add(lblNewLabel_5_2);

		JLabel lblNewLabel_6 = new JLabel(H1s);
		lblNewLabel_6.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(277, 25, 57, 15);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_6_1 = new JLabel(H2s);
		lblNewLabel_6_1.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_6_1.setBounds(277, 50, 57, 15);
		panel.add(lblNewLabel_6_1);

		JLabel lblNewLabel_6_2 = new JLabel(H3s);
		lblNewLabel_6_2.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_6_2.setBounds(277, 75, 57, 15);
		panel.add(lblNewLabel_6_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null);

		panel_1.setBorder(new TitledBorder(null, "지능랭킹", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		((javax.swing.border.TitledBorder) panel_1.getBorder()).setTitleFont(new Font("경기천년제목 Bold", Font.PLAIN, 19));
		panel_1.setBounds(10, 142, 416, 105);

		frame.getContentPane().add(panel_1);

		JLabel lblNewLabel_3 = new JLabel("1등   -");
		lblNewLabel_3.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(20, 25, 57, 15);
		panel_1.add(lblNewLabel_3);

		JLabel lblNewLabel_1_1 = new JLabel("2등   -");
		lblNewLabel_1_1.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(20, 50, 57, 15);
		panel_1.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("3등   -");
		lblNewLabel_2_1.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(20, 75, 57, 15);
		panel_1.add(lblNewLabel_2_1);

		JLabel lblNewLabel_6_3 = new JLabel(I1s);
		lblNewLabel_6_3.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_6_3.setBounds(277, 25, 57, 15);
		panel_1.add(lblNewLabel_6_3);

		JLabel lblNewLabel_5_3 = new JLabel(Ione);
		lblNewLabel_5_3.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_5_3.setBounds(75, 25, 190, 15);
		panel_1.add(lblNewLabel_5_3);

		JLabel lblNewLabel_6_4 = new JLabel(I2s);
		lblNewLabel_6_4.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_6_4.setBounds(277, 50, 57, 15);
		panel_1.add(lblNewLabel_6_4);

		JLabel lblNewLabel_5_4 = new JLabel(Itwo);
		lblNewLabel_5_4.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_5_4.setBounds(75, 50, 190, 15);
		panel_1.add(lblNewLabel_5_4);

		JLabel lblNewLabel_6_5 = new JLabel(I3s);
		lblNewLabel_6_5.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_6_5.setBounds(277, 75, 57, 15);
		panel_1.add(lblNewLabel_6_5);

		JLabel lblNewLabel_5_5 = new JLabel(Ithree);
		lblNewLabel_5_5.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_5_5.setBounds(75, 75, 190, 15);
		panel_1.add(lblNewLabel_5_5);

		JPanel panel_2 = new JPanel();
		panel_2.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 13));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setLayout(null);

		panel_2.setBorder(new TitledBorder(null, "재능랭킹", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		((javax.swing.border.TitledBorder) panel_2.getBorder()).setTitleFont(new Font("경기천년제목 Bold", Font.PLAIN, 19));
		panel_2.setBounds(10, 265, 416, 105);

		frame.getContentPane().add(panel_2);

		JLabel lblNewLabel_4 = new JLabel("1등   -");
		lblNewLabel_4.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(20, 25, 57, 15);
		panel_2.add(lblNewLabel_4);

		JLabel lblNewLabel_1_2 = new JLabel("2등   -");
		lblNewLabel_1_2.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(20, 50, 57, 15);
		panel_2.add(lblNewLabel_1_2);

		JLabel lblNewLabel_2_2 = new JLabel("3등   -");
		lblNewLabel_2_2.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(20, 75, 57, 15);
		panel_2.add(lblNewLabel_2_2);

		JLabel lblNewLabel_6_6 = new JLabel(T1s);
		lblNewLabel_6_6.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_6_6.setBounds(277, 25, 57, 15);
		panel_2.add(lblNewLabel_6_6);

		JLabel lblNewLabel_5_6 = new JLabel(Tone);
		lblNewLabel_5_6.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_5_6.setBounds(75, 25, 190, 15);
		panel_2.add(lblNewLabel_5_6);

		JLabel lblNewLabel_6_7 = new JLabel(T2s);
		lblNewLabel_6_7.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_6_7.setBounds(277, 50, 57, 15);
		panel_2.add(lblNewLabel_6_7);

		JLabel lblNewLabel_5_7 = new JLabel(Ttwo);
		lblNewLabel_5_7.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_5_7.setBounds(75, 50, 190, 15);
		panel_2.add(lblNewLabel_5_7);

		JLabel lblNewLabel_6_8 = new JLabel(T3s);
		lblNewLabel_6_8.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_6_8.setBounds(277, 75, 57, 15);
		panel_2.add(lblNewLabel_6_8);

		JLabel lblNewLabel_5_8 = new JLabel(Tthree);
		lblNewLabel_5_8.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel_5_8.setBounds(75, 75, 190, 15);
		panel_2.add(lblNewLabel_5_8);
	}
}
