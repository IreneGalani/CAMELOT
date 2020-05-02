
public class Special_Rules {

	public boolean IsOn; //Metavlhth pou dhlwnei an o eidikos kanonas einai energopoihmenos.
	public String name;  //Metavlhth pou dhlwnei to onoma tou eidikou kanona.
	
	public Special_Rules (boolean IsOn, String name){
		this.IsOn = false;
		this.name = name ;
		
	}
	
	public boolean getIsOn(){
		return IsOn;
	}
	
	public String getname(){
		return name;
	}
	
	public boolean setIsOn(boolean Io){
		IsOn = Io;
	}
	public String setname( String n){
		name = n;
	}
}

