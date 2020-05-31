package camelot;
import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class Voting1 extends JFrame {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	String[] players;
	boolean ok1 = false;
	boolean ok2 = false;
	boolean ok3 = false;
	boolean ok4 = false;
	boolean ok5 = false;
	boolean ok6 = false;
	boolean ok7 = false;
	boolean ok8 = false;
	boolean ok9 = false;
	boolean ok10 = false;
	VotingData vd;
	QuestChoiceData qd;
	Current_Game curr;
	Special_Rules a;
	QuestOutcome qo;
	Score scr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String[] list = {"Bill", "Irene", "Paul", "Tzo", "Mike"};
					VotingData vd = new VotingData();
					QuestChoiceData qd= new QuestChoiceData();
					Current_Game curr = new Current_Game();
					String[] playerList = {"Irene", "Bill", "Paul", "Mike", "Tzo"};
					curr.setPlayerList(playerList);
					Special_Rules a = new Special_Rules(false, false);
					//Voting1 window = new Voting1(vd, qd, curr, a);
					//window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public Voting1(QuestChoiceData qd, Current_Game curr, Special_Rules a,VotingData vd,QuestOutcome qo,Score scr) {
		//this.players = players;
		this.vd = vd;
		this.qd = qd;
		this.curr = curr;
		this.a = a;
		this.scr=scr;
		this.qo=qo;
		
		//initialize(players, vd);
	//}

	/**
	 * Initialize the contents of the frame.
	 */
	//private void initialize(String[] players, VotingData vd) {
		//VotingData vd = new VotingData();
		String[] players = curr.getPlayerList();
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 450, 300);
		setSize(350, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel titleLabel = new JLabel("\u03A8\u0397\u03A6\u039F\u03A6\u039F\u03A1\u0399\u0391");
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setFont(new Font("Sitka Text", Font.BOLD, 18));
		titleLabel.setBounds(104, 0, 121, 31);
		getContentPane().add(titleLabel);
		
		JLabel yper = new JLabel("\u03A5\u03A0\u0395\u03A1");
		yper.setForeground(Color.WHITE);
		yper.setFont(new Font("Tahoma", Font.BOLD, 12));
		yper.setBounds(224, 24, 40, 23);
		getContentPane().add(yper);
		
		JLabel kata = new JLabel("\u039A\u0391\u03A4\u0391");
		kata.setForeground(Color.WHITE);
		kata.setFont(new Font("Tahoma", Font.BOLD, 12));
		kata.setBounds(274, 26, 50, 18);
		getContentPane().add(kata);
		
		for(int i = 0; i < players.length; i++) {
			if(i == 0) {
				JLabel label1 = new JLabel(players[i]);
				label1.setForeground(Color.WHITE);
				label1.setFont(new Font("Tahoma", Font.BOLD, 16));
				label1.setBounds(10, 50, 142, 30);
				getContentPane().add(label1);
				
			} else if (i == 1) {
				JLabel label2 = new JLabel(players[i]);
				label2.setForeground(Color.WHITE);
				label2.setFont(new Font("Tahoma", Font.BOLD, 16));
				label2.setBounds(10, 90, 142, 30);
				getContentPane().add(label2);
				
			} else if (i == 2) {
				JLabel label3 = new JLabel(players[i]);
				label3.setForeground(Color.WHITE);
				label3.setFont(new Font("Tahoma", Font.BOLD, 16));
				label3.setBounds(10, 130, 142, 30);
				getContentPane().add(label3);
				
			} else if (i == 3) {
				JLabel label4 = new JLabel(players[i]);
				label4.setForeground(Color.WHITE);
				label4.setFont(new Font("Tahoma", Font.BOLD, 16));
				label4.setBounds(10, 170, 142, 30);
				getContentPane().add(label4);
				
			} else if (i == 4) {
				JLabel label5 = new JLabel(players[i]);
				label5.setForeground(Color.WHITE);
				label5.setFont(new Font("Tahoma", Font.BOLD, 16));
				label5.setBounds(10, 210, 142, 30);
				getContentPane().add(label5);
				
			} else if (i == 5 && i < players.length) {
				JLabel label6 = new JLabel(players[i]);
				label6.setForeground(Color.WHITE);
				label6.setFont(new Font("Tahoma", Font.BOLD, 16));
				label6.setBounds(10, 250, 142, 30);
				getContentPane().add(label6);
				
			} else if (i == 6 && i < players.length) {
				JLabel label7 = new JLabel(players[i]);
				label7.setForeground(Color.WHITE);
				label7.setFont(new Font("Tahoma", Font.BOLD, 16));
				label7.setBounds(10, 290, 142, 30);
				getContentPane().add(label7);
				
			} else if (i == 7 && i < players.length) {
				JLabel label8 = new JLabel(players[i]);
				label8.setForeground(Color.WHITE);
				label8.setFont(new Font("Tahoma", Font.BOLD, 16));
				label8.setBounds(10, 330, 142, 30);
				getContentPane().add(label8);
				
			} else if ( i == 8 && i < players.length) {
				JLabel label9 = new JLabel(players[i]);
				label9.setForeground(Color.WHITE);
				label9.setFont(new Font("Tahoma", Font.BOLD, 16));
				label9.setBounds(10, 370, 142, 30);
				getContentPane().add(label9);
				
			} else if ( i == 9 && i < players.length) {
				JLabel label10 = new JLabel(players[i]);
				label10.setForeground(Color.WHITE);
				label10.setFont(new Font("Tahoma", Font.BOLD, 16));
				label10.setBounds(10, 410, 142, 30);
				getContentPane().add(label10);
			}
		}
		
		if(players.length == 5) {
			JRadioButton p1yper = new JRadioButton("");
			p1yper.setOpaque(false);
			p1yper.setBounds(234, 50, 21, 23);
			getContentPane().add(p1yper);
			
			JRadioButton p1kata = new JRadioButton("");
			p1kata.setOpaque(false);
			p1kata.setBounds(284, 50, 21, 23);
			getContentPane().add(p1kata);
			
			ButtonGroup bg = new ButtonGroup();
			bg.add(p1yper);bg.add(p1kata);
			
			JRadioButton p2yper = new JRadioButton("");
			p2yper.setOpaque(false);
			p2yper.setBounds(234, 90, 18, 23);
			getContentPane().add(p2yper);
			
			JRadioButton p2kata = new JRadioButton("");
			p2kata.setOpaque(false);
			p2kata.setBounds(284, 90, 18, 23);
			getContentPane().add(p2kata);
			
			ButtonGroup bg2 = new ButtonGroup();
			bg2.add(p2yper);bg2.add(p2kata);
			
			JRadioButton p3yper = new JRadioButton("");
			p3yper.setOpaque(false);
			p3yper.setBounds(234, 130, 18, 23);
			getContentPane().add(p3yper);
			
			JRadioButton p3kata = new JRadioButton("");
			p3kata.setOpaque(false);
			p3kata.setBounds(284, 130, 18, 23);
			getContentPane().add(p3kata);
			
			ButtonGroup bg3 = new ButtonGroup();
			bg3.add(p3yper);bg3.add(p3kata);
			
			JRadioButton p4yper = new JRadioButton("");
			p4yper.setOpaque(false);
			p4yper.setBounds(234, 170, 21, 23);
			getContentPane().add(p4yper);
			
			JRadioButton p4kata = new JRadioButton("");
			p4kata.setOpaque(false);
			p4kata.setBounds(284, 170, 21, 23);
			getContentPane().add(p4kata);
			
			ButtonGroup bg4 = new ButtonGroup();
			bg4.add(p4yper);bg4.add(p4kata);
			
			JRadioButton p5yper = new JRadioButton("");
			p5yper.setOpaque(false);
			p5yper.setBounds(234, 210, 19, 23);
			getContentPane().add(p5yper);
			
			JRadioButton p5kata = new JRadioButton("");
			p5kata.setOpaque(false);
			p5kata.setBounds(284, 210, 19, 23);
			getContentPane().add(p5kata);
			
			ButtonGroup bg5 = new ButtonGroup();
			bg5.add(p5yper);bg5.add(p5kata);
			
			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(p1yper.isSelected()) {
						vd.saveVote(true);
						ok1 = true;
					} else if(p1kata.isSelected()) {
						vd.saveVote(false);
						ok1 = true;
					} else {
						ok1 = false;
					}
					if(p2yper.isSelected()) {
						vd.saveVote(true);
						ok2 = true;
					} else if(p2kata.isSelected()){
						vd.saveVote(false);
						ok2 = true;
					} else {
						ok2 = false;
					}
					if(p3yper.isSelected()) {
						vd.saveVote(true);
						ok3 = true;
					} else if(p3kata.isSelected()) {
						vd.saveVote(false);
						ok3 = true;
					} else {
						ok3 = false;
					}
					if(p4yper.isSelected()) {
						vd.saveVote(true);
						ok4 = true;
					} else if(p4kata.isSelected()){
						vd.saveVote(false);
						ok4 = true;
					} else {
						ok4 = false;
					}
					if(p5yper.isSelected()) {
						vd.saveVote(true);
						ok5 = true;
					} else if(p5kata.isSelected()){
						vd.saveVote(false);
						ok5 = true;
					} else {
						ok5 = false;
					}
					
					if(ok1 && ok2 && ok3 && ok4 && ok5) {
						dispose();
						boolean result = vd.checkResult();
						if(result) {
							QuestApproved qa = new QuestApproved(qd, curr, a, vd, qo, scr);
							qa.setVisible(true);
						} else {
							QuestRejected qr = new QuestRejected(qd, curr, a, vd, qo, scr);
							qr.setVisible(true);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Όλοι οι παίκτες πρέπει να ψηφίσουν!");
					}
				}
			});
			
			Image img1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
			
		} else if (players.length == 6) {
			JRadioButton p1yper = new JRadioButton("");
			p1yper.setOpaque(false);
			p1yper.setBounds(234, 50, 21, 23);
			getContentPane().add(p1yper);
			
			JRadioButton p1kata = new JRadioButton("");
			p1kata.setOpaque(false);
			p1kata.setBounds(284, 50, 21, 23);
			getContentPane().add(p1kata);
			
			ButtonGroup bg = new ButtonGroup();
			bg.add(p1yper);bg.add(p1kata);
			
			JRadioButton p2yper = new JRadioButton("");
			p2yper.setOpaque(false);
			p2yper.setBounds(234, 90, 18, 23);
			getContentPane().add(p2yper);
			
			JRadioButton p2kata = new JRadioButton("");
			p2kata.setOpaque(false);
			p2kata.setBounds(284, 90, 18, 23);
			getContentPane().add(p2kata);
			
			ButtonGroup bg2 = new ButtonGroup();
			bg2.add(p2yper);bg2.add(p2kata);
			
			JRadioButton p3yper = new JRadioButton("");
			p3yper.setOpaque(false);
			p3yper.setBounds(234, 130, 18, 23);
			getContentPane().add(p3yper);
			
			JRadioButton p3kata = new JRadioButton("");
			p3kata.setOpaque(false);
			p3kata.setBounds(284, 130, 18, 23);
			getContentPane().add(p3kata);
			
			ButtonGroup bg3 = new ButtonGroup();
			bg3.add(p3yper);bg3.add(p3kata);
			
			JRadioButton p4yper = new JRadioButton("");
			p4yper.setOpaque(false);
			p4yper.setBounds(234, 170, 21, 23);
			getContentPane().add(p4yper);
			
			JRadioButton p4kata = new JRadioButton("");
			p4kata.setOpaque(false);
			p4kata.setBounds(284, 170, 21, 23);
			getContentPane().add(p4kata);
			
			ButtonGroup bg4 = new ButtonGroup();
			bg4.add(p4yper);bg4.add(p4kata);
		
			JRadioButton p5yper = new JRadioButton("");
			p5yper.setOpaque(false);
			p5yper.setBounds(234, 210, 19, 23);
			getContentPane().add(p5yper);
			
			JRadioButton p5kata = new JRadioButton("");
			p5kata.setOpaque(false);
			p5kata.setBounds(284, 210, 19, 23);
			getContentPane().add(p5kata);
			
			ButtonGroup bg5 = new ButtonGroup();
			bg5.add(p5yper);bg5.add(p5kata);
			
			JRadioButton p6yper = new JRadioButton("");
			p6yper.setOpaque(false);
			p6yper.setBounds(234, 250, 22, 23);
			getContentPane().add(p6yper);
			
			JRadioButton p6kata = new JRadioButton("");
			p6kata.setOpaque(false);
			p6kata.setBounds(284, 250, 22, 23);
			getContentPane().add(p6kata);
			
			ButtonGroup bg6 = new ButtonGroup();
			bg6.add(p6yper);bg6.add(p6kata);

			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(p1yper.isSelected()) {
						vd.saveVote(true);
						ok1 = true;
					} else if(p1kata.isSelected()) {
						vd.saveVote(false);
						ok1 = true;
					} else {
						ok1 = false;
					}
					if(p2yper.isSelected()) {
						vd.saveVote(true);
						ok2 = true;
					} else if(p2kata.isSelected()){
						vd.saveVote(false);
						ok2 = true;
					} else {
						ok2 = false;
					}
					if(p3yper.isSelected()) {
						vd.saveVote(true);
						ok3 = true;
					} else if(p3kata.isSelected()) {
						vd.saveVote(false);
						ok3 = true;
					} else {
						ok3 = false;
					}
					if(p4yper.isSelected()) {
						vd.saveVote(true);
						ok4 = true;
					} else if(p4kata.isSelected()){
						vd.saveVote(false);
						ok4 = true;
					} else {
						ok4 = false;
					}
					if(p5yper.isSelected()) {
						vd.saveVote(true);
						ok5 = true;
					} else if(p5kata.isSelected()){
						vd.saveVote(false);
						ok5 = true;
					} else {
						ok5 = false;
					}
					if(p6yper.isSelected()) {
						vd.saveVote(true);
						ok6 = true;
					} else if(p6kata.isSelected()){
						vd.saveVote(false);
						ok6 = true;
					} else {
						ok6 = false;
					}
					
					if(ok1 && ok2 && ok3 && ok4 && ok5 && ok6) {
						dispose();
						boolean result = vd.checkResult();
						if(result) {
							QuestApproved qa = new QuestApproved(qd, curr, a, vd, qo, scr);
							qa.setVisible(true);
						} else {
							QuestRejected qr = new QuestRejected(qd, curr, a, vd, qo, scr);
							qr.setVisible(true);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Όλοι οι παίκτες πρέπει να ψηφίσουν!");
					}
				}
			});
			Image img1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
			
		} else if (players.length == 7) {
			JRadioButton p1yper = new JRadioButton("");
			p1yper.setOpaque(false);
			p1yper.setBounds(234, 50, 21, 23);
			getContentPane().add(p1yper);
			
			JRadioButton p1kata = new JRadioButton("");
			p1kata.setOpaque(false);
			p1kata.setBounds(284, 50, 21, 23);
			getContentPane().add(p1kata);
			
			ButtonGroup bg = new ButtonGroup();
			bg.add(p1yper);bg.add(p1kata);
			
			JRadioButton p2yper = new JRadioButton("");
			p2yper.setOpaque(false);
			p2yper.setBounds(234, 90, 18, 23);
			getContentPane().add(p2yper);
			
			JRadioButton p2kata = new JRadioButton("");
			p2kata.setOpaque(false);
			p2kata.setBounds(284, 90, 18, 23);
			getContentPane().add(p2kata);
			
			ButtonGroup bg2 = new ButtonGroup();
			bg2.add(p2yper);bg2.add(p2kata);
			
			JRadioButton p3yper = new JRadioButton("");
			p3yper.setOpaque(false);
			p3yper.setBounds(234, 130, 18, 23);
			getContentPane().add(p3yper);
			
			JRadioButton p3kata = new JRadioButton("");
			p3kata.setOpaque(false);
			p3kata.setBounds(284, 130, 18, 23);
			getContentPane().add(p3kata);
			
			ButtonGroup bg3 = new ButtonGroup();
			bg3.add(p3yper);bg3.add(p3kata);
			
			JRadioButton p4yper = new JRadioButton("");
			p4yper.setOpaque(false);
			p4yper.setBounds(234, 170, 21, 23);
			getContentPane().add(p4yper);
			
			JRadioButton p4kata = new JRadioButton("");
			p4kata.setOpaque(false);
			p4kata.setBounds(284, 170, 21, 23);
			getContentPane().add(p4kata);
			
			ButtonGroup bg4 = new ButtonGroup();
			bg4.add(p4yper);bg4.add(p4kata);
			
			JRadioButton p5yper = new JRadioButton("");
			p5yper.setOpaque(false);
			p5yper.setBounds(234, 210, 19, 23);
			getContentPane().add(p5yper);
			
			JRadioButton p5kata = new JRadioButton("");
			p5kata.setOpaque(false);
			p5kata.setBounds(284, 210, 19, 23);
			getContentPane().add(p5kata);
			
			ButtonGroup bg5 = new ButtonGroup();
			bg5.add(p5yper);bg5.add(p5kata);
			
			JRadioButton p6yper = new JRadioButton("");
			p6yper.setOpaque(false);
			p6yper.setBounds(234, 250, 22, 23);
			getContentPane().add(p6yper);
			
			JRadioButton p6kata = new JRadioButton("");
			p6kata.setOpaque(false);
			p6kata.setBounds(284, 250, 22, 23);
			getContentPane().add(p6kata);
			
			ButtonGroup bg6 = new ButtonGroup();
			bg6.add(p6yper);bg6.add(p6kata);
			
			JRadioButton p7yper = new JRadioButton("");
			p7yper.setOpaque(false);
			p7yper.setBounds(234, 290, 21, 23);
			getContentPane().add(p7yper);
			
			JRadioButton p7kata = new JRadioButton("");
			p7kata.setOpaque(false);
			p7kata.setBounds(284, 290, 21, 23);
			getContentPane().add(p7kata);
			
			ButtonGroup bg7 = new ButtonGroup();
			bg7.add(p7yper);bg7.add(p7kata);
			
			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(p1yper.isSelected()) {
						vd.saveVote(true);
						ok1 = true;
					} else if(p1kata.isSelected()) {
						vd.saveVote(false);
						ok1 = true;
					} else {
						ok1 = false;
					}
					if(p2yper.isSelected()) {
						vd.saveVote(true);
						ok2 = true;
					} else if(p2kata.isSelected()){
						vd.saveVote(false);
						ok2 = true;
					} else {
						ok2 = false;
					}
					if(p3yper.isSelected()) {
						vd.saveVote(true);
						ok3 = true;
					} else if(p3kata.isSelected()) {
						vd.saveVote(false);
						ok3 = true;
					} else {
						ok3 = false;
					}
					if(p4yper.isSelected()) {
						vd.saveVote(true);
						ok4 = true;
					} else if(p4kata.isSelected()){
						vd.saveVote(false);
						ok4 = true;
					} else {
						ok4 = false;
					}
					if(p5yper.isSelected()) {
						vd.saveVote(true);
						ok5 = true;
					} else if(p5kata.isSelected()){
						vd.saveVote(false);
						ok5 = true;
					} else {
						ok5 = false;
					}
					if(p6yper.isSelected()) {
						vd.saveVote(true);
						ok6 = true;
					} else if(p6kata.isSelected()){
						vd.saveVote(false);
						ok6 = true;
					} else {
						ok6 = false;
					}
					if(p7yper.isSelected()) {
						vd.saveVote(true);
						ok7 = true;
					} else if(p7kata.isSelected()){
						vd.saveVote(false);
						ok7 = true;
					} else {
						ok7 = false;
					}
					
					if(ok1 && ok2 && ok3 && ok4 && ok5 && ok6 && ok7) {
						dispose();
						boolean result = vd.checkResult();
						if(result) {
							QuestApproved qa = new QuestApproved(qd, curr, a, vd, qo, scr);
							qa.setVisible(true);
						} else {
							QuestRejected qr = new QuestRejected(qd, curr, a, vd, qo, scr);
							qr.setVisible(true);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Όλοι οι παίκτες πρέπει να ψηφίσουν!");
					}
				}
			});
			Image img1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
			
		} else if (players.length == 8) {
			JRadioButton p1yper = new JRadioButton("");
			p1yper.setOpaque(false);
			p1yper.setBounds(234, 50, 21, 23);
			getContentPane().add(p1yper);
			
			JRadioButton p1kata = new JRadioButton("");
			p1kata.setOpaque(false);
			p1kata.setBounds(284, 50, 21, 23);
			getContentPane().add(p1kata);
			
			ButtonGroup bg = new ButtonGroup();
			bg.add(p1yper);bg.add(p1kata);
			
			JRadioButton p2yper = new JRadioButton("");
			p2yper.setOpaque(false);
			p2yper.setBounds(234, 90, 18, 23);
			getContentPane().add(p2yper);
			
			JRadioButton p2kata = new JRadioButton("");
			p2kata.setOpaque(false);
			p2kata.setBounds(284, 90, 18, 23);
			getContentPane().add(p2kata);
			
			ButtonGroup bg2 = new ButtonGroup();
			bg2.add(p2yper);bg2.add(p2kata);
			
			JRadioButton p3yper = new JRadioButton("");
			p3yper.setOpaque(false);
			p3yper.setBounds(234, 130, 18, 23);
			getContentPane().add(p3yper);
			
			JRadioButton p3kata = new JRadioButton("");
			p3kata.setOpaque(false);
			p3kata.setBounds(284, 130, 18, 23);
			getContentPane().add(p3kata);
			
			ButtonGroup bg3 = new ButtonGroup();
			bg3.add(p3yper);bg3.add(p3kata);
			
			JRadioButton p4yper = new JRadioButton("");
			p4yper.setOpaque(false);
			p4yper.setBounds(234, 170, 21, 23);
			getContentPane().add(p4yper);
			
			JRadioButton p4kata = new JRadioButton("");
			p4kata.setOpaque(false);
			p4kata.setBounds(284, 170, 21, 23);
			getContentPane().add(p4kata);
			
			ButtonGroup bg4 = new ButtonGroup();
			bg4.add(p4yper);bg4.add(p4kata);
			
			JRadioButton p5yper = new JRadioButton("");
			p5yper.setOpaque(false);
			p5yper.setBounds(234, 210, 19, 23);
			getContentPane().add(p5yper);
			
			JRadioButton p5kata = new JRadioButton("");
			p5kata.setOpaque(false);
			p5kata.setBounds(284, 210, 19, 23);
			getContentPane().add(p5kata);
			
			ButtonGroup bg5 = new ButtonGroup();
			bg5.add(p5yper);bg5.add(p5kata);
			
			JRadioButton p6yper = new JRadioButton("");
			p6yper.setOpaque(false);
			p6yper.setBounds(234, 250, 22, 23);
			getContentPane().add(p6yper);
			
			JRadioButton p6kata = new JRadioButton("");
			p6kata.setOpaque(false);
			p6kata.setBounds(284, 250, 22, 23);
			getContentPane().add(p6kata);
			
			ButtonGroup bg6 = new ButtonGroup();
			bg6.add(p6yper);bg6.add(p6kata);
			
			JRadioButton p7yper = new JRadioButton("");
			p7yper.setOpaque(false);
			p7yper.setBounds(234, 290, 21, 23);
			getContentPane().add(p7yper);
			
			JRadioButton p7kata = new JRadioButton("");
			p7kata.setOpaque(false);
			p7kata.setBounds(284, 290, 21, 23);
			getContentPane().add(p7kata);
			
			ButtonGroup bg7 = new ButtonGroup();
			bg7.add(p7yper);bg7.add(p7kata);
			
			JRadioButton p8yper = new JRadioButton("");
			p8yper.setOpaque(false);
			p8yper.setBounds(234, 330, 23, 23);
			getContentPane().add(p8yper);
			
			JRadioButton p8kata = new JRadioButton("");
			p8kata.setOpaque(false);
			p8kata.setBounds(284, 330, 23, 23);
			getContentPane().add(p8kata);
			
			ButtonGroup bg8 = new ButtonGroup();
			bg8.add(p8yper);bg8.add(p8kata);
			
			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(p1yper.isSelected()) {
						vd.saveVote(true);
						ok1 = true;
					} else if(p1kata.isSelected()) {
						vd.saveVote(false);
						ok1 = true;
					} else {
						ok1 = false;
					}
					if(p2yper.isSelected()) {
						vd.saveVote(true);
						ok2 = true;
					} else if(p2kata.isSelected()){
						vd.saveVote(false);
						ok2 = true;
					} else {
						ok2 = false;
					}
					if(p3yper.isSelected()) {
						vd.saveVote(true);
						ok3 = true;
					} else if(p3kata.isSelected()) {
						vd.saveVote(false);
						ok3 = true;
					} else {
						ok3 = false;
					}
					if(p4yper.isSelected()) {
						vd.saveVote(true);
						ok4 = true;
					} else if(p4kata.isSelected()){
						vd.saveVote(false);
						ok4 = true;
					} else {
						ok4 = false;
					}
					if(p5yper.isSelected()) {
						vd.saveVote(true);
						ok5 = true;
					} else if(p5kata.isSelected()){
						vd.saveVote(false);
						ok5 = true;
					} else {
						ok5 = false;
					}
					if(p6yper.isSelected()) {
						vd.saveVote(true);
						ok6 = true;
					} else if(p6kata.isSelected()){
						vd.saveVote(false);
						ok6 = true;
					} else {
						ok6 = false;
					}
					if(p7yper.isSelected()) {
						vd.saveVote(true);
						ok7 = true;
					} else if(p7kata.isSelected()){
						vd.saveVote(false);
						ok7 = true;
					} else {
						ok7 = false;
					}
					if(p8yper.isSelected()) {
						vd.saveVote(true);
						ok8 = true;
					} else if(p8kata.isSelected()){
						vd.saveVote(false);
						ok8 = true;
					} else {
						ok8 = false;
					}
					
					if(ok1 && ok2 && ok3 && ok4 && ok5 && ok6 && ok7 && ok8) {
						dispose();
						boolean result = vd.checkResult();
						if(result) {
							QuestApproved qa = new QuestApproved(qd, curr, a, vd, qo, scr);
							qa.setVisible(true);
						} else {
							QuestRejected qr = new QuestRejected(qd, curr, a, vd, qo, scr);
							qr.setVisible(true);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Όλοι οι παίκτες πρέπει να ψηφίσουν!");
					}
				}
			});
			Image img1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
			
		} else if (players.length == 9) {
			JRadioButton p1yper = new JRadioButton("");
			p1yper.setOpaque(false);
			p1yper.setBounds(234, 50, 21, 23);
			getContentPane().add(p1yper);
			
			JRadioButton p1kata = new JRadioButton("");
			p1kata.setOpaque(false);
			p1kata.setBounds(284, 50, 21, 23);
			getContentPane().add(p1kata);
			
			ButtonGroup bg = new ButtonGroup();
			bg.add(p1yper);bg.add(p1kata);
			
			JRadioButton p2yper = new JRadioButton("");
			p2yper.setOpaque(false);
			p2yper.setBounds(234, 90, 18, 23);
			getContentPane().add(p2yper);
			
			JRadioButton p2kata = new JRadioButton("");
			p2kata.setOpaque(false);
			p2kata.setBounds(284, 90, 18, 23);
			getContentPane().add(p2kata);
			
			ButtonGroup bg2 = new ButtonGroup();
			bg2.add(p2yper);bg2.add(p2kata);
			
			JRadioButton p3yper = new JRadioButton("");
			p3yper.setOpaque(false);
			p3yper.setBounds(234, 130, 18, 23);
			getContentPane().add(p3yper);
			
			JRadioButton p3kata = new JRadioButton("");
			p3kata.setOpaque(false);
			p3kata.setBounds(284, 130, 18, 23);
			getContentPane().add(p3kata);
			
			ButtonGroup bg3 = new ButtonGroup();
			bg3.add(p3yper);bg3.add(p3kata);
			
			JRadioButton p4yper = new JRadioButton("");
			p4yper.setOpaque(false);
			p4yper.setBounds(234, 170, 21, 23);
			getContentPane().add(p4yper);
			
			JRadioButton p4kata = new JRadioButton("");
			p4kata.setOpaque(false);
			p4kata.setBounds(284, 170, 21, 23);
			getContentPane().add(p4kata);
			
			ButtonGroup bg4 = new ButtonGroup();
			bg4.add(p4yper);bg4.add(p4kata);
			
			JRadioButton p5yper = new JRadioButton("");
			p5yper.setOpaque(false);
			p5yper.setBounds(234, 210, 19, 23);
			getContentPane().add(p5yper);
			
			JRadioButton p5kata = new JRadioButton("");
			p5kata.setOpaque(false);
			p5kata.setBounds(284, 210, 19, 23);
			getContentPane().add(p5kata);
			
			ButtonGroup bg5 = new ButtonGroup();
			bg5.add(p5yper);bg5.add(p5kata);
			
			JRadioButton p6yper = new JRadioButton("");
			p6yper.setOpaque(false);
			p6yper.setBounds(234, 250, 22, 23);
			getContentPane().add(p6yper);
			
			JRadioButton p6kata = new JRadioButton("");
			p6kata.setOpaque(false);
			p6kata.setBounds(284, 250, 22, 23);
			getContentPane().add(p6kata);
			
			ButtonGroup bg6 = new ButtonGroup();
			bg6.add(p6yper);bg6.add(p6kata);
			
			JRadioButton p7yper = new JRadioButton("");
			p7yper.setOpaque(false);
			p7yper.setBounds(234, 290, 21, 23);
			getContentPane().add(p7yper);
			
			JRadioButton p7kata = new JRadioButton("");
			p7kata.setOpaque(false);
			p7kata.setBounds(284, 290, 21, 23);
			getContentPane().add(p7kata);
			
			ButtonGroup bg7 = new ButtonGroup();
			bg7.add(p7yper);bg7.add(p7kata);
			
			JRadioButton p8yper = new JRadioButton("");
			p8yper.setOpaque(false);
			p8yper.setBounds(234, 330, 23, 23);
			getContentPane().add(p8yper);
			
			JRadioButton p8kata = new JRadioButton("");
			p8kata.setOpaque(false);
			p8kata.setBounds(284, 330, 23, 23);
			getContentPane().add(p8kata);
			
			ButtonGroup bg8 = new ButtonGroup();
			bg8.add(p8yper);bg8.add(p8kata);
			
			JRadioButton p9yper = new JRadioButton("");
			p9yper.setOpaque(false);
			p9yper.setBounds(234, 370, 23, 23);
			getContentPane().add(p9yper);
			
			JRadioButton p9kata = new JRadioButton("");
			p9kata.setOpaque(false);
			p9kata.setBounds(284, 370, 23, 23);
			getContentPane().add(p9kata);
			
			ButtonGroup bg9= new ButtonGroup();
			bg9.add(p9yper);bg9.add(p9kata);
			
			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(p1yper.isSelected()) {
						vd.saveVote(true);
						ok1 = true;
					} else if(p1kata.isSelected()) {
						vd.saveVote(false);
						ok1 = true;
					} else {
						ok1 = false;
					}
					if(p2yper.isSelected()) {
						vd.saveVote(true);
						ok2 = true;
					} else if(p2kata.isSelected()){
						vd.saveVote(false);
						ok2 = true;
					} else {
						ok2 = false;
					}
					if(p3yper.isSelected()) {
						vd.saveVote(true);
						ok3 = true;
					} else if(p3kata.isSelected()) {
						vd.saveVote(false);
						ok3 = true;
					} else {
						ok3 = false;
					}
					if(p4yper.isSelected()) {
						vd.saveVote(true);
						ok4 = true;
					} else if(p4kata.isSelected()){
						vd.saveVote(false);
						ok4 = true;
					} else {
						ok4 = false;
					}
					if(p5yper.isSelected()) {
						vd.saveVote(true);
						ok5 = true;
					} else if(p5kata.isSelected()){
						vd.saveVote(false);
						ok5 = true;
					} else {
						ok5 = false;
					}
					if(p6yper.isSelected()) {
						vd.saveVote(true);
						ok6 = true;
					} else if(p6kata.isSelected()){
						vd.saveVote(false);
						ok6 = true;
					} else {
						ok6 = false;
					}
					if(p7yper.isSelected()) {
						vd.saveVote(true);
						ok7 = true;
					} else if(p7kata.isSelected()){
						vd.saveVote(false);
						ok7 = true;
					} else {
						ok7 = false;
					}
					if(p8yper.isSelected()) {
						vd.saveVote(true);
						ok8 = true;
					} else if(p8kata.isSelected()){
						vd.saveVote(false);
						ok8 = true;
					} else {
						ok8 = false;
					}
					if(p9yper.isSelected()) {
						vd.saveVote(true);
						ok9 = true;
					} else if(p8kata.isSelected()){
						vd.saveVote(false);
						ok9 = true;
					} else {
						ok9 = false;
					}
					
					if(ok1 && ok2 && ok3 && ok4 && ok5 && ok6 && ok7 && ok8 && ok9) {
						dispose();
						boolean result = vd.checkResult();
						if(result) {
							QuestApproved qa = new QuestApproved(qd, curr, a, vd, qo, scr);
							qa.setVisible(true);
						} else {
							QuestRejected qr = new QuestRejected(qd, curr, a, vd, qo, scr);
							qr.setVisible(true);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Όλοι οι παίκτες πρέπει να ψηφίσουν!");
					}
				}
			});
			Image img1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
		} else {
			JRadioButton p1yper = new JRadioButton("");
			p1yper.setOpaque(false);
			p1yper.setBounds(234, 50, 21, 23);
			getContentPane().add(p1yper);
			
			JRadioButton p1kata = new JRadioButton("");
			p1kata.setOpaque(false);
			p1kata.setBounds(284, 50, 21, 23);
			getContentPane().add(p1kata);
			
			ButtonGroup bg = new ButtonGroup();
			bg.add(p1yper);bg.add(p1kata);
			
			JRadioButton p2yper = new JRadioButton("");
			p2yper.setOpaque(false);
			p2yper.setBounds(234, 90, 18, 23);
			getContentPane().add(p2yper);
			
			JRadioButton p2kata = new JRadioButton("");
			p2kata.setOpaque(false);
			p2kata.setBounds(284, 90, 18, 23);
			getContentPane().add(p2kata);
			
			ButtonGroup bg2 = new ButtonGroup();
			bg2.add(p2yper);bg2.add(p2kata);
			
			JRadioButton p3yper = new JRadioButton("");
			p3yper.setOpaque(false);
			p3yper.setBounds(234, 130, 18, 23);
			getContentPane().add(p3yper);
			
			JRadioButton p3kata = new JRadioButton("");
			p3kata.setOpaque(false);
			p3kata.setBounds(284, 130, 18, 23);
			getContentPane().add(p3kata);
			
			ButtonGroup bg3 = new ButtonGroup();
			bg3.add(p3yper);bg3.add(p3kata);
			
			JRadioButton p4yper = new JRadioButton("");
			p4yper.setOpaque(false);
			p4yper.setBounds(234, 170, 21, 23);
			getContentPane().add(p4yper);
			
			JRadioButton p4kata = new JRadioButton("");
			p4kata.setOpaque(false);
			p4kata.setBounds(284, 170, 21, 23);
			getContentPane().add(p4kata);
			
			ButtonGroup bg4 = new ButtonGroup();
			bg4.add(p4yper);bg4.add(p4kata);
			
			JRadioButton p5yper = new JRadioButton("");
			p5yper.setOpaque(false);
			p5yper.setBounds(234, 210, 19, 23);
			getContentPane().add(p5yper);
			
			JRadioButton p5kata = new JRadioButton("");
			p5kata.setOpaque(false);
			p5kata.setBounds(284, 210, 19, 23);
			getContentPane().add(p5kata);
			
			ButtonGroup bg5 = new ButtonGroup();
			bg5.add(p5yper);bg5.add(p5kata);
			
			JRadioButton p6yper = new JRadioButton("");
			p6yper.setOpaque(false);
			p6yper.setBounds(234, 250, 22, 23);
			getContentPane().add(p6yper);
			
			JRadioButton p6kata = new JRadioButton("");
			p6kata.setOpaque(false);
			p6kata.setBounds(284, 250, 22, 23);
			getContentPane().add(p6kata);
			
			ButtonGroup bg6 = new ButtonGroup();
			bg6.add(p6yper);bg6.add(p6kata);
			
			JRadioButton p7yper = new JRadioButton("");
			p7yper.setOpaque(false);
			p7yper.setBounds(234, 290, 21, 23);
			getContentPane().add(p7yper);
			
			JRadioButton p7kata = new JRadioButton("");
			p7kata.setOpaque(false);
			p7kata.setBounds(284, 290, 21, 23);
			getContentPane().add(p7kata);
			
			ButtonGroup bg7 = new ButtonGroup();
			bg7.add(p7yper);bg7.add(p7kata);
			
			JRadioButton p8yper = new JRadioButton("");
			p8yper.setOpaque(false);
			p8yper.setBounds(234, 330, 23, 23);
			getContentPane().add(p8yper);
			
			JRadioButton p8kata = new JRadioButton("");
			p8kata.setOpaque(false);
			p8kata.setBounds(284, 330, 23, 23);
			getContentPane().add(p8kata);
			
			ButtonGroup bg8 = new ButtonGroup();
			bg8.add(p8yper);bg8.add(p8kata);
			
			JRadioButton p9yper = new JRadioButton("");
			p9yper.setOpaque(false);
			p9yper.setBounds(234, 370, 23, 23);
			getContentPane().add(p9yper);
			
			JRadioButton p9kata = new JRadioButton("");
			p9kata.setOpaque(false);
			p9kata.setBounds(284, 370, 23, 23);
			getContentPane().add(p9kata);
			
			ButtonGroup bg9= new ButtonGroup();
			bg9.add(p9yper);bg9.add(p9kata);
			
			JRadioButton p10yper = new JRadioButton("");
			p10yper.setOpaque(false);
			p10yper.setBounds(234, 411, 21, 23);
			getContentPane().add(p10yper);
			
			JRadioButton p10kata = new JRadioButton("");
			p10kata.setOpaque(false);
			p10kata.setBounds(284, 411, 21, 23);
			getContentPane().add(p10kata);
			
			ButtonGroup bg10 = new ButtonGroup();
			bg10.add(p10yper);bg10.add(p10kata);
			
			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(p1yper.isSelected()) {
						vd.saveVote(true);
						ok1 = true;
					} else if(p1kata.isSelected()) {
						vd.saveVote(false);
						ok1 = true;
					} else {
						ok1 = false;
					}
					if(p2yper.isSelected()) {
						vd.saveVote(true);
						ok2 = true;
					} else if(p2kata.isSelected()){
						vd.saveVote(false);
						ok2 = true;
					} else {
						ok2 = false;
					}
					if(p3yper.isSelected()) {
						vd.saveVote(true);
						ok3 = true;
					} else if(p3kata.isSelected()) {
						vd.saveVote(false);
						ok3 = true;
					} else {
						ok3 = false;
					}
					if(p4yper.isSelected()) {
						vd.saveVote(true);
						ok4 = true;
					} else if(p4kata.isSelected()){
						vd.saveVote(false);
						ok4 = true;
					} else {
						ok4 = false;
					}
					if(p5yper.isSelected()) {
						vd.saveVote(true);
						ok5 = true;
					} else if(p5kata.isSelected()){
						vd.saveVote(false);
						ok5 = true;
					} else {
						ok5 = false;
					}
					if(p6yper.isSelected()) {
						vd.saveVote(true);
						ok6 = true;
					} else if(p6kata.isSelected()){
						vd.saveVote(false);
						ok6 = true;
					} else {
						ok6 = false;
					}
					if(p7yper.isSelected()) {
						vd.saveVote(true);
						ok7 = true;
					} else if(p7kata.isSelected()){
						vd.saveVote(false);
						ok7 = true;
					} else {
						ok7 = false;
					}
					if(p8yper.isSelected()) {
						vd.saveVote(true);
						ok8 = true;
					} else if(p8kata.isSelected()){
						vd.saveVote(false);
						ok8 = true;
					} else {
						ok8 = false;
					}
					if(p9yper.isSelected()) {
						vd.saveVote(true);
						ok9 = true;
					} else if(p8kata.isSelected()){
						vd.saveVote(false);
						ok9 = true;
					} else {
						ok9 = false;
					}
					if(p10yper.isSelected()) {
						vd.saveVote(true);
						ok10 = true;
					} else if(p10kata.isSelected()){
						vd.saveVote(false);
						ok10 = true;
					} else {
						ok10 = false;
					}
					
					if(ok1 && ok2 && ok3 && ok4 && ok5 && ok6 && ok7 && ok8 && ok9 && ok10) {
						dispose();
						boolean result = vd.checkResult();
						if(result) {
							QuestApproved qa = new QuestApproved(qd, curr, a, vd, qo, scr);
							qa.setVisible(true);
						} else {
							QuestRejected qr = new QuestRejected(qd, curr, a, vd, qo, scr);
							qr.setVisible(true);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Όλοι οι παίκτες πρέπει να ψηφίσουν!");
					}
				}
			});
			Image img1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
		}
		
		JLabel imgLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/im2.jpg")).getImage();
		imgLabel.setIcon(new ImageIcon(img));
		imgLabel.setBounds(0, 0, 334, 461);
		getContentPane().add(imgLabel);
		
	}
}

	


