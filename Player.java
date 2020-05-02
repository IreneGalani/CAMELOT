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

    public Player(String username, boolean isLeader, boolean isLadyOfTheLake) {
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
}
