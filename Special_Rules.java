
public class Special_Rules {

		public boolean IsOn; //Metavlhth pou dhlwnei an o eidikos kanonas einai energopoihmenos.
		public String name;  //Metavlhth pou dhlwnei to onoma tou eidikou kanona.
		
		
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
		
		public void storeSpecialrules(){
		    if (this.IsOn == true){
		    	System.out.println(" O eidikos kanonas " + this.name +  " einai energopoihmenos");
		    	this.IsOn = true;
		    }
		    else {
		    	System.out.println(" O eidikos kanonas " + this.name +  " einai apenergopoihmneos");
		    	this.IsOn = false;
		    }
			}
		
		public boolean getSpecialrules(){
			return this.IsOn;
			}
		
		public boolean checkTargeting(){
			   if(this.IsOn==true)
			   {
			       if (this.name=="Targeting")
			        {
			            return true;
			        }
			       else{
			           return false;
			       }
			   }
			   else 
			   {
			       return false;
			   }
			}
		
		public boolean checkLoL (){
			   if(this.IsOn==true)
			   {
			       if (this.name=="Lady of the Lake")
			        {
			            return true;
			        }
			       else{
			           return false;
			       }
			   }
			   else 
			   {
			       return false;
			   }
		}
}
