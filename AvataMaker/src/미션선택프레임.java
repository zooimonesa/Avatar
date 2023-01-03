import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 미션선택프레임 {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					미션선택프레임 window = new 미션선택프레임();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public 미션선택프레임() {
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

		JButton 운동버튼 = new JButton("운동");
		운동버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				미션프레임 미션프레임새창 = new 미션프레임();
				미션프레임새창.frame.setVisible(true);
				미션프레임새창.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				미션프레임새창.frame.setResizable(false);
			}
		});
		운동버튼.setBounds(30, 30, 370, 80);
		frame.getContentPane().add(운동버튼);

		JButton 공부버튼 = new JButton("공부");
		공부버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				미션프레임 미션프레임새창 = new 미션프레임();
				미션프레임새창.frame.setVisible(true);
				미션프레임새창.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				미션프레임새창.frame.setResizable(false);
			}
		});
		공부버튼.setBounds(30, 120, 370, 80);
		frame.getContentPane().add(공부버튼);

		JButton 취미버튼 = new JButton("취미");
		취미버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				미션프레임 미션프레임새창 = new 미션프레임();
				미션프레임새창.frame.setVisible(true);
				미션프레임새창.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				미션프레임새창.frame.setResizable(false);
			}
		});
		취미버튼.setBounds(30, 210, 370, 80);
		frame.getContentPane().add(취미버튼);
		
		JButton btnNewButton = new JButton("보유미션보기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				유저보유미션목록 유저보유미션목록새창 = new 유저보유미션목록();
				유저보유미션목록새창.frame.setVisible(true); // 다음 프레임 띄우기
				유저보유미션목록새창.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				유저보유미션목록새창.frame.setResizable(false);
				
			}
		});
		btnNewButton.setBounds(30, 317, 122, 53);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("이전으로");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		btnNewButton_1.setBounds(278, 317, 122, 53);
		frame.getContentPane().add(btnNewButton_1);
	}

}
