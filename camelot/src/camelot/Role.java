public class Role {
    String roleName;//onoma xarakthra
    String side;//stratopedo
    boolean isUsed;//o xaraktiras epilexthike
    boolean given;//o xaraktiras xrisimopoieitai

    public Role(String roleName) {
        this.roleName = roleName.toLowerCase();
        switch (this.roleName){
            case "good": case "merlin": case "percival":
                this.side = "good";
                break;
            case "evil": case "mordred": case "oberon": case "morgana": default:
                this.side = "evil";
                break;
        }
        this.isUsed = false;
        this.given = false;
    }

    public void setIsUsed(boolean isUsed){
        this.isUsed = isUsed;
    }

    public void setGiven(boolean given){
        this.given = given;
    }
	public boolean getGiven() {
    	return given;
    }
    public String getRoleName() {
    	return roleName;
    }
    
    //μέθοδος που ελέγχει το στρατόπεδο του χαρακτήρα
    public boolean checkSide(){
        if(this.side.equals("good")){
            return true;
        } else {
            return false;
        }
    }
    public boolean checkformerlin (){
			   if(this.roleName.equals("merlin"))
			   {
			       if (this.given==true)
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
    public boolean checkRoles()
    { 
       return this.isUsed;
    }
}