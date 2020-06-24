import java.util.Scanner;
/*
AUTHOR: <Vishwas Mani>
ILENAME: Lab4.java
SPECIFICATION: <Providing 4 options which the user can choose from, and performing the task chosen  >
FOR: CSE 110 - > Lab 4
TIME SPENT: <1 hour>
*/

public class Lab4 {
	public static void main(String[] args) {

		int option;  // declaring variables
		int number = 0;

		Scanner scan = new Scanner(System.in); // establishing scanner
		System.out.println("Please choose your choice from following menu:");  // asking user to choose from different tasks 
		System.out.println("1) Calculate the sum of integers 1 to m.");
		System.out.println("2) Calculate the factorial of given number.");
		System.out.println("3) Find the first digit of a given number.");
		System.out.println("4) Quit.");
		option = scan.nextInt(); // saving answer in variable "option"

		do {

			if (option == 1 || option == 2 || option == 3) { // if the options are viable, asking user for number
				System.out.println("Enter the number:");
				number = scan.nextInt();
			}

			switch (option) { // using a switch statement to test different cases
			case 1: // finding sum until number using this method

				int sum = 0;  
				int counter = 1;
				while (counter <= number) {
					sum += counter;
					counter++;
				}
				System.out.println("The sum of the first " + number + " numbers is " + sum);
				break;

			case 2: // finding factorial of given number using this method

				int counter2 = 1;
				int fact = 1;
				while (counter2 <= number) {
					fact *= counter2;
					counter2++;

				}
				System.out.println("The factorial of " + number +  " is " + fact);
				break;

			case 3: // returning first digit from the left when given the initial number
				String numConvert = Integer.toString(number);
				System.out.println("The first integer of the given number from the left is " + numConvert.charAt(0));
				break;
			case 4: // Forces program to quit if this option is selected
				System.exit(0);
				break;
			default:
				System.out.println("ERROR: Please do not select anything apart from the listed options ");

			}
		
			// asking user for the four option again, after tasks are performed
			System.out.println("Please choose your choice from following menu:");
			System.out.println("1) Calculate the sum of integers 1 to m.");
			System.out.println("2) Calculate the factorial of given number.");
			System.out.println("3) Find the first digit of a given number.");
			System.out.println("4) Quit.");
			option = scan.nextInt();

		} while (true);

	}

}
