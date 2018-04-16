
// Cost : 50c   Accepts two Quarters
class Gumball_machine_mode2
{
	private int num_gumballs = 0;
	private boolean has_coin = false;
	private double Gumball_size;
	private int no_of_quarters = 0;
	private int Coin_total_amount = 0;
	
	
	
	
	public Gumball_machine_mode2(int size)
	{
		
	  this.num_gumballs = size;
	  this.has_coin = false;
	}

	
	
	public void insert_Quarter(int coin)
	{
		this.has_coin = true;
		
		if(coin == 25)
		{
			this.Coin_total_amount = this.Coin_total_amount + coin;
			this.has_coin = false;
			this.no_of_quarters++;
			
		}

		
		else
		{
			System.out.println("Wrong Coin inserted, Please insert only Quarters" );
		}
	}
	
	
	
       public void turnCrank()
	{
		if (this.has_coin != true)
		{
			
	    	if(this.no_of_quarters==2 && this.Coin_total_amount == 50)
			{
	    		if (this.num_gumballs > 0)
	    		{
	    			
				this.num_gumballs --;
				System.out.println("Thank you, the total amount is  "+Coin_total_amount + " , Gumball Ejected");
				this.Coin_total_amount = 0;
				this.no_of_quarters = 0;
				
				
	    		}
	    		
	    		else
	    		{
	    			System.out.println(  "No More Gumballs!  sorry, can't return your quarter."  );
	    		}
			}
			
											     
			else
			{
				System.out.println(" Not enough amount entered , Sorry cant return the coins ");
			}
			
	    }
	
	}
}
