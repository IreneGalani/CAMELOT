public class Player {
    public String username;
    public boolean isLeader; //gia na elegxoume ean enas paikths einai kai paikths-arxhgos
    public boolean isLadyOfTheLake; //gia na elegxoume ean enas paikths einai kai paikths-Lady of the Lake
    public boolean newPlayer;
    public boolean canBeExamined; //gia na elegxoume kata thn fasi Lady of the Lake ean o paikths pou epilegetai na eksetasthei einai egkyros
    public boolean chosen; //gia na elegxoume ean o paikths epilexthike kata thn fasi ths epiloghs apostolhs
    public int playerGames; //se poses partides exei summetasxei
    public int playerWins;
    public int playerDefeats;
    Role playerRole //kathe paikths exei enan rolo
    public String playerSide; //metavliti pou krataei to stratopedo kathe paikth
    

    public Player(String username) {
        this.username = username;
        this.isLeader = false;
        this.isLadyOfTheLake = false;
        this.newPlayer = true;
        this.canBeExamined = true;
        this.chosen = false;
        this.playerGames = 0;
        this.playerWins = 0;
        this.playerDefeats = 0;
    }
    
    public void setPlayerRole(Role playerRole) {
        this.playerRole = playerRole;
    }
    
    public Role getPlayerRole() {
        return playerRole;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    
    public void setLeader(boolean leader) {
        isLeader = leader;
    }

    public void setLadyOfTheLake(boolean ladyOfTheLake) {
        isLadyOfTheLake = ladyOfTheLake;
    }

    public void setNewPlayer(boolean newPlayer) {
        this.newPlayer = newPlayer;
    }

    public void setCanBeExamined(boolean canBeExamined) {
        this.canBeExamined = canBeExamined;
    }

    public void setChosen(boolean chosen) {
        this.chosen = chosen;
    }

    public void setPlayerGames(int playerGames) {
        this.playerGames = playerGames;
    }

    public void setPlayerWins(int playerWins) {
        this.playerWins = playerWins;
    }

    public void setPlayerDefeats(int playerDefeats) {
        this.playerDefeats = playerDefeats;
    }
    
    public String getPlayerSide() {
        return playerSide;
    }

    public void setPlayerSide(String playerSide) {
        this.playerSide = playerSide;
    }
    
    //μέθοδος που ελέγχει το στρατόπεδο του ΧΑΡΑΚΤΗΡΑ του παίκτη και με βάση το αποτέλεσμα, ορίζει το στρατόπεδο του παίκτη
    public void checkPlayerSide() {
        boolean isGood = playerRole.checkSide();
        if(isGood){
            setPlayerSide("good");
        } else {
            setPlayerSide("evil");
        }
    }
    
    
    //μέθοδος που ορίζει τον νέο παίκτη Lady of the Lake
    public void setNewLady(){
        if(this.canBeExamined) {
            this.canBeExamined = false;
        }
        if(!this.isLadyOfTheLake){
            setLadyOfTheLake(true);
        } else {
            setLadyOfTheLake(false);
        }
    }
    
    //μέθοδος που ελέγχει αν ο παίκτης που επέλεξε η Lady of the Lake μπορεί να εξεταστεί
    public boolean validateLadysChoice(String name){
        if(this.username.equals(name)){
            if(this.canBeExamined){
                return true;
            }
        }
        return false;
    }
   
}
