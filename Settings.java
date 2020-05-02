
public class Settings {
	public int Volume;  //Metavlhth gia thn entash afhghshs
	public boolean Is_on;// Metavlhth gia ton Hxo polumeswn kai gia ta Notifications.Ta arxikopoihoume true
	public String Lang_Chosen;//Metavlhth gia thn epilogh glwssas.Thn arxikopoihoume se Greek.
	
	public Settings (int Volume, boolean Is_on, String Lang_chosen){
		this.Volume = Volume;
		this.Is_on = true;
		this.Lang_Chosen = "Greek";
	}
	
	public boolean getIs_On(){
		return Is_on;
	}
	
	public int getVolume(){
		return Volume;
	}
	
	public String getLang(){
		return Lang_Chosen;
	}
	
	public boolean setIs_On( boolean Io){
		 Is_on = Io;
	}
	
	public int setVolume(int v){
		 Volume = v;
	}
	
	public String getLang(String Lang){
		 Lang_Chosen = Lang;
	}

}
