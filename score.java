public class score {
    int goodSc;
    int evilSc;
    private Role role=new Role();
    private Questoutcome questoutcome=new Questoutcome();
    private SpecialRules sp=new SpecialRules();
    //constructor
    public score() {
        this.goodSc=0;
        this.evilSc=0;
    }
    public void setGoodSc(int gsc) {
        this.goodSc=gsc;
    }
    public void setEvilsc(int esc) {
        this.evilSc=esc;
    }
    public void setRole ( Role role) {
        this.role=role;
    }
    public void setspecialRules(SpecialRules sp){
        this.sp=sp;
    }
    public  int adde() {
        this.evilSc++;
        return this.evilSc;
    }
     public  int addg() {
        this.goodSc++;
        return this.goodSc;
    }
    public  void checkscore(){
    if (this.goodSc==3) {
        role.checkformerlin();
    } else if (this.evilSc==3) {
        System.out.println("EVILS WIN.");
    }
}
public  void scorecheck(){
    if (this.evilSc<3 && questoutcome.fails>0) {
    sp.LoLcheck();
} else if (this.evilSc==3) {
    questoutcome.checkfinishing();
} else if (this.goodSc==3) {
    questoutcome.checkfinishing();
} else if (this.goodSc<3 && questoutcome.fails==0) {
    sp.LoLcheck();
}
}
}
