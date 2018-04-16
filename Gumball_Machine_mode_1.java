// Cost : 25   Accepts only Quarter
class Gumball_machine_mode1 
{
	private int num_gumballs;
	private boolean has_quarter;
	
	
	
	public  Gumball_machine_mode1 (int size)
	{
	  this.num_gumballs = size;
	  this.has_quarter = false;
	}

	
	
	public void insertQuarter(int coin)
	{
		if(coin == 25)
		{
			this.has_quarter = true;
		}
		else
		{
			this.has_quarter = false;
		}
	}
	
	
	
	public void turnCrank()
	{
		if (this.has_quarter)
		{
			
			
			if (this.num_gumballs > 0)
			{
				
			  this.num_gumballs--;
			  this.has_quarter = false;
			  System.out.println(  "Thanks for your quarter , Gumball ejected!"  );
			  
			}
			
		
		   else
		   {
			System.out.println(  "No More Gumballs!  sorry, can't return your quarter."  );
		   }
			
			
	   }
	
		
	else
	{
		System.out.println(  "Please insert a quarter"  );
	}
	
	}

}
