
/**
 *  QuestChoice
 * 
  
 * @version1
 */
public class QuestChoiceData 
{
    // μεταβλητές στιγμιοτύπου - αντικαταστήστε το ακόλουθο παράδειγμα
    // με τις δικές σας μεταβλητές
    
     private int missioners;
   
    private int leadersChoice;// epilogh (quest/missioners) apo leader
    
    private int countQuest;// h apostolh pou briskomaste
    private int hasVoted;

    
   
   
    private String[] ml= new String [missioners] ;
    
    

   public QuestChoiceData()
    {
             this.countQuest=1;
             
    }
            // methodos pou ay3anei to countQuest
            // an OnGoingFailures=0, return true apo getSetZero ->Voting=> count++
    public void setCountQuest(int count){
   
        this.countQuest=count;
               
    } 
             
    
    public int getCount(){
     return this.countQuest;
    }
     
  public void saveMissioners(String [] pl){
	    this.ml=pl;
	   }
	
	public int getHasVoted() {
		return hasVoted;
	}
    
  public void stMissioners(int k){
       
          this.missioners =k;
        
    }
   public int returnMissioners(){
        return this.missioners;
    }
   // methodos poy elegxei an h epilogh Quest/missioners tou Paikth-Arxhgoy einai egkyrh-- syndeetai me interface
 
   //set get ths epiloghs quest tou Paikth Arxhgou sth periptwsh targeting
    public void setLeadersChoice(int q){
    this.leadersChoice=q;
    }
   
    public int getLeadersChoice(){
    return this.leadersChoice;
    }
 
    public String[] getSMis() {
	   return this.ml;
   }
	 public String getML(int i) {
	   return ml[i];
   }
	 public int getMLen() {
	   return  ml.length;
   }
	public void setHasVoted(int hasVoted) {
		this.hasVoted = hasVoted;
	}
	 
	public void saveMissionersVoted(int count)
	   {
	       this.hasVoted = this.hasVoted + count;
	    }
	 
}  

      
