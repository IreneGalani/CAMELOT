package camelot;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class ChoosePlayerName extends JFrame {

	private JPanel contentPane;
	public Player chosenPlayer;
	//Player[] player;
	QuestChoiceData qd;
	Current_Game curr;
	Special_Rules a;
	QuestOutcome qo;
	Score scr;
	VotingData vd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Player pl1 = new Player("Bill");
					Player pl2 = new Player("Irene");
					Player pl3 = new Player("Paul");
					Player pl4 = new Player("Tzo");
					Player pl5 = new Player("Mike");
					Player[] player = {pl1, pl2, pl3, pl4, pl5};
					
					//ChoosePlayerName frame = new ChoosePlayerName(player);
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setChosenPlayer(Player player) {
		this.chosenPlayer = player;
	}
	
	public Player getChosenPlayer() {
		return this.chosenPlayer;
	}

	/**
	 * Create the frame.
	 */
	public ChoosePlayerName(QuestChoiceData qd, Current_Game curr, Special_Rules a,VotingData vd, QuestOutcome qo, Score scr) {
		this.qd = qd;
		this.curr = curr;
		this.a = a;
		this.qo = qo;
		this.scr = scr;
		this.vd = vd;
		String[] players = curr.getPlayerList();
		Player[] player = curr.getPlayer();
		for(int i = 0; i < player.length; i++) {
			players[i] = player[i].getUsername();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(350, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel whosLabel = new JLabel("\u03A0\u03BF\u03B9\u03B1\u03BD\u03BF\u03CD \u03C0\u03B1\u03AF\u03BA\u03C4\u03B7 \u03C4\u03BF \u03C3\u03C4\u03C1\u03B1\u03C4\u03CC\u03C0\u03B5\u03B4\u03BF");
		whosLabel.setForeground(new Color(255, 255, 255));
		whosLabel.setFont(new Font("Sitka Text", Font.BOLD, 20));
		whosLabel.setBounds(10, 0, 314, 26);
		contentPane.add(whosLabel);
		
		JLabel examineLabel = new JLabel("\u03B8\u03B1 \u03B1\u03BD\u03B1\u03BA\u03B1\u03BB\u03CD\u03C8\u03B5\u03B9\u03C2?");
		examineLabel.setForeground(new Color(255, 255, 255));
		examineLabel.setFont(new Font("Sitka Text", Font.BOLD, 20));
		examineLabel.setBounds(10, 24, 314, 26);
		contentPane.add(examineLabel);
		
		for(int i = 0; i <= players.length; i++) {
			if(i == 0) {
				JLabel label1 = new JLabel(players[i]);
				label1.setForeground(Color.WHITE);
				label1.setFont(new Font("Tahoma", Font.BOLD, 16));
				label1.setBounds(20, 50, 142, 30);
				getContentPane().add(label1);
				
			} else if (i == 1) {
				JLabel label2 = new JLabel(players[i]);
				label2.setForeground(Color.WHITE);
				label2.setFont(new Font("Tahoma", Font.BOLD, 16));
				label2.setBounds(20, 90, 142, 30);
				getContentPane().add(label2);
				
			} else if (i == 2) {
				JLabel label3 = new JLabel(players[i]);
				label3.setForeground(Color.WHITE);
				label3.setFont(new Font("Tahoma", Font.BOLD, 16));
				label3.setBounds(20, 130, 142, 30);
				getContentPane().add(label3);
				
			} else if (i == 3) {
				JLabel label4 = new JLabel(players[i]);
				label4.setForeground(Color.WHITE);
				label4.setFont(new Font("Tahoma", Font.BOLD, 16));
				label4.setBounds(20, 170, 142, 30);
				getContentPane().add(label4);
				
			} else if (i == 4) {
				JLabel label5 = new JLabel(players[i]);
				label5.setForeground(Color.WHITE);
				label5.setFont(new Font("Tahoma", Font.BOLD, 16));
				label5.setBounds(20, 210, 142, 30);
				getContentPane().add(label5);
				
			} else if (i == 5 && i < players.length) {
				JLabel label6 = new JLabel(players[i]);
				label6.setForeground(Color.WHITE);
				label6.setFont(new Font("Tahoma", Font.BOLD, 16));
				label6.setBounds(20, 250, 142, 30);
				getContentPane().add(label6);
				
			} else if (i == 6 && i < players.length) {
				JLabel label7 = new JLabel(players[i]);
				label7.setForeground(Color.WHITE);
				label7.setFont(new Font("Tahoma", Font.BOLD, 16));
				label7.setBounds(20, 290, 142, 30);
				getContentPane().add(label7);
				
			} else if (i == 7 && i < players.length) {
				JLabel label8 = new JLabel(players[i]);
				label8.setForeground(Color.WHITE);
				label8.setFont(new Font("Tahoma", Font.BOLD, 16));
				label8.setBounds(20, 330, 142, 30);
				getContentPane().add(label8);
				
			} else if ( i == 8 && i < players.length) {
				JLabel label9 = new JLabel(players[i]);
				label9.setForeground(Color.WHITE);
				label9.setFont(new Font("Tahoma", Font.BOLD, 16));
				label9.setBounds(20, 370, 142, 30);
				getContentPane().add(label9);
				
			} else if ( i == 9 && i < players.length) {
				JLabel label10 = new JLabel(players[i]);
				label10.setForeground(Color.WHITE);
				label10.setFont(new Font("Tahoma", Font.BOLD, 16));
				label10.setBounds(20, 410, 142, 30);
				getContentPane().add(label10);
			}
		}
		
		if(players.length == 5) {
			JRadioButton p1 = new JRadioButton("");
			p1.setOpaque(false);
			p1.setBounds(234, 50, 21, 23);
			getContentPane().add(p1);
			
			JRadioButton p2 = new JRadioButton("");
			p2.setOpaque(false);
			p2.setBounds(234, 90, 18, 23);
			getContentPane().add(p2);
			
			JRadioButton p3 = new JRadioButton("");
			p3.setOpaque(false);
			p3.setBounds(234, 130, 18, 23);
			getContentPane().add(p3);
			
			JRadioButton p4 = new JRadioButton("");
			p4.setOpaque(false);
			p4.setBounds(234, 170, 21, 23);
			getContentPane().add(p4);
			
			JRadioButton p5 = new JRadioButton("");
			p5.setOpaque(false);
			p5.setBounds(234, 210, 19, 23);
			getContentPane().add(p5);
			
			ButtonGroup bg5 = new ButtonGroup();
			bg5.add(p1);bg5.add(p2);bg5.add(p3);bg5.add(p4);bg5.add(p5);
			
			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					boolean choose = false;
					boolean ok; //= false;
					if(p1.isSelected()) {
						setChosenPlayer(player[0]);
						choose = true;
					} else if(p2.isSelected()) {
						setChosenPlayer(player[1]);
						choose = true;
					} else if(p3.isSelected()) {
						setChosenPlayer(player[2]);
						choose = true;
					} else if(p4.isSelected()) {
						setChosenPlayer(player[3]);
						choose = true;
					} else if(p5.isSelected()){
						setChosenPlayer(player[4]);
						choose = true;
					} else {
						choose = false;
					}
					//ok = getChosenPlayer().validateLadysChoice(getChosenPlayer().username);
					//ok = false;
					if(!choose) {
						JOptionPane.showMessageDialog(null, "Πρέπει να επιλέξεις κάποιον παίκτη!");
					} else {
					ok = getChosenPlayer().validateLadysChoice(getChosenPlayer().username);
					if(!ok) {
						JOptionPane.showMessageDialog(null, "Επίλεξε άλλον παίκτη!");
					} else {
					//Role r1 = new Role("oberon"); //px
					//getChosenPlayer().setPlayerRole(r1);
					getChosenPlayer().checkPlayerSide();
					String side = getChosenPlayer().getPlayerSide();
					//String side = "good";
					if(side == "good") {
						dispose();
						for(int i = 0; i < player.length; i++) {
							if(player[i].isLadyOfTheLake()) {
								player[i].setNewLady();
								//System.out.println(player[i].isLadyOfTheLake);
								WithTheGood good = new WithTheGood(getChosenPlayer(),qd,  curr, a, vd, qo, scr);
								good.setVisible(true);
							}
						}
					} else {
						dispose();
						for(int i = 0; i < player.length; i++) {
							if(player[i].isLadyOfTheLake()) {
								player[i].setNewLady();
								//System.out.println(player[i].isLadyOfTheLake);
								WithTheEvil evil = new WithTheEvil(getChosenPlayer(), qd, curr, a,vd, qo, scr);
								evil.setVisible(true);
							}
						}
					}
					}
					}
				
				}
			});
			
			Image img1 = new ImageIcon(this.getClass().getResource("/next.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
			
		} else if(players.length == 6) {
			JRadioButton p1 = new JRadioButton("");
			p1.setOpaque(false);
			p1.setBounds(234, 50, 21, 23);
			getContentPane().add(p1);
			
			JRadioButton p2 = new JRadioButton("");
			p2.setOpaque(false);
			p2.setBounds(234, 90, 18, 23);
			getContentPane().add(p2);
			
			JRadioButton p3 = new JRadioButton("");
			p3.setOpaque(false);
			p3.setBounds(234, 130, 18, 23);
			getContentPane().add(p3);
			
			JRadioButton p4 = new JRadioButton("");
			p4.setOpaque(false);
			p4.setBounds(234, 170, 21, 23);
			getContentPane().add(p4);
			
			JRadioButton p5 = new JRadioButton("");
			p5.setOpaque(false);
			p5.setBounds(234, 210, 19, 23);
			getContentPane().add(p5);
			
			JRadioButton p6 = new JRadioButton("");
			p6.setOpaque(false);
			p6.setBounds(234, 250, 22, 23);
			getContentPane().add(p6);
			
			ButtonGroup bg6 = new ButtonGroup();
			bg6.add(p1);bg6.add(p2);bg6.add(p3);bg6.add(p4);bg6.add(p5);bg6.add(p6);
			
			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(p1.isSelected()) {
						setChosenPlayer(player[0]);
					} else if(p2.isSelected()) {
						setChosenPlayer(player[1]);
					} else if(p3.isSelected()) {
						setChosenPlayer(player[2]);
					} else if(p4.isSelected()) {
						setChosenPlayer(player[3]);
					} else if(p5.isSelected()){
						setChosenPlayer(player[4]);
					} else {
						setChosenPlayer(player[5]);
					}
					boolean ok = getChosenPlayer().validateLadysChoice(getChosenPlayer().username);
					System.out.println(getChosenPlayer().username + " was selected!");
					ok = false;
					if(!ok) {
						JOptionPane.showMessageDialog(null, "Επίλεξε άλλον παίκτη!");
					} else {
						Role r1 = new Role("oberon"); //px
						getChosenPlayer().setPlayerRole(r1);
						getChosenPlayer().checkPlayerSide();
						String side = getChosenPlayer().getPlayerSide();
						//String side = "good";
						if(side == "good") {
							dispose();
							for(int i = 0; i < player.length; i++) {
								if(player[i].isLadyOfTheLake()) {
									player[i].setNewLady();
									WithTheGood good = new WithTheGood(getChosenPlayer(),qd,  curr, a, vd, qo, scr);
									good.setVisible(true);
								}
							}
						} else {
							dispose();
							for(int i = 0; i < player.length; i++) {
								if(player[i].isLadyOfTheLake()) {
									player[i].setNewLady();
									WithTheEvil evil = new WithTheEvil(getChosenPlayer(),qd,  curr, a, vd, qo, scr);
									evil.setVisible(true);
								}
							}
						}
					}
				}
			});
			
			Image img1 = new ImageIcon(this.getClass().getResource("/next.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
			
		} else if(players.length == 7) {
			JRadioButton p1 = new JRadioButton("");
			p1.setOpaque(false);
			p1.setBounds(234, 50, 21, 23);
			getContentPane().add(p1);
			
			JRadioButton p2 = new JRadioButton("");
			p2.setOpaque(false);
			p2.setBounds(234, 90, 18, 23);
			getContentPane().add(p2);
			
			JRadioButton p3 = new JRadioButton("");
			p3.setOpaque(false);
			p3.setBounds(234, 130, 18, 23);
			getContentPane().add(p3);
			
			JRadioButton p4 = new JRadioButton("");
			p4.setOpaque(false);
			p4.setBounds(234, 170, 21, 23);
			getContentPane().add(p4);
			
			JRadioButton p5 = new JRadioButton("");
			p5.setOpaque(false);
			p5.setBounds(234, 210, 19, 23);
			getContentPane().add(p5);
			
			JRadioButton p6 = new JRadioButton("");
			p6.setOpaque(false);
			p6.setBounds(234, 250, 22, 23);
			getContentPane().add(p6);
			
			JRadioButton p7 = new JRadioButton("");
			p7.setOpaque(false);
			p7.setBounds(234, 290, 21, 23);
			getContentPane().add(p7);
			
			ButtonGroup bg7 = new ButtonGroup();
			bg7.add(p1);bg7.add(p2);bg7.add(p3);bg7.add(p4);bg7.add(p5);bg7.add(p6);bg7.add(p7);
			
			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(p1.isSelected()) {
						setChosenPlayer(player[0]);
					} else if(p2.isSelected()) {
						setChosenPlayer(player[1]);
					} else if(p3.isSelected()) {
						setChosenPlayer(player[2]);
					} else if(p4.isSelected()) {
						setChosenPlayer(player[3]);
					} else if(p5.isSelected()){
						setChosenPlayer(player[4]);
					} else if(p6.isSelected()){
						setChosenPlayer(player[5]);
					} else {
						setChosenPlayer(player[6]);
					}
					boolean ok = getChosenPlayer().validateLadysChoice(getChosenPlayer().username);
					System.out.println(getChosenPlayer().username + " was selected!");
					ok = false;
					if(!ok) {
						JOptionPane.showMessageDialog(null, "Επίλεξε άλλον παίκτη!");
					} else {
						Role r1 = new Role("oberon"); //px
						getChosenPlayer().setPlayerRole(r1);
						getChosenPlayer().checkPlayerSide();
						String side = getChosenPlayer().getPlayerSide();
						//String side = "good";
						if(side == "good") {
							dispose();
							for(int i = 0; i < player.length; i++) {
								if(player[i].isLadyOfTheLake()) {
									player[i].setNewLady();
									WithTheGood good = new WithTheGood(getChosenPlayer(),qd,  curr, a, vd, qo, scr);
									good.setVisible(true);
								}
							}
						} else {
							dispose();
							for(int i = 0; i < player.length; i++) {
								if(player[i].isLadyOfTheLake()) {
									player[i].setNewLady();
									WithTheEvil evil = new WithTheEvil(getChosenPlayer(),qd,  curr, a, vd, qo, scr);
									evil.setVisible(true);
								}
							}
						}
					}
				}
			});
			
			Image img1 = new ImageIcon(this.getClass().getResource("/next.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
			
		} else if(players.length == 8) {
			JRadioButton p1 = new JRadioButton("");
			p1.setOpaque(false);
			p1.setBounds(234, 50, 21, 23);
			getContentPane().add(p1);
			
			JRadioButton p2 = new JRadioButton("");
			p2.setOpaque(false);
			p2.setBounds(234, 90, 18, 23);
			getContentPane().add(p2);
			
			JRadioButton p3 = new JRadioButton("");
			p3.setOpaque(false);
			p3.setBounds(234, 130, 18, 23);
			getContentPane().add(p3);
			
			JRadioButton p4 = new JRadioButton("");
			p4.setOpaque(false);
			p4.setBounds(234, 170, 21, 23);
			getContentPane().add(p4);
			
			JRadioButton p5 = new JRadioButton("");
			p5.setOpaque(false);
			p5.setBounds(234, 210, 19, 23);
			getContentPane().add(p5);
			
			JRadioButton p6 = new JRadioButton("");
			p6.setOpaque(false);
			p6.setBounds(234, 250, 22, 23);
			getContentPane().add(p6);
			
			JRadioButton p7 = new JRadioButton("");
			p7.setOpaque(false);
			p7.setBounds(234, 290, 21, 23);
			getContentPane().add(p7);
			
			JRadioButton p8 = new JRadioButton("");
			p8.setOpaque(false);
			p8.setBounds(234, 330, 23, 23);
			getContentPane().add(p8);
			
			ButtonGroup bg8 = new ButtonGroup();
			bg8.add(p1);bg8.add(p2);bg8.add(p3);bg8.add(p4);bg8.add(p5);bg8.add(p6);bg8.add(p7);bg8.add(p8);
			
			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(p1.isSelected()) {
						setChosenPlayer(player[0]);
					} else if(p2.isSelected()) {
						setChosenPlayer(player[1]);
					} else if(p3.isSelected()) {
						setChosenPlayer(player[2]);
					} else if(p4.isSelected()) {
						setChosenPlayer(player[3]);
					} else if(p5.isSelected()){
						setChosenPlayer(player[4]);
					} else if(p6.isSelected()){
						setChosenPlayer(player[5]);
					} else if(p7.isSelected()){
						setChosenPlayer(player[6]);
					} else {
						setChosenPlayer(player[7]);
					}
					boolean ok = getChosenPlayer().validateLadysChoice(getChosenPlayer().username);
					System.out.println(getChosenPlayer().username + " was selected!");
					ok = false;
					if(!ok) {
						JOptionPane.showMessageDialog(null, "Επίλεξε άλλον παίκτη!");
					} else {
						Role r1 = new Role("oberon"); //px
						getChosenPlayer().setPlayerRole(r1);
						getChosenPlayer().checkPlayerSide();
						String side = getChosenPlayer().getPlayerSide();
						//String side = "good";
						if(side == "good") {
							dispose();
							for(int i = 0; i < player.length; i++) {
								if(player[i].isLadyOfTheLake()) {
									player[i].setNewLady();
									WithTheGood good = new WithTheGood(getChosenPlayer(),qd,  curr, a, vd, qo, scr);
									good.setVisible(true);
								}
							}
						} else {
							dispose();
							for(int i = 0; i < player.length; i++) {
								if(player[i].isLadyOfTheLake()) {
									player[i].setNewLady();
									WithTheEvil evil = new WithTheEvil(getChosenPlayer(),qd,  curr, a, vd, qo, scr);
									evil.setVisible(true);
								}
							}
						}
					}
				}
			});
			
			Image img1 = new ImageIcon(this.getClass().getResource("/next.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
			
		} else if(players.length == 9) {
			JRadioButton p1 = new JRadioButton("");
			p1.setOpaque(false);
			p1.setBounds(234, 50, 21, 23);
			getContentPane().add(p1);
			
			JRadioButton p2 = new JRadioButton("");
			p2.setOpaque(false);
			p2.setBounds(234, 90, 18, 23);
			getContentPane().add(p2);
			
			JRadioButton p3 = new JRadioButton("");
			p3.setOpaque(false);
			p3.setBounds(234, 130, 18, 23);
			getContentPane().add(p3);
			
			JRadioButton p4 = new JRadioButton("");
			p4.setOpaque(false);
			p4.setBounds(234, 170, 21, 23);
			getContentPane().add(p4);
			
			JRadioButton p5 = new JRadioButton("");
			p5.setOpaque(false);
			p5.setBounds(234, 210, 19, 23);
			getContentPane().add(p5);
			
			JRadioButton p6 = new JRadioButton("");
			p6.setOpaque(false);
			p6.setBounds(234, 250, 22, 23);
			getContentPane().add(p6);
			
			JRadioButton p7 = new JRadioButton("");
			p7.setOpaque(false);
			p7.setBounds(234, 290, 21, 23);
			getContentPane().add(p7);
			
			JRadioButton p8 = new JRadioButton("");
			p8.setOpaque(false);
			p8.setBounds(234, 330, 23, 23);
			getContentPane().add(p8);
			
			JRadioButton p9 = new JRadioButton("");
			p9.setOpaque(false);
			p9.setBounds(234, 370, 23, 23);
			getContentPane().add(p9);
			
			ButtonGroup bg9= new ButtonGroup();
			bg9.add(p1);bg9.add(p2);bg9.add(p3);bg9.add(p4);bg9.add(p5);bg9.add(p6);bg9.add(p7);bg9.add(p8);bg9.add(p9);
			
			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(p1.isSelected()) {
						setChosenPlayer(player[0]);
					} else if(p2.isSelected()) {
						setChosenPlayer(player[1]);
					} else if(p3.isSelected()) {
						setChosenPlayer(player[2]);
					} else if(p4.isSelected()) {
						setChosenPlayer(player[3]);
					} else if(p5.isSelected()){
						setChosenPlayer(player[4]);
					} else if(p6.isSelected()){
						setChosenPlayer(player[5]);
					} else if(p7.isSelected()){
						setChosenPlayer(player[6]);
					} else if(p8.isSelected()){
						setChosenPlayer(player[7]);
					} else {
						setChosenPlayer(player[8]);
					}
					boolean ok = getChosenPlayer().validateLadysChoice(getChosenPlayer().username);
					System.out.println(getChosenPlayer().username + " was selected!");
					ok = false;
					if(!ok) {
						JOptionPane.showMessageDialog(null, "Επίλεξε άλλον παίκτη!");
					} else {
						Role r1 = new Role("oberon"); //px
						getChosenPlayer().setPlayerRole(r1);
						getChosenPlayer().checkPlayerSide();
						String side = getChosenPlayer().getPlayerSide();
						//String side = "good";
						if(side == "good") {
							dispose();
							for(int i = 0; i < player.length; i++) {
								if(player[i].isLadyOfTheLake()) {
									player[i].setNewLady();
									WithTheGood good = new WithTheGood(getChosenPlayer(),qd,  curr, a, vd, qo, scr);
									good.setVisible(true);
								}
							}
						} else {
							dispose();
							for(int i = 0; i < player.length; i++) {
								if(player[i].isLadyOfTheLake()) {
									player[i].setNewLady();
									WithTheEvil evil = new WithTheEvil(getChosenPlayer(),qd,  curr, a, vd, qo, scr);
									evil.setVisible(true);
								}
							}
						}
					}
				}
			});
			
			Image img1 = new ImageIcon(this.getClass().getResource("/next.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
		} else {
			JRadioButton p1 = new JRadioButton("");
			p1.setOpaque(false);
			p1.setBounds(234, 50, 21, 23);
			getContentPane().add(p1);
			
			JRadioButton p2 = new JRadioButton("");
			p2.setOpaque(false);
			p2.setBounds(234, 90, 18, 23);
			getContentPane().add(p2);
			
			JRadioButton p3 = new JRadioButton("");
			p3.setOpaque(false);
			p3.setBounds(234, 130, 18, 23);
			getContentPane().add(p3);
			
			JRadioButton p4 = new JRadioButton("");
			p4.setOpaque(false);
			p4.setBounds(234, 170, 21, 23);
			getContentPane().add(p4);
			
			JRadioButton p5 = new JRadioButton("");
			p5.setOpaque(false);
			p5.setBounds(234, 210, 19, 23);
			getContentPane().add(p5);
			
			JRadioButton p6 = new JRadioButton("");
			p6.setOpaque(false);
			p6.setBounds(234, 250, 22, 23);
			getContentPane().add(p6);
			
			JRadioButton p7 = new JRadioButton("");
			p7.setOpaque(false);
			p7.setBounds(234, 290, 21, 23);
			getContentPane().add(p7);
			
			JRadioButton p8 = new JRadioButton("");
			p8.setOpaque(false);
			p8.setBounds(234, 330, 23, 23);
			getContentPane().add(p8);
			
			JRadioButton p9 = new JRadioButton("");
			p9.setOpaque(false);
			p9.setBounds(234, 370, 23, 23);
			getContentPane().add(p9);
			
			JRadioButton p10 = new JRadioButton("");
			p10.setOpaque(false);
			p10.setBounds(234, 411, 21, 23);
			getContentPane().add(p10);
			
			ButtonGroup bg10 = new ButtonGroup();
			bg10.add(p1);bg10.add(p2);bg10.add(p3);bg10.add(p4);bg10.add(p5);bg10.add(p6);bg10.add(p7);bg10.add(p8);bg10.add(p9);bg10.add(p10);
			
			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(p1.isSelected()) {
						setChosenPlayer(player[0]);
					} else if(p2.isSelected()) {
						setChosenPlayer(player[1]);
					} else if(p3.isSelected()) {
						setChosenPlayer(player[2]);
					} else if(p4.isSelected()) {
						setChosenPlayer(player[3]);
					} else if(p5.isSelected()){
						setChosenPlayer(player[4]);
					} else if(p6.isSelected()){
						setChosenPlayer(player[5]);
					} else if(p7.isSelected()){
						setChosenPlayer(player[6]);
					} else if(p8.isSelected()){
						setChosenPlayer(player[7]);
					} else if(p9.isSelected()){
						setChosenPlayer(player[8]);
					} else {
						setChosenPlayer(player[9]);
					}
					boolean ok = getChosenPlayer().validateLadysChoice(getChosenPlayer().username);
					//System.out.println(getChosenPlayer().username + " was selected!");
					//boolean ok = false;
					//System.out.println(ok);
					if(!ok) {
						JOptionPane.showMessageDialog(null, "Επίλεξε άλλον παίκτη!");
					} else {
						Role r1 = new Role("oberon"); //px
						getChosenPlayer().setPlayerRole(r1);
						getChosenPlayer().checkPlayerSide();
						String side = getChosenPlayer().getPlayerSide();
						//String side = "good";
						if(side == "good") {
							dispose();
							for(int i = 0; i < player.length; i++) {
								if(player[i].isLadyOfTheLake()) {
									player[i].setNewLady();
									WithTheGood good = new WithTheGood(getChosenPlayer(),qd,  curr, a, vd, qo, scr);
									good.setVisible(true);
								}
							}
						} else {
							dispose();
							for(int i = 0; i < player.length; i++) {
								if(player[i].isLadyOfTheLake()) {
									player[i].setNewLady();
									WithTheEvil evil = new WithTheEvil(getChosenPlayer(),qd,  curr, a, vd, qo, scr);
									evil.setVisible(true);
								}
							}
						}
					}
				}
			});
			Image img1 = new ImageIcon(this.getClass().getResource("/next.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
		}
		
		JLabel imgLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/im3.jpg")).getImage();
		imgLabel.setIcon(new ImageIcon(img));
		imgLabel.setBounds(0, 0, 334, 461);
		contentPane.add(imgLabel);
	}

}