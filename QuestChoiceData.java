
/**
 *  QuestChoice
 * 
  
 * @version1
 */
public class QuestChoiceData 
{
    // μεταβλητές στιγμιοτύπου - αντικαταστήστε το ακόλουθο παράδειγμα
    // με τις δικές σας μεταβλητές
    /
     private int missioners;
   
    private int leadersChoice;// epilogh (quest/missioners) apo leader
    
    private int countQuest;// h apostolh pou briskomaste
    private boolean validChoice;
   
    private boolean targetingOn;
    private String[] ml= new String [missioners] ;
    
    

   public QuestChoiceData()
    {
             this.countQuest=1;
             
    }
            // methodos pou ay3anei to countQuest
            // an OnGoingFailures=0, return true apo getSetZero ->Voting=> count++
    public void setQuestChoice(boolean ogF)
     {if(ogF==true){
        this.countQuest=countQuest+1;
      }             
    } 
             
    } 
    public int getCount(){
     return this.countQuest;
    }
     
   public void TargetingOn(boolean on) {
       if(on){
           this.targetingOn= true;
        } else{
           this.targetingOn = false;
        }
   }
    
   public void stMissioners(Quest rm){
        if((rm.getNumPlayers()==5 || rm.getNumPlayers()==6 || rm.getNumPlayers()==7) && countQuest==1) {
          this.missioners=2;
        }
        else if((rm.getNumPlayers()==8 || rm.getNumPlayers()==9 || rm.getNumPlayers()==10) && countQuest==1){
           this.missioners=3;
        }
        else{
          this.missioners =rm.getMissioners();
        }
    }
   public int returnMissioners(){
        return this.missioners;
    }
   // methodos poy elegxei an h epilogh Quest/missioners tou Paikth-Arxhgoy einai egkyrh-- syndeetai me interface
   public void checkLeadersChoice(int qq, int qo1){
     if(qq==5 && qo1<2){
         this.validChoice=false; //not valid choice         
         System.out.println("Not valid choice, choose another quest!");
                 
        }
     else{
        this.validChoice=true; //valid choice        
    }
    }
   public boolean getValidChoice(){
     return this.validChoice;
    }
   //set get ths epiloghs quest tou Paikth Arxhgou sth periptwsh targeting
    public void setLeadersChoice(int q){
    this.leadersChoice=q;
    }
   
    public int getLeadersChoice(){
    return this.leadersChoice;
    }
   //save epilogh missioners
   public void saveMissioners(String [] pl){
    this.ml=pl;
   }
}  

      
