import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IsLadyOfTheLake extends JFrame {

	String ladyName;
	Current_Game curr;
	Special_Rules a;
	QuestChoiceData qd;
	QuestOutcome qo;
	Score scr;
	VotingData vd;

	public void setLady(String name) {
		this.ladyName = name;
	}
	
	private String getLady() {
		return this.ladyName;
	}
	
	public IsLadyOfTheLake(QuestChoiceData qd, Current_Game curr, Special_Rules a,VotingData vd, QuestOutcome qo, Score scr) {
		this.qd = qd;
		this.curr = curr;
		this.a = a;
		this.qo = qo;
		this.scr = scr;
		this.vd = vd;
		Player[] player = curr.getPlayer();
		
		getContentPane().setLayout(null);
		
		JLabel ladyLabel = new JLabel("Lady of the Lake");
		ladyLabel.setForeground(new Color(178, 34, 34));
		ladyLabel.setFont(new Font("Sitka Text", Font.BOLD, 28));
		ladyLabel.setBounds(30, 181, 272, 57);
		getContentPane().add(ladyLabel);
		
		JLabel IsLabel = new JLabel("\u03B5\u03AF\u03BD\u03B1\u03B9 \u03BF/\u03B7 ");
		IsLabel.setForeground(new Color(178, 34, 34));
		IsLabel.setFont(new Font("Sitka Text", Font.BOLD, 28));
		IsLabel.setBounds(30, 228, 135, 42);
		getContentPane().add(IsLabel);
		
		for(int i = 0; i < player.length; i++) {
			if(player[i].isLadyOfTheLake()) {
				setLady(player[i].getUsername());
			}
		}
		JLabel labelName = new JLabel(getLady());
		labelName.setForeground(new Color(178, 34, 34));
		labelName.setFont(new Font("Sitka Text", Font.BOLD, 28));
		labelName.setBounds(162, 228, 160, 42);
		getContentPane().add(labelName);
		setBounds(100, 100, 450, 300);
		setSize(350, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		JButton NextButton = new JButton("");
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ChoosePlayerName chooseN = new ChoosePlayerName(qd, curr, a,vd, qo, scr);
				chooseN.setVisible(true);
			}
		});
		
		Image img1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
		NextButton.setIcon(new ImageIcon(img1));
		NextButton.setBounds(284, 438, 50, 23);
		getContentPane().add(NextButton);
		
		JLabel imgLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/im11.jpg")).getImage();
		imgLabel.setIcon(new ImageIcon(img));
		imgLabel.setBounds(0, 0, 334, 461);
		getContentPane().add(imgLabel);
	}
}