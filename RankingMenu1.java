package camelot1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RankingMenu1 extends JFrame {

	private JPanel contentPane;

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
		setSize(350,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton newGame = new JRadioButton("\u039D\u03AD\u03B1 \u03A0\u03B1\u03C1\u03C4\u03AF\u03B4\u03B1");
		newGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Special_Rules b=new Special_Rules(false,false);
				ArxikoMenuOth g = new ArxikoMenuOth(b);						
                                    dispose();
				g.setVisible(true);
			}
			
		});
		newGame.setBounds(146, 70, 109, 23);
		contentPane.add(newGame);
		
		JRadioButton exit = new JRadioButton("\u0388\u03BE\u03BF\u03B4\u03BF");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rating r = new Rating();						
                                  dispose();
				r.setVisible(true);
			}
				
			
		});
		exit.setBounds(146, 122, 109, 23);
		contentPane.add(exit);
	}
}
