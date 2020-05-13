
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
    	 //eksetasi me obj tou chooseSpRoles()
	return validSpRoles;
   	}
}
