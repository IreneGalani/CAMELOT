
public class Current_Game {
	
public int numPlayers; //Metavlhth pou orizei posoi paiktes dhlwthikan gia thn sigkekrimenh partida.
public int rolesAssigned; // Metavlhth pou orizei ton metrhth pou metraei posoi xarakthres exoun dwthei se paiktes.
public String [] playerList = new String [10] ; // Pinakas pou kataxwrountai ta onomata pou exoun lavei meros sth sugkekrimenh patida.

public Current_game (int numPlayers, int rolesAssigned)
{
	this.numPlayers = numPlayers;
	this.rolesAssigned = rolesAssigned;
	playerList = new String[10] {" "," "," "," "," "," "," "," "," "," "};
	
}

public int getnumPlayers(){
	return numPlayers;
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
}
