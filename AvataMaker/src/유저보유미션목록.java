import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 유저보유미션목록 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					유저보유미션목록 window = new 유저보유미션목록();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public 유저보유미션목록() {
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
		lblNewLabel.setBounds(12, 10, 73, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1번 미션");
		lblNewLabel_1.setBounds(12, 50, 280, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("달성");  //한번 다른창이 나옴 //두번째에 포인트를쌓음  //버튼을 반복문으로 줄여줄것//라벨도 반복문으로
		btnNewButton.setBounds(317, 50, 57, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("포기");
		btnNewButton_1.setBounds(386, 50, 57, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2번 미션");
		lblNewLabel_1_1.setBounds(12, 90, 280, 30);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton_2 = new JButton("달성");
		btnNewButton_2.setBounds(317, 90, 57, 30);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("포기");
		btnNewButton_1_1.setBounds(386, 90, 57, 30);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("3번 미션");
		lblNewLabel_1_2.setBounds(12, 130, 280, 30);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JButton btnNewButton_3 = new JButton("달성");
		btnNewButton_3.setBounds(317, 130, 57, 30);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("포기");
		btnNewButton_1_2.setBounds(386, 130, 57, 30);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("4번 미션");
		lblNewLabel_1_3.setBounds(12, 170, 280, 30);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JButton btnNewButton_4 = new JButton("달성");
		btnNewButton_4.setBounds(317, 170, 57, 30);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1_3 = new JButton("포기");
		btnNewButton_1_3.setBounds(386, 170, 57, 30);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("5번 미션");
		lblNewLabel_1_4.setBounds(12, 210, 280, 30);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JButton btnNewButton_5 = new JButton("달성");
		btnNewButton_5.setBounds(317, 210, 57, 30);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_1_4 = new JButton("포기");
		btnNewButton_1_4.setBounds(386, 210, 57, 30);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("6번 미션");
		lblNewLabel_1_5.setBounds(12, 250, 280, 30);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JButton btnNewButton_6 = new JButton("달성");
		btnNewButton_6.setBounds(317, 250, 57, 30);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_1_5 = new JButton("포기");
		btnNewButton_1_5.setBounds(386, 250, 57, 30);
		frame.getContentPane().add(btnNewButton_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("7번 미션");
		lblNewLabel_1_6.setBounds(12, 290, 280, 30);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JButton btnNewButton_7 = new JButton("달성");
		btnNewButton_7.setBounds(317, 290, 57, 30);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_1_6 = new JButton("포기");
		btnNewButton_1_6.setBounds(386, 290, 57, 30);
		frame.getContentPane().add(btnNewButton_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("8번 미션");
		lblNewLabel_1_7.setBounds(12, 330, 280, 30);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		JButton btnNewButton_8 = new JButton("달성");
		btnNewButton_8.setBounds(317, 330, 57, 30);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_1_7 = new JButton("포기");
		btnNewButton_1_7.setBounds(386, 330, 57, 30);
		frame.getContentPane().add(btnNewButton_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("9번 미션");
		lblNewLabel_1_8.setBounds(12, 370, 280, 30);
		frame.getContentPane().add(lblNewLabel_1_8);
		
		JButton btnNewButton_9 = new JButton("달성");
		btnNewButton_9.setBounds(317, 370, 57, 30);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_1_8 = new JButton("포기");
		btnNewButton_1_8.setBounds(386, 370, 57, 30);
		frame.getContentPane().add(btnNewButton_1_8);
		
		JButton btnNewButton_10 = new JButton("닫기");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_10.setBounds(175, 456, 117, 23);
		frame.getContentPane().add(btnNewButton_10);
		frame.setBounds(100, 100, 471, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
