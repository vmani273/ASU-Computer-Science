import java.util.Scanner;
import java.util.Arrays;
/*
AUTHOR: <Vishwas Mani>
ILENAME: Lab10.java
SPECIFICATION: <Asking user for elements of array and preceding by making specific modifications>
LAB LETTER FOR CLOSED LAB: F
FOR: CSE 110 - > Lab 10 - Monday 4:10 to 5:00pm
TIME SPENT: <1 hour>
*/

public class Lab10 {
	public static void main(String[] args) {
		int numElements; // establishing variables and scanner
		int value;
		Scanner scan;
		
		
		
		
		scan = new Scanner(System.in); // creating new scanner
		
		System.out.println("How many elements in the array?"); // asking user for how many elements
		numElements = scan.nextInt(); // saving in variable numElements
		
		int[] intArray = new int[numElements]; // creating new array
		for(int i = 0; i < numElements; i++) { // for loop to fill in array with user input
			System.out.println("Enter next Value: ");
			intArray[i] = scan.nextInt();
	
		}
		
		
		Arrays.sort(intArray); // sorting array
		
		
		for ( int z = 0 ; z < intArray.length ; z++ ) { // printing out sorted array
			if(z == intArray.length - 1) {
				System.out.print(intArray[z]);
			} else {
				System.out.print(intArray[z] + ", ");
			}
           
        }
		
		
		
		System.out.println();
		
		int[] intArray2 = new int[numElements]; // making new array containing same values as first array
		
		for(int w = 0; w < numElements; w++ ) { // deleting minimum value off this new array
			if(w == numElements - 1) {
				intArray2[w] = 0;
			} else {
				intArray2[w] = intArray[w + 1];
			}
			
		}
		
		System.out.println("The array with the minimum removed:");
		
		for ( int y = 0 ; y < intArray2.length ; y++ ) {
			if(y == intArray2.length - 1) {
				System.out.print(intArray2[y]);
			} else {
				System.out.print(intArray2[y] + ", ");
			}
           
        }
		
		System.out.println();
		
		System.out.println("Enter the value to search and remove: "); // asking user for which value to be removed
		value = scan.nextInt(); // saving user input
		
		
		boolean isFound = false; // boolean to see if user gives valid input
		for(int t = 0; t < numElements; t++) { // removing element that user requested 

			if(intArray2[t] == value) {
				isFound = true;
				for(int z = t; z < numElements - 1; z++ ) {	
						intArray2[z] = intArray2[z + 1];
				}
				break;
			}
			
		}
		
		if(isFound) { // if the element is found and otherwise
			System.out.println("Search element found");
		} else {
			System.out.println("Search element NOT found");
		}
		
		
		
		
		System.out.println("The final array");
		
		for ( int r = 0 ; r < intArray2.length; r++ ) { // / printing final array
			if(r == intArray2.length - 1) {
				System.out.print(intArray2[r]);
			} else {
				System.out.print(intArray2[r] + ", ");
			}
           
        }
		
		
		scan.close();
		
		
		
		
		
	}
}
