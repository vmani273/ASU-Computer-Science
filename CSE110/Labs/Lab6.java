import java.util.Scanner; 
/*
AUTHOR: <Vishwas Mani>
ILENAME: Lab6.java
SPECIFICATION: <Using object oriented programming to create a person class and utilizing it another classes >
FOR: CSE 110 - > Lab6
TIME SPENT: <1 hour>
*/
public class Lab6 { 	
	public static void main(String[] args) {
		String firstName = ""; // establishing all variables
		String lastName = "";
		int birthYear;
		Scanner scan;
		scan = new Scanner(System.in); // creating new scanner for input
		
		
		System.out.println("Enter the first name of the person: "); // asking user for first name of person
		firstName = scan.next();
		
		System.out.println("Enter the last name of the person: "); // asking  user for last name of the person
		lastName = scan.next();
		
		System.out.println("Enter the birth year of the person: "); // asking for birth year of person
		birthYear = scan.nextInt();
		
		Person guy = new Person(firstName, lastName, birthYear); // creating new person called guy
		System.out.println(guy.getFirstName() + " is " + guy.getAge(2018) +  " years old in 2018 and will be " + (guy.getAge(2018) + 10) + " years old in ten years"); // printing out the final print statement
		
		
	}
}
