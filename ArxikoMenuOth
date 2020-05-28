import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.*;  
import javax.swing.*;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class ArxikoMenuOth extends JFrame {

	private JFrame frame;
	private final JLabel label = new JLabel("\u0391\u03C1\u03C7\u03B9\u03BA\u03CC \u039C\u03B5\u03BD\u03BF\u03CD");
	Special_Rules a;
	Settings sett;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Special_Rules a = new Special_Rules(false, false);
					ArxikoMenuOth window = new ArxikoMenuOth(a);
					//setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ArxikoMenuOth(Special_Rules a) {
		this.a = a;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {   
		//frame = new JFrame();
				ImageIcon icon1 = new ImageIcon("C:\\Users\\Bill\\workspace\\javauidemo\\src\\javauidemo\\play2.png");
				ImageIcon icon2 = new ImageIcon("C:\\Users\\Bill\\workspace\\javauidemo\\src\\javauidemo\\iconfinder_rules_3018564(1).png");
				ImageIcon icon3 = new ImageIcon("C:\\Users\\Bill\\workspace\\javauidemo\\src\\javauidemo\\special rules.png");
				ImageIcon icon4 = new ImageIcon ("C:\\Users\\Bill\\workspace\\javauidemo\\src\\javauidemo\\settings.png");          
				getContentPane().setLayout(null);
				JButton b0 = new JButton("Play",icon1); 
				
				JButton b1 = new JButton("Rules",icon2);
				JButton b2 = new JButton("Special Rules",icon3);
				JButton b3 = new JButton("Settings",icon4);
				b0.setBounds(98,98,150, 40);
				b1.setBounds(98,149,150, 40); 
				b2.setBounds(98,200,150, 40); 
				b3.setBounds(98,251,150, 40); 
				getContentPane().add(b0);   
				getContentPane().add(b1);
				getContentPane().add(b2);
				getContentPane().add(b3);
				label.setForeground(Color.WHITE);
				label.setFont(new Font("Sitka Text", Font.BOLD, 24));
				label.setBounds(88, 29, 192, 56);
				
				getContentPane().add(label);
				
				setSize(350,500);       
				setVisible(true);    
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
				b0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
						//Menu me = new Menu(a);
					}
				});
				b2.addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
					dispose();
					OthoniEidikoiKannones a = new OthoniEidikoiKannones();
					}
				});
				b1.addActionListener(new ActionListener(){
					public void actionPerformed (ActionEvent e) {
						dispose();
						//OthoniEidikoiKannones a = new OthoniEidikoiKannones();
						}
					});
				b3.addActionListener(new ActionListener(){
					public void actionPerformed (ActionEvent e) {
						dispose();
						OthoniSettings s = new OthoniSettings(a,sett);
						}
					});
				
				JLabel imgLabel = new JLabel("");
		        Image img1 = new ImageIcon(this.getClass().getResource("/mauro.jpg")).getImage();
			    imgLabel.setIcon(new ImageIcon(img1));
			    imgLabel.setBounds(0, 0, 334, 461);
				getContentPane().add(imgLabel);
				
			
			}
	}

