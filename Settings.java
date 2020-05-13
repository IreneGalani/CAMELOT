
public class Settings {

	public int Volume;  //Metavlhth gia thn entash afhghshs.
	public boolean Is_on_hx;// Metavlhth gia ton Hxo polumeswn.
	public boolean Is_on_n; // Metavlhth gia ta Notifications.
	public String Lang_Chosen;//Metavlhth gia thn epilogh glwssas.Thn arxikopoihoume se Greek.
	
	public Settings (int Volume, boolean Is_on_hx, String Lang_chosen, boolean Is_on_n){
		this.Volume = Volume;
		this.Is_on_hx = Is_on_hx;
		this.Lang_Chosen = "Greek";
		this.Is_on_n = Is_on_n;   /* Prosthesa allh mia boolean metavlhth etsi wste kathe fora 
		                        pou dhmiourgeitai ena antikeimo tupou settings, na mhn ephreazetai
		                        h timh gia tis metavlhtes hxos_polumeswn kai Notifications  */
	}
	
	public boolean getIs_On_hx(){
		return Is_on_hx;
	}
	
	public int getVolume(){
		return Volume;
	}
	
	public String getLang(){
		return Lang_Chosen;
	}
	
	
	
	//public void setIs_On( boolean Io){
		// Is_on = Io;
	//}
	
	/*public void setVolume(int v){
		 Volume = v;
	}
	
	public void setLang(String Lang){
		 Lang_Chosen = Lang;
	}*/
	

    public boolean getIs_on_n() {
		return Is_on_n;
	}


	public void storevolume( Settings s1){                      // Methodos gia thn apothikeush ths timhs
	 Volume = s1.Volume ;                                       // ths entashs afhghshs                            
    	System.out.println("H entash afhghshs einai :" + Volume);
    }
    
    public void storeaudio(Settings s1){                                 
	                                                                  //Methodos gia thn apothikeush an einai energopoihmenos    
    	Is_on_hx = s1.Is_on_hx;                                           //   h oxi o Hxos polumeswn
    	if (Is_on_hx == true){
    	System.out.println("O hxos polumeswn einai energopoihmenos ");
    	}else {
    		System.out.println("O hxos polumeswn einai apenergopoihmenos");
    	}
    }
    
    public void storeLang(Settings s1){                                                 //Methodos gia thn apothikeush ths
    	Lang_Chosen = s1.Lang_Chosen ;                                                  // glwssas pou  tha xrhsimopoithei 
    	System.out.println("H Glwssa pou xrhsimopoieitai einai :" + Lang_Chosen);
    	
    }
    
    public void storeNotific(Settings s1){                                              //Methodos gia thn apothikeush an 
    	Is_on_n = s1.Is_on_n;                                                           // theloume h oxi notifications
    	if (Is_on_n == true){
    	System.out.println("H leitourgia notifications einai energh ");
    	}else {
    		System.out.println("H leitourgia notifications einai anenergh");
    	}
    	
    }
    
	
}
