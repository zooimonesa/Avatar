import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ���������� {
	public JFrame frmAlpha;
	private JTextField ���̵�;
	private JPasswordField �н�����;

	public ����������() {
		initialize();
	}

	private void initialize() {
		
		
		frmAlpha = new JFrame();
		frmAlpha.getContentPane().setBackground(new Color(255, 255, 255));
		frmAlpha.setTitle("������Ʈ �ٸ���ġ alpha_0.00");
		frmAlpha.setBounds(100, 100, 545, 507);
		frmAlpha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlpha.getContentPane().setLayout(null);

		ImageIcon ���� = new ImageIcon("���ο��ÿ���.gif");
		JLabel �����̹��� = new JLabel(����);
		�����̹���.setForeground(UIManager.getColor("Button.focus"));
		�����̹���.setBackground(new Color(0, 0, 0));
		�����̹���.setBounds(12, 10, 505, 259);
		frmAlpha.getContentPane().add(�����̹���);

		���̵� = new JTextField();
		���̵�.setBounds(164, 307, 205, 21);
		frmAlpha.getContentPane().add(���̵�);
		���̵�.setColumns(10);
		

		�н����� = new JPasswordField();
		�н�����.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER   ) {
					
				/*���̵�� �н����带 ��Ʈ������ ��ȯ �� �����Ϳ� ��
				 if(���̵� ��й�ȣ�� ������ ������  �Ʒ����� ����) */
					
				����ȭ�������� ����ȭ�������ӻ�â = new ����ȭ��������();
				����ȭ�������ӻ�â.frame.setVisible(true); // ���� ������ ����
				����ȭ�������ӻ�â.frame.setBounds(100, 100, 815, 526);
				����ȭ�������ӻ�â.frame.setLocationRelativeTo(null); // â �߰��� ��������
				����ȭ�������ӻ�â.frame.setResizable(false);
				frmAlpha.setVisible(false);
				/*������  ���*/
				}
			}
		});
		
		�н�����.setBounds(164, 350, 205, 21);
		frmAlpha.getContentPane().add(�н�����);
		�н�����.setColumns(10);

		ȸ������������ ȸ�����Ի�â = new ȸ������������();
		JButton ȸ������ = new JButton("ȸ������");
		ȸ������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ȸ�����Ի�â.frame.setVisible(true); // ���� ������ ����
				ȸ�����Ի�â.frame.setBounds(100, 100, 450, 445);
				ȸ�����Ի�â.frame.setLocationRelativeTo(null); // â �߰��� ��������
			}
		});
		ȸ������.setBounds(12, 412, 130, 23);
		frmAlpha.getContentPane().add(ȸ������);

		JButton �α��� = new JButton("�α���");
		�α���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*���̵�� �н����带 ��Ʈ������ ��ȯ �� �����Ϳ� ��
				 if(���̵� ��й�ȣ�� ������ ������  �Ʒ����� ����) */
					
				����ȭ�������� ����ȭ�������ӻ�â = new ����ȭ��������();
				����ȭ�������ӻ�â.frame.setVisible(true); // ���� ������ ����
				����ȭ�������ӻ�â.frame.setBounds(100, 100, 815, 526);
				����ȭ�������ӻ�â.frame.setLocationRelativeTo(null); // â �߰��� ��������
				����ȭ�������ӻ�â.frame.setResizable(false);
				frmAlpha.setVisible(false);
				
				/*������ ���*/

			}
		});
		�α���.setBounds(204, 412, 130, 23);
		frmAlpha.getContentPane().add(�α���);

		JButton ���� = new JButton("����");
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		����.setBounds(387, 412, 130, 23);
		frmAlpha.getContentPane().add(����);

		JLabel ���̵�� = new JLabel("���̵�");
		���̵��.setHorizontalAlignment(SwingConstants.CENTER);
		���̵��.setBounds(85, 310, 57, 15);
		frmAlpha.getContentPane().add(���̵��);

		JLabel ��й�ȣ�� = new JLabel("��й�ȣ");
		��й�ȣ��.setHorizontalAlignment(SwingConstants.CENTER);
		��й�ȣ��.setBounds(85, 353, 57, 15);
		frmAlpha.getContentPane().add(��й�ȣ��);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					���������� window = new ����������();
					window.frmAlpha.setVisible(true);
					window.frmAlpha.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}