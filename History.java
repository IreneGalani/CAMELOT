
/**
 *  History
 * 
  
 * @version1
 */
public class History{
    
    private boolean emptyHistory;
    private boolean saveGame;// save current game?
    private int savedGames;// #of saved Games
    private Player name;// player's name
    String[] allPlayers = new String(100);

    public History(int savedGames, Player username)
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
   public boolean playerExists(String allPlayers[],boolean newPlayer)
  {
      for(int i = 0; i < 100; i++)
      {
          if(nm == allPlayers[i])
          {
              i = 100;
              newPlayer = false;
            }
            else
            {
                newPlayer = true;
            }
        }
      return newPlayer;
            
  }
    
    

