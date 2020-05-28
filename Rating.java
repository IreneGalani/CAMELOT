import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rating extends JFrame {

	private JPanel contentPane;
	int stars;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rating frame = new Rating();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Rating() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(81, 185, 45, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblNewLabel_1.setBounds(181, 185, 45, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblNewLabel_2.setBounds(281, 185, 45, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("4");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_3.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(381, 185, 45, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("5");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_4.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(481, 185, 45, 33);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("No,thanks!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(220, 317, 175, 66);
		contentPane.add(btnNewButton_1);
		
		JButton star1Button = new JButton("");
		star1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				star1Button.setBorderPainted(true);
				stars = 1;//save sti vasi dedomenon
				String rate = "Η γνώμη σας μετράει.Πείτε μας τι μπορούμε να βελτιώσουμε:";
				String comment = JOptionPane.showInputDialog(null, rate);
				if(comment != null) {
					//save sti vasi dedomenon
				}
				JOptionPane.showMessageDialog(null,"Ευχαριστουμε για την αξιολόγηση!");
				dispose();
			}
		});
		star1Button.setBorderPainted(false); 
		star1Button.setFocusPainted(false); 
		star1Button.setOpaque(false);
		star1Button.setBackground(Color.WHITE);
		Image star1 = new ImageIcon(this.getClass().getResource("/star-2-.png")).getImage();
		star1Button.setIcon(new ImageIcon(star1));
		star1Button.setBounds(75, 134, 63, 47);
		contentPane.add(star1Button);
		
		JButton star2Button = new JButton("");
		star2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				star2Button.setBorderPainted(true);
				stars = 2;
				//save sti vasi dedomenon
				String rate = "Η γνώμη σας μετράει.Πείτε μας τι μπορούμε να βελτιώσουμε:";
				String comment = JOptionPane.showInputDialog(null, rate);
				if(comment != null) {
					//save sti vasi dedomenon
				}
				JOptionPane.showMessageDialog(null,"Ευχαριστουμε για την αξιολόγηση!");
				dispose();
				
			}
		});
		star2Button.setBorderPainted(false); 
		star2Button.setFocusPainted(false); 
		star2Button.setOpaque(false);
		star2Button.setBackground(Color.WHITE);
		Image star2 = new ImageIcon(this.getClass().getResource("/star-2-.png")).getImage();
		star2Button.setIcon(new ImageIcon(star2));
		star2Button.setBounds(171, 134, 63, 47);
		contentPane.add(star2Button);
		
		JButton star3Button = new JButton("");
		star3Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				star3Button.setBorderPainted(true);
				stars = 3;//save sti vasi dedomenon
				String rate = "Η γνώμη σας μετράει.Πείτε μας τι μπορούμε να βελτιώσουμε:";
				String comment = JOptionPane.showInputDialog(null, rate);
				if(comment != null) {
					//save sti vasi dedomenon
				}
				JOptionPane.showMessageDialog(null,"Ευχαριστουμε για την αξιολόγηση!");
				dispose();
			}
		});
		star3Button.setBorderPainted(false); 
		star3Button.setFocusPainted(false); 
		star3Button.setOpaque(false);
		star3Button.setBackground(Color.WHITE);
		Image star3 = new ImageIcon(this.getClass().getResource("/star-2-.png")).getImage();
		star3Button.setIcon(new ImageIcon(star3));
		star3Button.setBounds(271, 134, 63, 47);
		contentPane.add(star3Button);
		
		JButton star4Button = new JButton("");
		star4Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				star4Button.setBorderPainted(true);
				stars = 4;//save sti vasi dedomenon
				String rate = "Η γνώμη σας μετράει.Πείτε μας τι μπορούμε να βελτιώσουμε:";
				String comment = JOptionPane.showInputDialog(null, rate);
				if(comment != null) {
					//save sti vasi dedomenon
				}
				JOptionPane.showMessageDialog(null,"Ευχαριστουμε για την αξιολόγηση!");
				dispose();
				
			
		}});
		star4Button.setBorderPainted(false); 
		star4Button.setFocusPainted(false); 
		star4Button.setOpaque(false);
		star4Button.setBackground(Color.WHITE);
		Image star4 = new ImageIcon(this.getClass().getResource("/star-2-.png")).getImage();
		star4Button.setIcon(new ImageIcon(star4));
		star4Button.setBounds(371, 134, 63, 47);
		contentPane.add(star4Button);
		
		JButton star5Button = new JButton("");
		star5Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				star5Button.setBorderPainted(true);
				stars = 5;//save sti vasi dedomenon
				JOptionPane.showMessageDialog(null,"Ευχαριστουμε για την αξιολόγηση!");
				dispose();				
			}
		});
		star5Button.setBorderPainted(false); 
		star5Button.setFocusPainted(false); 
		star5Button.setOpaque(false);
		star5Button.setBackground(Color.WHITE);
		Image star5 = new ImageIcon(this.getClass().getResource("/star-2-.png")).getImage();
		star5Button.setIcon(new ImageIcon(star5));
		star5Button.setBounds(471, 134, 63, 47);
		contentPane.add(star5Button);
		
		JLabel rateusLabel = new JLabel("Rate us!"); 
		rateusLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		rateusLabel.setBackground(Color.BLACK);
		Image rateus = new ImageIcon(this.getClass().getResource("/smiley1.png")).getImage();
		rateusLabel.setIcon(new ImageIcon(rateus));
		rateusLabel.setForeground(Color.YELLOW);
		rateusLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 34));
		rateusLabel.setHorizontalAlignment(SwingConstants.CENTER);
		rateusLabel.setBounds(203, 67, 199, 39);
		contentPane.add(rateusLabel);
		
		
		JLabel imgLabel = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/papyros.jpg")).getImage();
		imgLabel.setIcon(new ImageIcon(img));
		imgLabel.setBounds(0, 0, 602, 553);
		contentPane.add(imgLabel);
		
		
	}
}
