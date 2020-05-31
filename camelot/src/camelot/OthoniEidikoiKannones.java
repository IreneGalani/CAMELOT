package camelot;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Font;
import java.awt.Image;

public class OthoniEidikoiKannones extends JFrame {
	private final JLabel label2 ;
	Special_Rules a;
	
	
	
	public OthoniEidikoiKannones(){
		
		super("Othoni Eidikoi Kanones");
		getContentPane().setLayout(null);
		JButton bt1 = new JButton("Ενεργοποίηση Ειδικών Κανόνων");
		bt1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bt1.setBounds(38,124,250,40);
        getContentPane().add(bt1);
        JButton x = new JButton("Έξοδος");
        x.setFont(new Font("Tahoma", Font.PLAIN, 14));
        x.setBounds(114,254,100, 40);
        getContentPane().add(x);
        
        setSize(350,500);       
		setVisible(true);    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				dispose();
				OthoniLolTarg a = new OthoniLolTarg();
				//a.getbtLol();
				
			}
			
		});
		x.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				dispose();
				ArxikoMenuOth ab = new ArxikoMenuOth(a);
				
			}
			
		});
		label2 = new JLabel("");
		getContentPane().add(label2);
		Image img1 = new ImageIcon(this.getClass().getResource("/im2.jpg")).getImage();
		label2.setIcon(new ImageIcon(img1));
        label2.setBounds(0, 0, 334, 461);
        getContentPane().add(label2);
        
}
	public void addActivate(){
		
	}
}