package guis;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StoreFrame {
	MainFrame main = new MainFrame();
	JFrame frame;
	private LineBorder bb = new LineBorder(Color.black, 1, true);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreFrame window = new StoreFrame();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StoreFrame() {
		initialize();
		customcursor();
	}

	public void customcursor() { // 마우스포인터 ====================================

		Toolkit tk = Toolkit.getDefaultToolkit();
		Image cursorimage = tk.getImage("대형견_커서.png");
		Point point = new Point(0, 0);
		Cursor cursor = tk.createCustomCursor(cursorimage, point, "haha");
		frame.setCursor(cursor);
	} // =======================================================

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("상점");
		frame.setBounds(100, 100, 815, 526);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon 얼굴 = new ImageIcon(main.avatar.avatarOnFinding(main.user_pk, "얼굴"));  // 캐릭터 옷 아이콘 =================
		ImageIcon 악세서리 = new ImageIcon(main.avatar.avatarOnFinding(main.user_pk, "악세사리"));
		ImageIcon 상의 = new ImageIcon(main.avatar.avatarOnFinding(main.user_pk, "옷")); // =======================
		ImageIcon 상점캐릭터 = new ImageIcon("농담곰_상점_기본.png");
		ImageIcon 목도리 = new ImageIcon("목도리.png");
		ImageIcon 요리사 = new ImageIcon("요리사.png");
		ImageIcon 조리기구 = new ImageIcon("조리기구.png");
		ImageIcon 앞치마 = new ImageIcon("앞치마.png");
		ImageIcon 튜브 = new ImageIcon("튜브.png");
		ImageIcon 사슴뿔 = new ImageIcon("사슴뿔.png");
		ImageIcon 썬글라스 = new ImageIcon("썬글라스.png");
		ImageIcon 겨울배경 = new ImageIcon("겨울배경.png");
		ImageIcon 용사검 = new ImageIcon("용사검.png");
		ImageIcon 용사투구 = new ImageIcon("용사투구.png");
		ImageIcon 용사갑옷 = new ImageIcon("용사갑옷.png");
		ImageIcon 물총 = new ImageIcon("물총.png");
		ImageIcon 고구마 = new ImageIcon("고구마.png");
		ImageIcon 용사의방 = new ImageIcon("용사의방.png");
		ImageIcon 여름 = new ImageIcon("여름.png");
		ImageIcon 주방 = new ImageIcon("주방.png");

		JButton btnNewButton_1 = new JButton("목도리.png");
		btnNewButton_1.setIcon(목도리);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Object ok = e.getSource();
				
				if(ok == btnNewButton_1) {
					
					PurchaseFrame purchaseFrame = new PurchaseFrame();
				purchaseFrame.avatarName = "목도리.png";
				purchaseFrame.type = "옷";
				
				System.out.println(purchaseFrame.avatarName);
				System.out.println(purchaseFrame.type);
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				}
				
				
			
		
				
			}
		});
		
		
		btnNewButton_1.setBounds(324, 21, 90, 100);
		frame.getContentPane().add(btnNewButton_1);
		

		JButton btnNewButton_1_1 = new JButton("튜브.png");
		btnNewButton_1_1 .setIcon(튜브);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				purchaseFrame.avatarName = "튜브.png";
				purchaseFrame.type = "옷";
				
				
				
				
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		btnNewButton_1_1.setBounds(324, 131, 90, 100);
		frame.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("앞치마.png");
		btnNewButton_1_2.setIcon(앞치마);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				
				purchaseFrame.avatarName = "앞치마.png";
				purchaseFrame.type = "옷";
				
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		btnNewButton_1_2.setBounds(324, 241, 90, 100);
		frame.getContentPane().add(btnNewButton_1_2);

		JButton btnNewButton_1_3 = new JButton("용사갑옷.png");
		 btnNewButton_1_3.setIcon(용사갑옷);
		
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				
				purchaseFrame.avatarName = "용사갑옷.png";
				purchaseFrame.type = "옷";
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		btnNewButton_1_3.setBounds(324, 351, 90, 100);
		frame.getContentPane().add(btnNewButton_1_3);

		JButton btnNewButton_1_4 = new JButton("사슴뿔");
		btnNewButton_1_4.setIcon(사슴뿔);
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				purchaseFrame.avatarName = "사슴뿔.png";
				purchaseFrame.type = "얼굴";
				
				
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		btnNewButton_1_4.setBounds(426, 21, 90, 100);
		frame.getContentPane().add(btnNewButton_1_4);

		JButton btnNewButton_1_1_1 = new JButton("썬글라스");
		btnNewButton_1_1_1.setIcon(썬글라스);
	
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				
				purchaseFrame.avatarName = "썬글라스.png";
				purchaseFrame.type = "얼굴";
				
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		btnNewButton_1_1_1.setBounds(426, 131, 90, 100);
		frame.getContentPane().add(btnNewButton_1_1_1);

		JButton btnNewButton_1_2_1 = new JButton("요리사.png");
		btnNewButton_1_2_1.setIcon(요리사);
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				
				purchaseFrame.avatarName = "요리사.png";
				purchaseFrame.type = "얼굴";
				
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		btnNewButton_1_2_1.setBounds(426, 241, 90, 100);
		frame.getContentPane().add(btnNewButton_1_2_1);

		JButton btnNewButton_1_3_1 = new JButton("용사투구.png");
		btnNewButton_1_3_1.setIcon(용사투구);
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				
				purchaseFrame.avatarName = "용사투구.png";
				purchaseFrame.type = "얼굴";
				
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		btnNewButton_1_3_1.setBounds(426, 351, 90, 100);
		frame.getContentPane().add(btnNewButton_1_3_1);

		JButton btnNewButton_1_5 = new JButton("고구마.png");
		btnNewButton_1_5.setIcon(고구마);
		btnNewButton_1_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				
				purchaseFrame.avatarName = "고구마.png";
				purchaseFrame.type = "악세사리";
				
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		btnNewButton_1_5.setBounds(528, 21, 90, 100);
		frame.getContentPane().add(btnNewButton_1_5);

		JButton btnNewButton_1_1_2 = new JButton("물총.png");
		btnNewButton_1_1_2.setIcon(물총);
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				
				purchaseFrame.avatarName = "물총.png";
				purchaseFrame.type = "악세사리";
				
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		btnNewButton_1_1_2.setBounds(528, 131, 90, 100);
		frame.getContentPane().add(btnNewButton_1_1_2);

		JButton btnNewButton_1_2_2 = new JButton("조리도구.png");
		btnNewButton_1_2_2.setIcon(조리기구);
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				
				purchaseFrame.avatarName = "조리도구.png";
				purchaseFrame.type = "악세사리";
				
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		btnNewButton_1_2_2.setBounds(528, 241, 90, 100);
		frame.getContentPane().add(btnNewButton_1_2_2);

		JButton btnNewButton_1_3_2 = new JButton("용사검");
		btnNewButton_1_3_2.setIcon(용사검);
		
		
		btnNewButton_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				
				purchaseFrame.avatarName = "용사검.png";
				purchaseFrame.type = "악세사리";
				
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		btnNewButton_1_3_2.setBounds(528, 351, 90, 100);
		frame.getContentPane().add(btnNewButton_1_3_2);

		JButton btnNewButton_1_6 = new JButton("겨울배경.png");
		btnNewButton_1_6.setIcon(겨울배경);
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				purchaseFrame.avatarName = "겨울배경.png";
				purchaseFrame.type = "배경";
				
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		btnNewButton_1_6.setBounds(630, 21, 90, 100);
		frame.getContentPane().add(btnNewButton_1_6);

		JButton btnNewButton_1_1_3 = new JButton("주방");
		btnNewButton_1_1_3.setIcon(주방);
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				
				purchaseFrame.avatarName = "주방.png";
				purchaseFrame.type = "배경";
				
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		btnNewButton_1_1_3.setBounds(630, 131, 90, 100);
		frame.getContentPane().add(btnNewButton_1_1_3);

		JButton btnNewButton_1_2_3= new JButton("여름");
		btnNewButton_1_2_3.setIcon(여름);
		btnNewButton_1_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				
				purchaseFrame.avatarName = "여름.png";
				purchaseFrame.type = "배경";
				
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		btnNewButton_1_2_3.setBounds(630, 241, 90, 100);
		frame.getContentPane().add(btnNewButton_1_2_3);

		JButton btnNewButton_1_3_3 = new JButton("용사의방");
		btnNewButton_1_3_3.setIcon(용사의방);
		btnNewButton_1_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseFrame purchaseFrame = new PurchaseFrame();
				purchaseFrame.avatarName = "용사의방.png";
				purchaseFrame.type = "배경";
				
				purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
				purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
				purchaseFrame.frame.setResizable(false);
				
			}
		});
		btnNewButton_1_3_3.setBounds(630, 351, 90, 100);
		frame.getContentPane().add(btnNewButton_1_3_3);
