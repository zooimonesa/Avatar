import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ���������� {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					���������� window = new ����������();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ����������() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("����");
		frame.setBounds(100, 100, 815, 526);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ImageIcon ����ĳ���� = new ImageIcon("����_����_�⺻.png");//��ǥĳ���Ͱ� ���̴� ��//�����ư �����//��������Ʈ�� �����

		JButton btnNewButton_1 = new JButton("New button"); //��â�̶� //�����̶�//�����ϱ� ,�Ա����,�ݱ�
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

		JButton ����â��ư = new JButton("��������");
		����â��ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
		����â��ư.setHorizontalAlignment(SwingConstants.TRAILING);
		����â��ư.setBounds(732, 351, 55, 100);
		frame.getContentPane().add(����â��ư);

		JLabel lblNewLabel = new JLabel(����ĳ����);
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setBounds(12, 21, 300, 430);
		frame.getContentPane().add(lblNewLabel);
	}

}
