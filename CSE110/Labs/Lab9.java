import java.util.*;
/*
AUTHOR: <Vishwas Mani>
ILENAME: Lab9.java
SPECIFICATION: <Learing the basics of the array object as well as different functions of the array>
LAB LETTER FOR CLOSED LAB: F
FOR: CSE 110 - > Lab 9 - Monday, Wednesday, Friday 2:00 to 2:50pm
TIME SPENT: <30 minutes>
*/
public class Lab9 {
	public static void main(String[] args) {
		Scanner scan; // establishing variables and scanner
		int elements;
		double sum = 0;
		
		scan = new Scanner(System.in); // creating new scanner
		
		System.out.println("How many elements in the array? "); // Asking user for how many elements in the array
		elements = scan.nextInt(); // saving user input in variable "elements"
		
		double[] integerArray = new double[elements]; // creating new array called integerArray
		
		for(int i = 0; i < elements; i++) { // making a for loop to fill in the array with user input
			System.out.println("Please enter the next value: ");
			integerArray[i] = scan.nextDouble();
		}
		
		for(int y = integerArray.length - 1; y >= 0 ; y--) { //  for loop to print our the contents of the array as well as finding the sum
			System.out.print(integerArray[y] + " ");
			sum += integerArray[y];
		}
		
		System.out.println(); 
		
		System.out.println("The sum of the array's elements is: " + sum); // printing out the sum
		
		scan.close(); // closing scanner
	}
}
