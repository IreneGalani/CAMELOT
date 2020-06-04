import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestRejected extends JFrame {

	private JPanel contentPane;
	VotingData vd;
	QuestChoiceData qd;
	Current_Game curr;
	Special_Rules a;
	QuestOutcome qo;
	Score scr;

	public QuestRejected(QuestChoiceData qd, Current_Game curr, Special_Rules a, VotingData vd, QuestOutcome qo, Score scr) {
		this.vd = vd;
		this.qd = qd;
		this.curr = curr;
		this.a = a;
		this.qo = qo;
		this.scr = scr;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(350, 500);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuest = new JLabel("\u0397 \u0391\u03A0\u039F\u03A3\u03A4\u039F\u039B\u0397");
		lblQuest.setForeground(new Color(139, 0, 0));
		lblQuest.setFont(new Font("Sitka Text", Font.BOLD, 32));
		lblQuest.setBounds(49, 207, 232, 68);
		contentPane.add(lblQuest);
		
		JLabel lblRejected = new JLabel("\u0391\u03A0\u039F\u03A1\u03A1\u0399\u03A0\u03A4\u0395\u03A4\u0391\u0399!");
		lblRejected.setForeground(new Color(139, 0, 0));
		lblRejected.setFont(new Font("Sitka Text", Font.BOLD, 32));
		lblRejected.setBounds(36, 247, 288, 62);
		contentPane.add(lblRejected);
		
		JButton NextButton = new JButton("");
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int failures = vd.checkFailures();
				vd.setAgainst(0);
				vd.setInFavor(0);
				//System.out.println(failures);
				if((failures >0 && failures < 5)) {
				int quest = qd.getCount();
				QuestChoiceData qd = new QuestChoiceData(); 
				if(quest ==1) {
					qd.setCountQuest(1);
					if(a.checkTargeting()) {
						dispose();
						ChooseQuest cq = new ChooseQuest(qd, curr, a, vd, qo, scr);
						cq.setVisible(true);
					} else {
						dispose();
						ChooseMissioners cm = new ChooseMissioners(qd, curr, a, vd, qo, scr);
						cm.setVisible(true);
					}
				} else if(quest ==2) {
					qd.setCountQuest(2);
					if(a.checkTargeting()) {
						dispose();
						ChooseQuest cq = new ChooseQuest(qd, curr, a, vd, qo, scr);
						cq.setVisible(true);
					} else {
						dispose();
						ChooseMissioners cm = new ChooseMissioners(qd, curr, a, vd, qo, scr);
						cm.setVisible(true);
					}
				} else if(quest ==3) {
					qd.setCountQuest(3);
					if(a.checkTargeting()) {
						dispose();
						ChooseQuest cq = new ChooseQuest(qd, curr, a, vd, qo, scr);
						cq.setVisible(true);
					} else {
						dispose();
						ChooseMissioners cm = new ChooseMissioners(qd, curr, a, vd, qo, scr);
						cm.setVisible(true);
					}
				} else if(quest ==4) {
					qd.setCountQuest(4);
					if(a.checkTargeting()) {
						dispose();
						ChooseQuest cq = new ChooseQuest(qd, curr, a, vd, qo, scr);
						cq.setVisible(true);
					} else {
						dispose();
						ChooseMissioners cm = new ChooseMissioners(qd, curr, a, vd, qo, scr);
						cm.setVisible(true);
					}
				} else {
					qd.setCountQuest(5);
					if(a.checkTargeting()) {
						dispose();
						ChooseQuest cq = new ChooseQuest(qd, curr, a, vd, qo, scr);
						cq.setVisible(true);
					} else {
						dispose();
						ChooseMissioners cm = new ChooseMissioners(qd, curr, a, vd, qo, scr);
						cm.setVisible(true);
					}
				}
				} else {
					evilwins1 evil = new evilwins1(curr);
					evil.setVisible(true);
				}
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
		NextButton.setIcon(new ImageIcon(img1));
		NextButton.setBounds(284, 438, 50, 23);
		contentPane.add(NextButton);
		
		JLabel imgLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/im11.jpg")).getImage();
		imgLabel.setIcon(new ImageIcon(img));
		imgLabel.setBounds(0, 0, 334, 461);
		contentPane.add(imgLabel);
	}

}