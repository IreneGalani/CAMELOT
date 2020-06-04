public class Score {
    int goodSc;
    int evilSc;
    //constructor
    public Score() {
        this.goodSc=0;
        this.evilSc=0;
    }

    public int getGoodSc() {
        return this.goodSc;
        
    }
     public int getEvilSc() {
        return this.evilSc;
        
    }
     
     public int adde () {
    	 this.evilSc++;
    	 return evilSc;
     }
     
     public int addg() {
    	this.goodSc++;
    	return goodSc;
     }
}
