package camelot;

public class Score {
    int goodSc;
    int evilSc;
    String k,l;
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
    	 this.evilSc++;
    	 return evilSc;
     }
     
     public int addg() {
    	this.goodSc++;
    	return goodSc;
     }
     
    

}
