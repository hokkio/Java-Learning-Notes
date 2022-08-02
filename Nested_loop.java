package Lesson_11_to_20;
import java.util.Scanner;
public class Nested_loop {

	public static void main(String[] args) {

		// Nested loop = a loop inside of a loop
		
		Scanner scanner = new Scanner(System.in);
		
		int rows, columns;
		String symbol = "";
		
		System.out.print("Enter # of rows: ");
		rows = scanner.nextInt();
		System.out.print("Enter # of columns; ");
		columns = scanner.nextInt();
		System.out.print("Enter a symbol: ");
		symbol = scanner.next();
		
		for (int i=1; i<=rows; i++) { // '<=' make it true, can't be '=' 
			System.out.println(); //Opening a new line for the symbol
			for (int j=1; j<=columns; j++) {
				System.out.print(symbol);
			}
		}
		
		scanner.close();

	}

}
