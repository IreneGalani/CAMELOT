import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class OthoniLolTarg extends JFrame {
    private boolean clickLol = false;
    private boolean clickTarg= false;
    private JButton ok;
    private final JLabel label = new JLabel("\u0395\u03BD\u03B5\u03C1\u03B3\u03BF\u03C0\u03AF\u03B7\u03C3\u03B7 \u0395\u03B9\u03B4\u03B9\u03BA\u03CE\u03BD \u039A\u03B1\u03BD\u03CC\u03BD\u03C9\u03BD");
	
    Special_Rules a = new Special_Rules(false,false);
    public OthoniLolTarg (){
		super("Othoni me tis epiloges LoL & Targeting");
		ImageIcon icon1 = new ImageIcon("C:\\Users\\Bill\\workspace\\javauidemo\\imgs\\left.png");
		JRadioButton cb1 = new JRadioButton("Lady Of the Lake");                                        //Plhktro Lady of the lake 
		cb1.setForeground(Color.WHITE);
		cb1.setOpaque(false);
		cb1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cb1.setBounds(101,116, 179,50);  
        JRadioButton cb2 = new JRadioButton("Targeting");           // Plhktro Targeting
        cb2.setForeground(Color.WHITE);
        cb2.setOpaque(false);
        cb2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cb2.setBounds(101,221, 179,50);  
        JButton ok = new JButton(icon1);                     //Plhktro epistrofhs gia na gurisei pisw sth othoni arxiko menou
        ok.setOpaque(false);
        ok.setBounds(43,344,70, 33); 
        getContentPane().add(cb1);  
        getContentPane().add(cb2);  
        getContentPane().add(ok);
        setSize(350,500);  
        getContentPane().setLayout(null);  
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD, 16));
        label.setBounds(43, 35, 252, 40);
        
        getContentPane().add(label);
        
        //JLabel label1 = new JLabel("");
        //label1.setBounds(0, 0, 384, 361);
        //getContentPane().add(label1);
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	cb1.addActionListener(new ActionListener(){                             //Edw ginetai o elegxos ths epiloghs gia to plhktro Lady of the lake kai h apothikeush epiloghs.                            
		public void actionPerformed (ActionEvent e) {
			
		
			if ((e.getSource()==cb1) && (clickLol==false) ){
				clickLol = true;
				//Special_Rules a = new Special_Rules(true,"Lady_of_the_Lake");
				//Special_Rules a = new Special_Rules(true,false);
				//a.IsOnl = true;
				a.setIsOnl(true);
				a.storeSpecialrules();
				boolean x = a.getIsOnl();
				//System.out.println(x);

				
			}else if ((e.getSource()==cb1) && (clickLol==true)) {
			clickLol = false;
			//Special_Rules a = new Special_Rules(false,false);
			//a.IsOnl = false;
			a.setIsOnl(false);
			a.storeSpecialrules();
			boolean x = a.getIsOnl();
			//System.out.println(x);
			}else{
				clickLol = false;
				//Special_Rules a = new Special_Rules(false,false);
				//a.IsOnl = false;
				a.setIsOnl(false);
				a.storeSpecialrules();
			}
			//setLol(clickLol);
			//System.out.println(getbtLoL());
		}
		
	});
	
	cb2.addActionListener(new ActionListener(){                            //Edw ginetai o elegxos epiloghs gia to plhktro Targeting kai h apothikeush ths epiloghs
		public void actionPerformed (ActionEvent e) { 
			if ((e.getSource()==cb2) && (clickTarg==false) ){
				clickTarg = true;
				
				//Special_Rules a = new Special_Rules(false,true);
				//a.IsOnt = true;
				a.setIsOnt(true);
				a.storeSpecialrules();
				boolean x = a.getIsOnt();
				//System.out.println(x);
				//a.checkTargeting();
				
			}else if ((e.getSource()==cb2) && (clickTarg==true)) {
				clickTarg = false;
				//Special_Rules a = new Special_Rules(false,false);
				//a.IsOnt = false;
				a.setIsOnt(false);
				a.storeSpecialrules();
				boolean x = a.getIsOnt();
				//System.out.println(x);
				}else{
					clickTarg = false;
					//Special_Rules a = new Special_Rules(false,false);
					//a.IsOnt = false;
					a.setIsOnt(false);
					a.storeSpecialrules();
					boolean x = a.getIsOnt();
					//System.out.println(x);
				}
			//setTarg(clickTarg);
			//System.out.println(getTarg());
		}
		});
	ok.addActionListener(new ActionListener(){               //Elegxos epiloghs gia to plhktro epistrofhs.
		public void actionPerformed (ActionEvent e) { 
			if (e.getSource()==ok){
				dispose();
				new ArxikoMenuOth(a);
			}
			
		}
		});
	JLabel label1 = new JLabel("");
    getContentPane().add(label1);
    Image img1 = new ImageIcon(this.getClass().getResource("/mauro.jpg")).getImage();
    label1.setIcon(new ImageIcon(img1));
    label1.setBounds(0, 0, 334, 461);
    getContentPane().add(label1);
	
} //edw kleinei o constructor
	
	public void setLol( boolean clickLol){
		this.clickLol = clickLol;
	}
	public void setTarg( boolean clickTarg){
		this.clickTarg = clickTarg;
	}
	public boolean getbtLoL(){
		return this.clickLol;
		}
	
	public boolean getTarg(){
		return this.clickTarg;
		}
	}

