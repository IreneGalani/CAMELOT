

public class EndoftheGame
{
    String winnerside;
    //costructor
    public EndoftheGame() {
        this.winnerside=winnerside;
    }
   public void setWinnerSide(int goodS, int evilS) {
        this.gS=goodS;
        this.eS=evilS;
        if(gS>eS){
        this.winnerside="good";}
        else{
        this.winnerside="evil";
    }
    }
    //
    public String getWinnerSide() {
        return this.winnerside;
    }
   
}
