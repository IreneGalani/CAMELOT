public class Special_Rules {

	public boolean IsOn;//Metavlhth pou dhlwnei an o eidikos kanonas einai energopoihmenos.
	public boolean IsOnt;
	public boolean IsOnl;
	public String name;  //Metavlhth pou dhlwnei to onoma tou eidikou kanona.

	
	public Special_Rules (boolean IsOnl, boolean IsOnt){
		this.IsOnl = IsOnl;
		this.IsOnt = IsOnt  ;
		
	}
	
	public boolean getIsOnl(){
		return IsOnl;
	}
	public boolean getIsOnt(){
		return IsOnt;
	}

	public void setIsOnl (boolean Io){
		IsOnl = Io;
	}
	public void setIsOnt ( boolean Io){
		IsOnt = Io;
	}
	
	public void storeSpecialrules(){
	    if (this.IsOnl == true){
	    	this.IsOnl = true;
	    }
	    else {
	    	this.IsOnl = false;
	    }
        if (this.IsOnt == true){
	    	this.IsOnt = true;
	    }
	    else {
	    	this.IsOnt = false;
	    }
	    
		}

	public boolean checkTargeting(){
		   if(this.IsOnt==true)
		   {
		            return true;
		            }
		    else 
		   {
		       return false;
		   }
		}
	
	public boolean checkLoL (){
		   if(this.IsOnl==true)
		   {
		       return true;
		   }
		   else 
		   {
		       return false;
		   }
	}
}