
public class Rating
{
    int stars;//arithmos asteriou
    String comment;//sxolio xristi
    boolean hasCommented;//elegxos iparksis sxoliou
    
    public Rating(int stars,String comment){
        this.stars = stars;
        this.comment = comment;
        this.hasCommented = false;
    }
    public void HasCommented(boolean hasCommented){
        this.hasCommented = hasCommented;
    }
    
}
