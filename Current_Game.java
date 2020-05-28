
public class Current_Game {
	
public int numPlayers; //Metavlhth pou orizei posoi paiktes dhlwthikan gia thn sigkekrimenh partida.
public int rolesAssigned; // Metavlhth pou orizei ton metrhth pou metraei posoi xarakthres exoun dwthei se paiktes.
public String [] playerList = new String [numPlayers] ; // Pinakas pou kataxwrountai ta onomata pou exoun lavei meros sth sugkekrimenh patida.
private int keepLeader; //voithitiki metavliti pou krataei ti thesi tou arxhgou sth lista paiktwn
private VotingData Vdata = new VotingData();
PlayerLeader theLeader;
public boolean availName;//metavliti pou deixnei an iparxei to onoma sthn partida
Role[] role;
Player[] player;
	
	
public Current_game (int numPlayers, Role[] role)
{
	this.rolesAssigned = 0;
	this.keepLeader = 0;
	this.role = role;
	
}
public Current_Game()
{}
public Player[] getPlayer() {
		return player;
	}
public void setPlayer(Player[] player) {
		this.player = player;
	}
public Role[] getRole() {
        return role;
}
	
public void setRole(Role[] role) {
        this.role = role;
    }	
	
public void setAvailName(boolean availName)
{
	this.availName = availName;
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


public void setrolesAssigned(int rolesA){
	rolesAssigned = rolesA;
}
 

public boolean VoteFails(){
        int fails = Vdata.checkFailures();
        if(fails > 0 && fails < 5) {
            String leader = chooseLeader();
	    theLeader = new PlayerLeader(leader);
            theLeader.setLeader(true);
	    return true;
	} else if(fails == 0){
		return false;
	} else {
		return true;
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
	
	public VotingData getVdata() {
		return Vdata;
	}

	public void setVdata(VotingData vdata) {
		Vdata = vdata;
	}
	
	public void saveRoleAssignement(int count)
   {
       this.rolesAssigned = this.rolesAssigned + count;
    }
	
	 public int getKeepLeader() {
        return keepLeader;
    }
	
public boolean verifySpRoles(){
        boolean merlinUsed = false;
        boolean percivalUsed = false;
        boolean morganaUsed = false;
        boolean mordredUsed = false;
        boolean oberonUsed = false;
        for(int i = 0; i < rolesAssigned; i++){
            if(role[i].roleName.equals("merlin") && role[i].checkRoles()){
                merlinUsed = true;
            }
            if(role[i].roleName.equals("percival") && role[i].checkRoles()){
                percivalUsed = true;
            }
            if(role[i].roleName.equals("morgana") && role[i].checkRoles()){
                morganaUsed = true;
            }
            if(role[i].roleName.equals("mordred") && role[i].checkRoles()){
                mordredUsed = true;
            }
            if(role[i].roleName.equals("oberon") && role[i].checkRoles()){
                oberonUsed = true;
            }
        }
        if(numPlayers == 5){
            if(!percivalUsed && !morganaUsed && !mordredUsed && !oberonUsed){
                return true;
            } else {
                return false;
            }
        } else if(numPlayers == 6){
            if(!morganaUsed && !mordredUsed && !oberonUsed){
                return true;
            } else {
                return false;
            }
        } else {
            if (mordredUsed || morganaUsed) {
                if (merlinUsed && percivalUsed) {
                    return true;
                } else {
                    return false;
                }
            }
            if (percivalUsed) {
                if (merlinUsed) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
	
