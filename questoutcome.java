public class QuestOutcome {
	   int fails;
	   int completedQuests;
	   Score score=new Score();
	 
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
	   
	   public void failnumcheck(boolean lol) {
	        if (this.fails>0) {
	            score.adde();
	            add();
	            score.scorecheck(lol);
	        } else if (this.fails==0)  {
	            score.addg();
	            add();
	            score.scorecheck(lol);
	            }
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
	public void checkfinishing(boolean lol){
	   if (this.completedQuests<5 && score.evilSc==3) {
	      if(lol==true){
	       System.out.println("go on with Lady of the Lake");
	      } else {
	       System.out.println("evil wins"); 
	   }
	 } else if (this.completedQuests==5 && score.evilSc==3) {
	      System.out.println("evil wins");
	} else if (completedQuests<5 && score.goodSc==3) {
	      if(lol==true){
	       System.out.println("go on with Lady of the Lake");
	      } else {
	       System.out.println("time to check for merlin"); 
	      } 
	   } else if (completedQuests==5 && score.evilSc==3) {
	         System.out.println("evil wins");
	   }
	   }
	}

