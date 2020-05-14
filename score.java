

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
    public static int adde(int evilSc) {
        this.evilSc++;
        return this.evilSc;
    }
     public static int addg(int goodSc) {
        this.goodSc++;
        return this.goodSc;
    }
    public static void checkscore(int goodSc ,int evilSc){
    if (this.goodSc==3) {
        ole.checkformerlin();
    } else if (this.evilSc==3) {
        System.out.println("EVILS WIN.");
    }
}
public static void scorecheck(int goodSc, int evilSc){
    if ((this.evilSc<3) && (questoutcome.fails>0)) {
    sp.LoLcheck();
} else if (this.evilSc==3) {
    questoutcome.checkcompleted();
} else if (this.goodSc==3) {
    questoutcome.checkcompleted();
} else if ((this.goodSc<3) && (questoutcome.fails==0)) {
    sp.LoLcheck();
}
}
}