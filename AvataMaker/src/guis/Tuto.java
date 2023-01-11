package guis;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

public class Tuto implements ActionListener, ItemListener {

	JFrame frame;
	private JPanel tuto_1;
	private JPanel tuto_2;
	private JPanel tuto_3;
	private JPanel tuto_4;
	private JPanel tuto_5;
	private JPanel tuto_6;
	private JPanel tuto_7;
	private JPanel tuto_8;
	private JPanel tuto_9;
	private JPanel tuto_10;
	private JPanel tuto_11;
	private JPanel tuto_12;
	private JPanel tuto_13;
	private JPanel tuto_14;
	private JPanel tuto_15;
	private JPanel tuto_16;
	private JPanel tuto_17;
	private JPanel tuto_18;
	private JPanel tuto_19;
	private JPanel tuto_20;
	private JPanel tuto_21;
	private JPanel tuto_22;
	private JPanel tuto_23;
	private JPanel tuto_24;
	private JPanel tuto_25;
	private JPanel tuto_26;
	private JPanel tuto_27;
	private JPanel tuto_28;
	private JPanel tuto_29;
	private JPanel tuto_30;
	private JPanel tuto_31;
	private JPanel tuto_32;

	public Tuto() {
		initialize();
		customcursor();
	}

	public void customcursor() { // 마우스포인터 ====================================

		Toolkit tk = Toolkit.getDefaultToolkit();
		Image cursorimage = tk.getImage("src/image/대형견_커서.png");
		Point point = new Point(0, 0);
		Cursor cursor = tk.createCustomCursor(cursorimage, point, "haha");
		frame.setCursor(cursor);
	} // =======================================================

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("튜토리얼");
		frame.setBounds(100, 100, 700, 600);
		frame.setLocationRelativeTo(null); // 창 중간에 나오게함
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tuto_1 = new JPanel(); // 튜토리얼 시작 ================================================================
		ImageIcon scene1 = new ImageIcon("src/image/튜토리얼_0.png");
		tuto_1.setBackground(new Color(255, 255, 255));
		tuto_1.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_1);
		tuto_1.setLayout(null);

		ImageIcon next1 = new ImageIcon("");
		JButton tuto1Next = new JButton(next1); // 다음페이지 버튼
		tuto1Next.setBorderPainted(false);
		tuto1Next.setContentAreaFilled(false);
		tuto1Next.setFocusPainted(false);
		tuto1Next.setBounds(0, 0, 684, 561);
		tuto1Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_2.setVisible(true);
				tuto_1.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_1.add(tuto1Next);
		JLabel screen1 = new JLabel(scene1); // 이미지
		screen1.setBounds(0, 0, 684, 561);

		tuto_1.add(screen1);
		tuto_1.setVisible(true); // 1페이지 끝===============================================================

		tuto_2 = new JPanel(); // 2페이지 시작 ================================================================
		ImageIcon scene2 = new ImageIcon("src/image/튜토리얼_1.png");
		tuto_2.setBackground(new Color(255, 255, 255));
		tuto_2.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_2);
		tuto_2.setLayout(null);

		ImageIcon next2 = new ImageIcon("");
		JButton tuto2Next = new JButton(next2); // 다음페이지 버튼
		tuto2Next.setBorderPainted(false);
		tuto2Next.setContentAreaFilled(false);
		tuto2Next.setFocusPainted(false);
		tuto2Next.setBounds(0, 0, 684, 561);
		tuto2Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_3.setVisible(true);
				tuto_2.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_2.add(tuto2Next);
		JLabel screen2 = new JLabel(scene2); // 이미지
		screen2.setBounds(0, 0, 684, 561);

		tuto_2.add(screen2);
		tuto_2.setVisible(false); // 2페이지 끝===============================================================

		tuto_3 = new JPanel(); // 3페이지 시작 ================================================================
		ImageIcon scene3 = new ImageIcon("src/image/튜토리얼_2.png");
		tuto_3.setBackground(new Color(255, 255, 255));
		tuto_3.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_3);
		tuto_3.setLayout(null);

		ImageIcon next3 = new ImageIcon("");
		JButton tuto3Next = new JButton(next3); // 다음페이지 버튼
		tuto3Next.setBorderPainted(false);
		tuto3Next.setContentAreaFilled(false);
		tuto3Next.setFocusPainted(false);
		tuto3Next.setBounds(0, 0, 684, 561);
		tuto3Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_4.setVisible(true);
				tuto_3.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_3.add(tuto3Next);
		JLabel screen3 = new JLabel(scene3); // 이미지
		screen3.setBounds(0, 0, 684, 561);

		tuto_3.add(screen3);
		tuto_3.setVisible(false); // 3페이지 끝===============================================================

		tuto_4 = new JPanel(); // 4페이지 시작 ================================================================
		ImageIcon scene4 = new ImageIcon("src/image/튜토리얼_3.png");
		tuto_4.setBackground(new Color(255, 255, 255));
		tuto_4.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_4);
		tuto_4.setLayout(null);

		ImageIcon next4 = new ImageIcon("");
		JButton tuto4Next = new JButton(next4); // 다음페이지 버튼
		tuto4Next.setBorderPainted(false);
		tuto4Next.setContentAreaFilled(false);
		tuto4Next.setFocusPainted(false);
		tuto4Next.setBounds(0, 0, 684, 561);
		tuto4Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_5.setVisible(true);
				tuto_4.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_4.add(tuto4Next);
		JLabel screen4 = new JLabel(scene4); // 이미지
		screen4.setBounds(0, 0, 684, 561);

		tuto_4.add(screen4);
		tuto_4.setVisible(false); // 4페이지 끝===============================================================

		tuto_5 = new JPanel(); // 5페이지 시작 ================================================================
		ImageIcon scene5 = new ImageIcon("src/image/튜토리얼_4.png");
		tuto_5.setBackground(new Color(255, 255, 255));
		tuto_5.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_5);
		tuto_5.setLayout(null);

		ImageIcon next5 = new ImageIcon("");
		JButton tuto5Next = new JButton(next5); // 다음페이지 버튼
		tuto5Next.setBorderPainted(false);
		tuto5Next.setContentAreaFilled(false);
		tuto5Next.setFocusPainted(false);
		tuto5Next.setBounds(0, 0, 684, 561);
		tuto5Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_6.setVisible(true);
				tuto_5.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_5.add(tuto5Next);
		JLabel screen5 = new JLabel(scene5); // 이미지
		screen5.setBounds(0, 0, 684, 561);

		tuto_5.add(screen5);
		tuto_5.setVisible(false); // 5페이지 끝===============================================================

		tuto_6 = new JPanel(); // 6페이지 시작 ================================================================
		ImageIcon scene6 = new ImageIcon("src/image/튜토리얼_5.png");
		tuto_6.setBackground(new Color(255, 255, 255));
		tuto_6.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_6);
		tuto_6.setLayout(null);

		ImageIcon next6 = new ImageIcon("");
		JButton tuto6Next = new JButton(next6); // 다음페이지 버튼
		tuto6Next.setBorderPainted(false);
		tuto6Next.setContentAreaFilled(false);
		tuto6Next.setFocusPainted(false);
		tuto6Next.setBounds(0, 0, 684, 561);
		tuto6Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_7.setVisible(true);
				tuto_6.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_6.add(tuto6Next);
		JLabel screen6 = new JLabel(scene6); // 이미지
		screen6.setBounds(0, 0, 684, 561);

		tuto_6.add(screen6);
		tuto_6.setVisible(false); // 6페이지 끝===============================================================

		tuto_7 = new JPanel(); // 7페이지 시작 ================================================================
		ImageIcon scene7 = new ImageIcon("src/image/튜토리얼_6.png");
		tuto_7.setBackground(new Color(255, 255, 255));
		tuto_7.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_7);
		tuto_7.setLayout(null);

		ImageIcon next7 = new ImageIcon("");
		JButton tuto7Next = new JButton(next7); // 다음페이지 버튼
		tuto7Next.setBorderPainted(false);
		tuto7Next.setContentAreaFilled(false);
		tuto7Next.setFocusPainted(false);
		tuto7Next.setBounds(0, 0, 684, 561);
		tuto7Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_8.setVisible(true);
				tuto_7.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_7.add(tuto7Next);
		JLabel screen7 = new JLabel(scene7); // 이미지
		screen7.setBounds(0, 0, 684, 561);

		tuto_7.add(screen7);
		tuto_7.setVisible(false); // 7페이지 끝===============================================================

		tuto_8 = new JPanel(); // 8페이지 시작 ================================================================
		ImageIcon scene8 = new ImageIcon("src/image/튜토리얼_7.png");
		tuto_8.setBackground(new Color(255, 255, 255));
		tuto_8.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_8);
		tuto_8.setLayout(null);

		ImageIcon next8 = new ImageIcon("");
		JButton tuto8Next = new JButton(next8); // 다음페이지 버튼
		tuto8Next.setBorderPainted(false);
		tuto8Next.setContentAreaFilled(false);
		tuto8Next.setFocusPainted(false);
		tuto8Next.setBounds(0, 0, 684, 561);
		tuto8Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_9.setVisible(true);
				tuto_8.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_8.add(tuto8Next);
		JLabel screen8 = new JLabel(scene8); // 이미지
		screen8.setBounds(0, 0, 684, 561);

		tuto_8.add(screen8);
		tuto_8.setVisible(false); // 8페이지 끝===============================================================

		tuto_9 = new JPanel(); // 9페이지 시작 ================================================================
		ImageIcon scene9 = new ImageIcon("src/image/튜토리얼_8.png");
		tuto_9.setBackground(new Color(255, 255, 255));
		tuto_9.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_9);
		tuto_9.setLayout(null);

		ImageIcon next9 = new ImageIcon("");
		JButton tuto9Next = new JButton(next9); // 다음페이지 버튼
		tuto9Next.setBorderPainted(false);
		tuto9Next.setContentAreaFilled(false);
		tuto9Next.setFocusPainted(false);
		tuto9Next.setBounds(0, 0, 684, 561);
		tuto9Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_10.setVisible(true);
				tuto_9.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_9.add(tuto9Next);
		JLabel screen9 = new JLabel(scene9); // 이미지
		screen9.setBounds(0, 0, 684, 561);

		tuto_9.add(screen9);
		tuto_9.setVisible(false); // 9페이지 끝===============================================================

		tuto_10 = new JPanel(); // 10페이지 시작 ================================================================
		ImageIcon scene10 = new ImageIcon("src/image/튜토리얼_9.png");
		tuto_10.setBackground(new Color(255, 255, 255));
		tuto_10.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_10);
		tuto_10.setLayout(null);

		ImageIcon next10 = new ImageIcon("");
		JButton tuto10Next = new JButton(next10); // 다음페이지 버튼
		tuto10Next.setBorderPainted(false);
		tuto10Next.setContentAreaFilled(false);
		tuto10Next.setFocusPainted(false);
		tuto10Next.setBounds(0, 0, 684, 561);
		tuto10Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_11.setVisible(true);
				tuto_10.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_10.add(tuto10Next);
		JLabel screen10 = new JLabel(scene10); // 이미지
		screen10.setBounds(0, 0, 684, 561);

		tuto_10.add(screen10);
		tuto_10.setVisible(false); // 10페이지 끝===============================================================

		tuto_11 = new JPanel(); // 11페이지 시작 ================================================================
		ImageIcon scene11 = new ImageIcon("src/image/튜토리얼_10.png");
		tuto_11.setBackground(new Color(255, 255, 255));
		tuto_11.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_11);
		tuto_11.setLayout(null);

		ImageIcon next11 = new ImageIcon("");
		JButton tuto11Next = new JButton(next11); // 다음페이지 버튼
		tuto11Next.setBorderPainted(false);
		tuto11Next.setContentAreaFilled(false);
		tuto11Next.setFocusPainted(false);
		tuto11Next.setBounds(0, 0, 684, 561);
		tuto11Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_12.setVisible(true);
				tuto_11.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_11.add(tuto11Next);
		JLabel screen11 = new JLabel(scene11); // 이미지
		screen11.setBounds(0, 0, 684, 561);

		tuto_11.add(screen11);
		tuto_11.setVisible(false); // 11페이지 끝===============================================================

		tuto_12 = new JPanel(); // 12페이지 시작 ================================================================
		ImageIcon scene12 = new ImageIcon("src/image/튜토리얼_11.png");
		tuto_12.setBackground(new Color(255, 255, 255));
		tuto_12.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_12);
		tuto_12.setLayout(null);

		ImageIcon next12 = new ImageIcon("");
		JButton tuto12Next = new JButton(next12); // 다음페이지 버튼
		tuto12Next.setBorderPainted(false);
		tuto12Next.setContentAreaFilled(false);
		tuto12Next.setFocusPainted(false);
		tuto12Next.setBounds(0, 0, 684, 561);
		tuto12Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_13.setVisible(true);
				tuto_12.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_12.add(tuto12Next);
		JLabel screen12 = new JLabel(scene12); // 이미지
		screen12.setBounds(0, 0, 684, 561);

		tuto_12.add(screen12);
		tuto_12.setVisible(false); // 12페이지 끝===============================================================

		tuto_13 = new JPanel(); // 13페이지 시작 ================================================================
		ImageIcon scene13 = new ImageIcon("src/image/튜토리얼_12.png");
		tuto_13.setBackground(new Color(255, 255, 255));
		tuto_13.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_13);
		tuto_13.setLayout(null);

		ImageIcon next13 = new ImageIcon("");
		JButton tuto13Next = new JButton(next13); // 다음페이지 버튼
		tuto13Next.setBorderPainted(false);
		tuto13Next.setContentAreaFilled(false);
		tuto13Next.setFocusPainted(false);
		tuto13Next.setBounds(0, 0, 684, 561);
		tuto13Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_14.setVisible(true);
				tuto_13.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_13.add(tuto13Next);
		JLabel screen13 = new JLabel(scene13); // 이미지
		screen13.setBounds(0, 0, 684, 561);

		tuto_13.add(screen13);
		tuto_13.setVisible(false); // 13페이지 끝===============================================================

		tuto_14 = new JPanel(); // 14페이지 시작 ================================================================
		ImageIcon scene14 = new ImageIcon("src/image/튜토리얼_13.png");
		tuto_14.setBackground(new Color(255, 255, 255));
		tuto_14.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_14);
		tuto_14.setLayout(null);

		ImageIcon next14 = new ImageIcon("");
		JButton tuto14Next = new JButton(next14); // 다음페이지 버튼
		tuto14Next.setBorderPainted(false);
		tuto14Next.setContentAreaFilled(false);
		tuto14Next.setFocusPainted(false);
		tuto14Next.setBounds(0, 0, 684, 561);
		tuto14Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_15.setVisible(true);
				tuto_14.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_14.add(tuto14Next);
		JLabel screen14 = new JLabel(scene14); // 이미지
		screen14.setBounds(0, 0, 684, 561);

		tuto_14.add(screen14);
		tuto_14.setVisible(false); // 14페이지 끝===============================================================

		tuto_15 = new JPanel(); // 15페이지 시작 ================================================================
		ImageIcon scene15 = new ImageIcon("src/image/튜토리얼_14.png");
		tuto_15.setBackground(new Color(255, 255, 255));
		tuto_15.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_15);
		tuto_15.setLayout(null);

		ImageIcon next15 = new ImageIcon("");
		JButton tuto15Next = new JButton(next15); // 다음페이지 버튼
		tuto15Next.setBorderPainted(false);
		tuto15Next.setContentAreaFilled(false);
		tuto15Next.setFocusPainted(false);
		tuto15Next.setBounds(0, 0, 684, 561);
		tuto15Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_16.setVisible(true);
				tuto_15.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_15.add(tuto15Next);
		JLabel screen15 = new JLabel(scene15); // 이미지
		screen15.setBounds(0, 0, 684, 561);

		tuto_15.add(screen15);
		tuto_15.setVisible(false); // 15페이지 끝===============================================================

		tuto_16 = new JPanel(); // 16페이지 시작 ================================================================
		ImageIcon scene16 = new ImageIcon("src/image/튜토리얼_15.png");
		tuto_16.setBackground(new Color(255, 255, 255));
		tuto_16.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_16);
		tuto_16.setLayout(null);

		ImageIcon next16 = new ImageIcon("");
		JButton tuto16Next = new JButton(next16); // 다음페이지 버튼
		tuto16Next.setBorderPainted(false);
		tuto16Next.setContentAreaFilled(false);
		tuto16Next.setFocusPainted(false);
		tuto16Next.setBounds(0, 0, 684, 561);
		tuto16Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_17.setVisible(true);
				tuto_16.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_16.add(tuto16Next);
		JLabel screen16 = new JLabel(scene16); // 이미지
		screen16.setBounds(0, 0, 684, 561);

		tuto_16.add(screen16);
		tuto_16.setVisible(false); // 16페이지 끝===============================================================

		tuto_17 = new JPanel(); // 17페이지 시작 ================================================================
		ImageIcon scene17 = new ImageIcon("src/image/튜토리얼_16.png");
		tuto_17.setBackground(new Color(255, 255, 255));
		tuto_17.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_17);
		tuto_17.setLayout(null);

		ImageIcon next17 = new ImageIcon("");
		JButton tuto17Next = new JButton(next17); // 다음페이지 버튼
		tuto17Next.setBorderPainted(false);
		tuto17Next.setContentAreaFilled(false);
		tuto17Next.setFocusPainted(false);
		tuto17Next.setBounds(0, 0, 684, 561);
		tuto17Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_18.setVisible(true);
				tuto_17.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_17.add(tuto17Next);
		JLabel screen17 = new JLabel(scene17); // 이미지
		screen17.setBounds(0, 0, 684, 561);

		tuto_17.add(screen17);
		tuto_17.setVisible(false); // 17페이지 끝===============================================================

		tuto_18 = new JPanel(); // 18페이지 시작 ================================================================
		ImageIcon scene18 = new ImageIcon("src/image/튜토리얼_17.png");
		tuto_18.setBackground(new Color(255, 255, 255));
		tuto_18.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_18);
		tuto_18.setLayout(null);

		ImageIcon next18 = new ImageIcon("");
		JButton tuto18Next = new JButton(next18); // 다음페이지 버튼
		tuto18Next.setBorderPainted(false);
		tuto18Next.setContentAreaFilled(false);
		tuto18Next.setFocusPainted(false);
		tuto18Next.setBounds(0, 0, 684, 561);
		tuto18Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_19.setVisible(true);
				tuto_18.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_18.add(tuto18Next);
		JLabel screen18 = new JLabel(scene18); // 이미지
		screen18.setBounds(0, 0, 684, 561);

		tuto_18.add(screen18);
		tuto_18.setVisible(false); // 18페이지 끝===============================================================

		tuto_19 = new JPanel(); // 19페이지 시작 ================================================================
		ImageIcon scene19 = new ImageIcon("src/image/튜토리얼_18.png");
		tuto_19.setBackground(new Color(255, 255, 255));
		tuto_19.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_19);
		tuto_19.setLayout(null);

		ImageIcon next19 = new ImageIcon("");
		JButton tuto19Next = new JButton(next19); // 다음페이지 버튼
		tuto19Next.setBorderPainted(false);
		tuto19Next.setContentAreaFilled(false);
		tuto19Next.setFocusPainted(false);
		tuto19Next.setBounds(0, 0, 684, 561);
		tuto19Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_20.setVisible(true);
				tuto_19.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_19.add(tuto19Next);
		JLabel screen19 = new JLabel(scene19); // 이미지
		screen19.setBounds(0, 0, 684, 561);

		tuto_19.add(screen19);
		tuto_19.setVisible(false); // 19페이지 끝===============================================================

		tuto_20 = new JPanel(); // 20페이지 시작 ================================================================
		ImageIcon scene20 = new ImageIcon("src/image/튜토리얼_19.png");
		tuto_20.setBackground(new Color(255, 255, 255));
		tuto_20.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_20);
		tuto_20.setLayout(null);

		ImageIcon next20 = new ImageIcon("");
		JButton tuto20Next = new JButton(next20); // 다음페이지 버튼
		tuto20Next.setBorderPainted(false);
		tuto20Next.setContentAreaFilled(false);
		tuto20Next.setFocusPainted(false);
		tuto20Next.setBounds(0, 0, 684, 561);
		tuto20Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_21.setVisible(true);
				tuto_20.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_20.add(tuto20Next);
		JLabel screen20 = new JLabel(scene20); // 이미지
		screen20.setBounds(0, 0, 684, 561);

		tuto_20.add(screen20);
		tuto_20.setVisible(false); // 20페이지 끝===============================================================

		tuto_21 = new JPanel(); // 21페이지 시작 ================================================================
		ImageIcon scene21 = new ImageIcon("src/image/튜토리얼_20.png");
		tuto_21.setBackground(new Color(255, 255, 255));
		tuto_21.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_21);
		tuto_21.setLayout(null);

		ImageIcon next21 = new ImageIcon("");
		JButton tuto21Next = new JButton(next21); // 다음페이지 버튼
		tuto21Next.setBorderPainted(false);
		tuto21Next.setContentAreaFilled(false);
		tuto21Next.setFocusPainted(false);
		tuto21Next.setBounds(0, 0, 684, 561);
		tuto21Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_22.setVisible(true);
				tuto_21.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_21.add(tuto21Next);
		JLabel screen21 = new JLabel(scene21); // 이미지
		screen21.setBounds(0, 0, 684, 561);

		tuto_21.add(screen21);
		tuto_21.setVisible(false); // 21페이지 끝===============================================================

		tuto_22 = new JPanel(); // 22페이지 시작 ================================================================
		ImageIcon scene22 = new ImageIcon("src/image/튜토리얼_21.png");
		tuto_22.setBackground(new Color(255, 255, 255));
		tuto_22.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_22);
		tuto_22.setLayout(null);

		ImageIcon next22 = new ImageIcon("");
		JButton tuto22Next = new JButton(next22); // 다음페이지 버튼
		tuto22Next.setBorderPainted(false);
		tuto22Next.setContentAreaFilled(false);
		tuto22Next.setFocusPainted(false);
		tuto22Next.setBounds(0, 0, 684, 561);
		tuto22Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_23.setVisible(true);
				tuto_22.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_22.add(tuto22Next);
		JLabel screen22 = new JLabel(scene22); // 이미지
		screen22.setBounds(0, 0, 684, 561);

		tuto_22.add(screen22);
		tuto_22.setVisible(false); // 22페이지 끝===============================================================

		tuto_23 = new JPanel(); // 23페이지 시작 ================================================================
		ImageIcon scene23 = new ImageIcon("src/image/튜토리얼_22.png");
		tuto_23.setBackground(new Color(255, 255, 255));
		tuto_23.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_23);
		tuto_23.setLayout(null);

		ImageIcon next23 = new ImageIcon("");
		JButton tuto23Next = new JButton(next23); // 다음페이지 버튼
		tuto23Next.setBorderPainted(false);
		tuto23Next.setContentAreaFilled(false);
		tuto23Next.setFocusPainted(false);
		tuto23Next.setBounds(0, 0, 684, 561);
		tuto23Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_24.setVisible(true);
				tuto_23.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_23.add(tuto23Next);
		JLabel screen23 = new JLabel(scene23); // 이미지
		screen23.setBounds(0, 0, 684, 561);

		tuto_23.add(screen23);
		tuto_23.setVisible(false); // 23페이지 끝===============================================================

		tuto_24 = new JPanel(); // 24페이지 시작 (선택지 패널)================================================================
		ImageIcon scene24 = new ImageIcon("src/image/튜토리얼_23.png");
		tuto_24.setBackground(new Color(255, 255, 255));
		tuto_24.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_24);
		tuto_24.setLayout(null);

		JButton btnNewButton = new JButton("응.");
		btnNewButton.setBackground(new Color(186, 184, 254));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_25.setVisible(true);
				tuto_24.setVisible(false);
				System.out.println("다음으로");
			}
		});
		btnNewButton.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 20));
		btnNewButton.setBounds(418, 279, 210, 65);
		tuto_24.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("아니.");
		btnNewButton_1.setBackground(new Color(186, 184, 254));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_30.setVisible(true);
				tuto_24.setVisible(false);
				System.out.println("다음으로");
			}
		});
		btnNewButton_1.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 20));
		btnNewButton_1.setBounds(418, 380, 210, 65);
		tuto_24.add(btnNewButton_1);

