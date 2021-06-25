package classques;
import java.util.*;
class game{
	int number;
	int userNumber;
	int count;
	
	 game() {
		Random r = new Random();
		this.number = r.nextInt(100);
	}
	 
	int takeUserInput() {
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("GUESS THE NUMBER :");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		Scanner s= new Scanner(System.in);
		userNumber = s.nextInt();
		return userNumber;
	}
	
	boolean isCorrectNumber() {
		count++;
		if(userNumber == number)
			
		{   System.out.println("-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*--*-*-");
			System.out.println("You Guessed it RIGHT!! the correct Number is "+number+"\nYou guessed it in : "+count+" Tries ");
			System.out.println("-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*--*-*-");
			return true;
		}	
		else if(userNumber>number) {
			System.out.println("---------------------");
			System.out.println("Too High... Try Again!");
			System.out.println("---------------------");
			
			
		}
		else if(userNumber<number) {
			System.out.println("---------------------");
			System.out.println("Too low... Try Again!");
			System.out.println("---------------------");
		
		}
		
		return false;
	}
	
	
	
}


public class GuessGame {

	public static void main(String[] args) {
	
	boolean b = false;
	
	game g = new game();
	while(!b) 
	{
    
    g.takeUserInput();
    b=g.isCorrectNumber();
    
	}
	
	}

}
