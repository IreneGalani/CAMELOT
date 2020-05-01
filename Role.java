
public class Role
{
    String roleName;//onoma xarakthra
    String side;//stratopedo
    boolean isUsed;//o xaraktiras epilexthike
    boolean given;//o xaraktiras xrisimopoieitai
    public Role(String roleName,String side)
    {
   this.roleName = roleName;
   this.side = side;
   this.isUsed = false;
   this.given = false;
    }
    public void setIsUsed(boolean isUsed){
    this.isUsed = isUsed;
    }
    public void setGiven(boolean given){
    this.given = given;
      }
}
