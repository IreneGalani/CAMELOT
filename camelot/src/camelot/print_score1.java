import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class print_score1 extends JFrame {

	 Score scr;
     QuestOutcome qo;
     Current_Game curr;
     Special_Rules a;
     QuestChoiceData qd;
     VotingData vd;
     boolean lol;
     int fails;
     

	public print_score1(QuestChoiceData qd,Current_Game curr, Special_Rules a,VotingData vd,QuestOutcome qo,Score scr) {
		this.qo=qo;
        this.qd=qd;
        this.a=a;
        this.vd=vd;
        this.curr=curr;
        this.scr=scr;
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		setResizable(false);

		
		JButton btnNewButton = new JButton("");
		Image img1 = new ImageIcon(this.getClass().getResource("/next.png")).getImage();
		btnNewButton.setIcon (new ImageIcon(img1));
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setBounds(252, 197, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public  void actionPerformed(ActionEvent e2) {
				lol=a.checkLoL();
				fails=qo.getfails();
				int x;
				boolean mer = false;
				for (int i=0;i<curr.role.length;i++) {
					if(curr.role[i].checkformerlin()) {
						mer = curr.role[i].checkformerlin();
						break;
					}
				}
				x=qo.checkCompleted();
				QuestOutcome qo1=new QuestOutcome();
			if(x==0) {
					qo1.setCompletedQuests(1);
					int quest=qd.getCount();
					QuestChoiceData qd=new QuestChoiceData();
					if(quest ==1) {
						qd.setCountQuest(2);
						if(a.checkTargeting()) {
							ChooseQuest cq = new ChooseQuest(qd, curr, a,vd,qo1,scr);
							dispose();
							cq.setVisible(true);
						} else {
							ChooseMissioners cm = new ChooseMissioners(qd, curr, a, vd,qo1,scr);
							dispose();
							cm.setVisible(true);
						}
					} 
			}else if(x==1) {
				qo1.setCompletedQuests(2);

				if (lol==true) {
					dispose();
					curr.player[0].setNewLady();
					IsLadyOfTheLake isLoL=new IsLadyOfTheLake(qd, curr ,a ,vd,qo1,scr);
					isLoL.setVisible(true);
				}else {
					int quest=qd.getCount();
					QuestChoiceData qd=new QuestChoiceData();
					if(quest ==2) {
						qd.setCountQuest(3);
						if(a.checkTargeting()) {
							ChooseQuest cq = new ChooseQuest(qd, curr ,a ,vd,qo1,scr);
							dispose();
							cq.setVisible(true);
						} else {
							ChooseMissioners cm = new ChooseMissioners(qd, curr, a,vd,qo1,scr);
							dispose();
							cm.setVisible(true);
						}
					}
				}
			  } else if(x==2) {
					qo1.setCompletedQuests(3);

				if (lol==true) {
					dispose();
					IsLadyOfTheLake isLoL=new IsLadyOfTheLake(qd,curr,a,vd,qo1,scr);
					isLoL.setVisible(true);
				} else {
					if(scr.evilSc==3) {
						dispose();
						evilwins1 evil=new evilwins1(curr);
						evil.setVisible(true);
					} else if (scr.goodSc==3){
						if(mer) {
							dispose();
							evillastchance last=new evillastchance(curr);
							last.setVisible(true);
						} else {
							dispose();
							goodwins1 good=new goodwins1(curr);
							good.setVisible(true);
						}
						
					} else {
						int quest=qd.getCount();
						QuestChoiceData qd=new QuestChoiceData();
						if(quest ==3) {
							qd.setCountQuest(4);
							if(a.checkTargeting()) {
								ChooseQuest cq = new ChooseQuest(qd, curr, a,vd,qo1,scr);
								dispose();
								cq.setVisible(true);
							} else {
								ChooseMissioners cm = new ChooseMissioners(qd, curr, a,vd,qo1,scr);
								dispose();
								cm.setVisible(true);
							}
						} 
					}
				}
				
			}else if (x==3) {
				qo.setCompletedQuests(4);
				if (lol==true) {
					dispose();
					IsLadyOfTheLake isLoL=new IsLadyOfTheLake(qd,curr,a,vd,qo1,scr);
					isLoL.setVisible(true);
				} else {
					if(scr.evilSc==3) {
						dispose();
						evilwins1 evil=new evilwins1(curr);
						evil.setVisible(true);
					} else if (scr.goodSc==3){
						if(mer) {
							dispose();
							evillastchance last=new evillastchance(curr);
							last.setVisible(true);
						} else {
							dispose();
							goodwins1 good=new goodwins1(curr);
							good.setVisible(true);
						}
						
					}else {
						int quest=qd.getCount();
						QuestChoiceData qd=new QuestChoiceData();
						if(quest ==4) {
							qd.setCountQuest(5);
							if(a.checkTargeting()) {
								ChooseQuest cq = new ChooseQuest(qd, curr, a,vd,qo1,scr);
								dispose();
								cq.setVisible(true);
							} else {
								ChooseMissioners cm = new ChooseMissioners(qd, curr, a,vd,qo1,scr);
								dispose();
								cm.setVisible(true);
							}
						} 
					}
				}
			}else if(x==4) {
			     qo1.setCompletedQuests(5);
			     if(scr.evilSc==3) {
					dispose();
					evilwins1 evil=new evilwins1(curr);
					evil.setVisible(true);
					
				} 
				if (scr.goodSc==3){
					if(mer) {
						dispose();
						evillastchance last=new evillastchance(curr);
						last.setVisible(true);
					} else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					
		            }	
			}}});
		
		getContentPane().add(btnNewButton);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setText("Το σκορ είναι  " + String.valueOf(scr.getGoodSc()) +"-" +  String.valueOf(scr.getEvilSc()));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setBounds(91, 110, 214, 84);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(85, 96, 46, 14);
		lblNewLabel_1.setText(String.valueOf(scr.getGoodSc()));
		Image img2 = new ImageIcon(this.getClass().getResource("/infavor.png")).getImage();
		lblNewLabel_1.setIcon (new ImageIcon(img2));
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2.setBounds(241, 96, 46, 14);
		lblNewLabel_2.setText(String.valueOf(scr.getEvilSc()));
		Image img3 = new ImageIcon(this.getClass().getResource("/against.png")).getImage();
		lblNewLabel_2.setIcon (new ImageIcon(img3));
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u0391\u03A0\u039F\u03A4\u0395\u039B\u0395\u03A3\u039C\u0391 \u0391\u03A0\u039F\u03A3\u03A4\u039F\u039B\u0397\u03A3 ");
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblNewLabel_3.setBounds(82, 41, 282, 28);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setForeground(Color.GRAY);
		lblNewLabel_4.setBounds(0, 0, 434, 246);
		Image img = new ImageIcon(this.getClass().getResource("/softeng.png")).getImage();
		lblNewLabel_4.setIcon (new ImageIcon(img));
		getContentPane().add(lblNewLabel_4);
}

}