import java.util.Scanner;

public class Basic_math {

	public static void main(String[] args) {
		
		double x;
		double y;
		double z;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scan.nextDouble();
		System.out.println("Enter side y: ");
		y = scan.nextDouble();
		
		z = Math.sqrt( ( x * x ) + ( y * y ) ); //Calculating the hypothenuse
		
		//z = Math.max(x, y); //Find the Maximum or Minimum (min)
		
		//z = Math.abs(y);
		//z = Math.sqrt(y); 
		//z = Math.round(y);
		//z = Math.ceil(y);
		//z = Math.floor(y);
				
		System.out.println("The hypothenuse is: " + z);
		
		scan.close();
		
		

	}

}
