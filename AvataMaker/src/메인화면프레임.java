import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.Icon;

public class ����ȭ�������� {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					����ȭ�������� window = new ����ȭ��������();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null); // â �߰��� ��������
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ����ȭ��������() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("����ȭ��");
		frame.setBounds(100, 100, 815, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ImageIcon ĳ���� = new ImageIcon("����_����_�⺻.png"); //�����ͺ��̽����� ������ �޼ҵ�  //���� ����� �޼ҵ�//�⺻�� �η� ����
		ImageIcon ��� = new ImageIcon("���.png");
		ImageIcon ���� = new ImageIcon("�񵵸�.png");
		ImageIcon ü�� = new ImageIcon("�ɷ�ġ_ü��.png");  // �ɷ�ġ �������� �󺧷ε��� if ���̻��̸� ����� �̷���
		ImageIcon ���� = new ImageIcon("�ɷ�ġ_����.png");
		ImageIcon ��� = new ImageIcon("�ɷ�ġ_���.png");
		
		
		JLabel �г��Ӷ� = new JLabel("�г���");   //������
		�г��Ӷ�.setBackground(new Color(255, 255, 255));
		�г��Ӷ�.setHorizontalAlignment(SwingConstants.CENTER);
		�г��Ӷ�.setBounds(315, 40, 424, 35);
		frame.getContentPane().add(�г��Ӷ�);
		
		JLabel lblNewLabel = new JLabel("���丮"); //������
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(40, 291, 150, 160);
		frame.getContentPane().add(lblNewLabel);

		JLabel ü�¼�ġ = new JLabel(ü��);  //������
		ü�¼�ġ.setHorizontalAlignment(SwingConstants.CENTER);
		ü�¼�ġ.setBounds(315, 85, 424, 35);
		frame.getContentPane().add(ü�¼�ġ);

		JLabel ���ɼ�ġ = new JLabel(����);
		���ɼ�ġ.setHorizontalAlignment(SwingConstants.CENTER);
		���ɼ�ġ.setBounds(315, 130, 424, 35);
		frame.getContentPane().add(���ɼ�ġ);

		JLabel ��ɼ�ġ = new JLabel(���);
		��ɼ�ġ.setHorizontalAlignment(SwingConstants.CENTER);
		��ɼ�ġ.setBounds(315, 175, 424, 35);
		frame.getContentPane().add(��ɼ�ġ);


		JButton �̼ǹ�ư = new JButton("�̼�");
		�̼ǹ�ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				�̼Ǽ��������� �̼Ǽ��������ӻ�â = new �̼Ǽ���������();
				�̼Ǽ��������ӻ�â.frame.setVisible(true); // ���� ������ ����
				�̼Ǽ��������ӻ�â.frame.setLocationRelativeTo(null); // â �߰��� ��������
				�̼Ǽ��������ӻ�â.frame.setResizable(false);

			}
		});
		�̼ǹ�ư.setBounds(315, 291, 97, 50);
		frame.getContentPane().add(�̼ǹ�ư);

		���������� ���������ӻ�â = new ����������();

		JButton ������ư = new JButton("����");
		������ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���������ӻ�â.frame.setVisible(true); // ���� ������ ����
				���������ӻ�â.frame.setBounds(100, 100, 815, 526);
				���������ӻ�â.frame.setLocationRelativeTo(null); // â �߰��� ��������
				���������ӻ�â.frame.setResizable(false);

			}
		});
		������ư.setBounds(424, 291, 97, 50);
		frame.getContentPane().add(������ư);

		JButton �α׹�ư = new JButton("�α�");
		�α׹�ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				�α������� �α������ӻ�â = new �α�������();
				�α������ӻ�â.frame.setVisible(true); // ���� ������ ����
				�α������ӻ�â.frame.setBounds(100, 100, 450, 550);
				�α������ӻ�â.frame.setLocationRelativeTo(null); // â �߰��� ��������
				�α������ӻ�â.frame.setResizable(false);
			}
		});
		�α׹�ư.setBounds(533, 291, 97, 50);
		frame.getContentPane().add(�α׹�ư);

		JButton �α׾ƿ���ư = new JButton("�α׾ƿ�");
		�α׾ƿ���ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���������� ���������ӻ�â = new ����������();
				���������ӻ�â.frmAlpha.setVisible(true); // ���� ������ ����
				���������ӻ�â.frmAlpha.setLocationRelativeTo(null); // â �߰��� ��������
				���������ӻ�â.frmAlpha.setResizable(false);
				frame.dispose();
			}
		});
		�α׾ƿ���ư.setBounds(642, 291, 97, 50);
		frame.getContentPane().add(�α׾ƿ���ư);

		JLabel ��������Ʈ = new JLabel("����Ʈ"); //������
		��������Ʈ.setHorizontalAlignment(SwingConstants.CENTER);
		��������Ʈ.setBounds(533, 351, 206, 100);
		frame.getContentPane().add(��������Ʈ);

		JLabel ĳ���͸Ӹ��� = new JLabel();
		ĳ���͸Ӹ���.setBounds(40, 40, 150, 200);
		frame.getContentPane().add(ĳ���͸Ӹ���);

		JLabel ĳ���;Ǽ��� = new JLabel();
		ĳ���;Ǽ���.setBounds(40, 40, 150, 200);
		frame.getContentPane().add(ĳ���;Ǽ���);

		JLabel ĳ���ͻ��Ƕ� = new JLabel(����);
		ĳ���ͻ��Ƕ�.setBounds(40, 40, 150, 200);
		frame.getContentPane().add(ĳ���ͻ��Ƕ�);

		JLabel ĳ���Ͷ� = new JLabel(ĳ����);
		ĳ���Ͷ�.setBounds(40, 40, 150, 200);
		frame.getContentPane().add(ĳ���Ͷ�);
		
		JLabel ĳ���͹��� = new JLabel(���);
		ĳ���͹���.setBounds(40, 40, 150, 200);
		frame.getContentPane().add(ĳ���͹���);
	}
}
