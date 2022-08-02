
import java.util.Scanner;
import java.util.Random;
public class Logical_operators {

	public static void main(String[] args) {
		// logical operators = used to connect two or more expressions
		
		// && = AND both expressions must be true
		// || = OR either condition must be true
		// ! = NOT reverses boolean value of condition
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int temp = random.nextInt(42)+1;
		
		//Example for && and
		if (temp>30) {
			System.out.println("It\'s so hot outside!\nTemputaur now is: " + temp + " degrees");
		}
		else if (temp>=20 && temp<=30) { //Use OR will became all range
			System.out.println("It\'s warm outside!\nTemputaur now is: " + temp + " degrees");
		}
		else {
			System.out.println("It\'s cold outside!\nTemputaur now is: " + temp + " degrees");
		}
		
		//Example for || or
		System.out.println("Do you want to go outside?");
		String will = scanner.next();
		
		if (will.equals("q") || will.equals("Q")) {
			System.out.println("You have been in outside!");
		}
		else {
			System.out.println("You stay at your home!");
			
		//Example for ! Not
	//	if (!will.equals("q") && !will.equals("Q")) {
	//		System.out.println("You stay at your home!");
	//	}
	//	else {
	//		System.out.println("You have been in outside!");
	//	}	
			
			scanner.close();
		}

	}

}
