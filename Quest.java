
/**
 * Quest
 * 
 * 
 * @version1
 */
public class Quest 
{
    private int questNumber;
    private int missioners;
    private int players;
    private int mis;
    //private int r_as;
    //Current_Game numPL= new Current_Game(players,r_as);

    
    public Quest(int qNumber, int pl)
    {
        this.questNumber=qNumber;
        this.players=pl;
    }
    
    
    public void setQuestNumber(int qNumber)
    {
             this.questNumber=qNumber;
    } 
    
    public void setNumPlayers(int pl)
    {
             this.players=pl;
    } 
    
        
    public int getQuestNumber(){
		return questNumber; 
		
    }
    public int getNumPlayers(){
		return questNumber; 
		
    }
    
    
          public int getMissioners(int pl,int qNumber){
		
           int  num=pl;
	   int  noQ=qNumber;
		
             if(num==5){
		  if(noQ==1){
                     missioners=2;
                    }
                  else if(noQ==2){
                     missioners=3;
                    }
                  else if(noQ==3){
                       missioners=2;
                  }
                  else if(noQ==4){
                      missioners=3;
                  }
                  else if(noQ==5){
                       missioners=3;
                  }
                }
             else if(num==6){
		  if(noQ==1){
                    missioners=2;
                    }
                  else if(noQ==2){
                    missioners=3;
                    }
                  else if(noQ==3){
                      missioners=4;
                  }
                  else if(noQ==4){
                       missioners=3;
                  }
                  else if(noQ==5){
                      missioners=4;
                  }
                }
             else if(num==7){
		  if(noQ==1){
                     missioners=2;
                    }
                  else if(noQ==2){
                    missioners=3;
                    }
                  else if(noQ==3){
                      missioners=3;
                  }
                  else if(noQ==4){
                      missioners=4;
                  }
                  else if(noQ==5){
                      missioners=4;
                  }
                }
             else if(num==8){
		  if(noQ==1){
                    missioners=3;
                    }
                  else if(noQ==2){
                    return missioners=4;
                    }
                  else if(noQ==3){
                     missioners=4;
                  }
                  else if(noQ==4){
                      missioners=5;
                  }
                  else if(noQ==5){
                      missioners=5;
                  }
                }
             else if(num==9){
		  if(noQ==1){
                    missioners=3;
                    }
                  else if(noQ==2){
                    missioners=4;
                    }
                  else if(noQ==3){
                      missioners=4;
                  }
                  else if(noQ==4){
                      missioners=5;
                  }
                  else if(noQ==5){
                      missioners=5;
                  }
                }
             else if(num==10){
		  if(noQ==1){
                    missioners=3;
                    }
                  else if(noQ==2){
                    missioners=4;
                    }
                  else if(noQ==3){
                      missioners=4;
                  }
                  else if(noQ==4){
                      missioners=5;
                  }
                  else if(noQ==5){
                      missioners=5;
                  }
                }
                
                else{
                   missioners=1;
             }
             
             this.mis=missioners; 
             return mis;
          }
		  
		  
		
}
