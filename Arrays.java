package Lesson_11_to_20;

public class Arrays {

	public static void main(String[] args) {
		
		// array = used to store multiple values in a single variable

		String[] cars = {"Camaro", "Corvette", "Tesla"}; // All need to be String
		
		cars[0] = "Mustang";
		
		cars = new String[3];
		
		cars[0]="Camaro"; // needs to be start with 0
		cars[1]="Corvette";
		cars[2]="Tesla";
		
		System.out.println(cars[2]);
		// out of the numb ==>  ArrayIndexOutOfBoundsException
		
		
		for(int i=0; i<cars.length; i++) { //cars.length ==> 3 ==> 0,1,2, if we use '<=' then in contains 0,1,2,3 
			System.out.println(cars[i]);
		}

	}

}
