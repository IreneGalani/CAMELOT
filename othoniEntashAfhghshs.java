import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class othoniEntashAfhghshs extends JFrame implements ChangeListener {
    JFrame f; 
  
    JSlider s; 
   
    JLabel l1;
    JLabel l2;
    boolean bok = false;
    boolean b;
    int fps;
    Settings sett = new Settings()  ;
    Special_Rules a;
		public othoniEntashAfhghshs() {
			    //this.sett = sett;
			    l1=new JLabel("\u03A1\u03CD\u03B8\u03BC\u03B9\u03C3\u03B7 \u0388\u03BD\u03C4\u03B1\u03C3\u03B7\u03C2");  
			    l1.setForeground(Color.RED);
			    l1.setFont(new Font("Tahoma", Font.BOLD, 18));
			    l1.setBounds(79,69, 171,30);
			    getContentPane().add(l1);
			JSlider s = new JSlider(0,100,50);
			s.setOpaque(false);
			s.setForeground(Color.RED);
			s.setFont(new Font("Tahoma", Font.BOLD, 15));
			// paint the ticks and tarcks 
	        s.setPaintTrack(true); 
	        s.setPaintTicks(true); 
	        s.setPaintLabels(true); 
	        // set spacing 
	        s.setMajorTickSpacing(50); 
	        s.setMinorTickSpacing(5);
			s.setBounds(10, 141, 314, 83);
			getContentPane().add(s);
			JButton btnOk = new JButton("OK");
			btnOk.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnOk.setBounds(120, 287, 89, 23);
			getContentPane().add(btnOk);
			s.addChangeListener(new ChangeListener(){
				public void stateChanged(ChangeEvent e){
				JSlider s = (JSlider)e.getSource();
				
					bok = true;
					//set.getVolume();
		             fps = (int)s.getValue();
		            //Settings set = new Settings();
		             //sett.storevolume(fps);
		            //System.out.println(fps);
		            } 
		            	
		            
			
				 });
			btnOk.addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
					if (e.getSource()==btnOk && bok==true){
					sett.storevolume(fps);
		            //System.out.println(fps);
					
					 new OthoniSettings(a,sett);
					}
					else if (e.getSource()==btnOk && bok==false){
						sett.storevolume(50);
						//OthoniSettings os = new OthoniSettings(a,sett);	
						new OthoniSettings(a,sett);
						
					}
					//Settings set = new Settings();
					//int x = set.getVolume();
					//set.storevolume(x);
					dispose();
					}
				});
			setSize(350,500);  
	        getContentPane().setLayout(null);  
	        
	        
	        setVisible(true);  
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        JLabel label7 = new JLabel("");
			Image img1 = new ImageIcon(this.getClass().getResource("/mauro.jpg")).getImage();
			label7.setIcon(new ImageIcon(img1));
	        label7.setBounds(0, 0, 334, 461);
	        getContentPane().add(label7);
		}
		
		
		
	        /*else {
	            	Settings set = new Settings();
	            	set.storevolume(set.Volume);
	            	int x = set.getVolume();
	            	System.out.println("H entash afhghshs einai : " + x);
	            	
	            }   */ 
	    
			
		


		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			
			
			
		}
		
		

		/*public void stateChanged(ChangeEvent e) {
			JEditorPane lblTheValueOf;
			lblTheValueOf.setText("value of Slider is : " + s.getValue()); 
		}*/

	}
		


