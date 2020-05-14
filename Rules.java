
public class Rules
{
	private boolean validSpRoles = false;
	
  	public boolean verifyNumPlayers(int np)
    	{
       		if(np >= 5 && np <= 10)
       		{
           		return true;
        	}
        	 else
         	{
            	 return false;
           	 }
       
   	 }
public boolean verifySpRoles(Role merlin,Role percival,Role mordred,Role oberon,Role morgana,boolean isUsed)
    {
     if(percival.isUsed == true && merlin.isUsed == false)
     {
         return false;
        }
     
     else if(mordred.isUsed == true && merlin.isUsed == false)
     {
         return false;
        }
        
     else if(morgana.isUsed == true && (merlin.isUsed == false || percival.isUsed == false))
     {
         return false;
        }
     else if(numPlayers == 5)
     {
        if(percival.isUsed == true && mordred.isUsed == false && morgana.isUsed == false)
         {
             return false;
            }
         else if( merlin.isUsed == true && percival.isUsed == true && mordred.isUsed == true && oberon.isUsed == true && morgana.isUsed == true)
         {
             return false;
            }
            else 
            {
         return true;
        }
    }
        else
        {
            return true;
    }
}
    	
}
