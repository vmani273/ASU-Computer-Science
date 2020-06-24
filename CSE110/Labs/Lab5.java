import java.util.Scanner;

/*
AUTHOR: <Vishwas Mani>
ILENAME: Lab5.java
SPECIFICATION: <Giving user 2 options, and performing a task based on what the user chose>
FOR: CSE 110 - Lab #5
TIME SPENT: <30 minutes>
*/
public class Lab5 {
	public static void main(String[] args) {
		int option; // establishing variables
		int num1;
		int num2;
		int height;
		Scanner scan = new Scanner(System.in); // creating new scanner for user input;
		
		while(true) {
			
			System.out.println("Please choose your choice from following menu:\n" + 
					"1) Print through all integer numbers between two given integers.\n" + 
					"2) Display a right triangular pattern of stars.\n" + 
					"3) Quit."); // asking user for 3 options
			option = scan.nextInt();
	
			switch(option) { // creating a switch statement to deal with each input
			case 1:
				System.out.println("Enter the start number:"); // asking for starting number
				num1 = scan.nextInt();
				System.out.println("Enter the end number:"); // asking for ending number
				num2 = scan.nextInt();
				for(int i = num1; i <= num2; i++) { // // creating a for loop to print all numbers between the two given numbers
					System.out.print(i + " ");
					
				}
				System.out.println();
				break; 
			case 2:
				System.out.println("Enter the height"); // asking for the height
				height = scan.nextInt();
				
				for(int x = 0; x <= height; x++) { // uses a nested for loop to display a right triangular pattern of stars using the given height
					for(int y = 0; y< x; y++) {
						System.out.print("* ");
					}
					System.out.println("");
				}
				break;
			case 3:
				System.exit(0); //// displays an error if case 3 is chosen
				break;
			default:
				System.out.println("ERROR: Please ONLY select one of the given options"); // If user prints out anything other than the given option, this error statement gets printed out.
				break;

			}
			
			
			
			
		}
	}
}
