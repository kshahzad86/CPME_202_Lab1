//import demo.Gumball_machine;


import java.io.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String Answer ="";
		
        try 
        
        
        {
        	System.out.println("which mode of gumball machine you want to select:");
        	System.out.println("  MODE: a        ,        MODE: b              ,  MODE: c");
        	System.out.println("Cost  25c        ,        Cost 50c             ,  Cost 50c");
        	System.out.println("Coin: 25c only   ,     Coin: 25c  25c          , Coin: 5c ,10c ,25c");
        	System.out.println(" ");
        	System.out.println(" ");
        	System.out.print("Enter :  ");
			String mode = br.readLine();
			
			switch (mode)
			{
			case "a":
			{
				Gumball_machine_mode1  GM_OBJECT1 = new Gumball_machine_mode1(3);
				System.out.println("Enter quarter:");
				int coin_value = Integer.parseInt(br.readLine());
				GM_OBJECT1.insertQuarter(coin_value);
				GM_OBJECT1.turnCrank();
				break;
			}
			case"b":
			{ 
				
				Gumball_machine_mode2  GM_OBJECT2 = new Gumball_machine_mode2(3);
				int i=0;
			    while(i < 2)
			    {
			    	System.out.println("Enter quarter:");
			    	int coin_value = Integer.parseInt(br.readLine());
			    	GM_OBJECT2.insert_Quarter(coin_value);
			    	i++;
			    }
			    GM_OBJECT2.turnCrank();
			    break;
			}
			
			case"c":
			{

				Gumball_machine_mode3  GM_OBJECT3 = new Gumball_machine_mode3(3);
				
				do
				{ 
					System.out.println("Enter coin:");
				    int coin_value = Integer.parseInt(br.readLine());
				    GM_OBJECT3.insertCoin(coin_value);
				    System.out.println("Do you want to enter more coin,  enter y or n :");
				    Answer = br.readLine();
					
				}while(Answer == "n");
				
				GM_OBJECT3.turnCrank();
				break;
			}
				
		    default: 
		    {
		    	System.out.printf("Error! ");
                return;
		    }
			
			
			}
			
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
     
		
	}

}
