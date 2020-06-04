package camelot;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;


public class OthoniGlwssas extends JFrame {

Settings sett;	
boolean boo = true;
Special_Rules a;
	public OthoniGlwssas(Settings sett){
		this.sett = sett;
		
		JLabel l1=new JLabel("Επιλογή Γλώσσας");  
		l1.setForeground(Color.RED);
	    l1.setFont(new Font("Tahoma", Font.BOLD, 18));
	    l1.setBounds(87,41, 182,30);
	    getContentPane().add(l1);
	    JRadioButton bt1 = new JRadioButton("Ελληνικά",true);
	    bt1.setOpaque(false);
	    bt1.setForeground(Color.RED);
		bt1.setBounds(117,118,123,50);
		bt1.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(bt1);
        JRadioButton bt2 = new JRadioButton("Αγγλικά");
        bt2.setOpaque(false);
        bt2.setForeground(Color.RED);
        bt2.setBounds(117,171,121, 50);
        bt2.setFont(new Font("Tahoma", Font.BOLD, 14));
        getContentPane().add(bt2);
        ButtonGroup bg=new ButtonGroup();
        bg.add(bt1);bg.add(bt2);
        JButton ok = new JButton("OK");
        ok.setBounds(121,279,90, 40);
        ok.setFont(new Font("Tahoma", Font.PLAIN,14));
        getContentPane().add(ok);
        bt1.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e) {
   			 boo = true;
   			sett.getLang();
   			//set.storeLang("Ελληνικά");
   			}
   		});
        ok.addActionListener(new ActionListener(){
         public void actionPerformed (ActionEvent e) {
			if((e.getSource()==ok) && (boo==true))
				sett.getLang();
				sett.storeLang("Greek");
				dispose();
			 new OthoniSettings(a,sett);
			}
		});
	    setSize(350,500);  
        getContentPane().setLayout(null);  
        setResizable(false);
        
        
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label3 = new JLabel("");
        getContentPane().add(label3);
        Image img1 = new ImageIcon(this.getClass().getResource("/im2.jpg")).getImage();
        label3.setIcon(new ImageIcon(img1));
        label3.setBounds(0, 0, 334, 461);
        getContentPane().add(label3);
        getContentPane().add(label3);
        
        
        
		
        
	}
}