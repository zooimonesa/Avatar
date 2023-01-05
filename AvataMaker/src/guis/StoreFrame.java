package guis;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StoreFrame {

	JFrame frame;
	private LineBorder bb = new LineBorder(Color.black, 1, true);
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreFrame window = new StoreFrame();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StoreFrame() {
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
		frame.setTitle("상점");
		frame.setBounds(100, 100, 815, 526);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ImageIcon 상점캐릭터 = new ImageIcon("농담곰_상점_기본.png");

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		
		
		btnNewButton_1.setBounds(324, 21, 90, 100);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(324, 131, 90, 100);
		frame.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("New button");
		btnNewButton_1_2.setBounds(324, 241, 90, 100);
		frame.getContentPane().add(btnNewButton_1_2);

		JButton btnNewButton_1_3 = new JButton("New button");
		btnNewButton_1_3.setBounds(324, 351, 90, 100);
		frame.getContentPane().add(btnNewButton_1_3);

		JButton btnNewButton_1_4 = new JButton("New button");
		btnNewButton_1_4.setBounds(426, 21, 90, 100);
		frame.getContentPane().add(btnNewButton_1_4);

		JButton btnNewButton_1_1_1 = new JButton("New button");
		btnNewButton_1_1_1.setBounds(426, 131, 90, 100);
		frame.getContentPane().add(btnNewButton_1_1_1);

		JButton btnNewButton_1_2_1 = new JButton("New button");
		btnNewButton_1_2_1.setBounds(426, 241, 90, 100);
		frame.getContentPane().add(btnNewButton_1_2_1);

		JButton btnNewButton_1_3_1 = new JButton("New button");
		btnNewButton_1_3_1.setBounds(426, 351, 90, 100);
		frame.getContentPane().add(btnNewButton_1_3_1);

		JButton btnNewButton_1_5 = new JButton("New button");
		btnNewButton_1_5.setBounds(528, 21, 90, 100);
		frame.getContentPane().add(btnNewButton_1_5);

		JButton btnNewButton_1_1_2 = new JButton("New button");
		btnNewButton_1_1_2.setBounds(528, 131, 90, 100);
		frame.getContentPane().add(btnNewButton_1_1_2);

		JButton btnNewButton_1_2_2 = new JButton("New button");
		btnNewButton_1_2_2.setBounds(528, 241, 90, 100);
		frame.getContentPane().add(btnNewButton_1_2_2);

		JButton btnNewButton_1_3_2 = new JButton("New button");
		btnNewButton_1_3_2.setBounds(528, 351, 90, 100);
		frame.getContentPane().add(btnNewButton_1_3_2);

		JButton btnNewButton_1_6 = new JButton("New button");
		btnNewButton_1_6.setBounds(630, 21, 90, 100);
		frame.getContentPane().add(btnNewButton_1_6);

		JButton btnNewButton_1_1_3 = new JButton("New button");
		btnNewButton_1_1_3.setBounds(630, 131, 90, 100);
		frame.getContentPane().add(btnNewButton_1_1_3);

		JButton btnNewButton_1_2_3 = new JButton("New button");
		btnNewButton_1_2_3.setBounds(630, 241, 90, 100);
		frame.getContentPane().add(btnNewButton_1_2_3);

		JButton btnNewButton_1_3_3 = new JButton("New button");
		btnNewButton_1_3_3.setBounds(630, 351, 90, 100);
		frame.getContentPane().add(btnNewButton_1_3_3);

		JButton 이전창버튼 = new JButton("이전으로");
		이전창버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
		이전창버튼.setHorizontalAlignment(SwingConstants.TRAILING);
		이전창버튼.setBounds(732, 351, 55, 100);
		frame.getContentPane().add(이전창버튼);

		JLabel lblNewLabel = new JLabel(상점캐릭터);
		lblNewLabel.setBorder(bb);
		lblNewLabel.setBounds(12, 21, 300, 430);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("보유포인트:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(528, 462, 90, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("0포인트");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(630, 461, 157, 16);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
