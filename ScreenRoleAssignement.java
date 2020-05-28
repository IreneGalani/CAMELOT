package camelot;
import java.awt.*;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.imageio.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.swing.border.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.EmptyBorder;

public class ScreenRoleAssignement extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	Current_Game curr;
	Special_Rules a;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Special_Rules a = new Special_Rules(false,false);
					Current_Game curr = new Current_Game();
					ScreenRoleAssignement frame = new ScreenRoleAssignement(curr,a);
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ScreenRoleAssignement(Current_Game curr,Special_Rules a) {
		this.curr = curr;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel roleText = new JLabel("");
		roleText.setForeground(new Color(220, 220, 220));
		roleText.setHorizontalAlignment(SwingConstants.CENTER);
		roleText.setFont(new Font("Tahoma", Font.BOLD, 42));
		roleText.setBounds(136, 201, 228, 118);
		contentPane.add(roleText);
		roleText.setVisible(false);
		
		
		JButton btnNewButton = new JButton("Press to see your role card");
		btnNewButton.setEnabled(false);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						btnNewButton.setVisible(false);
						btnNewButton.setEnabled(false);
						
						roleText.setVisible(true);
						
			}
		});
		//btnNewButton.setEnabled(false);
		//btnNewButton.setFocusable(false);
		btnNewButton.setBackground(new Color(245, 245, 245));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		btnNewButton.setBounds(131, 201, 233, 118);
		contentPane.add(btnNewButton);
		
		
		//curr.setPlayerList(names);
		JTextField nameField = new JTextField();
		nameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				String s = nameField.getText();
				int count = 0;
				boolean exists = false;
					//System.out.println(curr.playerList.length);
				for(int i = 0; i < curr.playerList.length; i++) {
					if(curr.playerList[i].equals(s)) {
						exists = true;
						break;
					}
				}
				
				if(exists) {
					
					JOptionPane.showMessageDialog(null,"To username δεν είναι διαθέσιμο");
				} else {
							
							while(curr.playerList[count] != "") {
								count++;
								
							}
							
							curr.playerList[count] = s;
							
							
							if(count == 0) {
								Player p1 = new Player(s);
								Player playerRef = p1;
								curr.player[0] = p1;
								Random generator = new Random();
								int randomIndex=generator.nextInt(curr.role.length);
								//for(int i=0; i<curr.role.length; i++) {
								while(p1.getPlayerRole() == null) {
									if((curr.role[randomIndex].checkRoles() == true) && (curr.role[randomIndex].getGiven() == false)) {
										//Random generator = new Random();
										//int randomIndex=generator.nextInt(curr.role.length);
										p1.setPlayerRole(curr.role[randomIndex]);
										curr.role[randomIndex].setGiven(true);
										/*p1.setPlayerRole(curr.role[i]);
										curr.role[i].setGiven(true);*/
										curr.saveRoleAssignement(1);
										break;
										
									}else {
										generator = new Random();
										randomIndex=generator.nextInt(curr.role.length);
									}
								}
								
								roleText.setText(playerRef.playerRole.getRoleName());
								btnNewButton.setEnabled(true);
								
							}else if(count == 1) {
								Player p2 = new Player(s);
								Player playerRef = p2;
								curr.player[1] = p2;
								Random generator = new Random();
								int randomIndex=generator.nextInt(curr.role.length);
								//for(int i=0; i<curr.role.length; i++) {
								while(p2.getPlayerRole() == null) {
									if((curr.role[randomIndex].checkRoles() == true) && (curr.role[randomIndex].getGiven() == false)) {
										//Random generator = new Random();
										//int randomIndex=generator.nextInt(curr.role.length);
										p2.setPlayerRole(curr.role[randomIndex]);
										curr.role[randomIndex].setGiven(true);
										/*p2.setPlayerRole(curr.role[i]);
										curr.role[i].setGiven(true);*/
										curr.saveRoleAssignement(1);
										break;
									}else {
										generator = new Random();
										randomIndex=generator.nextInt(curr.role.length);
										
									}
								}
								roleText.setText(playerRef.playerRole.getRoleName());
								btnNewButton.setEnabled(true);
							}
							else if(count == 2) {
								Player p3 = new Player(s);
								Player playerRef = p3;
								curr.player[2] = p3;
								Random generator = new Random();
								int randomIndex=generator.nextInt(curr.role.length);

								//for(int i=0; i<curr.role.length; i++) {
								while(p3.getPlayerRole() == null) {
									if((curr.role[randomIndex].checkRoles() == true) && (curr.role[randomIndex].getGiven() == false)) {
										//Random generator = new Random();
										//int randomIndex=generator.nextInt(curr.role.length);
										p3.setPlayerRole(curr.role[randomIndex]);
										curr.role[randomIndex].setGiven(true);
										/*p3.setPlayerRole(curr.role[i]);
										curr.role[i].setGiven(true);*/
										curr.saveRoleAssignement(1);
										break;
									}else {
										generator = new Random();
										randomIndex=generator.nextInt(curr.role.length);
									}
								}
								roleText.setText(playerRef.playerRole.getRoleName());
								btnNewButton.setEnabled(true);
							}else if(count == 3) {
								Player p4 = new Player(s);
								Player playerRef = p4;
								curr.player[3] = p4;
								Random generator = new Random();
								int randomIndex=generator.nextInt(curr.role.length);
								//for(int i=0; i<curr.role.length; i++) {
								while(p4.getPlayerRole() == null) {
									if((curr.role[randomIndex].checkRoles() == true) && (curr.role[randomIndex].getGiven() == false)) {
										//Random generator = new Random();
										//int randomIndex=generator.nextInt(curr.role.length);
										p4.setPlayerRole(curr.role[randomIndex]);
										curr.role[randomIndex].setGiven(true);
										/*p4.setPlayerRole(curr.role[i]);
										curr.role[i].setGiven(true);*/
										curr.saveRoleAssignement(1);
										break;
									}else {
										generator = new Random();
										randomIndex=generator.nextInt(curr.role.length);
									}
								}
								roleText.setText(playerRef.playerRole.getRoleName());
								btnNewButton.setEnabled(true);
							}else if (count == 4) {
								Player p5 = new Player(s);
								Player playerRef = p5;
								curr.player[4] = p5;
								Random generator = new Random();
								int randomIndex=generator.nextInt(curr.role.length);
								//for(int i=0; i<curr.role.length; i++) {
								while(p5.getPlayerRole() == null) {
									if((curr.role[randomIndex].checkRoles() == true) && (curr.role[randomIndex].getGiven() == false)) {
										//Random generator = new Random();
										//int randomIndex=generator.nextInt(curr.role.length);
										p5.setPlayerRole(curr.role[randomIndex]);
										curr.role[randomIndex].setGiven(true);
										/*p5.setPlayerRole(curr.role[i]);
										curr.role[i].setGiven(true);*/
										curr.saveRoleAssignement(1);
										break;
									}else {
										generator = new Random();
										randomIndex=generator.nextInt(curr.role.length);
									}
								}
								roleText.setText(playerRef.playerRole.getRoleName());
								btnNewButton.setEnabled(true);
							}else if (count == 5) {
								Player p6 = new Player(s);
								Player playerRef = p6;
								curr.player[5] = p6;
								Random generator = new Random();
								int randomIndex=generator.nextInt(curr.role.length);
								//for(int i=0; i<curr.role.length; i++) {
								while(p6.getPlayerRole() == null) {
									if((curr.role[randomIndex].checkRoles() == true) && (curr.role[randomIndex].getGiven() == false)) {
										//Random generator = new Random();
										//int randomIndex=generator.nextInt(curr.role.length);
										p6.setPlayerRole(curr.role[randomIndex]);
										curr.role[randomIndex].setGiven(true);
										/*p6.setPlayerRole(curr.role[i]);
										curr.role[i].setGiven(true);*/
										curr.saveRoleAssignement(1);
										break;
									}else {
										generator = new Random();
										randomIndex=generator.nextInt(curr.role.length);
									}
								}
								roleText.setText(playerRef.playerRole.getRoleName());
								btnNewButton.setEnabled(true);
							}else if(count == 6) {
								Player p7 = new Player(s);
								Player playerRef = p7;
								curr.player[6] = p7;
								Random generator = new Random();
								int randomIndex=generator.nextInt(curr.role.length);
								//for(int i=0; i<curr.role.length; i++) {
								while(p7.getPlayerRole() == null) {
									if((curr.role[randomIndex].checkRoles() == true) && (curr.role[randomIndex].getGiven() == false)) {
										//Random generator = new Random();
										//int randomIndex=generator.nextInt(curr.role.length);
										p7.setPlayerRole(curr.role[randomIndex]);
										curr.role[randomIndex].setGiven(true);
										/*p7.setPlayerRole(curr.role[i]);
										curr.role[i].setGiven(true);*/
										curr.saveRoleAssignement(1);
										break;
									}else {
										generator = new Random();
										randomIndex=generator.nextInt(curr.role.length);
									}
								}
								roleText.setText(playerRef.playerRole.getRoleName());
								btnNewButton.setEnabled(true);
								
							}else if(count == 7) {
								Player p8 = new Player(s);
								Player playerRef = p8;
								curr.player[7] = p8;
								Random generator = new Random();
								int randomIndex=generator.nextInt(curr.role.length);
								//for(int i=0; i<curr.role.length; i++) {
								while(p8.getPlayerRole() == null) {
									if((curr.role[randomIndex].checkRoles() == true) && (curr.role[randomIndex].getGiven() == false)) {
										//Random generator = new Random();
										//int randomIndex=generator.nextInt(curr.role.length);
										p8.setPlayerRole(curr.role[randomIndex]);
										curr.role[randomIndex].setGiven(true);
										/*p8.setPlayerRole(curr.role[i]);
										curr.role[i].setGiven(true);*/
										curr.saveRoleAssignement(1);
										break;
									}else {
										generator = new Random();
										randomIndex=generator.nextInt(curr.role.length);
									}
								}
								roleText.setText(playerRef.playerRole.getRoleName());
								btnNewButton.setEnabled(true);
							}else if (count == 8) {
								Player p9 = new Player(s);
								Player playerRef = p9;
								curr.player[8] = p9;
								Random generator = new Random();
								int randomIndex=generator.nextInt(curr.role.length);
								//for(int i=0; i<curr.role.length; i++) {
								while(p9.getPlayerRole() == null) {
									if((curr.role[randomIndex].checkRoles() == true) && (curr.role[randomIndex].getGiven() == false)) {
										//Random generator = new Random();
										//int randomIndex=generator.nextInt(curr.role.length);
										p9.setPlayerRole(curr.role[randomIndex]);
										curr.role[randomIndex].setGiven(true);
										/*p9.setPlayerRole(curr.role[i]);
										curr.role[i].setGiven(true);*/
										curr.saveRoleAssignement(1);
										break;
									}else {
										generator = new Random();
										randomIndex=generator.nextInt(curr.role.length);
									}
								}
								roleText.setText(playerRef.playerRole.getRoleName());
								btnNewButton.setEnabled(true);
							}else if(count == 9) {
								Player p10 = new Player(s);
								Player playerRef = p10;
								curr.player[9] = p10;
								Random generator = new Random();
								int randomIndex=generator.nextInt(curr.role.length);
								//for(int i=0; i<curr.role.length; i++) {
								while(p10.getPlayerRole() == null) {
									if((curr.role[randomIndex].checkRoles() == true) && (curr.role[randomIndex].getGiven() == false)) {
										//Random generator = new Random();
										//int randomIndex=generator.nextInt(curr.role.length);
										p10.setPlayerRole(curr.role[randomIndex]);
										curr.role[randomIndex].setGiven(true);
										/*p10.setPlayerRole(curr.role[i]);
										curr.role[i].setGiven(true);*/
										curr.saveRoleAssignement(1);
										break;
									}else {
										generator = new Random();
										randomIndex=generator.nextInt(curr.role.length);
									}
								}
								roleText.setText(playerRef.playerRole.getRoleName());
								btnNewButton.setEnabled(true);
							}
							

						}
					
						
		
				
				
			
		}});
		

		
		
		nameField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		nameField.setHorizontalAlignment(SwingConstants.CENTER);
		nameField.setBorder(null);
		nameField.setForeground(Color.WHITE);
		nameField.setOpaque(false);
		nameField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		nameField.setText("Εισάγετε Όνομα_");
		nameField.setBounds(136, 83, 228, 53);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		
		
		JButton nextButton = new JButton("");
		Image arrow = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
		nextButton.setIcon(new ImageIcon(arrow));
		nextButton.setBackground(Color.LIGHT_GRAY);
		nextButton.setBounds(419, 413, 85, 21);
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(curr.getroleAssigned() == curr.getnumPlayers()) {
					dispose();
					ScreenNarration narr = new ScreenNarration(curr,a);
					narr.setVisible(true);
					
	
				}else {
					dispose();
					ScreenRoleAssignement screen = new ScreenRoleAssignement(curr,a);
					screen.setVisible(true);
					
					
				}
				

		}});
		contentPane.add(nextButton);
		
		
			
		
		JLabel imgLabel = new JLabel("");
		imgLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		imgLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		imgLabel.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		Image img = new ImageIcon(this.getClass().getResource("/foto_anathesi1.jpg")).getImage();
		imgLabel.setIcon(new ImageIcon(img));
		imgLabel.setBounds(0, 0, 518, 458);
		contentPane.add(imgLabel);
		
		
		
	}
}
