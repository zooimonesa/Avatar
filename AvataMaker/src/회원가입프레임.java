import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class ȸ������������ {

	JFrame frame;
	private JTextField ���̵��ؽ�Ʈ�ʵ�;
	private JPasswordField ��й�ȣ�ؽ�Ʈ�ʵ�;
	private JTextField �г����ؽ�Ʈ�ʵ�;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ȸ������������ window = new ȸ������������();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ȸ������������() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));

		frame.setTitle("ȸ������");
		frame.setBounds(100, 100, 450, 445);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		JLabel ȸ�����Զ� = new JLabel("ȸ������");
		ȸ�����Զ�.setBounds(183, 10, 57, 15);
		frame.getContentPane().add(ȸ�����Զ�);

		JLabel ���̵�� = new JLabel("���̵�");
		���̵��.setHorizontalAlignment(SwingConstants.CENTER);
		���̵��.setBounds(37, 44, 77, 15);
		frame.getContentPane().add(���̵��);

		JLabel ��й�ȣ�� = new JLabel("��й�ȣ");
		��й�ȣ��.setHorizontalAlignment(SwingConstants.CENTER);
		��й�ȣ��.setBounds(37, 69, 77, 15);
		frame.getContentPane().add(��й�ȣ��);

		JLabel �г��Ӷ� = new JLabel("�г���");
		�г��Ӷ�.setHorizontalAlignment(SwingConstants.CENTER);
		�г��Ӷ�.setBounds(37, 119, 77, 15);
		frame.getContentPane().add(�г��Ӷ�);

		���̵��ؽ�Ʈ�ʵ� = new JTextField();
		���̵��ؽ�Ʈ�ʵ�.setBounds(126, 41, 133, 21);
		frame.getContentPane().add(���̵��ؽ�Ʈ�ʵ�);
		���̵��ؽ�Ʈ�ʵ�.setColumns(10);

		��й�ȣ�ؽ�Ʈ�ʵ� = new JPasswordField();
		��й�ȣ�ؽ�Ʈ�ʵ�.setColumns(10);
		��й�ȣ�ؽ�Ʈ�ʵ�.setBounds(126, 66, 132, 21);
		frame.getContentPane().add(��й�ȣ�ؽ�Ʈ�ʵ�);

		�г����ؽ�Ʈ�ʵ� = new JTextField();
		�г����ؽ�Ʈ�ʵ�.setColumns(10);
		�г����ؽ�Ʈ�ʵ�.setBounds(126, 116, 133, 21);
		frame.getContentPane().add(�г����ؽ�Ʈ�ʵ�);

		JButton ���̵��ߺ�Ȯ�ι�ư = new JButton("���̵� �ߺ� Ȯ��");
		���̵��ߺ�Ȯ�ι�ư.setBounds(294, 40, 128, 23);
		frame.getContentPane().add(���̵��ߺ�Ȯ�ι�ư);

		JButton �г����ߺ�Ȯ�ι�ư = new JButton("�г��� �ߺ� Ȯ��");
		�г����ߺ�Ȯ�ι�ư.setBounds(294, 115, 128, 23);
		frame.getContentPane().add(�г����ߺ�Ȯ�ι�ư);

		JButton �����ϱ��ư = new JButton("�����ϱ�");
		�����ϱ��ư.setBounds(95, 373, 97, 23);
		frame.getContentPane().add(�����ϱ��ư);

		JButton ����ϱ��ư = new JButton("����ϱ�");
		����ϱ��ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		����ϱ��ư.setBounds(234, 373, 97, 23);
		frame.getContentPane().add(����ϱ��ư);
	}
}
