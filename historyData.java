 
/**
 * Γράψτε μια περιγραφή της κλάσης historyData εδώ.
 * 
 * @author (Το όνομά σας) 
 * @version (Αριθμός έκδοσης ή ημερομηνία εδώ)
 */
public class historyData
{
    
    //metablites constructor Player
    private String usName;
    
    
    
    //metablites anatheshs sto setHistorydata  
    private int playerGames;
    private int playerWins;
    private int playerDefeats;
    private boolean newPlayer;
    private String username;
    
    private String win; // winner's side, metabliti apo getWinnersSide- EndoftheGame
    //
    private String pl_side;
    
    Player p= new Player(usName);
    
      
   
    public historyData(Player pl)
    {
        this.p=pl;
        
    }

    
    public void setnewP(boolean newP){
        this.newPlayer= p.getNewPlayer();
    }
    
    
    public void setHistoryData(String usName, String win){              
         this.usName=p.getUsername();                            
         this.playerGames=p.getPlayerGames()+1;
         this.pl_side=p.getPlayerSide();
         
         if(this.pl_side==win){
                    this.playerWins=p.getPlayerWins()+1;
         }
         else{
                   this.playerDefeats=p.getPlayerDefeats()+1;
         }
               
    }
    public int clearPLayerWins(){
       if(win=="null"){
       this.playerWins=0;       
       }  
       return playerWins;
    }
    public int clearPLayerDefeats(){
       if(win=="null"){
       this.playerDefeats=0;
    }
    return playerDefeats;       
    }
    public String toString(){
    return String.format("Name: %s Side: %s PlayerGames: %d PlayerWins: %d PlayerDefeats: %d", this.usName,this.pl_side,this.playerGames,this.playerWins, this.playerDefeats);
    }
}


