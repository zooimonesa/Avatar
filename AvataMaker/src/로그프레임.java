import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class �α������� {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					�α������� window = new �α�������();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public �α�������() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("�α�");
		frame.setBounds(100, 100, 450, 550);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel �α��ؽ�Ʈ�� = new JLabel("�α�");
		�α��ؽ�Ʈ��.setVerticalAlignment(SwingConstants.TOP);
		�α��ؽ�Ʈ��.setHorizontalAlignment(SwingConstants.LEFT);
		�α��ؽ�Ʈ��.setBounds(12, 10, 403, 410);
		frame.getContentPane().add(�α��ؽ�Ʈ��);
		
		JButton �ݱ��ư = new JButton("�ݱ�");
		�ݱ��ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		�ݱ��ư.setBounds(291, 430, 124, 71);
		frame.getContentPane().add(�ݱ��ư);
	}
}
