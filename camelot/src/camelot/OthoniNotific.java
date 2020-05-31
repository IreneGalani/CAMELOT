package camelot;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Color;

public class OthoniNotific extends JFrame {

	Settings sett ;
	boolean boo = false;
	Special_Rules a;
	
	public OthoniNotific(Settings sett){
		this.sett = sett;
		
		JLabel l1=new JLabel("Notifications");  
		l1.setForeground(Color.RED);
	    l1.setFont(new Font("Tahoma", Font.BOLD, 20));
	    l1.setBounds(93,29, 148,54);
	    getContentPane().add(l1);
	    JRadioButton on = new JRadioButton("ON",true);
	    on.setOpaque(false);
	    on.setForeground(Color.RED);
		on.setBounds(118,101,90,50);
		on.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(on);
        JRadioButton off = new JRadioButton("OFF");
        off.setOpaque(false);
        off.setForeground(Color.RED);
        off.setBounds(118,180,90, 50);
        off.setFont(new Font("Tahoma", Font.BOLD, 16));
        getContentPane().add(off);
        ButtonGroup bg=new ButtonGroup();
        bg.add(on);bg.add(off);
        JButton ok = new JButton("OK");
        ok.setBounds(118,308,90, 40);
        ok.setFont(new Font("Tahoma", Font.PLAIN,14));
        getContentPane().add(ok);
        on.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e) {
   			sett.getIs_on_n();
   			}
   		});
        off.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e) {
            	boo = true;
            	sett.Is_on_n = false;
            	sett.getIs_on_n();
   			//s.storeNotific(false);
   			}
   		});
        ok.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e) {
            	if ((e.getSource()==ok) && (boo==false)){
            		sett.storeNotific(true);
            		dispose();
   			        new OthoniSettings(a,sett);
   			}else if ((e.getSource()==ok) && (boo==true)){
   				sett.storeNotific(false);
   				dispose();
   			    new OthoniSettings(a,sett);
   			}
   			}
   		});
        setSize(350,500);  
        getContentPane().setLayout(null);  
        
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label5 = new JLabel("");
        getContentPane().add(label5);
        Image img1 = new ImageIcon(this.getClass().getResource("/im2.jpg")).getImage();
        label5.setIcon(new ImageIcon(img1));
        label5.setBounds(0, 0, 334, 461);
        getContentPane().add(label5);
        getContentPane().add(label5);
        
        
		
	}
}