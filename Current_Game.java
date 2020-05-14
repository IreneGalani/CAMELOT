
public class Current_Game {
	
public int numPlayers; //Metavlhth pou orizei posoi paiktes dhlwthikan gia thn sigkekrimenh partida.
public int rolesAssigned; // Metavlhth pou orizei ton metrhth pou metraei posoi xarakthres exoun dwthei se paiktes.
public String [] playerList = new String [numPlayers] ; // Pinakas pou kataxwrountai ta onomata pou exoun lavei meros sth sugkekrimenh patida.
private int keepLeader; //voithitiki metavliti pou krataei ti thesi tou arxhgou sth lista paiktwn
private VotingData Vdata = new VotingData();
PlayerLeader theLeader;
	
public Current_game (int numPlayers, int rolesAssigned)
{
	this.numPlayers = numPlayers;
	this.rolesAssigned = rolesAssigned;
	this.keepLeader = 0;
	
}

public void setPlayerList(String[] playerList) {
        this.playerList = playerList;
}

public int getnumPlayers(){
	return numPlayers;
}
	
public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
}

public int getroleAssigned(){
	return rolesAssigned;
}

public void setnumPlayers(int num){
	numPlayers = num;
}

public void setrolesAssigned(int rolesA){
	rolesAssigned = rolesA;
}
 

public void VoteFails(){
        int fails = Vdata.checkFailures();
        if(fails > 0 && fails < 5) {
            String leader = chooseLeader();
	          theLeader = new PlayerLeader(leader);
            theLeader.setLeader(true);
	      }
}

//μέθοδος για την επιλογή του παίκτη αρχηγού
public String chooseLeader(){
        if(this.keepLeader < this.playerList.length){
            this.keepLeader++;
        } else{
            this.keepLeader = 1;
        }
        return this.playerList[keepLeader-1];
 }
	
	
}
