public class QuestChoiceData
{
    private int missioners;
    private int countQuest;// h apostolh pou briskomaste
    private int hasVoted;
    public String[] ml= new String [missioners] ;

   public QuestChoiceData()
    {
             this.countQuest=1;
    }

    public void setCountQuest(int count){
        this.countQuest=count;
    }
    
    public int getCount(){
     return this.countQuest;
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

	 public String getML(int i) {
	   return ml[i];
   }
	 public int getMLen() {
	   return  ml.length;
   }
	 
	public void saveMissionersVoted(int count)
	   {
	       this.hasVoted = this.hasVoted + count;
	    }
	 
}  
