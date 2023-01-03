import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class 미션프레임 {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					미션프레임 window = new 미션프레임();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public 미션프레임() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("미션");
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel btnNewButton = new JLabel("하루미션~~");// 데이터베이스값을 랜덤으로 보여주기 //운동을 눌렀을때 운동만 나오게하는게 가능한가요?
		btnNewButton.setBounds(55, 30, 250, 50);
		frame.getContentPane().add(btnNewButton);
		
		JLabel btnNewButton_1 = new JLabel("하루미션~~");
		btnNewButton_1.setBounds(55, 124, 250, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel btnNewButton_2 = new JLabel("일주일 미션~~");
		btnNewButton_2.setBounds(55, 218, 250, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		
		JButton btnNewButton_3_1 = new JButton("이전으로");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_3_1.setBounds(161, 332, 140, 50);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_4 = new JButton("선택하기"); //진행중인 미션이 가득차 있으면 가득찻다고 알려줌 그리고 등록안됨
		btnNewButton_4.setBounds(325, 30, 97, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("새로고침");//한번 누르는건가능 두번째누르는건 돈이들게 카운드인트를 쌓아도 되고 정힘들면 처음부터받자
		btnNewButton_4_1.setBounds(325, 61, 97, 23);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("선택하기");
		btnNewButton_4_2.setBounds(325, 124, 97, 23);
		frame.getContentPane().add(btnNewButton_4_2);
		
		JButton btnNewButton_4_1_1 = new JButton("새로고침");
		btnNewButton_4_1_1.setBounds(325, 155, 97, 23);
		frame.getContentPane().add(btnNewButton_4_1_1);
		
		JButton btnNewButton_4_3 = new JButton("선택하기");  //일주일짜리미션은 일주일칸에 들어가게
		btnNewButton_4_3.setBounds(325, 218, 97, 23);
		frame.getContentPane().add(btnNewButton_4_3);
		
		JButton btnNewButton_4_1_2 = new JButton("새로고침");
		btnNewButton_4_1_2.setBounds(325, 249, 97, 23);
		frame.getContentPane().add(btnNewButton_4_1_2);
	}
}
