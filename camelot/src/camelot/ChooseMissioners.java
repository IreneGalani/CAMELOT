package camelot;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class ChooseMissioners extends JFrame {

	JPanel contentPane;
     int qs;
	 int mis_num;
	 int counter=0;
	 boolean b1=false;
	 boolean b2=false;
	 boolean b3=false;
     boolean b4=false;
     boolean b5=false;
     boolean b6=false;
     boolean b7=false;
     boolean b8=false;
     boolean b9=false;
     boolean b10=false;
    

    QuestChoiceData qd;
	Current_Game curr;
	Special_Rules a;
	VotingData vd;
	QuestOutcome qo;
	Score scr;
	private String[] names;
	private String led;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
			
				
				try {
					QuestChoiceData qd= new QuestChoiceData();
			//	ChooseMissioners frame = new ChooseMissioners(qd,curr,a);
				
				
				//qd.saveMissioners();
			//		frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	

	public ChooseMissioners(QuestChoiceData qd,Current_Game curr, Special_Rules a,VotingData vd,QuestOutcome qo,Score scr) {
		this.qd=qd;
		this.curr=curr;
		this.a=a;
		this.vd=vd;
		this.qo=qo;
		this.scr=scr;
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(350,500);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Επιλογή Missioners από τον/την");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(0, 10, 218, 23);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		

		if(a.checkTargeting()) {
		mis_num=qd.returnMissioners();		
		}
		else {	
			led=curr.chooseLeader();
			if (curr.VoteFails().equals("")) {
			   led= curr.chooseLeader();	    	
		    }
			 	
			
			
			if(qd.getCount()==1){
	            if( curr.getnumPlayers()==5|| curr.getnumPlayers()==6|| curr.getnumPlayers()==7){
	            	qd.stMissioners(2);

	              mis_num=2;
	              
	              }
	            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
	            	qd.stMissioners(3);

	             mis_num=3;
	              }
	          }
	          else if(qd.getCount()==2){
	              if( curr.getnumPlayers()==5|| curr.getnumPlayers()==6|| curr.getnumPlayers()==7){
	              	qd.stMissioners(3);

	              mis_num=3;
	              }
	            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
	            	qd.stMissioners(4);

	            mis_num=4;
	              }}
	          else if(qd.getCount()==3){
	          if( curr.getnumPlayers()==5){
	            	qd.stMissioners(2);

	              mis_num=2;
	              }
	            else if( curr.getnumPlayers()==6|| curr.getnumPlayers()==7){
	            	qd.stMissioners(3);

	              mis_num=3;
	              }
	            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
	            	qd.stMissioners(4);

	            mis_num=4;
	              }
	          }
	      else if(qd.getCount()==4){
	         if( curr.getnumPlayers()==5|| curr.getnumPlayers()==6){
	            	qd.stMissioners(3);

	          mis_num=3;
	              }
	            else if( curr.getnumPlayers()==7){
	            	qd.stMissioners(4);

	             mis_num=4;
	              }
	            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
	            	qd.stMissioners(5);

	              mis_num=5;
	              }}
	         else if(qd.getCount()==5){
	              if( curr.getnumPlayers()==5){
	              	qd.stMissioners(3);

	              mis_num=3;
	              }
	            else if( curr.getnumPlayers()==7|| curr.getnumPlayers()==6){
	            	qd.stMissioners(4);

	              mis_num=4;
	              }
	            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
	            	qd.stMissioners(5);

	              mis_num=5;
	              }
	             
	          }
			qd.stMissioners(mis_num);
			if(qd.returnMissioners()==2) {
			String[]	missioners= {"",""};
			qd.ml=missioners;
			}
			else if(qd.returnMissioners()==3) {
				String[]	missioners= {"","",""};
				qd.ml=missioners;
			}
			else if(qd.returnMissioners()==4) {
				String[]	missioners= {"","","",""};
				qd.ml=missioners;
			}else if(qd.returnMissioners()==5) {
				String[]	missioners= {"","","","",""};
				qd.ml=missioners;
			}
		}  
			
		qd.stMissioners(mis_num);
	
		
		JCheckBox cb1 = new JCheckBox();
		cb1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb1.setForeground(Color.WHITE);
		cb1.setOpaque(false);
		cb1.setBounds(60, 50, 270, 23);
		
		cb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	   	if(counter<mis_num) {		

	              if(  (e.getSource()==cb1 )&&(b1==false)) {
					b1=true;
					counter++;
					
				//	 String mis1=cb1.getText();
			        }
			   
	              else if(  (e.getSource()==cb1 )&&(b1==true)) {
	                b1=false;   
		            counter--;
		           
	            }
				}
		else {
					cb1.setSelected(false);
		              if(  (e.getSource()==cb1 )&&(b1==true)) {
		                b1=false;   
			            counter--;
		            }
					
				}
			}
		});
		contentPane.add(cb1);
		JCheckBox cb2 = new JCheckBox();
		cb2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb2.setForeground(Color.WHITE);
		cb2.setOpaque(false);
		cb2.setBounds(60, 90, 270, 23);
	
		cb2.addActionListener(new ActionListener() {
		    
		    public void actionPerformed( ActionEvent e) {
		        
		    	if(counter<mis_num) {		

		              if(  (e.getSource()==cb2 )&&(b2==false)) {
						b2=true;
						counter++;
					
				        }
				   
		              else if(  (e.getSource()==cb2 )&&(b2==true)) {
		                b2=false;   
			            counter--;
		            }
					}
			else {
						cb2.setSelected(false);
			              if(  (e.getSource()==cb2 )&&(b2==true)) {
			                b2=false;   
				            counter--;
			            }
						
					}
				}
		});
		contentPane.add(cb2);
		
		JCheckBox cb3 = new JCheckBox();
		cb3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb3.setForeground(Color.WHITE);
		cb3.setBounds(60, 130, 270, 23);
		cb3.setOpaque(false);
		cb3.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				if(counter<mis_num) {		

		              if(  (e.getSource()==cb3 )&&(b3==false)) {
						b3=true;
						counter++;
				        }
				   
		              else if(  (e.getSource()==cb3 )&&(b3==true)) {
		                b3=false;   
			            counter--;
		            }
					}
			else {
						cb3.setSelected(false);
			              if(  (e.getSource()==cb3 )&&(b3==true)) {
			                b3=false;   
				            counter--;
			            }
						
					}
				}
		});
		contentPane.add(cb3);
		
		JCheckBox cb4 = new JCheckBox();
		cb4.setOpaque(false);
		cb4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb4.setForeground(Color.WHITE);
		cb4.setBounds(60, 170, 270, 23);
		contentPane.add(cb4);
		
		cb4.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				if(counter<mis_num) {		

		              if(  (e.getSource()==cb4 )&&(b4==false)) {
						b4=true;
						counter++;
				        }
				   
		              else if(  (e.getSource()==cb4 )&&(b4==true)) {
		                b4=false;   
			            counter--;
		            }
					}
			else {
						cb4.setSelected(false);
			              if(  (e.getSource()==cb4 )&&(b4==true)) {
			                b4=false;   
				            counter--;
			            }
						
					}
				}
			});
		
		
		
		JCheckBox cb5 = new JCheckBox();
		cb5.setOpaque(false);
		cb5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb5.setForeground(Color.WHITE);
		cb5.setBounds(60, 210, 270, 23);
		contentPane.add(cb5);
		cb5.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				if(counter<mis_num) {		

		              if(  (e.getSource()==cb5 )&&(b5==false)) {
						b5=true;
						counter++;
				        }
				   
		              else if(  (e.getSource()==cb5 )&&(b5==true)) {
		                b5=false;   
			            counter--;
		            }
					}
			else {
						cb5.setSelected(false);
			              if(  (e.getSource()==cb5 )&&(b5==true)) {
			                b5=false;   
				            counter--;
			            }
						
					}
				}         	    
			});
		
		JCheckBox cb6 = new JCheckBox();
		cb6.setOpaque(false);
		cb6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb6.setForeground(Color.WHITE);
		cb6.setEnabled(false);
		cb6.setBounds(60, 250, 270, 23);
		cb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(counter<mis_num) {		

		              if(  (e.getSource()==cb6 )&&(b6==false)) {
						b6=true;
						counter++;
				        }
				   
		              else if(  (e.getSource()==cb6 )&&(b6==true)) {
		                b6=false;   
			            counter--;
		            }
					}
			else {
						cb6.setSelected(false);
			              if(  (e.getSource()==cb6 )&&(b6==true)) {
			                b6=false;   
				            counter--;
			            }
						
					}
				
				
			}
		});
		
		
		JCheckBox cb7 = new JCheckBox();
		cb7.setOpaque(false);
		cb7.setEnabled(false);
		cb7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb7.setForeground(Color.WHITE);
		cb7.setBounds(60, 290, 270, 23);
		cb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(counter<mis_num) {		

		              if(  (e.getSource()==cb7 )&&(b7==false)) {
						b7=true;
						counter++;
				        }
				   
		              else if(  (e.getSource()==cb7 )&&(b7==true)) {
		                b7=false;   
			            counter--;
		            }
					}
			else {
						cb4.setSelected(false);
			              if(  (e.getSource()==cb7 )&&(b7==true)) {
			                b7=false;   
				            counter--;
			            }
						
					}
				
			}
		});
		
		
		JCheckBox cb8 = new JCheckBox();
		cb8.setOpaque(false);
		cb8.setEnabled(false);
		cb8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb8.setForeground(Color.WHITE);
		cb8.setBounds(60, 330, 270, 23);
		cb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(counter<mis_num) {		

		              if(  (e.getSource()==cb8 )&&(b8==false)) {
						b8=true;
						counter++;
				        }
				   
		              else if(  (e.getSource()==cb8)&&(b8==true)) {
		                b8=false;   
			            counter--;
		            }
					}
			else {
						cb8.setSelected(false);
			              if(  (e.getSource()==cb8 )&&(b8==true)) {
			                b8=false;   
				            counter--;
			            }
						
					}
				}
		});
		
		JCheckBox cb9 = new JCheckBox();
		cb9.setOpaque(false);
		cb9.setEnabled(false);
		cb9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb9.setForeground(Color.WHITE);
		cb9.setBounds(60, 370, 270, 23);
		cb9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(counter<mis_num) {		

		              if(  (e.getSource()==cb9 )&&(b9==false)) {
						b9=true;
						counter++;
				        }
				   
		              else if(  (e.getSource()==cb9 )&&(b9==true)) {
		                b9=false;   
			            counter--;
		            }
					}
			else {
						cb9.setSelected(false);
			              if(  (e.getSource()==cb9 )&&(b9==true)) {
			                b9=false;   
				            counter--;
			            }
						
					}
				}
		});
		
		
		
		
		JCheckBox cb10 = new JCheckBox();
		cb10.setOpaque(false);
		cb10.setEnabled(false);
		cb10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb10.setForeground(Color.WHITE);
		cb10.setBounds(60, 410, 270, 23);
		cb10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(counter<mis_num) {		

		              if(  (e.getSource()==cb10 )&&(b10==false)) {
						b10=true;
						counter++;
				        }
				   
		              else if(  (e.getSource()==cb10 )&&(b10==true)) {
		                b10=false;   
			            counter--;
		            }
					}
			else {
						cb10.setSelected(false);
			              if(  (e.getSource()==cb10 )&&(b10==true)) {
			                b10=false;   
				            counter--;
			            }
						
					}
				}
		});
		
		
		names = curr.getPlayerList();
		for(int i=0;i<names.length;i++) {
			if(i==0) {
				cb1.setText(names[i]);
			}
			else if(i==1) {
				cb2.setText(names[i]);
			}
			else if(i==2) {
				cb3.setText(names[i]);
			}
			else if(i==3) {
				cb4.setText(names[i]);
			}
			else if(i==4) {
				cb5.setText(names[i]);
			}
			
			else if(i==5 ) {
				cb6.setText(names[i]);
				cb6.setEnabled(true);	
				contentPane.add(cb6);
			
			}
			else if(i==6) {
				cb7.setText(names[i]);
				cb7.setEnabled(true);
				contentPane.add(cb7);
			
			}
			else if(i==7) {
				cb8.setText(names[i]);
				cb8.setEnabled(true);	
				contentPane.add(cb8);
				
				
			}else if(i==8 ) {
				cb9.setText(names[i]);
				cb9.setEnabled(true);	
				contentPane.add(cb9);
			
			}else if(i==9) {			
				cb10.setText(names[i]);
				cb10.setEnabled(true);
				contentPane.add(cb10);
			
				
			}
			
		}
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(241, 440, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(counter<mis_num) {
					JOptionPane.showMessageDialog(null,"Επιλέξτε σωστό αριθμό παικτών");
				}else {
				
				if(cb1.isSelected()) {
					String	mis1=cb1.getText();
					int count=0;
					while(!(qd.getML(count).equals(""))) {
						count++;
											}
					qd.ml[count]=mis1;
					}
				if(cb2.isSelected()) {
					String	mis2=cb2.getText();
					int count=0;
					while(!(qd.getML(count).equals(""))) {
						count++;
											}
					qd.ml[count]=mis2;
					}
				if(cb3.isSelected()) {
					String	mis3=cb3.getText();
					int count=0;
					while(!(qd.getML(count).equals(""))) {
						count++;
											}
					qd.ml[count]=mis3;
					}
				if(cb4.isSelected()) {
					String	mis4=cb4.getText();
					int count=0;
					while(!(qd.getML(count).equals(""))) {
						count++;
											}
					qd.ml[count]=mis4;
					}
				if(cb5.isSelected()) {
					String	mis5=cb5.getText();
					int count=0;
					while(!(qd.getML(count).equals(""))) {
						count++;
											}
					qd.ml[count]=mis5;
					}
				if(cb6.isSelected()) {
						String	mis6=cb6.getText();
						int count=0;
						while(!(qd.getML(count).equals(""))) {
							count++;
												}
						qd.ml[count]=mis6;
					}
				if(cb7.isSelected())
					{
						String	mis7=cb7.getText();
						int count=0;
						while(!(qd.getML(count).equals(""))) {
							count++;
												}
						qd.ml[count]=mis7;
					}
				if(cb8.isSelected()) {
						String	mis8=cb8.getText();
						int count=0;
						while(!(qd.getML(count).equals(""))) {
							count++;
												}
						qd.ml[count]=mis8;
					}
				if(cb9.isSelected()) {
						String	mis9=cb9.getText();
						int count=0;
						while(!(qd.getML(count).equals(""))) {
							count++;
												}
						qd.ml[count]=mis9;
					}
				if(cb10.isSelected()) {
						String	mis10=cb10.getText();
						int count=0;
						while(!(qd.getML(count).equals(""))) {
							count++;
												}
						qd.ml[count]=mis10;
					}
				
				//VotingData vd=new VotingData();
				Voting1 k = new Voting1(qd,curr,a,vd,qo,scr);						
                dispose();
				k.setVisible(true);
			}}
		});
		if(qd.returnMissioners()==2) {
			String[]	missioners= {"",""};
			qd.ml=missioners;
			}
			else if(qd.returnMissioners()==3) {
				String[]	missioners= {"","",""};
				qd.ml=missioners;
			}
			else if(qd.returnMissioners()==4) {
				String[]	missioners= {"","","",""};
				qd.ml=missioners;
			}else if(qd.returnMissioners()==5) {
				String[]	missioners= {"","","","",""};
				qd.ml=missioners;
			}
		Image icon1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(icon1));
		contentPane.add(btnNewButton);
		
		JLabel leader = new JLabel(led);
		 leader.setForeground(Color.WHITE);
		leader.setBounds(214, 10, 128, 23);
		leader.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(leader);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		Image back = new ImageIcon(this.getClass().getResource("/im2.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(back));
		lblNewLabel_1.setBounds(0, 0, 346, 463);
		contentPane.add(lblNewLabel_1);
		
		
		
		}	
}