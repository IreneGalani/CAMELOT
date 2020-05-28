package camelot1;

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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ChooseMissioners extends JFrame {

	private JPanel contentPane;
    private  int qs;
	private int mis_num;
	private int counter=0;
	private boolean b1=false;
	private boolean b2=false;
	private boolean b3=false;
    private boolean b4=false;
    private boolean b5=false;
    private boolean b6=false;
    private boolean b7=false;
    private boolean b8=false;
    private boolean b9=false;
    private boolean b10=false;
    
  //  private int num;
	//private int r_as;
  //  Current_game cg=new Current_game(5,1);
    QuestChoiceData qd;
   // Special_Rules sp;
  // int y= fr.q;
	Current_Game curr;
	Special_Rules a;
	//private String[] names= {"1","2","3","4","5","6"};//
	private String[] names;
	//private int d=10-names.length;
	private String led;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
			
				
			
				
				
				
				
				
			//	System.out.println(f.getMis());
			
				try {
					QuestChoiceData qd= new QuestChoiceData();
			//	ChooseMissioners frame = new ChooseMissioners(qd,curr,a);
				
				
				//qd.saveMissioners();
				System.out.println(qd.ml);
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
	

	public ChooseMissioners(QuestChoiceData qd,Current_Game curr, Special_Rules a) {
		this.qd=qd;
		this.curr=curr;
		this.a=a;
		ImageIcon icon1 = new ImageIcon("C:\\Users\\301018\\eclipse-workspace\\camelot1\\iiim\\next.png");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0395\u03C0\u03B9\u03BB\u03BF\u03B3\u03AE Missioners  \u03B1\u03C0\u03CC");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(90, 11, 161, 23);
		contentPane.add(lblNewLabel);
		
	
		
		
		// Special_Rules sp= new Special_Rules(false,false);
	   //  Current_game cg= new Current_game(6,1);
	    // String[] player= {"1","2","3","4","5","6"};
	   //  curr.chooseLeader();
		
		// Player lead =new Player("tade");
		 
		 JLabel leader = new JLabel("");
			leader.setBounds(275, 11, 89, 23);
			contentPane.add(leader);
			
			leader.setText(led);
	           
		if(a.checkTargeting()) {
		mis_num=qd.returnMissioners();		    
		}
		else {	
			//curr.setnumPlayers(6);
			led=curr.chooseLeader();
			if (curr.VoteFails()==true) {
			   led= curr.chooseLeader();	    	
		    }
			
		    
			if(qd.getCount()==1){
	            if( curr.getnumPlayers()==5|| curr.getnumPlayers()==6|| curr.getnumPlayers()==7){
	              mis_num=2;
	              
	              }
	            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
	             mis_num=3;
	              }
	          }
	          else if(qd.getCount()==2){
	              if( curr.getnumPlayers()==5|| curr.getnumPlayers()==6|| curr.getnumPlayers()==7){
	              mis_num=3;
	              }
	            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
	            mis_num=4;
	              }}
	          else if(qd.getCount()==3){
	          if( curr.getnumPlayers()==5){
	              mis_num=2;
	              }
	            else if( curr.getnumPlayers()==6|| curr.getnumPlayers()==7){
	              mis_num=3;
	              }
	            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
	            mis_num=4;
	              }
	          }
	      else if(qd.getCount()==4){
	         if( curr.getnumPlayers()==5|| curr.getnumPlayers()==6){
	          mis_num=3;
	              }
	            else if( curr.getnumPlayers()==7){
	             mis_num=4;
	              }
	            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
	              mis_num=5;
	              }}
	         else if(qd.getCount()==5){
	              if( curr.getnumPlayers()==5){
	              mis_num=3;
	              }
	            else if( curr.getnumPlayers()==7|| curr.getnumPlayers()==6){
	              mis_num=4;
	              }
	            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
	              mis_num=5;
	              }
	             
	          }
			qd.stMissioners(mis_num);
			if(qd.returnMissioners()==2) {
			String[]	missioners= {"",""};
			qd.saveMissioners(missioners);
			}
			else if(qd.returnMissioners()==3) {
				String[]	missioners= {"","",""};
				qd.saveMissioners(missioners);
			}
			else if(qd.returnMissioners()==4) {
				String[]	missioners= {"","","",""};
				qd.saveMissioners(missioners);
			}else if(qd.returnMissioners()==5) {
				String[]	missioners= {"","","","",""};
				qd.saveMissioners(missioners);
			}
		}  
			//  qd.stMissioners(mis_num);
	
		
		JCheckBox cb1 = new JCheckBox();
		
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
		
		cb1.setBounds(136, 48, 97, 23);
		contentPane.add(cb1);
		JCheckBox cb2 = new JCheckBox();
	
		cb2.addActionListener(new ActionListener() {
		    
		    public void actionPerformed( ActionEvent e) {
		        
		    	if(counter<mis_num) {		

		              if(  (e.getSource()==cb2 )&&(b2==false)) {
						b2=true;
						counter++;
					//	String mis2=cb2.getText();
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
		
		cb2.setBounds(136, 74, 97, 23);
		contentPane.add(cb2);
		
		JCheckBox cb3 = new JCheckBox();
		
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
		
		cb3.setBounds(136, 100, 97, 23);
		contentPane.add(cb3);
		
		JCheckBox cb4 = new JCheckBox();
		cb4.setBounds(136, 126, 97, 23);
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
		cb5.setBounds(136, 152, 97, 23);
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
		cb6.setEnabled(false);
		cb6.setBounds(136, 178, 97, 23);
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
		cb7.setEnabled(false);
		cb7.setBounds(136, 204, 97, 23);
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
		cb8.setEnabled(false);
		cb8.setBounds(136, 230, 97, 23);
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
		cb9.setEnabled(false);
		cb9.setBounds(136, 256, 97, 23);
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
		cb10.setEnabled(false);
		cb10.setBounds(136, 282, 97, 23);
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
		
		
		
		names=curr.getplayerList();
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
			/*	if(d==5) {
				cb6.setVisible(false);
				cb6.setEnabled(false);
				}*/
			}
			else if(i==6) {
				cb7.setText(names[i]);
				cb7.setEnabled(true);
				contentPane.add(cb7);
			/*	if(d==4) {
				cb7.setVisible(false);
				
			    }*/
			}
			else if(i==7) {
				cb8.setText(names[i]);
				cb8.setEnabled(true);	
				contentPane.add(cb8);
				
				/*if(d==3) {
				cb8.setVisible(false);
				
				}*/
			}else if(i==8 ) {
				cb9.setText(names[i]);
				cb9.setEnabled(true);	
				contentPane.add(cb9);
			/*	if(d==2) {
				cb9.setVisible(false);
				
				}*/
			}else if(i==9) {			
				cb10.setText(names[i]);
				cb10.setEnabled(true);
				contentPane.add(cb10);
			/*	if(d==1) {				
				cb10.setVisible(false);
				
				}*/
				
			}
			
		}
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(cb1.isSelected()) {
					String	mis1=cb1.getText();
					int count=0;
					while(qd.ml[count]!="") {
						count++;
											}
					qd.ml[count]=mis1;
					}
				if(cb2.isSelected()) {
					String	mis2=cb2.getText();
					int count=0;
					while(qd.ml[count]!="") {
						count++;
											}
					qd.ml[count]=mis2;
					}
				if(cb3.isSelected()) {
					String	mis3=cb3.getText();
					int count=0;
					while(qd.ml[count]!="") {
						count++;
											}
					qd.ml[count]=mis3;
					}
				if(cb4.isSelected()) {
					String	mis4=cb4.getText();
					int count=0;
					while(qd.ml[count]!="") {
						count++;
											}
					qd.ml[count]=mis4;
					}
				if(cb5.isSelected()) {
					String	mis5=cb5.getText();
					int count=0;
					while(qd.ml[count]!="") {
						count++;
											}
					qd.ml[count]=mis5;
					}
				if(cb6.isSelected()) {
						String	mis6=cb6.getText();
						int count=0;
						while(qd.ml[count]!="") {
							count++;
												}
						qd.ml[count]=mis6;
					}
				if(cb7.isSelected())
					{
						String	mis7=cb7.getText();
						int count=0;
						while(qd.ml[count]!="") {
							count++;
												}
						qd.ml[count]=mis7;
					}
				if(cb8.isSelected()) {
						String	mis8=cb8.getText();
						int count=0;
						while(qd.ml[count]!="") {
							count++;
												}
						qd.ml[count]=mis8;
					}
				if(cb9.isSelected()) {
						String	mis9=cb9.getText();
						int count=0;
						while(qd.ml[count]!="") {
							count++;
												}
						qd.ml[count]=mis9;
					}
				if(cb10.isSelected()) {
						String	mis10=cb10.getText();
						int count=0;
						while(qd.ml[count]!="") {
							count++;
												}
						qd.ml[count]=mis10;
					}
				//String[] missioners=qd.ml;
				VotingData vd=new VotingData();
				Voting1 k = new Voting1(vd,qd,curr,a);						
                k.dispose();
				k.setVisible(true);
			}
		});
		btnNewButton.setBounds(349, 305, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		}	
			
			
		
		 
		
		
		

	
	
	
  //public void setNoMissioners(int n ) {
	  
	//  this.mis_num=n;  
	 
//  }
  
  
	  
  
  
 // public int getNoMissioners() {
	//  return this.mis_num;
  //}
}
