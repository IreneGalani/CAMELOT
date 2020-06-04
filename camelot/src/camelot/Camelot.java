package camelot;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.Timer;

public class Camelot {

	private JFrame frame;
	Timer tm;
	int i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Camelot window = new Camelot();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Camelot() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 377,580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		Special_Rules a = new Special_Rules(false,false);
		
		JButton pressScreenButton = new JButton("");
		pressScreenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();	
				ArxikoMenuOth arxMen = new ArxikoMenuOth(a);
				arxMen.setVisible(true);
				}
		});
		pressScreenButton.setContentAreaFilled(false);
		pressScreenButton.setBorderPainted(false); 
		pressScreenButton.setFocusPainted(false); 
		pressScreenButton.setOpaque(false);
		pressScreenButton.setBounds(0, 0, 363, 543);
		frame.getContentPane().add(pressScreenButton);
		
		JLabel clickScreenLabel = new JLabel("Click on screen to play");
		clickScreenLabel.setHorizontalAlignment(SwingConstants.CENTER);
		clickScreenLabel.setForeground(Color.WHITE);
		clickScreenLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		clickScreenLabel.setBounds(60, 420, 242, 45);
		frame.getContentPane().add(clickScreenLabel);
		
		tm = new Timer(800, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(clickScreenLabel.isVisible()) {
					clickScreenLabel.setVisible(false);

				}else {
				clickScreenLabel.setVisible(true);}
				

			}
			
		});
		tm.start();
		
		
		
		JLabel logoLabel = new JLabel("");
		logoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Image logo = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		logoLabel.setIcon(new ImageIcon(logo));
		logoLabel.setBounds(153, 79, 189, 182);
		frame.getContentPane().add(logoLabel);
		
		JLabel arxikiLabel = new JLabel("New label");
		arxikiLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		Image img = new ImageIcon(this.getClass().getResource("/arxiki.png")).getImage();
		arxikiLabel.setIcon(new ImageIcon(img));
		arxikiLabel.setBounds(0, 0, 497, 543);
		frame.getContentPane().add(arxikiLabel);
		
		
		
		
	
	
		
		
	}
}
