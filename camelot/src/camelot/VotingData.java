public class VotingData {

    public int inFavor; //to plithos twn yper
    public int against; //to plithos twn kata
    public int ongoingFailures; //o metritis gia tis synexomena mh egkekrimenes apostoles

    public VotingData() {
        this.inFavor = 0;
        this.against = 0;
        this.ongoingFailures = 0;
    }

    public void setInFavor(int inFavor) {
        this.inFavor = inFavor;
    }

    public void setAgainst(int against) {
        this.against = against;
    }
    
    //δέχεται σαν όρισμα την ψήφο του παίκτη και αν είναι true αυξάνει τα υπέρ, διαφορετικά αυξάνει τα κατά 
    public void saveVote(boolean vote){
        if(vote){
            this.inFavor++;
        } else {
            this.against++;
        }
    }

    //επιστρέφει το συνολικό αποτέλεσμα της ψηφοφορίας
    public boolean checkResult(){
        return this.inFavor > this.against;
    }
    
    public int checkFailures(){
        if(checkResult()){
            if(this.ongoingFailures > 0 && this.ongoingFailures < 5){
                setToZero();
            }
        } else {
            increaseFailures();
        }
        return this.ongoingFailures;
    }
    
     public void setToZero(){
        ongoingFailures = 0;
    }

    public void increaseFailures(){
        ongoingFailures++;
    }
}