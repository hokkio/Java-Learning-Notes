import java.util.Scanner; //Before using Scanner function you must import it

public class User_input {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //x is the name of the scanner
		
		System.out.println("What\'s your name?");
		String name = scanner.nextLine();
		
		System.out.println("What\'s your age?");
		int age = scanner.nextInt(); //There is still a "\n" inside the scanner
		
		scanner.nextLine(); //In order to erase that "\n"
		
		System.out.println("What food do you like best?");
		String food = scanner.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("You like to eat " + food);

		scanner.close();
	}

}