//		int storeX = 324; // 반복문 버튼 생성  // 가능하면 반복문으로 한번 바꿔보자
//	      int storeY = 21;
//	      int a =0;
//	      
//	      Map<Integer , String> map = new HashMap<Integer , String>();
//	      JButton btnNewButton_1[][] = new JButton[4][4];
//	      ActionListener listener = new ActionListener() {
//        	public void actionPerformed(ActionEvent e) {
//        		PurchaseFrame purchaseFrame = new PurchaseFrame();
//        		purchaseFrame.frame.setVisible(true); // 다음 프레임 띄우기
//        		purchaseFrame.frame.setLocationRelativeTo(null); // 창 중간에 나오게함
//        		purchaseFrame.frame.setResizable(false);
//        		//.getText(avatar.pngListMeker().get(a));
//        		
//        	}
//        };
//        
//	      for (int i = 0; i < 4; i++) {
//	         storeY = 21;
//	         for (int j = 0; j < 4; j ++) {
//	            btnNewButton_1[i][j] = new JButton();
//	            btnNewButton_1[i][j].setBounds(storeX, storeY, 90, 100);
//	            btnNewButton_1[i][j].addActionListener(listener);
//	            btnNewButton_1[i][j].setText(avatar.pngListMeker().get(a));
//	            
//	            frame.getContentPane().add(btnNewButton_1[i][j]);
//	            
//	            //map.put(a, avatar.pngListMeker().get(a).toString());
//	            a++;
//	            storeY += 110;
//	           
//	         }
//	         storeX += 102;
//	      }
        
       
        
        
        
        

		JButton 이전창버튼 = new JButton("이전으로");
		이전창버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mainFrame = new MainFrame();  // hj 메인 나오게================
				mainFrame.frame.setVisible(true);
				mainFrame.frame.setLocationRelativeTo(null); 
				mainFrame.frame.setResizable(false);  // =====================
				frame.dispose();
			}
		});
		이전창버튼.setHorizontalAlignment(SwingConstants.TRAILING);
		이전창버튼.setBounds(732, 351, 55, 100);
		frame.getContentPane().add(이전창버튼);
		
		JLabel charHead = new JLabel(얼굴);  // 상점 캐릭터 착용샷 =======================================================================
		charHead.setBounds(12, 21, 300, 430);
		frame.getContentPane().add(charHead);
		
		JLabel charAcc = new JLabel(악세서리);
		charAcc.setBounds(12, 21, 300, 430);
		frame.getContentPane().add(charAcc);
		
		JLabel charTop = new JLabel(상의);
		charTop.setBounds(12, 21, 300, 430);
		frame.getContentPane().add(charTop);
		
		JLabel mainChar = new JLabel(상점캐릭터);
		mainChar.setBorder(bb);
		mainChar.setBounds(12, 21, 300, 430);
		frame.getContentPane().add(mainChar);  // ==================================================================
		
		JLabel lblNewLabel_1 = new JLabel("보유포인트:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(528, 462, 90, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("0포인트");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(630, 461, 157, 16);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
