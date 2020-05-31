package camelot;

public class QuestOutcome {
	   int fails;
	   int completedQuests;
	   Score score=new Score();
	   boolean good=false;
	   boolean evil=false;
	  boolean lady=false; 
	  String k;
	   
	 
	   //constructor
	   public QuestOutcome() {
	       this.fails=0;
	       this.completedQuests=0;
	    }
	   public void setFails(int f) {
	       this.fails=f;
	    }
	    public void setCompletedQuests(int compq) {
	        this.completedQuests=compq;
	    }
	   

	    public void add() {
	        this.completedQuests++;
	    }
	   
	  
	   
	   public int getfails() {
		   return fails;
	   }
	   public void setfails() {
		   this.fails++;
	   }
	   
	   public int checkCompleted(){
	        switch (this.completedQuests){
	            case 1:
	                return 1;
	            case 2:
	                return 2;
	            case 3:
	                return 3;
	            case 4:
	                return 4;
	            case 5:
	                return 5;
	            default:
	                return 0;
	        }
	   }
}
