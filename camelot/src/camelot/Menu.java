package camelot;
import java.awt.*;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.image.*;
import javax.swing.JFrame;
import javax.swing.border.*;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Menu extends JFrame {
	private JTextField textField;
	private JPanel contentPane;
	private JFrame frame;
	 int numPlayers;
	 int num = 0;
	 Special_Rules a;
	 
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Special_Rules a = new Special_Rules(false,false);
					Menu frame = new Menu(a);
					frame.setVisible(true);
					frame.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void setNum(int ok) {
		this.num = ok;
	}
	
	private int getNum() {
		return num;
	}
	/**
	 * Create the frame.
	 */
	public Menu(Special_Rules a) {
		this.a = a;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 580);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel MenuLabel = new JLabel("MENU");
		MenuLabel.setForeground(Color.WHITE);
		MenuLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 28));
		MenuLabel.setBounds(104, 10, 176, 130);
		contentPane.add(MenuLabel);
		
		JLabel numPlLabel = new JLabel("Αριθμός Παικτών");
		numPlLabel.setForeground(Color.WHITE);
		numPlLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		numPlLabel.setBounds(104, 134, 176, 60);
		getContentPane().add(numPlLabel);
		
		Role merlin = new Role("merlin");
		Role percival = new Role("percival");
		Role mordred = new Role("mordred");
		Role oberon = new Role("oberon");
		Role morgana = new Role("morgana");
		Role good1 = new Role("good");
		Role good2 = new Role("good");
		Role good3 = new Role("good");
		Role good4 = new Role("good");
		Role good5 = new Role("good");
		Role good6 = new Role("good");
		Role evil1 = new Role("evil");
		Role evil2 = new Role("evil");
		Role evil3 = new Role("evil");
		Role evil4 = new Role("evil");
		Role[] roles = {merlin,percival,mordred,oberon,morgana,good1,good2,good3,good4,good5,good6,evil1,evil2,evil3,evil4};
		
		JRadioButton rdbtnMerlin = new JRadioButton("     Merlin");
		rdbtnMerlin.setForeground(Color.WHITE);
		rdbtnMerlin.setOpaque(false);
		rdbtnMerlin.setBackground(Color.DARK_GRAY);
		rdbtnMerlin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnMerlin.setBounds(401, 204, 157, 35);
		getContentPane().add(rdbtnMerlin);
		rdbtnMerlin.setEnabled(false);

		
		
		JRadioButton rdbtnPercival = new JRadioButton("     Percival");
		rdbtnPercival.setForeground(Color.WHITE);
		rdbtnPercival.setOpaque(false);
		rdbtnPercival.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnPercival.setBounds(401, 266, 157, 21);
		getContentPane().add(rdbtnPercival);
		rdbtnPercival.setEnabled(false);
		
		JRadioButton rdbtnMordred = new JRadioButton("     Mordred");
		rdbtnMordred.setForeground(Color.WHITE);
		rdbtnMordred.setOpaque(false);
		rdbtnMordred.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnMordred.setBounds(401, 318, 157, 21);
		getContentPane().add(rdbtnMordred);
		rdbtnMordred.setEnabled(false);
		
		JRadioButton rdbtnOberon = new JRadioButton("     Oberon");
		rdbtnOberon.setForeground(Color.WHITE);
		rdbtnOberon.setOpaque(false);
		rdbtnOberon.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnOberon.setBounds(401, 369, 157, 21);
		getContentPane().add(rdbtnOberon);
		rdbtnOberon.setEnabled(false);
		
		JRadioButton rdbtnMorgana = new JRadioButton("     Morgana");
		rdbtnMorgana.setEnabled(false);
		rdbtnMorgana.setForeground(Color.WHITE);
		rdbtnMorgana.setOpaque(false);
		rdbtnMorgana.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnMorgana.setBounds(401, 424, 157, 28);
		getContentPane().add(rdbtnMorgana);
		
		
		Current_Game curr = new Current_Game(5,roles);
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						try {
					num = Integer.parseInt(textField.getText());
					if(num < 5 || num > 10) {
						JOptionPane.showMessageDialog(null,"Μη έγκυρος αριθμός παικτών");
						}else {
					rdbtnMerlin.setEnabled(true);
					rdbtnPercival.setEnabled(true);
					rdbtnMordred.setEnabled(true);
					rdbtnOberon.setEnabled(true);
					rdbtnMorgana.setEnabled(true);
					curr.setNumPlayers(num);
					
					if(curr.getnumPlayers() == 5) {
						String[] names = {"","","","",""};
						curr.setPlayerList(names);
						Player[] players = new Player[5];
						curr.setPlayer(players);
					} else if(curr.getnumPlayers() == 6) {
						String[] names = {"","","","","",""};
						curr.setPlayerList(names);
						Player[] players = new Player[6];
						curr.setPlayer(players);

					} else if(curr.getnumPlayers() ==7) {
						String[] names = {"","","","","","",""};
						curr.setPlayerList(names);
						Player[] players = new Player[7];
						curr.setPlayer(players);

					} else if(curr.getnumPlayers() == 8) {
						String[] names = {"","","","","","","",""};
						curr.setPlayerList(names);
						Player[] players = new Player[8];
						curr.setPlayer(players);

					} else if(curr.getnumPlayers() ==9) {
						String[] names = {"","","","","","","","",""};
						curr.setPlayerList(names);
						Player[] players = new Player[9];
						curr.setPlayer(players);

					} else {
						String[] names = {"","","","","","","","","",""};
						curr.setPlayerList(names);
						Player[] players = new Player[10];
						curr.setPlayer(players);

					}
					}
					
				}catch(Exception e1) {
				
				JOptionPane.showMessageDialog(null,"Μη έγκυρος αριθμός παικτών");
			}
				
						
		}
			});
		
		
		textField.setBounds(401, 156, 47, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel SpRolesLabel = new JLabel("Ειδικοί Χαρακτήρες:");
		SpRolesLabel.setForeground(Color.WHITE);
		SpRolesLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		SpRolesLabel.setBounds(104, 284, 220, 88);
		getContentPane().add(SpRolesLabel);
		
		
		JButton nextButton = new JButton();
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num == 0) {
					JOptionPane.showMessageDialog(null,"Μη έγκυρος αριθμός παικτών");
				}else {
			if (rdbtnMerlin.isSelected()) {
			roles[0].setIsUsed(true);	
			}
			else {
				roles[0].setIsUsed(false);
			}
			if (rdbtnPercival.isSelected()) {
				roles[1].setIsUsed(true);
			} else {
				roles[1].setIsUsed(false);
			}
			if(rdbtnMordred.isSelected()) {
				roles[2].setIsUsed(true);
			}
			else {
				roles[2].setIsUsed(false);
			}
			if(rdbtnOberon.isSelected()) {
				roles[3].setIsUsed(true);
			}
			else {
				roles[3].setIsUsed(false);
			}
			if(rdbtnMorgana.isSelected()) {
				roles[4].setIsUsed(true);
			}
			else {
				roles[4].setIsUsed(false);
			}
			
			if(!curr.verifySpRoles()) {
				JOptionPane.showMessageDialog(null,"Οι ειδ. Χαρακτήρες δεν συμβαδίζουν με τους κανόνες");
			}else {
				if(curr.getnumPlayers() == 5) {
					roles[5].setIsUsed(true);
					roles[6].setIsUsed(true);
					roles[11].setIsUsed(true);
					roles[12].setIsUsed(true);
					if(!roles[0].checkRoles()) {
						roles[7].setIsUsed(true);
					}
				} else if(curr.getnumPlayers() == 6) {
					roles[5].setIsUsed(true);
					roles[6].setIsUsed(true);
					roles[11].setIsUsed(true);
					roles[12].setIsUsed(true);
					if(!roles[0].checkRoles()) {
						roles[7].setIsUsed(true);
					}
					if(!roles[1].checkRoles()) {
						roles[8].setIsUsed(true);
					}
				} else if(curr.getnumPlayers() == 7) {
					int count1 = 0;
					if(roles[2].checkRoles()) {
						count1++;
					}
					if(roles[3].checkRoles()) {
						count1++;
					}
					if(roles[4].checkRoles()) {
						count1++;
					}
					if(count1 == 0) {
						roles[11].setIsUsed(true);
						roles[12].setIsUsed(true);
						roles[13].setIsUsed(true);
					} else if(count1 == 1) {
						roles[11].setIsUsed(true);
						roles[12].setIsUsed(true);
					} else if(count1 == 2) {
						roles[11].setIsUsed(true);
					} else {
						//kanenas epipleon evil den anatithetai
					}
					if(roles[1].checkRoles()) {
						roles[5].setIsUsed(true);
						roles[6].setIsUsed(true);
					} else {
						if(roles[0].checkRoles()) {
							roles[5].setIsUsed(true);
							roles[6].setIsUsed(true);
							roles[7].setIsUsed(true);
						}
						else {
							roles[5].setIsUsed(true);
							roles[6].setIsUsed(true);
							roles[7].setIsUsed(true);
							roles[8].setIsUsed(true);
							
						}
					}
				} else if(curr.getnumPlayers() == 8) {
					int count1 = 0;
					if(roles[2].checkRoles()) {
						count1++;
					}
					if(roles[3].checkRoles()) {
						count1++;
					}
					if(roles[4].checkRoles()) {
						count1++;
					}
					if(count1 == 0) {
						roles[11].setIsUsed(true);
						roles[12].setIsUsed(true);
						roles[13].setIsUsed(true);
					} else if(count1 == 1) {
						roles[11].setIsUsed(true);
						roles[12].setIsUsed(true);
					} else if(count1 == 2) {
						roles[11].setIsUsed(true);
					} else {
						//kanenas epipleon evil den anatithetai
					}
					if(roles[1].checkRoles()) {
						roles[5].setIsUsed(true);
						roles[6].setIsUsed(true);
						roles[7].setIsUsed(true);
					} else {
						if(roles[0].checkRoles()) {
							roles[5].setIsUsed(true);
							roles[6].setIsUsed(true);
							roles[7].setIsUsed(true);
							roles[8].setIsUsed(true);
						}
						else {
							roles[5].setIsUsed(true);
							roles[6].setIsUsed(true);
							roles[7].setIsUsed(true);
							roles[8].setIsUsed(true);
							roles[9].setIsUsed(true);
						}
					}
				} else if(curr.getnumPlayers() == 9) {
					int count1 = 0;
					if(roles[2].checkRoles()) {
						count1++;
					}
					if(roles[3].checkRoles()) {
						count1++;
					}
					if(roles[4].checkRoles()) {
						count1++;
					}
					if(count1 == 0) {
						roles[11].setIsUsed(true);
						roles[12].setIsUsed(true);
						roles[13].setIsUsed(true);
					} else if(count1 == 1) {
						roles[11].setIsUsed(true);
						roles[12].setIsUsed(true);
					} else if(count1 == 2) {
						roles[11].setIsUsed(true);
					} else {
						//kanenas epipleon evil den anatithetai
					}
					if(roles[1].checkRoles()) {
						roles[5].setIsUsed(true);
						roles[6].setIsUsed(true);
						roles[7].setIsUsed(true);
						roles[8].setIsUsed(true);
					} else {
						if(roles[0].checkRoles()) {
							roles[5].setIsUsed(true);
							roles[6].setIsUsed(true);
							roles[7].setIsUsed(true);
							roles[8].setIsUsed(true);
							roles[9].setIsUsed(true);
						}
						else {
							roles[5].setIsUsed(true);
							roles[6].setIsUsed(true);
							roles[7].setIsUsed(true);
							roles[8].setIsUsed(true);
							roles[9].setIsUsed(true);
							roles[10].setIsUsed(true);
						}
					}
				} else {
					int count1 = 0;
					if(roles[2].checkRoles()) {
						count1++;
					}
					if(roles[3].checkRoles()) {
						count1++;
					}
					if(roles[4].checkRoles()) {
						count1++;
					}
					if(count1 == 0) {
						roles[11].setIsUsed(true);
						roles[12].setIsUsed(true);
						roles[13].setIsUsed(true);
						roles[14].setIsUsed(true);
					} else if(count1 == 1) {
						roles[11].setIsUsed(true);
						roles[12].setIsUsed(true);
						roles[13].setIsUsed(true);
					} else if(count1 == 2) {
						roles[11].setIsUsed(true);
						roles[12].setIsUsed(true);
					} else {
						roles[11].setIsUsed(true);
					}
					if(roles[1].checkRoles()) {
						roles[5].setIsUsed(true);
						roles[6].setIsUsed(true);
						roles[7].setIsUsed(true);
						roles[8].setIsUsed(true);
					} else {
						if(roles[0].checkRoles()) {
							roles[5].setIsUsed(true);
							roles[6].setIsUsed(true);
							roles[7].setIsUsed(true);
							roles[8].setIsUsed(true);
							roles[9].setIsUsed(true);
						}
						else {
							roles[5].setIsUsed(true);
							roles[6].setIsUsed(true);
							roles[7].setIsUsed(true);
							roles[8].setIsUsed(true);
							roles[9].setIsUsed(true);
							roles[10].setIsUsed(true);
						}
					}
				}
				dispose();
				ScreenRoleAssignement screen = new ScreenRoleAssignement(curr,a);
				screen.setVisible(true);
				setVisible(false);
			}}
		}});
		nextButton.setBackground(Color.LIGHT_GRAY);
		Image arrow = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
		nextButton.setIcon(new ImageIcon(arrow));
		nextButton.setBounds(499, 512, 85, 21);
		contentPane.add(nextButton);
		
		JLabel imgLabel = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/papyros.jpg")).getImage();
		imgLabel.setIcon(new ImageIcon(img));
		imgLabel.setBounds(0, 0, 602, 543);
		contentPane.add(imgLabel);
		
		
		
		
		
		
	}
}
	
