import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �̼Ǽ��������� {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					�̼Ǽ��������� window = new �̼Ǽ���������();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public �̼Ǽ���������() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBackground(Color.WHITE);
		frame.setTitle("�̼�");
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton ���ư = new JButton("�");
		���ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				�̼������� �̼������ӻ�â = new �̼�������();
				�̼������ӻ�â.frame.setVisible(true);
				�̼������ӻ�â.frame.setLocationRelativeTo(null); // â �߰��� ��������
				�̼������ӻ�â.frame.setResizable(false);
			}
		});
		���ư.setBounds(30, 30, 370, 80);
		frame.getContentPane().add(���ư);

		JButton ���ι�ư = new JButton("����");
		���ι�ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				�̼������� �̼������ӻ�â = new �̼�������();
				�̼������ӻ�â.frame.setVisible(true);
				�̼������ӻ�â.frame.setLocationRelativeTo(null); // â �߰��� ��������
				�̼������ӻ�â.frame.setResizable(false);
			}
		});
		���ι�ư.setBounds(30, 120, 370, 80);
		frame.getContentPane().add(���ι�ư);

		JButton ��̹�ư = new JButton("���");
		��̹�ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				�̼������� �̼������ӻ�â = new �̼�������();
				�̼������ӻ�â.frame.setVisible(true);
				�̼������ӻ�â.frame.setLocationRelativeTo(null); // â �߰��� ��������
				�̼������ӻ�â.frame.setResizable(false);
			}
		});
		��̹�ư.setBounds(30, 210, 370, 80);
		frame.getContentPane().add(��̹�ư);
		
		JButton btnNewButton = new JButton("�����̼Ǻ���");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���������̼Ǹ�� ���������̼Ǹ�ϻ�â = new ���������̼Ǹ��();
				���������̼Ǹ�ϻ�â.frame.setVisible(true); // ���� ������ ����
				���������̼Ǹ�ϻ�â.frame.setLocationRelativeTo(null); // â �߰��� ��������
				���������̼Ǹ�ϻ�â.frame.setResizable(false);
				
			}
		});
		btnNewButton.setBounds(30, 317, 122, 53);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("��������");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		btnNewButton_1.setBounds(278, 317, 122, 53);
		frame.getContentPane().add(btnNewButton_1);
	}

}
