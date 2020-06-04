import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class goodwins1 extends JFrame {

    EndoftheGame end=new EndoftheGame();
    Current_Game curr;

	public goodwins1(Current_Game curr) {
		this.curr=curr;
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
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
				RankingMenu1 jfrm2 =new RankingMenu1();
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