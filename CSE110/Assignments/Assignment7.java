import java.util.Scanner;
/*
AUTHOR: <Vishwas Mani>
ILENAME: Assignment7.java
SPECIFICATION: <Using an IntList class to modify and array in various ways with the given options>
LAB LETTER FOR CLOSED LAB: F
FOR: CSE 110 - > Assignment 7 - Monday, Wednesday, Friday 2:00 to 2:50pm
TIME SPENT: <2 hours>
*/
/*         PART ONE
 * 
 * 1) 
 * 	  a  is valid
 * 	  b. is not vaid. It is supposed to be  int[] words = new int[10];
 *    c. is valid.
 * 	  d. is not valid. It is supposed to be  double[] nums = {3.5, 35.1, 32.0};
 * 
 * 
 * 2)
 * Private String Concat(String[] arr, int num) {
		String con = "";
		for(int i = 0; i < num; i++) {
			con += arr[i];e
		}
		
		return con;
	}
 * 
 * 
 */



public class Assignment7 {
	
	
	public static void main(String[] args) {
		Scanner scan; // establishing all variables and scanner
		String choice;
		int size;
		
		scan = new Scanner(System.in); // creating new scanner
		
		System.out.println("Please enter a size for the array: "); // asking user for the size of the array
		size = scan.nextInt();
		
		IntList arrFinal = new IntList(size);  // creating a new "intList" called arrFinal
		
		System.out.println("Command Options\n" + 
				"-----------------------------------\n" + 
				"a: add an integer in the array\n" + 
				"b: display the array\n" + 
				"c: compute and display the maximum\n" + 
				"d: compute and display the minimum\n" + 
				"e: remove an integer from the array\n" + 
				"f: remove all integers from the array\n" + 
				"g: display list of integers that are greater than input value\n" + 
				"?: display the menu again\n" + 
				"q: quit this program");
		
		do { 
			System.out.println("Please enter a command or type ?"); // asking user for the command
			choice = scan.next(); // saving this in choice
			
			switch(choice) {
			case "a": // this case adds the user input to the integer
				System.out.println("Please enter an integer to add");
				int num1 = scan.nextInt();
				arrFinal.addInt(num1);
				break;
				
				
			case "b": // this case prints out the array
				System.out.println(arrFinal.toString());
				break;
				
			case "c": // case c prints the maximum of the array
				
				System.out.println("The maximum is: " + arrFinal.findMax());
				break;
			case "d": //  case d prints the minimum of the array
				System.out.println("The minimum is: " + arrFinal.findMin());
				break;
			case "e": // case e removes the value that the user inputs
				System.out.println("Please enter an integer to remove");
				int remove = scan.nextInt();
				arrFinal.removeFirst(remove);
				break;	
			case "f": // case f removes all values that the user inputs
				System.out.println("Please enter an integer to remove");
				int remove1 = scan.nextInt();
				arrFinal.removeAll(remove1);
				break;	
			
			case "g": // prints all values that are greater than value user inputed
				System.out.println("Enter an integer");
				int int2 = scan.nextInt();
				System.out.print("List of all integers greater than " + int2 + " are: ");
				for(int i = 0; i < arrFinal.countNumbers(int2).length; i++) {
					System.out.print(arrFinal.countNumbers(int2)[i] + " ");
				}
				System.out.println();
				break;
			case "?": // case to repeat options
				System.out.println("Command Options\n" + 
						"-----------------------------------\n" + 
						"a: add an integer in the array\n" + 
						"b: display the array\n" + 
						"c: compute and display the maximum\n" + 
						"d: compute and display the minimum\n" + 
						"e: remove an integer from the array\n" + 
						"f: remove all integers from the array\n" + 
						"g: display list of integers that are greater than input value\n" + 
						"?: display the menu again\n" + 
						"q: quit this program");
				break;
			case "q": // case for quitting program
				System.exit(0);
				break;
			}
			
		} while(choice != "q");
	
		scan.close();
	
	}
}
