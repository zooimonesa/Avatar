import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class �̼������� {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					�̼������� window = new �̼�������();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public �̼�������() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("�̼�");
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel btnNewButton = new JLabel("�Ϸ�̼�~~");// �����ͺ��̽����� �������� �����ֱ� //��� �������� ��� �������ϴ°� �����Ѱ���?
		btnNewButton.setBounds(55, 30, 250, 50);
		frame.getContentPane().add(btnNewButton);
		
		JLabel btnNewButton_1 = new JLabel("�Ϸ�̼�~~");
		btnNewButton_1.setBounds(55, 124, 250, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel btnNewButton_2 = new JLabel("������ �̼�~~");
		btnNewButton_2.setBounds(55, 218, 250, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		
		JButton btnNewButton_3_1 = new JButton("��������");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_3_1.setBounds(161, 332, 140, 50);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_4 = new JButton("�����ϱ�"); //�������� �̼��� ������ ������ �������ٰ� �˷��� �׸��� ��Ͼȵ�
		btnNewButton_4.setBounds(325, 30, 97, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("���ΰ�ħ");//�ѹ� �����°ǰ��� �ι�°�����°� ���̵�� ī�����Ʈ�� �׾Ƶ� �ǰ� ������� ó�����͹���
		btnNewButton_4_1.setBounds(325, 61, 97, 23);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("�����ϱ�");
		btnNewButton_4_2.setBounds(325, 124, 97, 23);
		frame.getContentPane().add(btnNewButton_4_2);
		
		JButton btnNewButton_4_1_1 = new JButton("���ΰ�ħ");
		btnNewButton_4_1_1.setBounds(325, 155, 97, 23);
		frame.getContentPane().add(btnNewButton_4_1_1);
		
		JButton btnNewButton_4_3 = new JButton("�����ϱ�");  //������¥���̼��� ������ĭ�� ����
		btnNewButton_4_3.setBounds(325, 218, 97, 23);
		frame.getContentPane().add(btnNewButton_4_3);
		
		JButton btnNewButton_4_1_2 = new JButton("���ΰ�ħ");
		btnNewButton_4_1_2.setBounds(325, 249, 97, 23);
		frame.getContentPane().add(btnNewButton_4_1_2);
	}
}
