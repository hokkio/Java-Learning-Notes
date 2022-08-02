
import java.util.Scanner;
public class While_loop {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		while (name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		// The do Loop
	//	do { 
	//		System.out.print("Enter your name: ");
	//		name = scanner.nextLine();
	//		
	//	} while (name.isBlank());
		
		System.out.print("Hello " + name);
		scanner.close();
		
		
		
		

	}

}
