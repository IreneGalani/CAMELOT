package camelot1;

public class historyData {
private String usName;
    
    private String win; // winner's side, metabliti apo getWinnersSide- EndoftheGame
    //
    private String pl_side;
    
    //Player p= new Player(usName);
    private int w;
    private int d;
    
    private int g;
     Current_Game cg; 
   
    public historyData( Current_Game cg,String winner)//(String usName,String side,String w, int games,int def,int wins  )
    {
    	cg.getPlayer();
          this.usName=cg.p.getUsername();                            
         this.g=cg.p.playerGames+1;
         this.pl_side=cg.p.getPlayerSide();
         this.win=winner;
         this.d=cg.p.playerDefeats;
         this.w=cg.p.playerWins;
        
    }
 
    public void setHistoryData(String usName){              
         
         
         if(this.pl_side==win){
                    this.w++;
         }
         else{
                   this.d++;
         }
               
    }
    public void ClearData(String usName){
         this.usName=null;                            
         this.g=0;
         this.w=0;
         this.d=0;
        
    }   
    
   
    public String toString(){
    return String.format("Name: %s Side: %s PlayerGames: %d PlayerWins: %d PlayerDefeats: %d", this.usName,this.pl_side,this.g,this.w, this.d);
    }
}
