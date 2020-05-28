package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Image;
import javax.swing.border.EmptyBorder;

import camelot1.Current_Game;
import camelot1.QuestChoiceData;
import camelot1.Special_Rules;

import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChooseQuest extends JFrame {
	private int mis;
	private int nP;
	private String s;
	//private String text;
	public int q;
    public int x;
//	private int j=0;
	private boolean q1=false;
	public boolean b1;
	public boolean b2;
	public boolean b3;
	public boolean b4;
	public boolean b5;
	private boolean q2=false;
	private boolean q3=false;
	private boolean q4=false;
	private boolean q5=false;
	private String name;
	private JPanel contentPane;
	//private int num;
	//private int r_as;
	private int i=1;
  public String led;
	QuestChoiceData qd;
	Current_Game curr;
   // Player p= new Player(name);
    Special_Rules a;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Special_Rules a= new Special_Rules(false,false);
					Current_Game curr= new Current_Game();
					QuestChoiceData qd=new QuestChoiceData();
					
					ChooseQuest frame = new ChooseQuest(qd,curr,a);
					
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
	public ChooseQuest (QuestChoiceData qd,Current_Game curr, Special_Rules a) {
		this.curr=curr;
		this.a=a;
		this.qd=qd;
		ImageIcon icon1 = new ImageIcon("C:\\Users\\301018\\eclipse-workspace\\camelot1\\iiim\\next.png");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	  
		//cg.setnumPlayers(5);
		//p.setUsername("tade");
	    
		JLabel message = new JLabel();
		message.setText("\u0395\u03C0\u03B9\u03BB\u03BF\u03B3\u03AE \u0391\u03C0\u03BF\u03C3\u03C4\u03BF\u03BB\u03AE\u03C2"+qd.getCount());
		message.setBounds(95, 22, 152, 33);
		contentPane.add(message);
		//i++;
		
		  JLabel leader = new JLabel("");
	         leader.setBounds(105, 49, 88, 27);
	         contentPane.add(leader);
	    
	 		if (curr.VoteFails().equals("")) {
	 		    	    	
	 	    }else {
	 		
	 			 led=curr.VoteFails();
	 	    }
	         leader.setText(led);
		JButton btnNewButton = new JButton(icon1);
		btnNewButton.setBounds(199, 376, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 	
				ChooseMissioners m = new ChooseMissioners(qd,curr,a);						
                m.dispose();
				m.setVisible(true);
			}
		});
		contentPane.add(btnNewButton);
	//	q=1;
		setSize(350,500);
		
		JRadioButton rb1 = new JRadioButton();
		rb1.setBounds(95, 83, 109, 23);
		rb1.setEnabled(true);
		rb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((e.getSource()==rb1)&& (q1==false)) {
					b1= true;
                //    j++;Quest quest=new Quest(1,cg.getNum);
                    setMis(1);
                    qd.stMissioners(getMis());
                    q1=true;
                    }
				else if((e.getSource()==rb1)&& (q1==true)){
					b1 = false;
                    ((JRadioButton)e.getSource()).setSelected(false);
              }
			}
		});
		setMis(1);
		rb1.setText("Q 1:"+getMis()+" missioners");
		contentPane.add(rb1);
		
		//q=2;
	//	setMis(2);
	// int x=	getMis();
		JRadioButton rb2 = new JRadioButton();
		rb2.setBounds(95, 123, 109, 23);
		rb2.setEnabled(true);
		rb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if((e.getSource()==rb2)&& (q2==false)) {
                  q2=true;
                  b2 = true;
                  setMis(2);
                  qd.stMissioners(getMis());
                  //  j++;
                    
                	
                }
                else if((e.getSource()==rb2)&& (q2==true)) {
                	b2 = false;
                    ((JRadioButton)e.getSource()).setSelected(false);
              }
				
			}
		});
		 rb2.setText("Q 2:"+getMis()+" missioners");
		contentPane.add(rb2);
		
		//q=3;
		setMis(3);
		JRadioButton rb3 = new JRadioButton();
		rb3.setBounds(95, 168, 109, 23);
		rb3.setEnabled(true);
		rb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 if((e.getSource()==rb3)&& (q3==false)) {
                	q3=true;
                	b3 = true;
                //	q=3;
                	setMis(3);
                    qd.stMissioners(getMis());
                //	setMis(q);
               	// x=getMis();
                  //  j++;
                 }
                 else if((e.getSource()==rb3)&& (q3==true)) {
                	 b3 = false;
                    ((JRadioButton)e.getSource()).setSelected(false);
              }
			}
		});
		rb3.setText("Q 3:"+getMis()+" missioners");
		contentPane.add(rb3);
		
		//q=4;
		setMis(4);
		JRadioButton rb4 = new JRadioButton();
		rb4.setBounds(95, 209, 109, 23);
		rb4.setEnabled(true);
		rb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 if((e.getSource()==rb4)&& (q4==false)) {
                	 b4 = true;
                	q4=true;
                //	q=4;
                	setMis(4);
                    qd.stMissioners(getMis());
                	//setMis(q);
                	
               	// x=getMis();
                  //  j++;
                 }
                 else if((e.getSource()==rb4)&& (q4==true)) {
                	 b4 = false;
                  
                    ((JRadioButton)e.getSource()).setSelected(false);
              }
			}
		});
		rb4.setText("Q 4:"+getMis()+" missioners");
		contentPane.add(rb4);
		
	//	q=5;
		setMis(5);
		getMis();
		JRadioButton rb5 = new JRadioButton();
		rb5.setBounds(95, 253, 109, 23);
		rb5.setEnabled(false);
		if( qd.getCount()>=2) {
            
            rb5.setEnabled(true);;
		}
		
		rb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				             
                
				if((e.getSource()==rb5)&& (q5==false)) {
					 q5=true;
					
	                	setMis(5);
	                    qd.stMissioners(getMis());
	               //	 x=getMis();
		        } 
				else if((e.getSource()==rb5)&& (q5==true)) {
					  ((JRadioButton)e.getSource()).setSelected(false);
		        }
			}
		});
		rb5.setText("Q 5:"+getMis()+" missioners");
		contentPane.add(rb5);
		
		ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        group.add(rb4);
        group.add(rb5);
        
         
        /* JLabel lblNewLabel = new JLabel("");
         getContentPane().add(label);
         lblNewLabel.setBounds(128, 41, 46, 14);
         lblNewLabel.setText(getName());
         contentPane.add(lblNewLabel);*/
         
       /*  JLabel lab = new JLabel("");
         lab.setBounds(0, 0, 334, 461);
         //getContentPane().add(lab);
         Image im1= new ImageIcon(this.getClass().getResource("/targ.jpg")).getImage();
         lab.setIcon(new ImageIcon(im1));
         contentPane.add(lab);
         */
       
      
     /*   if(b1==true) {
        	q=1;
        	setMis(q);
        	int x=getMis();
        	System.out.println(x);
        }else if (b2 ==true) {}
        q=2;
    	setMis(q);
    	 x=getMis();
    	 System.out.println(x);*/
       
	}
	public void setMis(int q){
        this.q=q;
     //   this.nP=numP;
      //  this.numPl=numP;
            if(this.q==1){
            if( curr.getnumPlayers()==5|| curr.getnumPlayers()==6|| curr.getnumPlayers()==7){
              this.mis=2;
              }
            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
              this.mis=3;
              }
          }
          else if(this.q==2){
              if( curr.getnumPlayers()==5|| curr.getnumPlayers()==6|| curr.getnumPlayers()==7){
              this.mis=3;
              }
            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
              this.mis=4;
              }}
          else if(this.q==3){
          if( curr.getnumPlayers()==5){
              this.mis=2;
              }
            else if( curr.getnumPlayers()==6|| curr.getnumPlayers()==7){
              this.mis=3;
              }
            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
              this.mis=4;
              }
          }
      else if(this.q==4){
         if( curr.getnumPlayers()==5|| curr.getnumPlayers()==6){
              this.mis=3;
              }
            else if( curr.getnumPlayers()==7){
              this.mis=4;
              }
            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
              this.mis=5;
              }}
          else if(this.q==5){
              if( curr.getnumPlayers()==5){
              this.mis=3;
              }
            else if( curr.getnumPlayers()==7|| curr.getnumPlayers()==6){
              this.mis=4;
              }
            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
              this.mis=5;
              }
          }
           

}   
	 
	
public int getMis(){
return this.mis;
}
public void StringToInt(int mis){
this.s=String.valueOf(mis);

}
public void setNum(int n) {
	this.nP=n;
}
public int getNum() {
	return this.nP;
}

public String getString(){
return this.s;
}
}
