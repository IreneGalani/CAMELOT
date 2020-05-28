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
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WithTheGood extends JFrame {

	private JPanel contentPane;
	Current_Game curr;
	Special_Rules a;
	Player examined;
	QuestChoiceData qd;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Player p1 = new Player("Irene");
					Player p2 = new Player("Tzo");
					//WithTheGood frame = new WithTheGood(p1);
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WithTheGood(Player examined, QuestChoiceData qd, Current_Game curr, Special_Rules a) {
		this.examined = examined;
		this.qd = qd;
		this.curr = curr;
		this.a = a;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(350, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel(examined.getUsername());
		nameLabel.setForeground(new Color(255, 0, 0));
		nameLabel.setFont(new Font("Sitka Text", Font.BOLD, 24));
		nameLabel.setBounds(59, 224, 265, 38);
		contentPane.add(nameLabel);
		
		JLabel sideLabel = new JLabel("is with the goods' side");
		sideLabel.setForeground(new Color(255, 0, 0));
		sideLabel.setFont(new Font("Sitka Text", Font.BOLD, 24));
		sideLabel.setBounds(42, 257, 292, 49);
		contentPane.add(sideLabel);
		examined.setNewLady();
		JButton NextButton = new JButton("");
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int quest = qd.getCount();
				QuestChoiceData newQuestData = new QuestChoiceData(); 
				if(quest ==1) {
					newQuestData.setCountQuest(2);
					if(a.checkTargeting()) {
						ChooseQuest cq = new ChooseQuest(newQuestData, curr, a);
					} else {
						ChooseMissioners cm = new ChooseMissioners(newQuestData, curr, a);
					}
				} else if(quest ==2) {
					newQuestData.setCountQuest(3);
					if(a.checkTargeting()) {
						ChooseQuest cq = new ChooseQuest(newQuestData, curr, a);
					} else {
						ChooseMissioners cm = new ChooseMissioners(newQuestData, curr, a);
					}
				} else if(quest ==3) {
					newQuestData.setCountQuest(4);
					if(a.checkTargeting()) {
						ChooseQuest cq = new ChooseQuest(newQuestData, curr, a);
					} else {
						ChooseMissioners cm = new ChooseMissioners(newQuestData, curr, a);
					}
				} else if(quest ==4) {
					newQuestData.setCountQuest(5);
					if(a.checkTargeting()) {
						ChooseQuest cq = new ChooseQuest(newQuestData, curr, a);
					} else {
						ChooseMissioners cm = new ChooseMissioners(newQuestData, curr, a);
					}
				} else {
					//τερματισμος παιχνιδιου
				}
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/next.png")).getImage();
		NextButton.setIcon(new ImageIcon(img1));
		NextButton.setBounds(284, 438, 50, 23);
		getContentPane().add(NextButton);
		
		JLabel imgLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/im11.jpg")).getImage();
		imgLabel.setIcon(new ImageIcon(img));
		imgLabel.setBounds(0, 0, 334, 461);
		contentPane.add(imgLabel);
	}
}
