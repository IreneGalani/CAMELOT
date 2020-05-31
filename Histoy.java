package camelot1;

public class Histoy {
	  
    private boolean emptyHistory;
    private boolean saveGame;// save current game?
    private int savedGames;// #of saved Games
    
    //nea
          
    private String[] us;//username   
    //private String winnerside;
    
    private boolean[] newpl;//new player
    
    private historyData[] allPlayerList; //= new historyData[100];
    private int x=0;// metrhths gia xwro list
    historyData h;  //to istoriko exei historydata
    
    
    public Histoy (boolean svG, String[] p)
    {
        this.emptyHistory=true;
        this.saveGame=svG;
        this.savedGames=0;
        this.us=p;
    }

    
   
    public void setEmptyHistory()
    {
        this.emptyHistory= true;
        this.savedGames=0;
        
    }
    
    public void setSaveGame(boolean saveG)
    {
        this.saveGame= saveG;
    }
    
    public void setSavedGames()
    {if(this.saveGame==true){
        this.savedGames++;
    }
    }
     public boolean getSaveGame() {
    	return this.saveGame;
    }
    
   
    public int getSavedGames() {
        return this.savedGames;
    
    }
    public boolean getEm() {
    	
     return this.emptyHistory;
    }
    
    
    //new! apo dw kai katw
    public void HistoryExist(){
       if (saveGame==true){
        this.emptyHistory=false;
        //this.savedGames= savedG+1;
    }
    }    
    
    public void addToHistory(historyData h){
       if(this.saveGame==true){       
        for(int i=0; i<us.length;i++){
           if(newpl[i]==true){
                  x++;
                  this.allPlayerList[x]=h;                
              }
            }
        for(int i=0; i<x; i++){
           
            
             this.allPlayerList[i].setHistoryData(us[i]);
             
        }
      }
    }
    
    public void clearHistory(boolean clear){
    	if(clear==true) {
        this.emptyHistory=true;        
        this.savedGames=0;
        for(int i=0; i<x; i++){                
               this.allPlayerList[i].ClearData(us[i]);
        }        
    	}
    }      
   //orisma: an kapoios Player einai new ( prepei na ginetai gia kathe paikth ths listas)
    public void checkIfNewPlayer(boolean[] NewPlayer ){
      for(int i=0; i<us.length;i++) {
    	if(NewPlayer[i]) {
         this.newpl[i]=true;
       }else {
          this.newpl[i]=false;
        }
        
    }
    }
    public historyData[] GetList(){
        return this.allPlayerList;
    }       
    
}
