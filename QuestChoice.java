
/**
 *  QuestChoice
 * 
  
 * @version1
 */
public class QuestChoice 
{
    // μεταβλητές στιγμιοτύπου - αντικαταστήστε το ακόλουθο παράδειγμα
    // με τις δικές σας μεταβλητές
    private int countQuest;
    private Player name;

    
    public QuestChoice(int countQuest, Player leader_name)
    {
             this.countQuest=0;
             name= leader_name;
    }
    
    
    public void setQuestChoice(int countQuest)
    {
             this.countQuest=countQuest;
    } 
    
   
    
    
}
