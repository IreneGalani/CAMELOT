package camelot;

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
private boolean qb1, qb2,qb3,qb4,qb5;

	
	
public Current_Game (int numPlayers, Role[] role)
{
	this.rolesAssigned = 0;
	this.keepLeader = 0;
	this.role = role;
	this.qb1=true;
	this.qb2=true;
	this.qb3=true;
	this.qb4=true;
	this.qb5=true;
	
	
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

public boolean isQb1() {
	return qb1;
}



public void setQb1(boolean qb1) {
	this.qb1 = qb1;
}



public boolean isQb2() {
	return qb2;
}



public void setQb2(boolean qb2) {
	this.qb2 = qb2;
}



public boolean isQb3() {
	return qb3;
}



public void setQb3(boolean qb3) {
	this.qb3 = qb3;
}



public boolean isQb4() {
	return qb4;
}



public void setQb4(boolean qb4) {
	this.qb4 = qb4;
}



public boolean isQb5() {
	return qb5;
}



public void setQb5(boolean qb5) {
	this.qb5 = qb5;
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
 

public String[] getPlayerList() {
	return playerList;
}
public String VoteFails(){
        int fails = Vdata.checkFailures();
        if((fails > 0 && fails < 5) || (fails == 0)) {
            String leader = chooseLeader();
	    theLeader = new PlayerLeader(leader);
            theLeader.setLeader(true);
	    return 
	    		leader;
	} else {
		return "";
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
        for(int i = 0; i < role.length; i++){
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
    }}