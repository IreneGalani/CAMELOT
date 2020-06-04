import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RankingMenu1 extends JFrame {

	private JPanel contentPane;
	Current_Game curr;
	EndoftheGame end;

	public RankingMenu1() {
		setSize(350,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton newGame = new JButton("\u039D\u03AD\u03B1 \u03A0\u03B1\u03C1\u03C4\u03AF\u03B4\u03B1");
		newGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Special_Rules b=new Special_Rules(false,false);
				 
					ArxikoMenuOth g = new ArxikoMenuOth(b);						
		             dispose();
						g.setVisible(true);
					
			}
		});
		newGame.setBounds(133, 74, 162, 35);
		contentPane.add(newGame);

		JButton exit = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rating r = new Rating();						
	               dispose();
				r.setVisible(true);
			
			}
		});
		exit.setBounds(133, 130, 162, 35);
		contentPane.add(exit);
		
		JLabel image = new JLabel("");	
		Image img1 = new ImageIcon(this.getClass().getResource("/softeng.png")).getImage();
		image.setIcon(new ImageIcon(img1));
		image.setBounds(0, 0, 434, 261);
	    contentPane.add(image);
	}
}