
public class QuestOutcome {
   int fails;
   int completedQuests;
   Score score=new Score();
   SpecialRules sp=new SpecialRules();
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
   
   public static void failnumcheck() {
        if (this.fails>0) {
            score.adde();
            add();
            score.scorecheck();
        } else if (this.fails==0) {
            score.addg();
            add();
            score.scorecheck();
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
      
      //να γινει ξεχωριστη μεθοδος που θα δεχεται το αποτελεσμα της checkCompleted()
      if (score.evilSc==3 && completedQuests<5) {
         sp.LoLcheck();
      } else if (score.evilSc==3 && completedQuests==5) {
         score.checkscore();
      } else if(score.goodSc==3 && completedQuests<5) {
         sp.loLcheck();
      } else if(score.goodsc==3 && completedQuests==5){
         score.checkscore();
      }
    }
}
