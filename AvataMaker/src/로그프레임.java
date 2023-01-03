import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 로그프레임 {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					로그프레임 window = new 로그프레임();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public 로그프레임() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("로그");
		frame.setBounds(100, 100, 450, 550);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel 로그텍스트라벨 = new JLabel("로그");
		로그텍스트라벨.setVerticalAlignment(SwingConstants.TOP);
		로그텍스트라벨.setHorizontalAlignment(SwingConstants.LEFT);
		로그텍스트라벨.setBounds(12, 10, 403, 410);
		frame.getContentPane().add(로그텍스트라벨);
		
		JButton 닫기버튼 = new JButton("닫기");
		닫기버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		닫기버튼.setBounds(291, 430, 124, 71);
		frame.getContentPane().add(닫기버튼);
	}
}
