
import java.util.Scanner;
public class If_statements {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("How old are you?");
		int age = scanner.nextInt();
		//int age = 15; //This is the original one
		
		if (age>=75) { //If the first if statement is true
			System.out.print("OK Boomer!"); //then the statement behind it will be all skip
		}
		else if (age>=18) {
			System.out.print("You\\'re a adult!");
		}
		else if (age>=13) {
			System.out.print("You are a teenager!");
		}
		else {
			System.out.print("You\'re a child!");
		}
		
		scanner.close();
		
		
		
		
	}
}
