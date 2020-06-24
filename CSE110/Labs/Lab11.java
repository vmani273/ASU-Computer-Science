import java.util.*;
/*
AUTHOR: <Vishwas Mani>
ILENAME: Lab11.java
SPECIFICATION: <Leaning more about 2D arrays through performing a list of given actions such as filling and array and calculating the sum of each row in the array>
LAB LETTER FOR CLOSED LAB: F
FOR: CSE 110 - > Lab 11 
TIME SPENT: <1 hour>
*/
public class Lab11 {
	public static void main(String[] args) {
		Scanner scan; // establishing varialbes and scanner
		int total;
		int numRows;
		int numColumns;
		
		scan = new Scanner(System.in); // creating new scanner
		
		System.out.println("Enter the number of rows in the array"); // asking user for number of rows in the array
		numRows = scan.nextInt();
		
		System.out.println("Enter the number of columns in the array"); // asking user for number of columns in the array
		numColumns = scan.nextInt();
		
		int[][] arr = new int[numRows][numColumns]; // creating new 2D array
		
		for(int i = 0; i < numRows; i++) { // nestd for loop to fill in array
			for(int z = 0 ; z < numColumns; z++) {
				System.out.println("Please enter a value for position (" + i + ", " + z + ")");
				int value = scan.nextInt();
				arr[i][z] = value;
			}
		}
		
		System.out.println();
		
		System.out.println("Your 2D array looks like: ");
		
		for(int i = 0; i < numRows; i++) { // nested for loop to print our the 2D array
			for(int z = 0 ; z < numColumns; z++) {
				System.out.print(arr[i][z] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Summary of each row:"); 
		for(int i = 0; i < numRows; i++) { // nested for loop to print out total of the element in each row
			total = 0;
			for(int z = 0 ; z < numColumns; z++) {
				total += arr[i][z];
			}
			System.out.println("Sum of the elements of the row " + i + " is: " + total);
		}
		

	}
	
}
