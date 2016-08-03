/*
 * Program to print the total number of days in a given year. 
 * Note : Leap year is not taken into consideration.
 */
public class Assign4 {

	public static void main(String[] args) {

		int monthInt = 15; // month feed to this variable from 1 to 12
							// corresponding January to December
		int daysInt = 0;
		String monthString = "Error";

		switch (monthInt) {
		case 1:
			daysInt = 31;
			monthString = "January";
			break;
		case 2:
			daysInt = 28;
			monthString = "February";
			break;
		case 3:
			daysInt = 31;
			monthString = "March";
			break;
		case 4:
			daysInt = 30;
			monthString = "April";
			break;
		case 5:
			daysInt = 31;
			monthString = "May";
			break;
		case 6:
			daysInt = 30;
			monthString = "June";
			break;
		case 7:
			daysInt = 31;
			monthString = "July";
			break;
		case 8:
			daysInt = 31;
			monthString = "August";
			break;
		case 9:
			daysInt = 30;
			monthString = "September";
			break;
		case 10:
			daysInt = 31;
			monthString = "October";
			break;
		case 11:
			daysInt = 30;
			monthString = "November";
			break;
		case 12:
			daysInt = 31;
			monthString = "December";
			break;
		default:
			System.out.println("It is not a valid month");
			
		}

		System.out.println(monthString + " has " + daysInt + " days in it.");
	}

}
