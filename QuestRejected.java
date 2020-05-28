import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuestRejected extends JFrame {

	private JPanel contentPane;
	//String[] list;
	VotingData vd;
	QuestChoiceData qd;
	Current_Game curr;
	Special_Rules a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VotingData vd = new VotingData();
					String[] list = {"Bill", "Irene", "Paul", "Tzo", "Mike"};
					//QuestRejected frame = new QuestRejected(list, vd);
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
	public QuestRejected(/*String[] list,*/ VotingData vd, QuestChoiceData qd, Current_Game curr, Special_Rules a) {
		//this.list = list;
		this.vd = vd;
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
				System.out.println(failures);
				dispose();
				Voting1 voting = new Voting1(vd, qd, curr, a);
				voting.setVisible(true);
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/next.png")).getImage();
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
