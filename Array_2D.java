package Lesson_11_to_20;

public class Array_2D {

	public static void main(String[] args) {
		
		// 2D array = an array of arrays, have rows and column
		
		//String[][] cars = new String [3][3];
		
		String[][] cars = {
								{"Camaro", "Corvette", "Silverado"},
								{"Mustang", "Ranger", "F-150"}, 
								{"Ferrari", "Lambo", "Tesla"}
							}; 
		
	//	cars[0][0] = "Camaro";
	//	cars[0][1] = "Corvette";
	//	cars[0][2] = "Silverado";
	//	cars[1][0] = "Mustang";
	//	cars[1][1] = "Ranger";
	//	cars[1][2] = "F-150";
	//	cars[2][0] = "Ferrari";
	//	cars[2][1] = "Lambo";
	//	cars[2][2] = "Tesla";

		for (int i=0; i<cars.length; i++) {    //0,1,2            
			System.out.println();
			for (int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
				
				              
				/*     
				 *            (confirm rows)  (confirm columns)  
				 *     i   j    cars.length    cars[i].length 
				 *     0   0        3                 3 ==> start inner loop
				 *     0   1        3                 3
				 *     ...
				 * 
				 */
			}
		}
		
		
	}

}
