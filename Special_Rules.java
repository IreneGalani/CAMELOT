
public class Special_Rules {

	public boolean IsOn; //Metavlhth pou dhlwnei an o eidikos kanonas einai energopoihmenos.
	public String name;  //Metavlhth pou dhlwnei to onoma tou eidikou kanona.
	private boolean target;// krataei to apotelesma tou elegxou Targeting.
	
	public Special_Rules (boolean IsOn, String name){
			this.IsOn = IsOn;
			this.name = name ;
			
		}
		
		public boolean getIsOn(){
			return IsOn;
		}
		
		public String getname(){
			return name;
		}
		
		public void setIsOn (boolean Io){
			IsOn = Io;
		}
		public void setname ( String n){
			name = n;
		}
		
		public void storeSpecialrules( Special_Rules sp1){
		    if (sp1.IsOn == true){
		    	System.out.println(" O eidikos kanonas " + sp1.name +  " einai energopoihmenos");
		    	IsOn = true;
		    }
		    else {
		    	System.out.println(" O eidikos kanonas " + sp1.name +  " einai apenergopoihmneos");
		    	IsOn = false;
		    }
			}
		
		public boolean getSpecialrules( Special_Rules sp1){
			return sp1.IsOn;}


	
	public boolean checkTargeting(Special_Rules sp1){
	   if(sp1.IsOn==true)
	   {
	       if (sp1.name=="Targeting")
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

