package guis;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.SwingConstants;

import character.avatarImageImpl;
import character.onOff;

public class PurchaseFrame {
	
	MainFrame main = new MainFrame();
	avatarImageImpl avatar = new avatarImageImpl();
	String avatarName ;
	String type ;
	JFrame frame;
	boolean go;
	boolean gogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PurchaseFrame window = new PurchaseFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PurchaseFrame() {
		initialize(go,gogo);
		customcursor();
	}

	public void customcursor() { // 마우스포인터 ====================================

		Toolkit tk = Toolkit.getDefaultToolkit();
		Image cursorimage = tk.getImage("마우스포인터_1.png");
		Point point = new Point(20, 20);
		Cursor cursor = tk.createCustomCursor(cursorimage, point, "haha");
		frame.setCursor(cursor);
	} // =======================================================
	
	public void initialize(boolean go,boolean gogo ) {
		 
		
		
		System.out.println(go);
		System.out.println(gogo);
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 417, 489);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon 배경 = new ImageIcon("미리보기"+ main.avatar.avatarOnFinding(main.user_pk, "배경"));
		ImageIcon 얼굴 = new ImageIcon("미리보기" + main.avatar.avatarOnFinding(main.user_pk, "얼굴"));  // 캐릭터 옷 아이콘 =================
		ImageIcon 악세서리 = new ImageIcon("미리보기" + main.avatar.avatarOnFinding(main.user_pk, "악세사리"));
		ImageIcon 상의 = new ImageIcon("미리보기" + main.avatar.avatarOnFinding(main.user_pk, "옷")); // =======================
		ImageIcon 상점캐릭터 = new ImageIcon("농담곰_상점_기본.png");
		
		
		JButton previousButton = new JButton("이전으로");
		previousButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
		previousButton.setBounds(12, 417, 90, 23);
		frame.getContentPane().add(previousButton);
		
		JButton buyButton = new JButton("구입하기");
		buyButton.setBounds(299, 417, 90, 23);
		
		avatar.byAvatar(main.mainnickname,  avatarName);
		avatar.insertCopy(main.mainnickname , avatarName);
		System.out.println(main.mainnickname);
		System.out.println(avatarName);
		
		frame.getContentPane().add(buyButton);
		if(go == false) {
		buyButton.setEnabled(go);
		}else {
			buyButton.setEnabled(true);
		}
		
		JButton unequipButton = new JButton("해제하기");
		unequipButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				avatar.avatarTakeOnOff(0,main.user_pk,avatarName);
			}
		});
		unequipButton.setBounds(206, 417, 81, 23);
		frame.getContentPane().add(unequipButton);
		
		JButton equipButton = new JButton("착용하기");
		equipButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				avatar.onSearching(main.user_pk, avatarName, type);
				
			}
		});
		equipButton.setBounds(114, 417, 81, 23);
		frame.getContentPane().add(equipButton);
		if(gogo == false) {
		equipButton.setEnabled(gogo);
		}else {
			equipButton.setEnabled(true);
		}
		JLabel price = new JLabel("아바타이름");
		price.setHorizontalAlignment(SwingConstants.CENTER);
		price.setBounds(12, 51, 159, 31);
		frame.getContentPane().add(price);
		
		JLabel avatarName = new JLabel("가격 ~~포인트");
		avatarName.setHorizontalAlignment(SwingConstants.CENTER);
		avatarName.setBounds(12, 10, 159, 31);
		frame.getContentPane().add(avatarName);
		
		
		
		
		
		
		JLabel charHead = new JLabel(얼굴);  // 상점 캐릭터 착용샷 =======================================================================
		charHead.setBounds(52, 21, 300, 430);
		frame.getContentPane().add(charHead);
		
		JLabel charAcc = new JLabel(악세서리);
		charAcc.setBounds(52, 21, 300, 430);
		frame.getContentPane().add(charAcc);
		
		JLabel charTop = new JLabel(상의);
		charTop.setBounds(52, 21, 300, 430);
		frame.getContentPane().add(charTop);
		
		JLabel mainChar = new JLabel(상점캐릭터);
		//mainChar.setBorder(bb);
		mainChar.setBounds(60, 21, 300, 430);
		frame.getContentPane().add(mainChar); 
		
		JLabel main = new JLabel(배경);
		//main.setBorder(bb);
		main.setBounds(60, 21, 300, 430);
		frame.getContentPane().add(main);
		
	}
}
