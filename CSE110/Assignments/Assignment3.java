import java.util.Scanner;

/*
AUTHOR: <Vishwas Mani>
ILENAME: Lab4.java
SPECIFICATION: <Part 1 consists of different problems revolving around switch statements and printing two programs.  Part 2 asks user for various options and according performing different actions.>
FOR: CSE 110 - > Assignment 3
TIME SPENT: <1 hour>
*/

/*                               PART 1
 * 1)
 * 		a. The value of x after the switch statement executes is 11
 * 		b. The value of x after the switch statement executes is 4
 * 
 * 2)
 * 		a. The value of x after the statement in executed is 3
 * 		b. The value of x after the statement in executed is 2
 * 3)
 * 		a. After the code provided terminates, x will be 128.
 * 
 * 4)
 * 		a. 0  10
 * 	       1  9
 *         2  8 
 * 	   	   3  7 
 *         4  6
 *        
 *      b. *
 *         =====
 *         *
 *         ====
 *         *
 *         ===
 *         *
 *         ==
 *         *
 *         =
 *         
 * 
 * 		   
 */        
           
public class Assignment3 {
	public static void main(String[] args) {
		Scanner scan; // declaring all variables
		double firstOpe;
		double secondOpe;
		String selection;
		scan = new Scanner(System.in); // establishing the scanner
		System.out.println("Welcome to the calculator");  
		
		System.out.print("Enter the first operand: "); // asking for first operand
		firstOpe = scan.nextDouble(); // saving first operand in variable "firstOpe"
		System.out.print("Enter the second operand: "); // saving second operand in variable "secondOpe"
		secondOpe = scan.nextDouble();
		
		System.out.println("Operations are:\n" + // providing user with different options
				"ADD or + for addition\n" + 
				"SUBTRACT or - for subraction\n" + 
				"MULTIPLY or * for multiplication\n" + 
				"DIVIDE or / for division");
		
		System.out.println("Enter your selection: "); // Asking user for their selection
		selection = scan.next(); // saving their selection in variable ""
		
		switch(selection) { // making a switch statement with the vairous options provided
			case "ADD":
			case "+": // this case calculates the sum of the two operands
				double sum = secondOpe + firstOpe;  
				String sumRounded = String.format("%.1f", sum);
				System.out.println(sumRounded);
				break;
			case "SUBTRACT": 
			case "-":  // this case calculates the difference of the two operands
				double diff = firstOpe - secondOpe;
				String diffRounded = String.format("%.1f", diff);
				System.out.println(diffRounded);
				break;
			case "MULTIPLY":
			case "*": // // this case calculates the product of the two operands
				double multiply = firstOpe * secondOpe;
				String multiplyRounded = String.format("%.1f", multiply);
				System.out.println("The product is " + multiplyRounded);
				break;
			case "DIVIDE":
			case "/": // // this case calculates the quotient of the two operands
				double divide = firstOpe / secondOpe;
				String divideRounded = String.format("%.1f", divide);
				System.out.println("The quotient is " + divideRounded);
				break;
			default:
				System.out.println("ERROR: PLEASE SELECT ONE OF THE FOLLOWING OPTIONS PROVIDED");
		
			
		}
		
		
	}
}