//		ImageIcon next24 = new ImageIcon("");
//		JButton tuto24Next = new JButton(next24); // 다음페이지 버튼
//		tuto24Next.setBorderPainted(false);
//		tuto24Next.setContentAreaFilled(false);
//		tuto24Next.setFocusPainted(false);
//		tuto24Next.setBounds(0, 0, 684, 561);
//		tuto24Next.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				tuto_25.setVisible(true);
//				tuto_24.setVisible(false);
//				System.out.println("다음으로");
//			}
//		});
//		tuto_24.add(tuto24Next);
		JLabel screen24 = new JLabel(scene24); // 이미지
		screen24.setBounds(0, 0, 684, 561);

		tuto_24.add(screen24);
		tuto_24.setVisible(false); // 24페이지 끝===============================================================

		tuto_25 = new JPanel(); // 25페이지 시작 ================================================================
		ImageIcon scene25 = new ImageIcon("src/image/튜토리얼_24.png");
		tuto_25.setBackground(new Color(255, 255, 255));
		tuto_25.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_25);
		tuto_25.setLayout(null);

		ImageIcon next25 = new ImageIcon("");
		JButton tuto25Next = new JButton(next25); // 다음페이지 버튼
		tuto25Next.setBorderPainted(false);
		tuto25Next.setContentAreaFilled(false);
		tuto25Next.setFocusPainted(false);
		tuto25Next.setBounds(0, 0, 684, 561);
		tuto25Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_26.setVisible(true);
				tuto_25.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_25.add(tuto25Next);
		JLabel screen25 = new JLabel(scene25); // 이미지
		screen25.setBounds(0, 0, 684, 561);

		tuto_25.add(screen25);
		tuto_25.setVisible(false); // 25페이지 끝===============================================================

		tuto_26 = new JPanel(); // 26페이지 시작 ================================================================
		ImageIcon scene26 = new ImageIcon("src/image/튜토리얼_25.png");
		tuto_26.setBackground(new Color(255, 255, 255));
		tuto_26.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_26);
		tuto_26.setLayout(null);

		ImageIcon next26 = new ImageIcon("");
		JButton tuto26Next = new JButton(next26); // 다음페이지 버튼
		tuto26Next.setBorderPainted(false);
		tuto26Next.setContentAreaFilled(false);
		tuto26Next.setFocusPainted(false);
		tuto26Next.setBounds(0, 0, 684, 561);
		tuto26Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_27.setVisible(true);
				tuto_26.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_26.add(tuto26Next);
		JLabel screen26 = new JLabel(scene26); // 이미지
		screen26.setBounds(0, 0, 684, 561);

		tuto_26.add(screen26);
		tuto_26.setVisible(false); // 26페이지 끝===============================================================

		tuto_27 = new JPanel(); // 27페이지 시작 ================================================================
		ImageIcon scene27 = new ImageIcon("src/image/튜토리얼_26.png");
		tuto_27.setBackground(new Color(255, 255, 255));
		tuto_27.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_27);
		tuto_27.setLayout(null);

		ImageIcon next27 = new ImageIcon("");
		JButton tuto27Next = new JButton(next27); // 다음페이지 버튼
		tuto27Next.setBorderPainted(false);
		tuto27Next.setContentAreaFilled(false);
		tuto27Next.setFocusPainted(false);
		tuto27Next.setBounds(0, 0, 684, 561);
		tuto27Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_28.setVisible(true);
				tuto_27.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_27.add(tuto27Next);
		JLabel screen27 = new JLabel(scene27); // 이미지
		screen27.setBounds(0, 0, 684, 561);

		tuto_27.add(screen27);
		tuto_27.setVisible(false); // 27페이지 끝===============================================================

		tuto_28 = new JPanel(); // 28페이지 시작 ================================================================
		ImageIcon scene28 = new ImageIcon("src/image/튜토리얼_27.png");
		tuto_28.setBackground(new Color(255, 255, 255));
		tuto_28.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_28);
		tuto_28.setLayout(null);

		ImageIcon next28 = new ImageIcon("");
		JButton tuto28Next = new JButton(next28); // 다음페이지 버튼
		tuto28Next.setBorderPainted(false);
		tuto28Next.setContentAreaFilled(false);
		tuto28Next.setFocusPainted(false);
		tuto28Next.setBounds(0, 0, 684, 561);
		tuto28Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_29.setVisible(true);
				tuto_28.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_28.add(tuto28Next);
		JLabel screen28 = new JLabel(scene28); // 이미지
		screen28.setBounds(0, 0, 684, 561);

		tuto_28.add(screen28);
		tuto_28.setVisible(false); // 28페이지 끝===============================================================

		tuto_29 = new JPanel(); // 29페이지 시작 ================================================================
		ImageIcon scene29 = new ImageIcon("src/image/튜토리얼_28.png");
		tuto_29.setBackground(new Color(255, 255, 255));
		tuto_29.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_29);
		tuto_29.setLayout(null);

		ImageIcon next29 = new ImageIcon("");
		JButton tuto29Next = new JButton(next29); // 다음페이지 버튼
		tuto29Next.setBorderPainted(false);
		tuto29Next.setContentAreaFilled(false);
		tuto29Next.setFocusPainted(false);
		tuto29Next.setBounds(0, 0, 684, 561);
		tuto29Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_30.setVisible(true);
				tuto_29.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_29.add(tuto29Next);
		JLabel screen29 = new JLabel(scene29); // 이미지
		screen29.setBounds(0, 0, 684, 561);

		tuto_29.add(screen29);
		tuto_29.setVisible(false); // 29페이지 끝===============================================================

		tuto_30 = new JPanel(); // 30페이지 시작 ================================================================
		ImageIcon scene30 = new ImageIcon("src/image/튜토리얼_29.png");
		tuto_30.setBackground(new Color(255, 255, 255));
		tuto_30.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_30);
		tuto_30.setLayout(null);

		ImageIcon next30 = new ImageIcon("");
		JButton tuto30Next = new JButton(next30); // 다음페이지 버튼
		tuto30Next.setBorderPainted(false);
		tuto30Next.setContentAreaFilled(false);
		tuto30Next.setFocusPainted(false);
		tuto30Next.setBounds(0, 0, 684, 561);
		tuto30Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_31.setVisible(true);
				tuto_30.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_30.add(tuto30Next);
		JLabel screen30 = new JLabel(scene30); // 이미지
		screen30.setBounds(0, 0, 684, 561);

		tuto_30.add(screen30);
		tuto_30.setVisible(false); // 30페이지 끝===============================================================

		tuto_31 = new JPanel(); // 31페이지 시작 ================================================================
		ImageIcon scene31 = new ImageIcon("src/image/튜토리얼_30.png");
		tuto_31.setBackground(new Color(255, 255, 255));
		tuto_31.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_31);
		tuto_31.setLayout(null);

		ImageIcon next31 = new ImageIcon("");
		JButton tuto31Next = new JButton(next31); // 다음페이지 버튼
		tuto31Next.setBorderPainted(false);
		tuto31Next.setContentAreaFilled(false);
		tuto31Next.setFocusPainted(false);
		tuto31Next.setBounds(0, 0, 684, 561);
		tuto31Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuto_32.setVisible(true);
				tuto_31.setVisible(false);
				System.out.println("다음으로");
			}
		});
		tuto_31.add(tuto31Next);
		JLabel screen31 = new JLabel(scene31); // 이미지
		screen31.setBounds(0, 0, 684, 561);

		tuto_31.add(screen31);
		tuto_31.setVisible(false); // 31페이지 끝===============================================================

		tuto_32 = new JPanel(); // 32페이지 시작 ================================================================
		ImageIcon scene32 = new ImageIcon("src/image/튜토리얼_31.png");
		tuto_32.setBackground(new Color(255, 255, 255));
		tuto_32.setBounds(0, 0, 684, 561);
		frame.getContentPane().add(tuto_32);
		tuto_32.setLayout(null);

		ImageIcon next32 = new ImageIcon("");
		JButton tuto32Next = new JButton(next32); // 다음페이지 버튼
		tuto32Next.setBorderPainted(false);
		tuto32Next.setContentAreaFilled(false);
		tuto32Next.setFocusPainted(false);
		tuto32Next.setBounds(0, 0, 684, 561);
		tuto32Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				tuto_31.setVisible(true);
//				tuto_30.setVisible(false);
				frame.dispose();
			}
		});
		tuto_32.add(tuto32Next);
		JLabel screen32 = new JLabel(scene32); // 이미지
		screen32.setBounds(0, 0, 684, 561);

		tuto_32.add(screen32);
		tuto_32.setVisible(false); // 32페이지 끝===============================================================

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tuto window = new Tuto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
