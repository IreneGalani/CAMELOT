package camelot;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScreenNarration extends JFrame {

	private JPanel contentPane;
	Current_Game curr;
	Special_Rules a;
	//private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//ScreenNarration frame = new ScreenNarration();
					//frame.setVisible(true);
					//frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ScreenNarration(Current_Game curr,Special_Rules a) {
		this.curr=curr;
		this.a = a;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		QuestChoiceData qcd = new QuestChoiceData();
		
		JLabel narrationLabel = new JLabel("Aφήγηση");
		narrationLabel.setForeground(Color.WHITE);
		narrationLabel.setFont(new Font("Arial Narrow", Font.BOLD, 30));
		narrationLabel.setBounds(149, 45, 152, 31);
		contentPane.add(narrationLabel);
		
		for(int i = 0; i < curr.playerList.length; i++) {
			if(i == 0) {
				JLabel label1 = new JLabel(curr.playerList[i]);
				label1.setForeground(Color.WHITE);
				label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label1.setBounds(148, 100, 300, 31);
				getContentPane().add(label1);
				
			} else if (i == 1) {
				JLabel label2 = new JLabel(curr.playerList[i]);
				label2.setForeground(Color.WHITE);
				label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label2.setBounds(148, 140, 300, 31);
				getContentPane().add(label2);
				
			} else if (i == 2) {
				JLabel label3 = new JLabel(curr.playerList[i]);
				label3.setForeground(Color.WHITE);
				label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label3.setBounds(148, 180, 300, 31);
				getContentPane().add(label3);
				
			} else if (i == 3) {
				JLabel label4 = new JLabel(curr.playerList[i]);
				label4.setForeground(Color.WHITE);
				label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label4.setBounds(148, 220, 300, 31);
				getContentPane().add(label4);
				
			} else if (i == 4) {
				JLabel label5 = new JLabel(curr.playerList[i]);
				label5.setForeground(Color.WHITE);
				label5.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label5.setBounds(148, 260, 300, 31);
				getContentPane().add(label5);
				
			} else if (i == 5 && i < curr.playerList.length) {
				JLabel label6 = new JLabel(curr.playerList[i]);
				label6.setForeground(Color.WHITE);
				label6.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label6.setBounds(148, 300, 300, 31);
				getContentPane().add(label6);
				
			} else if (i == 6 && i < curr.playerList.length) {
				JLabel label7 = new JLabel(curr.playerList[i]);
				label7.setForeground(Color.WHITE);
				label7.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label7.setBounds(148, 340, 300, 31);
				getContentPane().add(label7);
				
			} else if (i == 7 && i < curr.playerList.length) {
				JLabel label8 = new JLabel(curr.playerList[i]);
				label8.setForeground(Color.WHITE);
				label8.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label8.setBounds(148, 380, 300, 31);
				getContentPane().add(label8);
				
			} else if ( i == 8 && i < curr.playerList.length) {
				JLabel label9 = new JLabel(curr.playerList[i]);
				label9.setForeground(Color.WHITE);
				label9.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label9.setBounds(148, 420, 300, 31);
				getContentPane().add(label9);
				
			} else if ( i == 9 && i < curr.playerList.length) {
				JLabel label10 = new JLabel(curr.playerList[i]);
				label10.setForeground(Color.WHITE);
				label10.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label10.setBounds(148, 460, 300, 31);
				getContentPane().add(label10);
			}
		}
		
		JButton playButton = new JButton("");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//load audio clip
			}
		});
		playButton.setBackground(Color.BLACK);
		Image play = new ImageIcon(this.getClass().getResource("/play(4).png")).getImage();
		playButton.setIcon(new ImageIcon(play));
		playButton.setBounds(365, 45, 50, 40);
		contentPane.add(playButton);
		
		JButton pauseButton = new JButton("");
		pauseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pause audio clip
			}
		});
		pauseButton.setBackground(Color.BLACK);
		Image pause = new ImageIcon(this.getClass().getResource("/pause(2).png")).getImage();
		pauseButton.setIcon(new ImageIcon(pause));
		pauseButton.setBounds(443, 45, 50, 40);
		contentPane.add(pauseButton);
		
		JButton nextButton = new JButton("");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a.checkTargeting()) {
					dispose();
					ChooseQuest cq =new ChooseQuest(qcd,curr,a);
					cq.setVisible(true);
				}else {
					dispose();
					ChooseMissioners cm = new ChooseMissioners(qcd,curr,a);
					cm.setVisible(true);
				}
			}
		});
		Image arrow = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
		nextButton.setIcon(new ImageIcon(arrow));
		nextButton.setBackground(Color.LIGHT_GRAY);
		nextButton.setBounds(499, 512, 85, 21);
		contentPane.add(nextButton);
		
		JLabel imgLabel = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/papyros.jpg")).getImage();
		imgLabel.setIcon(new ImageIcon(img));
		imgLabel.setBounds(0, 0, 602, 553);
		contentPane.add(imgLabel);
		
		
	}
}
