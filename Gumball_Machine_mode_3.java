// Cost : 50   Accepts Nickle, Dime, Quarters
class Gumball_machine_mode3 
{
	private int num_gumballs = 0;
	private boolean has_coin = false;
	private double Gumball_size;
	private int Coin_total_amount = 0;
	
	
	
	public Gumball_machine_mode3(int size)
	{

	  this.num_gumballs = size;
	  this.has_coin = false;
    }

	
	
	public void insertCoin(int coin)
	{
		this.has_coin = true;
		
		if(coin == 5)
		{
			this.Coin_total_amount = this.Coin_total_amount + coin;
			this.has_coin = false;
			
		}
		
		else if(coin == 10)
		{
			this.Coin_total_amount = this.Coin_total_amount + coin;
			this.has_coin = false;
			
		}
		
		else if(coin == 25)
		{
			this.Coin_total_amount = this.Coin_total_amount + coin;
			this.has_coin = false;
		
		}
		
		else
		{
			System.out.println("you have inserted the wrong coin" );
		}
	}
	
	
	
       public void turnCrank()
	{
		if (this.has_coin != true)
		{
			
	    	if(this.Coin_total_amount == 50)
			{
	    		if (this.num_gumballs > 0)
	    		{
	    			
				this.num_gumballs --;
				System.out.println("Thank you, the total amount is  "+Coin_total_amount + " , Gumball Ejected");
				this.Coin_total_amount = 0;
				
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
