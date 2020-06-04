package camelot;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;



public class evillastchance extends JFrame {

     Current_Game curr;
    
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					evillastchance window = new evillastchance();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}/*

	/**
	 * Create the application.
	 */
	public evillastchance(Current_Game curr) {
	this.curr=curr;
	
	   
		
		String[] players = curr.getPlayerList();
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 450, 300);
		setSize(350,500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		if(players.length == 5) {
			JRadioButton rd1 = new JRadioButton(players[0]);
			rd1.setForeground(Color.WHITE);
			rd1.setOpaque(false);
			rd1.setBounds(10, 50, 142, 30);
			getContentPane().add(rd1);
			
			JRadioButton rd2 = new JRadioButton(players[1]);
			rd2.setForeground(Color.WHITE);
			rd2.setOpaque(false);
			rd2.setBounds(10, 90, 142, 30);
			getContentPane().add(rd2);
			
			JRadioButton rd3 = new JRadioButton(players[2]);
			rd3.setForeground(Color.WHITE);
			rd3.setOpaque(false);
			rd3.setBounds(10, 130, 142, 30);
			getContentPane().add(rd3);
					
			JRadioButton rd4 = new JRadioButton(players[3]);
			rd4.setForeground(Color.WHITE);
			rd4.setOpaque(false);
			rd4.setBounds(10, 170, 142, 30);
			getContentPane().add(rd4);
			
			JRadioButton rd5 = new JRadioButton(players[4]);
			rd5.setForeground(Color.WHITE);
			rd5.setOpaque(false);
			rd5.setBounds(10, 210, 142, 30);
			getContentPane().add(rd5);
			
		    ButtonGroup bg=new ButtonGroup();
		    bg.add(rd1);
		    bg.add(rd2);
		    bg.add(rd3);
		    bg.add(rd4);
		    bg.add(rd5);
		

			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!(rd1.isSelected())&&!(rd2.isSelected())&&!(rd3.isSelected())&&!(rd4.isSelected())&&!(rd5.isSelected())){
						JOptionPane.showMessageDialog(null, "Eπιλέξτε κάποιον παίκτη!");
					}else {
					if (rd1.isSelected()) {
						if(curr.player[0].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd2.isSelected()) {
						if(curr.player[1].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd3.isSelected()) {
						if(curr.player[2].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd4.isSelected()) {
						if(curr.player[3].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
						}
					}
					if (rd5.isSelected()) {
						if(curr.player[4].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
             	}}});
			Image img1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
		
			
		}else if (players.length == 6) {
			JRadioButton rd1 = new JRadioButton(players[0]);
			rd1.setForeground(Color.WHITE);
			rd1.setOpaque(false);
			rd1.setBounds(10, 50, 142, 30);
			getContentPane().add(rd1);
			
			JRadioButton rd2 = new JRadioButton(players[1]);
			rd2.setForeground(Color.WHITE);
			rd2.setOpaque(false);
			rd2.setBounds(10, 90, 142, 30);
			getContentPane().add(rd2);
			
			JRadioButton rd3 = new JRadioButton(players[2]);
			rd3.setForeground(Color.WHITE);
			rd3.setOpaque(false);
			rd3.setBounds(10, 130, 142, 30);
			getContentPane().add(rd3);
					
			JRadioButton rd4 = new JRadioButton(players[3]);
			rd4.setForeground(Color.WHITE);
			rd4.setOpaque(false);
			rd4.setBounds(10, 170, 142, 30);
			getContentPane().add(rd4);
			
			JRadioButton rd5 = new JRadioButton(players[4]);
			rd5.setForeground(Color.WHITE);
			rd5.setOpaque(false);
			rd5.setBounds(10, 210, 142, 30);
			getContentPane().add(rd5);
			
			JRadioButton rd6 = new JRadioButton(players[5]);
			rd6.setForeground(Color.WHITE);
			rd6.setOpaque(false);
			rd6.setBounds(10, 250, 142, 30);
			getContentPane().add(rd6);
			
			
		    ButtonGroup bg=new ButtonGroup();
		    bg.add(rd1);
		    bg.add(rd2);
		    bg.add(rd3);
		    bg.add(rd4);
		    bg.add(rd5);
		    bg.add(rd6);;
		

			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!(rd1.isSelected())&&!(rd2.isSelected())&&!(rd3.isSelected())&&!(rd4.isSelected())&&!(rd5.isSelected())&&!(rd6.isSelected())){
						JOptionPane.showMessageDialog(null, "Eπιλέξτε κάποιον παίκτη!");
					}else {
					if (rd1.isSelected()) {
						if(curr.player[0].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd2.isSelected()) {
						if(curr.player[1].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd3.isSelected()) {
						if(curr.player[2].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd4.isSelected()) {
						if(curr.player[3].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
						}
					}
					if (rd5.isSelected()) {
						if(curr.player[4].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd6.isSelected()) {
						if(curr.player[5].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);

					}
					}
					}}});
			Image img1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
			
		}else if (players.length==7) {
			JRadioButton rd1 = new JRadioButton(players[0]);
			rd1.setForeground(Color.WHITE);
			rd1.setOpaque(false);
			rd1.setBounds(10, 50, 142, 30);
			getContentPane().add(rd1);
			
			JRadioButton rd2 = new JRadioButton(players[1]);
			rd2.setForeground(Color.WHITE);
			rd2.setOpaque(false);
			rd2.setBounds(10, 90, 142, 30);
			getContentPane().add(rd2);
			
			JRadioButton rd3 = new JRadioButton(players[2]);
			rd3.setForeground(Color.WHITE);
			rd3.setOpaque(false);
			rd3.setBounds(10, 130, 142, 30);
			getContentPane().add(rd3);
					
			JRadioButton rd4 = new JRadioButton(players[3]);
			rd4.setForeground(Color.WHITE);
			rd4.setOpaque(false);
			rd4.setBounds(10, 170, 142, 30);
			getContentPane().add(rd4);
			
			JRadioButton rd5 = new JRadioButton(players[4]);
			rd5.setForeground(Color.WHITE);
			rd5.setOpaque(false);
			rd5.setBounds(10, 210, 142, 30);
			getContentPane().add(rd5);
			
			JRadioButton rd6 = new JRadioButton(players[5]);
			rd6.setForeground(Color.WHITE);
			rd6.setOpaque(false);
			rd6.setBounds(10, 250, 142, 30);
			getContentPane().add(rd6);
			
			JRadioButton rd7 = new JRadioButton(players[5]);
			rd7.setForeground(Color.WHITE);
			rd7.setOpaque(false);
			rd7.setBounds(10, 290, 142, 30);
			getContentPane().add(rd7);
			
			
		    ButtonGroup bg=new ButtonGroup();
		    bg.add(rd1);
		    bg.add(rd2);
		    bg.add(rd3);
		    bg.add(rd4);
		    bg.add(rd5);
		    bg.add(rd6);
		    bg.add(rd7);
		

			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!(rd1.isSelected())&&!(rd2.isSelected())&&!(rd3.isSelected())&&!(rd4.isSelected())&&!(rd5.isSelected())&&!(rd6.isSelected())&&!(rd7.isSelected())){
						JOptionPane.showMessageDialog(null, "Eπιλέξτε κάποιον παίκτη!");
					}else {
					if (rd1.isSelected()) {
						if(curr.player[0].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd2.isSelected()) {
						if(curr.player[1].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd3.isSelected()) {
						if(curr.player[2].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd4.isSelected()) {
						if(curr.player[3].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
						}
					}
					if (rd5.isSelected()) {
						if(curr.player[4].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd6.isSelected()) {
						if(curr.player[5].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);

					}
					}
					if (rd7.isSelected()) {
						if(curr.player[6].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);

					}
					}
					
						
             	}}});
			Image img1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
		}else if(players.length==8) {
			JRadioButton rd1 = new JRadioButton(players[0]);
			rd1.setForeground(Color.WHITE);
			rd1.setOpaque(false);
			rd1.setBounds(10, 50, 142, 30);
			getContentPane().add(rd1);
			
			JRadioButton rd2 = new JRadioButton(players[1]);
			rd2.setForeground(Color.WHITE);
			rd2.setOpaque(false);
			rd2.setBounds(10, 90, 142, 30);
			getContentPane().add(rd2);
			
			JRadioButton rd3 = new JRadioButton(players[2]);
			rd3.setForeground(Color.WHITE);
			rd3.setOpaque(false);
			rd3.setBounds(10, 130, 142, 30);
			getContentPane().add(rd3);
					
			JRadioButton rd4 = new JRadioButton(players[3]);
			rd4.setForeground(Color.WHITE);
			rd4.setOpaque(false);
			rd4.setBounds(10, 170, 142, 30);
			getContentPane().add(rd4);
			
			JRadioButton rd5 = new JRadioButton(players[4]);
			rd5.setForeground(Color.WHITE);
			rd5.setOpaque(false);
			rd5.setBounds(10, 210, 142, 30);
			getContentPane().add(rd5);
			
			JRadioButton rd6 = new JRadioButton(players[5]);
			rd6.setForeground(Color.WHITE);
			rd6.setOpaque(false);
			rd6.setBounds(10, 250, 142, 30);
			getContentPane().add(rd6);
			
			JRadioButton rd7 = new JRadioButton(players[5]);
			rd7.setForeground(Color.WHITE);
			rd7.setOpaque(false);
			rd7.setBounds(10, 290, 142, 30);
			getContentPane().add(rd7);
			
			JRadioButton rd8 = new JRadioButton(players[5]);
			rd8.setForeground(Color.WHITE);
			rd8.setOpaque(false);
			rd8.setBounds(10, 330, 142, 30);
			getContentPane().add(rd8);
			
			
		    ButtonGroup bg=new ButtonGroup();
		    bg.add(rd1);
		    bg.add(rd2);
		    bg.add(rd3);
		    bg.add(rd4);
		    bg.add(rd5);
		    bg.add(rd6);
		    bg.add(rd7);
		    bg.add(rd8);
		

			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!(rd1.isSelected())&&!(rd2.isSelected())&&!(rd3.isSelected())&&!(rd4.isSelected())&&!(rd5.isSelected())&&!(rd6.isSelected())&&!(rd7.isSelected())&&!(rd8.isSelected())){
						JOptionPane.showMessageDialog(null, "Eπιλέξτε κάποιον παίκτη!");
					}else {
					if (rd1.isSelected()) {
						if(curr.player[0].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd2.isSelected()) {
						if(curr.player[1].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd3.isSelected()) {
						if(curr.player[2].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd4.isSelected()) {
						if(curr.player[3].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
						}
					}
					if (rd5.isSelected()) {
						if(curr.player[4].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd6.isSelected()) {
						if(curr.player[5].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);

					}
					}
					if (rd7.isSelected()) {
						if(curr.player[6].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);

					}
					}
					if (rd8.isSelected()) {
						if(curr.player[7].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);

					}
					}
						
             	}}});
			Image img1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
			
		}else if(players.length==9) {
			JRadioButton rd1 = new JRadioButton(players[0]);
			rd1.setForeground(Color.WHITE);
			rd1.setOpaque(false);
			rd1.setBounds(10, 50, 142, 30);
			getContentPane().add(rd1);
			
			JRadioButton rd2 = new JRadioButton(players[1]);
			rd2.setForeground(Color.WHITE);
			rd2.setOpaque(false);
			rd2.setBounds(10, 90, 142, 30);
			getContentPane().add(rd2);
			
			JRadioButton rd3 = new JRadioButton(players[2]);
			rd3.setForeground(Color.WHITE);
			rd3.setOpaque(false);
			rd3.setBounds(10, 130, 142, 30);
			getContentPane().add(rd3);
					
			JRadioButton rd4 = new JRadioButton(players[3]);
			rd4.setForeground(Color.WHITE);
			rd4.setOpaque(false);
			rd4.setBounds(10, 170, 142, 30);
			getContentPane().add(rd4);
			
			JRadioButton rd5 = new JRadioButton(players[4]);
			rd5.setForeground(Color.WHITE);
			rd5.setOpaque(false);
			rd5.setBounds(10, 210, 142, 30);
			getContentPane().add(rd5);
			
			JRadioButton rd6 = new JRadioButton(players[5]);
			rd6.setForeground(Color.WHITE);
			rd6.setOpaque(false);
			rd6.setBounds(10, 250, 142, 30);
			getContentPane().add(rd6);
			
			JRadioButton rd7 = new JRadioButton(players[5]);
			rd7.setForeground(Color.WHITE);
			rd7.setOpaque(false);
			rd7.setBounds(10, 290, 142, 30);
			getContentPane().add(rd7);
			
			JRadioButton rd8 = new JRadioButton(players[5]);
			rd8.setForeground(Color.WHITE);
			rd8.setOpaque(false);
			rd8.setBounds(10, 330, 142, 30);
			getContentPane().add(rd8);
			
			JRadioButton rd9 = new JRadioButton(players[5]);
			rd9.setForeground(Color.WHITE);
			rd9.setOpaque(false);
			rd9.setBounds(10, 370, 142, 30);
			getContentPane().add(rd9);
			
			
			
		    ButtonGroup bg=new ButtonGroup();
		    bg.add(rd1);
		    bg.add(rd2);
		    bg.add(rd3);
		    bg.add(rd4);
		    bg.add(rd5);
		    bg.add(rd6);
		    bg.add(rd7);
		    bg.add(rd8);
		    bg.add(rd9);
		

			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!(rd1.isSelected())&&!(rd2.isSelected())&&!(rd3.isSelected())&&!(rd4.isSelected())&&!(rd5.isSelected())&&!(rd6.isSelected())&&!(rd7.isSelected())&&!(rd8.isSelected())&&!(rd9.isSelected())){
						JOptionPane.showMessageDialog(null, "Eπιλέξτε κάποιον παίκτη!");
					}else {
					if (rd1.isSelected()) {
						if(curr.player[0].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd2.isSelected()) {
						if(curr.player[1].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd3.isSelected()) {
						if(curr.player[2].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd4.isSelected()) {
						if(curr.player[3].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
						}
					}
					if (rd5.isSelected()) {
						if(curr.player[4].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd6.isSelected()) {
						if(curr.player[5].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);

					}
					}
					if (rd7.isSelected()) {
						if(curr.player[6].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);

					}
					}
					if (rd8.isSelected()) {
						if(curr.player[7].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);

					}
					}
					if (rd9.isSelected()) {
						if(curr.player[8].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					
						
             	}}});
			Image img1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
		}else if(players.length==10) {
			JRadioButton rd1 = new JRadioButton(players[0]);
			rd1.setForeground(Color.WHITE);
			rd1.setOpaque(false);
			rd1.setBounds(10, 50, 142, 30);
			getContentPane().add(rd1);
			
			JRadioButton rd2 = new JRadioButton(players[1]);
			rd2.setForeground(Color.WHITE);
			rd2.setOpaque(false);
			rd2.setBounds(10, 90, 142, 30);
			getContentPane().add(rd2);
			
			JRadioButton rd3 = new JRadioButton(players[2]);
			rd3.setForeground(Color.WHITE);
			rd3.setOpaque(false);
			rd3.setBounds(10, 130, 142, 30);
			getContentPane().add(rd3);
					
			JRadioButton rd4 = new JRadioButton(players[3]);
			rd4.setForeground(Color.WHITE);
			rd4.setOpaque(false);
			rd4.setBounds(10, 170, 142, 30);
			getContentPane().add(rd4);
			
			JRadioButton rd5 = new JRadioButton(players[4]);
			rd5.setForeground(Color.WHITE);
			rd5.setOpaque(false);
			rd5.setBounds(10, 210, 142, 30);
			getContentPane().add(rd5);
			
			JRadioButton rd6 = new JRadioButton(players[5]);
			rd6.setForeground(Color.WHITE);
			rd6.setOpaque(false);
			rd6.setBounds(10, 250, 142, 30);
			getContentPane().add(rd6);
			
			JRadioButton rd7 = new JRadioButton(players[5]);
			rd7.setForeground(Color.WHITE);
			rd7.setOpaque(false);
			rd7.setBounds(10, 290, 142, 30);
			getContentPane().add(rd7);
			
			JRadioButton rd8 = new JRadioButton(players[5]);
			rd8.setForeground(Color.WHITE);
			rd8.setOpaque(false);
			rd8.setBounds(10, 330, 142, 30);
			getContentPane().add(rd8);
			
			JRadioButton rd9 = new JRadioButton(players[5]);
			rd9.setForeground(Color.WHITE);
			rd9.setOpaque(false);
			rd9.setBounds(10, 370, 142, 30);
			getContentPane().add(rd9);
			
			
			JRadioButton rd10= new JRadioButton(players[5]);
			rd10.setForeground(Color.WHITE);
			rd10.setOpaque(false);
			rd10.setBounds(10, 410, 142, 30);
			getContentPane().add(rd10);
			
			ButtonGroup bg=new ButtonGroup();
		    bg.add(rd1);
		    bg.add(rd2);
		    bg.add(rd3);
		    bg.add(rd4);
		    bg.add(rd5);
		    bg.add(rd6);
		    bg.add(rd7);
		    bg.add(rd8);
		    bg.add(rd9);
		    bg.add(rd10);
		

			JButton NextButton = new JButton("");
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!(rd1.isSelected())&&!(rd2.isSelected())&&!(rd3.isSelected())&&!(rd4.isSelected())&&!(rd5.isSelected())&&!(rd6.isSelected())&&!(rd7.isSelected())&&!(rd8.isSelected())&&!(rd9.isSelected())&&!(rd10.isSelected())){
						JOptionPane.showMessageDialog(null, "Eπιλέξτε κάποιον παίκτη!");
					}else {
					if (rd1.isSelected()) {
						if(curr.player[0].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd2.isSelected()) {
						if(curr.player[1].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd3.isSelected()) {
						if(curr.player[2].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd4.isSelected()) {
						if(curr.player[3].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
						}
					}
					if (rd5.isSelected()) {
						if(curr.player[4].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd6.isSelected()) {
						if(curr.player[5].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);

					}
					}
					if (rd7.isSelected()) {
						if(curr.player[6].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);

					}
					}
					if (rd8.isSelected()) {
						if(curr.player[7].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);

					}
					}
					if (rd9.isSelected()) {
						if(curr.player[8].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
					if (rd10.isSelected()) {
						if(curr.player[9].playerRole.getRoleName().equals("merlin")) {
							dispose();
							evilwins1 evil=new evilwins1(curr);
							evil.setVisible(true);
							
					}else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
					}
							
             	}}});
			Image img1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
			NextButton.setIcon(new ImageIcon(img1));
			NextButton.setBounds(284, 438, 50, 23);
			getContentPane().add(NextButton);
			
		}
		
        
		JLabel lblNewLabel = new JLabel("EVIL'S LAST CHANCE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(78, 0, 220, 31);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PICK A MERLIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(120, 24, 162, 23);
		getContentPane().add(lblNewLabel_1);
		

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 334, 461);
		Image img = new ImageIcon(this.getClass().getResource("/im11.jpg")).getImage();
		lblNewLabel_2.setIcon (new ImageIcon(img));
		getContentPane().add(lblNewLabel_2);
	}
}