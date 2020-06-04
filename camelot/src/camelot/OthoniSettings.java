package camelot;

import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class OthoniSettings extends JFrame {

	boolean btb1 ;
	boolean btb2 ;
	boolean btb3 ;
	boolean btb4 ;
	boolean btb5 ;
	Special_Rules a;
	Settings sett ;
	public OthoniSettings(Special_Rules a,Settings sett){
		this.a = a;
		this.sett=sett;
		Image icon1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
		getContentPane().setLayout(null);
		ButtonGroup bg = new ButtonGroup();
		JRadioButton bt1 = new JRadioButton("Ένταση Αφήγησης");
		bt1.setOpaque(false);
		bt1.setForeground(Color.RED);
		bt1.setBounds(77,92,215,50);
		bt1.setFont(new Font("Tahoma", Font.BOLD, 16));
        getContentPane().add(bt1);
        JRadioButton bt2 = new JRadioButton("Ήχος Πολυμέσων");
        bt2.setOpaque(false);
        bt2.setForeground(Color.RED);
        bt2.setBounds(77,152,178, 50);
        bt2.setFont(new Font("Tahoma", Font.BOLD, 16));
        getContentPane().add(bt2);
        JRadioButton bt3 = new JRadioButton("Γλώσσα");
        bt3.setOpaque(false);
        bt3.setForeground(Color.RED);
        bt3.setBounds(77,205,168, 50);
        bt3.setFont(new Font("Tahoma", Font.BOLD, 16));
        getContentPane().add(bt3);
        JRadioButton bt4 = new JRadioButton("Notifications");
        bt4.setOpaque(false);
        bt4.setForeground(Color.RED);
        bt4.setBounds(77,258,350, 50);
        bt4.setFont(new Font("Tahoma", Font.BOLD, 16));
        getContentPane().add(bt4);
        JRadioButton bt5 = new JRadioButton("Έξοδος");
        bt5.setOpaque(false);
        bt5.setForeground(Color.RED);
        bt5.setBounds(77,312,215, 50);
        bt5.setFont(new Font("Tahoma", Font.BOLD, 16));
        getContentPane().add(bt5);
        JButton ok = new JButton();
        ok.setIcon(new ImageIcon(icon1));
        ok.setOpaque(false);
        ok.setBounds(221,405,90, 33);
        ok.setFont(new Font("Tahoma", Font.PLAIN,14));
        getContentPane().add(ok);
        bg.add(bt1);bg.add(bt2);bg.add(bt3);bg.add(bt4);bg.add(bt5);
JLabel lblSettings = new JLabel("Settings");
lblSettings.setForeground(Color.RED);
lblSettings.setFont(new Font("Tahoma", Font.BOLD, 20));
lblSettings.setBounds(102, 35, 99, 40);
getContentPane().add(lblSettings);
//JLabel label4 = new JLabel("");
//label4.setBounds(0, 2, 334, 461);
//getContentPane().add(label4);
        setSize(350,500);       
		setVisible(true);    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) { 
				if ((e.getSource()==bt1) && (btb1 == false)) {
					 btb1 = true;
				}else if ((e.getSource()==bt1) && (btb1 == true)){
					btb1 = false;}
			}
			});
		bt2.addActionListener(new ActionListener(){
           public void actionPerformed (ActionEvent e) { 
        	   if ((e.getSource()==bt2) && (btb2 == false)) {
					 btb2 = true;
				}else if ((e.getSource()==bt2) && (btb2 == true)){
					btb2 = false;}
			}
			});
		bt3.addActionListener(new ActionListener(){
	           public void actionPerformed (ActionEvent e) { 
	        	   if ((e.getSource()==bt3) && (btb3 == false)) {
						 btb3 = true;
					}else if ((e.getSource()==bt3) && (btb3 == true)){
						btb3 = false;}
				
				}
				});
		bt4.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				if ((e.getSource()==bt4) && (btb4 == false)) {
					 btb4 = true;
				}else if ((e.getSource()==bt4) && (btb4 == true)){
					btb4 = false;}
				
				}
			});
		bt5.addActionListener(new ActionListener(){
	           public void actionPerformed (ActionEvent e){
				
	        	   if ((e.getSource()==bt5) && (btb5 == false)) {
						 btb5 = true;
					}else if ((e.getSource()==bt5) && (btb5 == true)){
						btb5 = false;}
				}
				});
		ok.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				if ((e.getSource()==ok) && (btb1==true) ){
					dispose();
					othoniEntashAfhghshs entaf = new othoniEntashAfhghshs(sett);
				}else if ((e.getSource()==ok) && (btb2==true) ){
					dispose();
					OthoniHxosPolu oh = new OthoniHxosPolu(sett);
				}else if ((e.getSource()==ok) && (btb3==true) ){
					dispose();
					OthoniGlwssas glwssa = new OthoniGlwssas(sett);
				}else if ((e.getSource()==ok) && (btb4==true) ){
					dispose();
					OthoniNotific noti = new OthoniNotific(sett);
				}else if ((e.getSource()==ok) && (btb5==true) ) {
					dispose();
					 new ArxikoMenuOth(a);
				}
				
				}
			});
		JLabel label4 = new JLabel("");
		 getContentPane().add(label4);
	        Image img1 = new ImageIcon(this.getClass().getResource("/im2.jpg")).getImage();
	        label4.setIcon(new ImageIcon(img1));
	        label4.setBounds(0, 0, 334, 461);
	        getContentPane().add(label4);
	        //getContentPane().add(label4);

	}
}