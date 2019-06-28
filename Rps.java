import java.util.Random;
import java.util.Scanner;
class Rps {

	public static void main(String[] args) {
	//YF Rock paper Scissors
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int userChoice, computerChoice;
		
		System.out.println("Choices (0 = Rock 1 = Paper 2 = Scissors):");
		
		userChoice = scanner.nextInt();
		
		if (userChoice < 0 || userChoice> 2 )
		
		
		{
		System.out.println("Invalid Choice ENDING");	
		System.exit(0);
		}
		//if (!userChoice.equals(computerChoice) {}
		//if (!userChoice == computerChoice) ()
		
		
				
		
		
		computerChoice = random.nextInt(3);
		
		if(userChoice == computerChoice)
		{
		if(userChoice == 0)
		
			System.out.println("both player chose rock");
		
		
		
		else if (userChoice == 1)
		{
			System.out.println("both players chose paper");
		}
		else {
			System.out.println("both players chose scissors");
		}
		System.exit(0);{
		}
		}
	
		
		
		
	
	
	
		
		if (userChoice == 0)
		{
			if(computerChoice == 1)
			{
				System.out.println("user rocks Computer chose paper");
				System.out.println("Winner winner chicken dinner!");
				
			}
			else
			{
				System.out.println("user rocks Computer chose scissors");
				System.out.println("winner winner chicken dinner");
			}
		}
			else if(userChoice == 1)
			{
				if(computerChoice == 0)
				
				System.out.println("user is a paper - Computer chose rock");
				System.out.println("winner winner chicken dinner");
				}
			
			else
			{
				System.out.println("user is a paper Computer has scissors");
				System.out.println("You loose buddy!");
			}
		
	  
			
			if(computerChoice == 2)
			{
				System.out.println("user has scissors Computer has rock");
				System.out.println("You loose buddy!");
				
				{
					
				}
				
			}
			else
			{
				System.out.println("user has scissors Computer has paper");
				System.out.println("winner winner chicken dinner");
				scanner.close();
		
			}
		}
		
	}




