package camelot;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Color;

public class OthoniHxosPolu extends JFrame {

	Settings sett ;
	boolean btb= true;
	Special_Rules a;
	public OthoniHxosPolu(Settings sett){
		this.sett = sett;
		
		getContentPane().setLayout(null);
		ButtonGroup bg = new ButtonGroup();
		JRadioButton bt1 = new JRadioButton("ON",true);
		bt1.setOpaque(false);
		bt1.setForeground(Color.RED);
		JLabel l = new JLabel("Ήχος Πολυμέσων");
		l.setForeground(Color.RED);
		l.setFont(new Font("Tahoma", Font.BOLD, 18));
	    l.setBounds(82,50, 185,30);
	    getContentPane().add(l);
		bt1.setBounds(118,116,114,50);
		bt1.setFont(new Font("Tahoma", Font.BOLD, 16));
        getContentPane().add(bt1);
        JRadioButton bt2 = new JRadioButton("OFF");
        bt2.setOpaque(false);
        bt2.setForeground(Color.RED);
        bt2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bt2.setBounds(116,183,128,50);
		bt1.setFont(new Font("Tahoma", Font.PLAIN,14));
        getContentPane().add(bt2);
        bg.add(bt1); bg.add(bt2);
        JButton ok = new JButton("OK");
        ok.setBounds(114,304,90, 40);
        ok.setFont(new Font("Tahoma", Font.PLAIN,14));
        getContentPane().add(ok);
        
        bt1.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e) {
            	if (e.getSource()==bt1) {
            		btb = true;
					 //set.storeaudio(true);
					sett.getIs_On_hx();
				}
   			
   			}
   		});
        bt2.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e) {
   			
            	if (e.getSource()==bt2)  {
					 btb = false;
					// set.storeaudio(false);
					 
					 sett.getIs_On_hx();
				}
  			
   			}
   		});
        ok.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e) {
            	if ((e.getSource()==ok) && (btb==true))
            	{
   			        sett.storeaudio(true);
   			        dispose();
   			         new OthoniSettings(a,sett);
   			         }
   			       else if((e.getSource()==ok) && (btb==false)){
   				     sett.storeaudio(false);
   			}
            	dispose();
   			      new OthoniSettings(a,sett);
   			
            	}
   			});
        setSize(350,500);       
		setVisible(true);    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		JLabel label6 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/im2.jpg")).getImage();
		label6.setIcon(new ImageIcon(img1));
        label6.setBounds(0, 0, 334, 461);
        getContentPane().add(label6);
        
        
        
		
	}
}