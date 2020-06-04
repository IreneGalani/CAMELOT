import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseQuest extends JFrame {
	private int mis;
	private int nP;
	private String s;
	public int q;
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
	private JPanel contentPane;
	private int i=1;
  public String led;
	QuestChoiceData qd;
	Current_Game curr;
	VotingData vd;
	QuestOutcome qo;
	Score scr;
    Special_Rules a;
    

	public ChooseQuest (QuestChoiceData qd,Current_Game curr, Special_Rules a,VotingData vd,QuestOutcome qo,Score scr) {
		this.curr=curr;
		this.a=a;
		this.qd=qd;
		this.vd=vd;
		this.qo=qo;
		this.scr=scr;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 500);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	  
		JLabel message = new JLabel();
		message.setForeground(Color.WHITE);
		message.setFont(new Font("Tahoma", Font.PLAIN, 15));
		message.setText("Επιλογή Αποστολής από τον/την");
		message.setBounds(10, 24, 215, 33);
		contentPane.add(message);
		 led=curr.VoteFails();

			  JLabel leader = new JLabel(led);
		         leader.setBounds(228, 24, 130, 33);
		 		leader.setForeground(Color.WHITE);
		         leader.setFont(new Font("Tahoma", Font.PLAIN, 15));
		         contentPane.add(leader);

		setSize(422,547);
		JRadioButton rb1 = new JRadioButton();
		rb1.setOpaque(false);
		rb1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rb1.setForeground(Color.WHITE);
		rb1.setBounds(95, 80, 233, 23);
		if(curr.isQb1()) {
		rb1.setEnabled(true);
		}
		else {
			rb1.setEnabled(false);
		}
		rb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((e.getSource()==rb1)&& (q1==false)) {
					b1= true;
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
		
		
		JRadioButton rb2 = new JRadioButton();
		rb2.setOpaque(false);
		rb2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rb2.setForeground(Color.WHITE);
		rb2.setBounds(95, 150, 160, 23);
		if(curr.isQb2()) {
		rb2.setEnabled(true);
		}
		else {
			rb2.setEnabled(false);
		}
		rb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if((e.getSource()==rb2)&& (q2==false)) {
                  q2=true;
                  b2 = true;
                  setMis(2);
                  qd.stMissioners(getMis());
                  
                    
                	
                }
                else if((e.getSource()==rb2)&& (q2==true)) {
                	b2 = false;
                    ((JRadioButton)e.getSource()).setSelected(false);
              }
				
			}
		});
		setMis(2);
		 rb2.setText("Q 2:"+getMis()+" missioners");
		contentPane.add(rb2);

		setMis(3);
		JRadioButton rb3 = new JRadioButton();
		rb3.setOpaque(false);
		rb3.setForeground(Color.WHITE);
		rb3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rb3.setBounds(95, 220, 193, 23);
		if(curr.isQb3()) {
		rb3.setEnabled(true);
		}
		else {
			rb3.setEnabled(false);
		}
		rb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 if((e.getSource()==rb3)&& (q3==false)) {
                	q3=true;
                	b3 = true;
               
                	setMis(3);
                    qd.stMissioners(getMis());
              
                 }
                 else if((e.getSource()==rb3)&& (q3==true)) {
                	 b3 = false;
                    ((JRadioButton)e.getSource()).setSelected(false);
              }
			}
		});
		rb3.setText("Q 3:"+getMis()+" missioners");
		contentPane.add(rb3);
		
		
		setMis(4);
		JRadioButton rb4 = new JRadioButton();
		rb4.setOpaque(false);
		rb4.setForeground(Color.WHITE);
		rb4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rb4.setBounds(97, 290, 203, 23);
		if(curr.isQb4()) {
		rb4.setEnabled(true);
		}
		else {
			rb4.setEnabled(false);
		}
		rb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 if((e.getSource()==rb4)&& (q4==false)) {
                	 b4 = true;
                	q4=true;
                
                	setMis(4);
                    qd.stMissioners(getMis());
                	
                 }
                 else if((e.getSource()==rb4)&& (q4==true)) {
                	 b4 = false;
                  
                    ((JRadioButton)e.getSource()).setSelected(false);
              }
			}
		});
		rb4.setText("Q 4:"+getMis()+" missioners");
		contentPane.add(rb4);
		
	
		setMis(5);
		getMis();
		JRadioButton rb5 = new JRadioButton();
		rb5.setOpaque(false);
		rb5.setForeground(Color.WHITE);
		rb5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rb5.setBounds(95, 360, 193, 23);
		rb5.setEnabled(false);
		if( qd.getCount()>2 && curr.isQb5()) {
            
            rb5.setEnabled(true);;
		}
		
		rb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((e.getSource()==rb5)&& (q5==false)) {
					 q5=true;
					 b5 = true;
					
	                	setMis(5);
	                    qd.stMissioners(getMis());
	               
		        } 
				else if((e.getSource()==rb5)&& (q5==true)) {
					  ((JRadioButton)e.getSource()).setSelected(false);
					  b5 = false;
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
        
        JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		 	if(!(rb1.isSelected())&&!(rb2.isSelected())&&!(rb3.isSelected())&&!(rb4.isSelected())&&!(rb5.isSelected())) {
		 		JOptionPane.showMessageDialog(null,"Επιλέξτε Aποστολή");
		 	}else {
		 		if (rb1.isSelected()) {
		 		curr.setQb1(false);
		 		rb1.setEnabled(false);
		 	}else if(rb2.isSelected()) {
		 		curr.setQb2(false);
		 		rb2.setEnabled(false);
		 	}else if(rb3.isSelected()) {
		 		curr.setQb3(false);
		 		rb3.setEnabled(false);
		 	}else if(rb4.isSelected()) {
		 		curr.setQb4(false);
		 		rb4.setEnabled(false);
		 	}else if(rb5.isSelected()) {
		 		curr.setQb5(false);
		 		rb5.setEnabled(false);
		 	}
			ChooseMissioners m = new ChooseMissioners(qd,curr,a,vd,qo,scr);						
            dispose();
			m.setVisible(true);
		}}
	});
	
	Image next = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
	btnNewButton.setIcon(new ImageIcon(next));
	btnNewButton.setBounds(318, 484, 90, 26);
	contentPane.add(btnNewButton);
        
        JLabel lblNewLabel = new JLabel("New label");
        Image back = new ImageIcon(this.getClass().getResource("/im2.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(back));
        lblNewLabel.setBounds(0, 0, 408, 510);
        contentPane.add(lblNewLabel);
	}
	public void setMis(int q){
        this.q=q;
    
            if(this.q==1){
            if( curr.getnumPlayers()==5|| curr.getnumPlayers()==6|| curr.getnumPlayers()==7){
            	qd.stMissioners(2);
            	String[]	missioners= {"",""};
              this.mis=2;
              }
            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
            	qd.stMissioners(3);
            	String[]	missioners= {"","",""};

              this.mis=3;
              }
          }
          else if(this.q==2){
              if( curr.getnumPlayers()==5|| curr.getnumPlayers()==6|| curr.getnumPlayers()==7){
              	qd.stMissioners(3);
              	String[]	missioners= {"","",""};

              this.mis=3;
              }
            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
            	qd.stMissioners(4);
            	String[]	missioners= {"","","",""};

              this.mis=4;
              }}
          else if(this.q==3){
          if( curr.getnumPlayers()==5){
          	qd.stMissioners(2);
          	String[]	missioners= {"",""};

              this.mis=2;
              }
            else if( curr.getnumPlayers()==6|| curr.getnumPlayers()==7){
            	qd.stMissioners(3);
            	String[]	missioners= {"","",""};

              this.mis=3;
              }
            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
            	qd.stMissioners(4);
            	String[]	missioners= {"","","",""};

              this.mis=4;
              }
          }
      else if(this.q==4){
         if( curr.getnumPlayers()==5|| curr.getnumPlayers()==6){
         	qd.stMissioners(3);
         	String[]	missioners= {"","",""};

              this.mis=3;
              }
            else if( curr.getnumPlayers()==7){
            	qd.stMissioners(4);
            	String[]	missioners= {"","","",""};

              this.mis=4;
              }
            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
            	qd.stMissioners(5);
            	String[]	missioners= {"","","","",""};

              this.mis=5;
              }}
          else if(this.q==5){
              if( curr.getnumPlayers()==5){
              	qd.stMissioners(3);
              	String[]	missioners= {"","",""};

              this.mis=3;
              }
            else if( curr.getnumPlayers()==7|| curr.getnumPlayers()==6){
            	qd.stMissioners(4);
            	String[]	missioners= {"","","",""};

              this.mis=4;
              }
            else if( curr.getnumPlayers()==8|| curr.getnumPlayers()==9|| curr.getnumPlayers()==10){
            	qd.stMissioners(5);
            	String[]	missioners= {"","","","",""};

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