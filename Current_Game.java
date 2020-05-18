
public class Current_Game {
	
public int numPlayers; //Metavlhth pou orizei posoi paiktes dhlwthikan gia thn sigkekrimenh partida.
public int rolesAssigned; // Metavlhth pou orizei ton metrhth pou metraei posoi xarakthres exoun dwthei se paiktes.
public String [] playerList = new String [10] ; // Pinakas pou kataxwrountai ta onomata pou exoun lavei meros sth sugkekrimenh patida.
private int keepLeader; //voithitiki metavliti pou krataei ti thesi tou arxhgou sth lista paiktwn
private VotingData Vdata = new VotingData();
PlayerLeader theLeader;
public boolean availName;//metavliti pou deixnei an iparxei to onoma sthn partida
public int c = 0;
Role[] role;
	
public Current_game (int numPlayers, Role[] role)
{
	if(numPlayers >= 5 && numPlayers <= 10) {
            this.numPlayers = numPlayers;
        } else {
            this.numPlayers = 5;
        }
	this.rolesAssigned = 0;
	this.keepLeader = 0;
	this.role = role;
	
}
public Current_Game()
{}

public Role[] getRole() {
        return role;
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
	
	public void saveNumPlayers(int np)
    {
        numPlayers = np;
    }
	public boolean CurrNameCheck(String nm)
    {
        for(int i = 0; i < numPlayers; i++)
        {
            if (nm == playerList[i])
            {
                i = numPlayers;
                this.availName = false ;
                
            }
            else
            {
                this.availName = true;
            }
        }
        return availName;
    }
	public void saveCurrName(String nm,int c)
   {
       
       playerList[c] = nm;
       c = c+1;
        
    }
	public void saveRoleAssignement(int count)
   {
       this.rolesAssigned = this.rolesAssigned + count;
    }
	
public boolean verifySpRoles(){
        boolean merlinUsed = false;
        boolean percivalUsed = false;
        boolean morganaUsed = false;
        boolean mordredUsed = false;
        boolean oberonUsed = false;
        for(int i = 0; i < rolesAssigned; i++){
            if(role[i].roleName.equals("merlin") && role[i].isUsed()){
                merlinUsed = true;
            }
            if(role[i].roleName.equals("percival") && role[i].isUsed()){
                percivalUsed = true;
            }
            if(role[i].roleName.equals("morgana") && role[i].isUsed()){
                morganaUsed = true;
            }
            if(role[i].roleName.equals("mordred") && role[i].isUsed()){
                mordredUsed = true;
            }
            if(role[i].roleName.equals("oberon") && role[i].isUsed()){
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
	public boolean CurrNameCheck(String nm)
    {
        for(int i = 0; i < 10; i++)
        {
            if (nm == playerList[i])
            {
                i = 10;
                this.availName = false ;
                
            }
            else
            {
                this.availName = true;
            }
        }
        return availName;
    }
	public void saveCurrName(String nm) 
{
       
       
       playerList[c] = nm;
       c = c+1;
       
    
    }
}
