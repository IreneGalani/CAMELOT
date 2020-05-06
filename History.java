
/**
 *  History
 * 
  
 * @version1
 */
public class History{
    
    private boolean emptyHistory;
    private boolean saveGame;// save current game?
    private int savedGames;// #of saved Games
    private player name;// player's name
    

    public History(int savedGames, player username)
    {
        this.emptyHistory=true;
        this.saveGame=false;
        this.savedGames=0;
        username=name;
    }

    
    
    public void setEmptyHistory(boolean emHistory)
    {
        this.emptyHistory= emHistory;
    }
    
    public void setSaveGame(boolean saveG)
    {
        this.saveGame= saveG;
    }
    
    public void setSavedGames(int savedG)
    {
        this.savedGames= savedG;
    }
}
   
    
    

