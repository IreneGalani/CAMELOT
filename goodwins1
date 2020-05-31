package camelot;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;

public class goodwins1 extends JFrame {

    EndOfTheGame end=new EndOfTheGame();
    Current_Game curr;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					goodwins1 window = new goodwins1(curr);
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public goodwins1(Current_Game curr) {
		this.curr=curr;
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		JButton btnNewButton = new JButton("");
		Image img1 = new ImageIcon(this.getClass().getResource("/next.png")).getImage();
		btnNewButton.setIcon (new ImageIcon(img1));
		btnNewButton.setForeground(new Color(255, 218, 185));
		btnNewButton.setBounds(318, 196, 89, 23);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public  void actionPerformed(ActionEvent e) {
				end.setWinnerSide("good");
				dispose();
				SaveGameMes jfrm2 =new SavegameMes(end,curr);
				jfrm2.setVisible(true);
			}});
		getContentPane().add(btnNewButton);

		
		JLabel lblNewLabel_1 = new JLabel("GOOD WINS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1.setBounds(87, 104, 254, 43);
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(255, 218, 185));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		
		

		
		JLabel lblNewLabel = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/softeng.png")).getImage();
		lblNewLabel.setIcon (new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 434, 276);
		getContentPane().add(lblNewLabel);
	

	}
}
