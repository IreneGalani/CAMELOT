package camelot1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class RankingMenu1 extends JFrame {

	private JPanel contentPane;
Current_Game curr;
EndoftheGame end;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RankingMenu1 frame = new RankingMenu1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RankingMenu1() {
	//	Histoy h = new Histoy(false, curr.getPlayerList());
		//historyData hd= new historyData(curr,end.getWinnerSide() );
		setSize(350,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton displayHis = new JButton("\u0395\u03BC\u03C6\u03AC\u03BD\u03B9\u03C3\u03B7 \u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03BF\u03CD");
		displayHis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if(h.getEm()==true) {
					//tha bgazei mnm sthn othoni, den paei se nea othoni, blepe clearbutton
					//EmptyH eh=new EmptyH();
					//dispose();
					//.setVisible(true);
				//}
			//	else {
				//	h.GetList();
				//}
			}
		});
		displayHis.setBounds(112, 48, 147, 23);
		contentPane.add(displayHis);
		
		JButton newGame = new JButton("\u039D\u03AD\u03B1 \u03A0\u03B1\u03C1\u03C4\u03AF\u03B4\u03B1");
		newGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Special_Rules b=new Special_Rules(false,false);
					////	ArxikoMenuOth g = new ArxikoMenuOth(b);						
		              //  g.dispose();
						//setVisible(true);
					
			}
		});
		newGame.setBounds(112, 98, 147, 23);
		contentPane.add(newGame);
		
		JButton clearHis = new JButton("\u0395\u03BA\u03BA\u03B1\u03B8\u03AC\u03C1\u03B9\u03C3\u03B7 \u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03BF\u03CD");
		clearHis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h.setEmptyHistory();
		     // JOptionPane.showMessageDialog( null,"Το ιστορικό πλέον είναι άδειο");
			}
		});
		clearHis.setBounds(112, 149, 147, 23);
		contentPane.add(clearHis);
		
		JButton exit = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Rating r = new Rating();						
	               //dispose();
				//	r.setVisible(true);
			
			}
		});
		exit.setBounds(112, 201, 147, 23);
		contentPane.add(exit);
	}
}
