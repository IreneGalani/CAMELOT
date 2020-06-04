import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pickcard1 extends JFrame{

	int count;
	QuestChoiceData qd;
	Current_Game curr;
	Special_Rules a;
	QuestOutcome qo;
	VotingData vd;
	Score scr;
	boolean f=false;

	public pickcard1(QuestChoiceData qd,Current_Game curr, Special_Rules a,VotingData vd,QuestOutcome qo,Score scr) {
		this.qd=qd;
		this.curr =  curr;
		this.a = a;
        this.qo=qo;
        this.vd=vd;
        this.scr=scr;
	
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null);
		setVisible(true);
		count=0;
		int k=qd.getMLen();
		
		JLabel lblNewLabel = new JLabel("\u0395\u03A0\u0399\u039B\u039F\u0393\u0397 \u039A\u0391\u03A1\u03A4\u0391\u03A3 \u0391\u03A0\u039F\u03A3\u03A4\u039F\u039B\u0397\u03A3");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(64, 29, 325, 23);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setText(qd.ml[qd.getHasVoted()]);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(20, 112, 109, 34);
		getContentPane().add(lblNewLabel_1);
		
		JRadioButton infavor = new JRadioButton("success");
		infavor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infavor.setBorderPainted(true);
			}
		});
		infavor.setForeground(Color.GREEN);
		infavor.setOpaque(false);
		infavor.setBounds(133, 121, 109, 23);
		Image img1 = new ImageIcon(this.getClass().getResource("/infavor.png")).getImage();
		infavor.setIcon (new ImageIcon(img1));
		getContentPane().add(infavor);
		infavor.setBackground(Color.LIGHT_GRAY);
		
		
		JRadioButton against = new JRadioButton("fail");
		against.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				against.setBorderPainted(true);
			}
		});
		against.setForeground(Color.RED);
		against.setOpaque(false);
		Image img2= new ImageIcon(this.getClass().getResource("/against.png")).getImage();
		against.setIcon (new ImageIcon(img2));	
		against.setBounds(300, 121, 89, 23);
		
		
		against.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(against);
		
		ButtonGroup bg =new ButtonGroup();
		bg.add(infavor);
		bg.add(against);
		
		JButton btnNewButton_2 = new JButton("");
		Image img3 = new ImageIcon(this.getClass().getResource("/next.png")).getImage();
		btnNewButton_2.setIcon (new ImageIcon(img3));	
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int v=0;
				if (infavor.isSelected()) {
					f=true;
				   qd.saveMissionersVoted(1);
				   v=qd.getHasVoted();
				  
				} else if (against.isSelected()) {
					   f=false;
					   qd.saveMissionersVoted(1);
					   v=qd.getHasVoted();
					   qo.setfails();
			} else {
				JOptionPane.showMessageDialog(null, "ΠΡΕΠΕΙ ΝΑ ΨΗΦΙΣΕΙΣ ΤΩΡΑ !!");
			}
				if (v==qd.getMLen()) {
					if (qo.getfails()==0) {
						scr.addg();
					} else {
						scr.adde();
					}
					dispose();
					print_score1 jfrm=new print_score1(qd,curr,a,vd,qo,scr);
					jfrm.setVisible(true);
						
				 } else {
				    dispose();
					pickcard1 pk=new pickcard1(qd,curr,a,vd,qo,scr);
					pk.setVisible(true);
				 }
			}
		});
		btnNewButton_2.setBounds(335, 212, 89, 23);
		getContentPane().add(btnNewButton_2);

	    JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 434, 263);
		Image img = new ImageIcon(this.getClass().getResource("/softeng.png")).getImage();
        lblNewLabel_2.setIcon (new ImageIcon(img));	
		getContentPane().add(lblNewLabel_2);
	}
}