import java.util.*;
/*
AUTHOR: <Vishwas Mani>
ILENAME: Assignment4.java
SPECIFICATION: <Taking 2 numbers and finding the GCD for the first case, and taking a set of number and perform various tasks>
FOR: CSE 110 - Assignment 4
TIME SPENT: <2 hours>
*/
//                          PART 1
/*	1) a. i is : 5
 *        i is : 4
 *        i is : 3
 *        i is : 2
 *        i is : 1
 *        i is : 0
 *        
 *     b. while(i >= 0) {
 *     	    System.out.println("i is : " + i);
 *          i--;
 *        }
 *        
 *  2)  ***** 
 *      #####
 *      *****   
 *      #####
 *  
 *  3)  * * * * *
 *      * * * *
 *      * * * 
 *      * * 
 *      
 *  c)  Scanner scan = new Scanner(System.in);
 *  	System.out.println("Input a number between 0 and 100");
 *  	int ans = scan.nextInt();
 *  	while(!(ans < 100 && ans > 0)) {
 *  		System.out.println("Input a number between 0 and 100");
 *  	    ans = scan.nextInt();
 *      }
 *  
 *  
 *  	
 *  
 */
//                                  PART 2
public class Assignment4 {
	public static void main(String[] args) {

		int int1 = 0; // Establishing Variables
		int int2 = 0;
		int gcd = 0;
		int startingInt1 = 0;
		int startingInt2 = 0;
		double sum = 0;
		double max;
		double min;
		double average;
		String choice;
		List<Integer> sequence = new ArrayList <Integer>(); // creating an array called sequence
		Scanner scan;

		scan = new Scanner(System.in); // creating a new scanner

		do { // making a do loop

			System.out.println("Command Options\n" + "-----------------------------------\n" + "a: find gcd\n"
					+ "b: find max, min & average\n" + "?: Display\n" + "q: Quit");

			choice = scan.next(); // saving user input in variable choice

			switch (choice) { // creating a switch statement
			case "a":
				System.out.print("Enter the first integer: "); //  Asking user to enter first integer
				int1 = scan.nextInt(); // saving input in the variable int1
				startingInt1 = int1;

				System.out.print("Enter the second integer: ");// Asking user to enter second integer
				int2 = scan.nextInt(); // saving input in the variable int2
				startingInt2 = int2; 
				
			
				while (int1 != int2) { // Algorithm to find greatest common divisor
					if (int1 > int2) {
						int1 = int1 - int2;
					} else {
						int2 = int2 - int1; // 2
					}
					


				}
				gcd = int1; 

				System.out.println("The gcd of " + startingInt1 + " and " + startingInt2 + " is " + gcd); // printing out gcd
				break;
			case "b":
				
				System.out.print("Enter a sequence of integers, 0 to quit: "); // asking for sequence of numbers
				while (scan.hasNextInt()) { // adding list of numbers to an array
					int test = scan.nextInt();
					if (test != 0) {
						sequence.add(test); // adding to the array sequence
					} else {
						break;
					}

				}
				double added = 0;
				Collections.sort(sequence); // sorting array from smallest to largest
				System.out.println("Smallest: " + sequence.get(0)); // printing out smallest integer
				System.out.println("Largest: " + sequence.get(sequence.size() - 1)); // printing out largest integer
				for(int i = 0; i < sequence.size(); i++) {
					added += sequence.get(i); // for loop to find sum
				}
				System.out.println("Sum is: " + added); // printing out sum
				average = added / sequence.size();
				System.out.println("Average is: " + average); // printing out the average
			case "?":
				break; // repeats the instructions
				
			case "q":
				System.out.println("USER HAS ENDED THE PROGRAM"); // quits program
				System.exit(0);
			}

		} while (choice != "q"); // condition for while loop

		scan.close();

	}
}
