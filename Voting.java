public class Voting {

    public int inFavor; //to plithos twn yper
    public int against; //to plithos twn kata
    public int ongoingFailures; //o metritis gia tis synexomena mh egkekrimenes apostoles

    public Voting() {
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

    public void setOngoingFailures(int ongoingFailures) {
        this.ongoingFailures = ongoingFailures;
    }
}
