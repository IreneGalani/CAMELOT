

/**
 *  History
 * 
  
 * @version1
 */
public class History{
    
    private boolean emptyHistory;
    private boolean saveGame;// save current game?
    private int savedGames;// #of saved Games
    
    //nea
          
    private String us;//username   
    private String winnerside;
    private boolean newpl;//new player
    
    private historyData[] allPlayerList= new historyData[100];
    private int x=0;// metrhths gia xwro list
    historyData h;  
    
    public History(boolean svG)
    {
        this.emptyHistory=true;
        this.saveGame=svG;
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
    //new! apo dw kai katw
    public void HistoryExist(boolean emHistory,boolean saveG, int savedG){
       if (savedGames!=0){
        this.emptyHistory=false;
        this.savedGames= savedG+1;
    }
    }    
    
    public void addToHistory(historyData h){
       if(this.saveGame=true){
        if(x<allPlayerList.length){                            
           
              if(this.newpl==true){
                  x++;
                  this.allPlayerList[x]=h;                
              }
            
             for(int i=1; i==x; i++){ 
               this.allPlayerList[i].setHistoryData(us,winnerside);
              }               
           
        }        
      }
    }
    
    public void clearHistory(historyData[] allPlayerList){
        this.emptyHistory=true;        
        this.savedGames=0;
        for(int i=1; i==x; i++){                
               this.allPlayerList[i].setHistoryData("null","null");
        }
        this.x=0;  
        
    }
    
    
   
    public void checkIfNewPlayer(boolean NewPlayer ){
         if(NewPlayer) {
         this.newpl=true;
       }
        
    }
    public historyData[] GetList(){
        return this.allPlayerList;
    }
    
    
    
}
    

