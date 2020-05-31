package camelot1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SaveGameMes extends JFrame {

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
					SaveGameMes frame = new SaveGameMes();
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
	public SaveGameMes(EndoftheGame end,Current_Game curr) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel message = new JLabel("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7 \u03A0\u03B1\u03C1\u03C4\u03AF\u03B4\u03B1\u03C2?");
		message.setBounds(141, 27, 131, 30);
		contentPane.add(message);
		
		JButton buttonYES = new JButton("\u039D\u03B1\u03B9");
		buttonYES.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Histoy h= new Histoy(true,curr.getPlayerList());
				h.setSaveGame(true);
				h.HistoryExist();
				h.setSavedGames();
				historyData hd= new historyData(curr,end.getWinnerSide());
			//	h.checkIfNewPlayer(curr.p.newPlayer);
				h.addToHistory(hd);
			}
		});
		buttonYES.setBounds(71, 117, 89, 23);
		contentPane.add(buttonYES);
		
		JButton buttonNO = new JButton("\u038C\u03C7\u03B9");
		buttonNO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RankingMenu1 r = new RankingMenu1();						
	               dispose();
			   r.setVisible(true);
			}
		});
		buttonNO.setBounds(243, 117, 89, 23);
		contentPane.add(buttonNO);
	}
}
