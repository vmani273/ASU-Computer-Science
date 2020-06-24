import java.util.Scanner;

/*
AUTHOR: <Vishwas Mani>
ILENAME: Lab2.java
SPECIFICATION: <Asking and Saving user's name as well as returning their name in caps and name length.  I also use two strings to differentiate between "==" and "++" \>
FOR: CSE 110 - Lab #2
TIME SPENT: <1 hour>
*/

public class Lab2 {
	public static void main(String[] args) {
		String firstName; // establishing all variables in this program
		String lastName;
		String fullName;
		String fullNameCaps;
		String title1;
		String title2;
		int nameLength;

		Scanner scan = new Scanner(System.in);  // Creating new scanner used in the rest of the program

		System.out.println("Please enter first name: "); // asking user for first name
		firstName = scan.nextLine(); // Saving first name
		System.out.println("Please enter last name: "); // asking user for last name
		lastName = scan.nextLine(); // saving last name 
		fullName = firstName + " " + lastName;
		fullNameCaps = fullName.toUpperCase(); // converting to uppercase
		nameLength = fullNameCaps.length(); // returns length on name 

		System.out.println("Full name (in capitals): " + fullNameCaps); // prints full name all caps
		System.out.println("Length of full name: " + nameLength); // prints length of full name

		title1 = new String("cse110");  //creating new string
		title2 = "cse110"; // new string

		if (title1 == title2) { // comparing both variables with "==".  Generally not used for strings
			System.out.println("String comparison using \"==\" sign works");
		} else {
			System.out.println("String comparison using \"==\" sign does NOT work");
		}
		if (title1.equals(title2)) { //// comparing both variables with ".equals".  Generally not used for strings
			System.out.println("String comparison using \"equals\" method works");
		} else {
			System.out.println("String comparison using \"equals\" method does NOT work");
		}

	}

}
