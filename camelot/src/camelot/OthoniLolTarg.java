import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OthoniLolTarg extends JFrame {
    private boolean clickLol = false;
    private boolean clickTarg= false;
    private final JLabel lblo = new JLabel("Ενεργοπoίηση Ειδικών Κανόνων");

    public OthoniLolTarg (){
		super("Othoni me tis epiloges LoL & Targeting");
		Special_Rules a = new Special_Rules(false,false);
		Image icon2 = new ImageIcon(this.getClass().getResource("/left2.png")).getImage();
		JRadioButton cb1 = new JRadioButton("Lady Of the Lake");                                        //Plhktro Lady of the lake 
		cb1.setForeground(Color.WHITE);
		cb1.setOpaque(false);
		cb1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cb1.setBounds(101,116, 179,50);  
        JRadioButton cb2 = new JRadioButton("Targeting");           // Plhktro Targeting
        cb2.setForeground(Color.WHITE);
        cb2.setOpaque(false);
        cb2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cb2.setBounds(101,221, 179,50);  
        JButton ok = new JButton();  //Plhktro epistrofhs gia na gurisei pisw sth othoni arxiko menou
        ok.setIcon(new ImageIcon(icon2));
        ok.setOpaque(false);
        ok.setBounds(43,344,70, 33); 
        getContentPane().add(cb1);  
        getContentPane().add(cb2);  
        getContentPane().add(ok);
        setSize(350,500);  
        setResizable(false);
        getContentPane().setLayout(null);  
        lblo.setForeground(Color.WHITE);
        lblo.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblo.setBounds(43, 35, 265, 40);
        
        getContentPane().add(lblo);
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	cb1.addActionListener(new ActionListener(){                             //Edw ginetai o elegxos ths epiloghs gia to plhktro Lady of the lake kai h apothikeush epiloghs.                            
		public void actionPerformed (ActionEvent e) {
			
		
			if ((e.getSource()==cb1) && (clickLol==false) ){
				clickLol = true;
				a.setIsOnl(true);
				a.storeSpecialrules();
				boolean x = a.getIsOnl();

			}else if ((e.getSource()==cb1) && (clickLol==true)) {
			clickLol = false;
			a.setIsOnl(false);
			a.storeSpecialrules();
			boolean x = a.getIsOnl();
			}else{
				clickLol = false;
				a.setIsOnl(false);
				a.storeSpecialrules();
			}
		}
		
	});
	
	cb2.addActionListener(new ActionListener(){                            //Edw ginetai o elegxos epiloghs gia to plhktro Targeting kai h apothikeush ths epiloghs
		public void actionPerformed (ActionEvent e) { 
			if ((e.getSource()==cb2) && (clickTarg==false) ){
				clickTarg = true;
				a.setIsOnt(true);
				a.storeSpecialrules();
				boolean x = a.getIsOnt();
				
			}else if ((e.getSource()==cb2) && (clickTarg==true)) {
				clickTarg = false;
				a.setIsOnt(false);
				a.storeSpecialrules();
				boolean x = a.getIsOnt();
				}else{
					clickTarg = false;
					a.setIsOnt(false);
					a.storeSpecialrules();
					boolean x = a.getIsOnt();
				}
		}
		});
	ok.addActionListener(new ActionListener(){               //Elegxos epiloghs gia to plhktro epistrofhs.
		public void actionPerformed (ActionEvent e) { 
			if (e.getSource()==ok){
				dispose();
				new ArxikoMenuOth(a);
			}
		}
		});
	JLabel lady = new JLabel("");
    Image img2 = new ImageIcon(this.getClass().getResource("/lady.jpg")).getImage();
    lady.setIcon(new ImageIcon(img2));
    getContentPane().add(lady);
    lady.setBounds(21, 109, 63, 68);
    
    JLabel target = new JLabel("New label");
    Image img3 = new ImageIcon(this.getClass().getResource("/target.png")).getImage();
    target.setIcon(new ImageIcon(img3));
    getContentPane().add(target);
    target.setBounds(21, 214, 63, 68);
    
	JLabel label1 = new JLabel("");
    getContentPane().add(label1);
    Image img1 = new ImageIcon(this.getClass().getResource("/im2.jpg")).getImage();
    label1.setIcon(new ImageIcon(img1));
    label1.setBounds(0, 0, 334, 461);
    getContentPane().add(label1);
	
}
	
	public void setLol( boolean clickLol){
		this.clickLol = clickLol;
	}
	public void setTarg( boolean clickTarg){
		this.clickTarg = clickTarg;
	}
	public boolean getbtLoL(){
		return this.clickLol;
		}
	
	public boolean getTarg(){
		return this.clickTarg;
		}
	}
