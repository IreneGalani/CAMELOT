
public class Rules
{
	
	private boolean validNumPlayers = false;
	private boolean validSpRoles = false;
	
  	public boolean verifyNumPlayers(boolean validNumPlayers)
	{
       		if(np >= 5 && np <= 10)
		{
           		validNumPlayers = true;
           		return validNumPlayers; 
		}
	}

    	public boolean verifySpRoles(boolean validSpRoles)
    {
     if(percival.isUsed = true && merlin.isUsed = false)
     {
         validSpRoles = false;
        }
     
     else if(mordred.isUsed = true && merlin.isUsed = false)
     {
         validSpRoles = false;
        }
        
     else if(morgana.isUsed = true && (merlin.isUsed = false || percival.isUsed = false))
     {
         validSpRoles = false;
        }
     else if(numPlayers = 5)
     {
         if(percival.isUsed = true && mordred.isUsed = false && morgana.isUsed = false)
         {
             valiSpRoles = false;
            }
         else if( merlin.isUsed = true && percival.isUsed = true && mordred.isUsed = true && oberon.isUsed = true && morgana.isUsed = true)
         {
             validSpRoles = false;
            }  
     }
     else {
         validSpRoles = true;
        }
     
     return validSpRoles;
    }
}
