import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestApproved extends JFrame {

	private JPanel contentPane;
	VotingData vd;
	QuestChoiceData qd;
	Current_Game curr;
	Special_Rules a;
	QuestOutcome qo;
	Score scr;

	public QuestApproved(QuestChoiceData qd, Current_Game curr, Special_Rules a, VotingData vd, QuestOutcome qo, Score scr) {
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
		
		JLabel lblApproved = new JLabel("\u0395\u0393\u039A\u03A1\u0399\u039D\u0395\u03A4\u0391\u0399!");
		lblApproved.setForeground(new Color(139, 0, 0));
		lblApproved.setFont(new Font("Sitka Text", Font.BOLD, 32));
		lblApproved.setBounds(50, 247, 257, 62);
		contentPane.add(lblApproved);
		
		JButton NextButton = new JButton("");
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int failures = vd.checkFailures();
				//System.out.println(failures);
				if(failures == 0) {
					dispose();
					VotingData vd = new VotingData();
					//QuestOutcome qo = new QuestOutcome();
					pickcard1 pc = new pickcard1(qd, curr, a, vd, qo, scr);
					pc.setVisible(true);
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