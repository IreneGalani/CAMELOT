import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class evilwins1 extends JFrame {

    EndoftheGame end=new EndoftheGame();    
    Current_Game curr;

	public evilwins1(Current_Game curr) {
	this.curr=curr;
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null);
		setVisible(true);

		JButton btnNewButton = new JButton("");
		Image img1 = new ImageIcon(this.getClass().getResource("/next.png")).getImage();
		btnNewButton.setIcon (new ImageIcon(img1));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public  void actionPerformed(ActionEvent e1) {
				end.setWinnerSide("evil");
				dispose();
				RankingMenu1 jfrm=new RankingMenu1();
				jfrm.setVisible(true);
			}});
		btnNewButton.setBounds(318, 198, 89, 23);
		getContentPane().add(btnNewButton);

		
		JLabel lblNewLabel_1 = new JLabel("EVIL WINS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1.setBounds(122, 104, 219, 43);
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);

		JLabel lblNewLabel = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/softeng.png")).getImage();
		lblNewLabel.setIcon (new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 434, 276);
		getContentPane().add(lblNewLabel);
	}
}