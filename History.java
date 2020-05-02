
/**
 *  History
 * 
  
 * @version1
 */
public class History{
    
    public boolean emptyHistory;
    public boolean saveGame;// save current game?
    public int savedGames;// #of saved Games
    

    public History(int savedGames)
    {
        this.emptyHistory=true;
        this.saveGame=false;
        this.savedGames=0;
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
   
    
    

