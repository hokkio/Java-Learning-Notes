
public class Switches {

	public static void main(String[] args) {


		String day = "Wednesday";
		
		switch(day) { 
		// If it has sth suitable then it will start outputing no matter if it's right
			case "Sunday": System.out.print("It is Sunday!");
			break;
			case "Monday": System.out.print("It is Monday!");
			break;
			case "Tuesday": System.out.print("It is Tuesday!");
			break;
			case "Wednesday": System.out.print("It is Wednesday!");
			break;
			case "Thursady": System.out.print("It is Thursday!");
			break;
			case "Friday": System.out.print("It is Friday!");
			break;
			case "Saturday": System.out.print("It is Saturday!");
			break;
			
			default: System.out.print("That\'s not a fucking day!");
			// If there is no suitable ans then output this ==> default
		}

	}

}
