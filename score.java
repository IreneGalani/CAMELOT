package camelot;

public class Score {
    int goodSc;
    int evilSc;
    QuestOutcome questoutcome=new QuestOutcome();
    
    //constructor
    public Score() {
        this.goodSc=0;
        this.evilSc=0;
    }
    public void setGoodSc(int gsc) {
        this.goodSc=gsc;
    }
    public void setEvilsc(int esc) {
        this.evilSc=esc;
    }
    public int getGoodSc() {
        return this.goodSc;
        
    }
     public int getEvilSc() {
        return this.evilSc;
        
    }
     
     public int adde () {
    	 this.goodSc++;
    	 return goodSc;
     }
     
     public int addg() {
    	evilSc++;
    	return evilSc;
     }
     
     public  void checkscore(boolean mer){
    	    if (this.goodSc==3 && mer==true) {
    	         System.out.println("EVIL's LAST CHANCE");
    	    } else if (this.evilSc==3) {
    	        System.out.println("EVILS WIN.");
    	    }
    	    else if (this.goodSc==3 && mer==false) {
    	    System.out.println("GOOD WIN.");
    	}
    	}
    	public  void scorecheck(boolean lol){
    	    if (this.evilSc<3 && questoutcome.fails>0) {
    	        if (lol==true){
    	             System.out.println("LADY OF THE LAKE");
    	            } else {
    	             System.out.println("NEW LEADER WANTED");
    	            };
    	    } else if (this.evilSc==3) {
    	      questoutcome.checkCompleted();
    	    } else if (this.goodSc==3) {
    	      questoutcome.checkCompleted();
    	    } else if ((this.goodSc<3) && (questoutcome.fails==0)) {
    	        if (lol==true){
    	          System.out.println("LADY OF THE LAKE");
    	        } else
    	          System.out.println("NEW LEADER WANTED");
    	        };
    	    }

}
