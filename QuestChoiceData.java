
/**
 *  QuestChoice
 * 
  
 * @version1
 */
public class QuestChoiceData 
{
    // μεταβλητές στιγμιοτύπου - αντικαταστήστε το ακόλουθο παράδειγμα
    // με τις δικές σας μεταβλητές
    //private int rAs;//roleassigned
    private int missioners;
    private int mis;//missioners
    private int noQ;//noQuest
    private int countQuest;// h apostolh pou briskomaste
    private boolean IsOn;//for targeting
    private String name;// name of sp rule
    private String Lname;// leader name
    private boolean targetingOn;
    private int numPl;//numof players
    Special_Rules targeting= new Special_Rules(IsOn,name);
    Quest rm = new Quest(noQ,numPl );
    //Player LeaderName= new Player(username,isLeader,isLadyOfTheLake);
    //Current_Game chL= new Current_Game(numPl, rAs);
     

    public QuestChoiceData(int cQ)
    {
             this.countQuest=cQ;
             //this.missioners= mis;
    }
            
    public void setQuestChoice(int cQ)
    {
             countQuest=cQ;
    } 
     
   public boolean TargetingOn(boolean IsOn, String name) {
           targetingOn=targeting.checkTargeting(IsOn,name);
           return targetingOn;
   }
    
   public int returnMissioners(int noQ, int numPl){
                 
       return missioners = rm.getMissioners( noQ, numPl);   
                 
   }  
}      
