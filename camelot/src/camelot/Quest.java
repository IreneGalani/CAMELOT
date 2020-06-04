package camelot;

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
    

    
    public Quest(int qNumber, int pl)
    {
        this.questNumber=qNumber;
        this.players=pl;
    }
    
    
    
    
        
    public int getQuestNumber(){
		return questNumber; 
		
    }
    public int getNumPlayers(){
		return questNumber; 
		
    }
    
    
           public void setMissioners(int pl,int qNumber){
		
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
            
          }
          public int getMissioners(){
		  return this.mis;
           }
   }	
