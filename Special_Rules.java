
public class Special_Rules {

	public boolean IsOn; //Metavlhth pou dhlwnei an o eidikos kanonas einai energopoihmenos.
	public String name;  //Metavlhth pou dhlwnei to onoma tou eidikou kanona.
	private boolean target;// krataei to apotelesma tou elegxou Targeting.
	
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
	
	public void setIsOn(boolean Io){
		IsOn = Io;
	}
	public void setname( String n){
		name = n;
	}
	
	public boolean checkTargeting(boolean IO,String NM){
	   if(IO=true)
	   {
	       if (NM=="Targeting")
	        {
	            return target=true;
	        }
	       else{
	           return false;
	       }
	   }
	   else 
	   {
	       return target=false;
	   }
	}
}

