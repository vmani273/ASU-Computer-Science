import java.util.Scanner;
/*
AUTHOR: <Vishwas Mani>
ILENAME: Lab7.java
SPECIFICATION: <Using a builder class as well as a main method to build a row and a pyramid based on user input>
LAB LETTER FOR CLOSED LAB: F
FOR: CSE 110 - > Lab 7 
TIME SPENT: <2 hours>
*/
public class Lab7 {
	public static void main(String[] args) {
		Scanner scan; // establishing all variables and scanner
		String name;
		int posIntRow;
		int posIntPyr;
		
		scan = new Scanner(System.in); // creaging new scanner
		
		System.out.println("Name of the builder"); // asking user for the name of the builder
		name = scan.next(); // saving this in variable "name"
		
		Builder guy = new Builder(name); // creating new Builder named "guy"
		
		System.out.println("The name of builder is: " + guy.getName()); // printing the name of the guy
		
		System.out.println("Enter a positive integer"); // asking for a positive integer to print row
		posIntRow = scan.nextInt(); // saving user input in variable "posIntRow"
		
		System.out.println(guy.makeRow(posIntRow, "*")); // Printing row
		
		System.out.println("Enter a positive odd integer, representing number of stars in the base of a pyramid:"); // asking for a positive integer to print the pyramid 
		posIntPyr = scan.nextInt(); // saving this is variable "postIntPyr"
		
		
		guy.makePyramid(posIntPyr, "*"); // making the pyramid
		
		

		
		scan.close(); // closing scanner
		
		
	}
}
