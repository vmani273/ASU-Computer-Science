import java.util.Scanner;

/*
AUTHOR: <Vishwas Mani>
ILENAME: Assignment2.java
SPECIFICATION: <For the first part, I use the string given to the string length, substring, and the inde of a specific word.  For the second part, I make the user input two strings and find various features of the two strings>
FOR: CSE 110 - Assignment 2
TIME SPENT: <1 hour>
*/
public class Assignment2 {
	public static void main(String[] args) {
		//PART 1
		/*
		int myStringLength;
		String subString;
		String myString = "Now is the time for my birthday party";
		myStringLength = myString.length();
		subString = myString.substring(4, 15);
		System.out.println("Number of characters in string: " + myStringLength);
		System.out.println(myString.indexOf("birthday"));
		System.out.println("The extracted string is " + subString);
		*/
		
		/*
		int x = 6, y = 3
		a) x == y / 2
		 -> checking if x is equal to y/2
		 -> false
		
		b) x % 2 != 0 || y % 2 != 0
		 -> checking if any of the two conditions work 
		 -> true  because second condition works
		 
		 c) x - y > 0 && !(x <= y)
		  -> checking if both conditions are true
		  -> true because both conditions work
		  
		 d) x + 6 != y || x / y <= 0
		  -> checking if any of the two conditions work 
		  -> true because the first condition works
		*/
		/*
		switch(letter) {
		    case 'A':
		    case 'a':
		    	System.out.println("Excellent");
		        break;
		    case 'B':
		    case 'b':
		    	System.out.println("You can do better");
		    	break;
		    case 'C':
		    case 'c':
		    	System.out.println("Try harder");
		    	break;
		    case 'D':
		    case 'd':
		    	System.out.println("Try much harder");
		    default:
		    	System.out.println("Try another major! ");
		    	
	}
		
		*/
		
		// PART 2
		String stringOne;  // establishing all variables and scanners
		String stringTwo;
		String bothCombinedCaps;
		String stringOneLowCase;
		String stringTwoLowCase;
		Scanner in;
		char strOneLetterCaps;
		char strTwoLetterCaps;
		
		
		
		in = new Scanner(System.in); // creating new scanner for user input 
		
		System.out.println("Please enter a string: "); // asking user for first string
		stringOne = in.nextLine(); // saving user input for first string
		System.out.println("Please enter another string: "); //  asking user for second string
		stringTwo = in.nextLine(); // saving user input for second string
		
		
		
		if(stringOne.length() % 2 == 0) { // checking if string is even by checking if the module 2 is 0.
			System.out.println("The first string's length is even");
		} else {
			System.out.println("The first string's length is odd");
		}
		
		if(stringTwo.length() % 2 == 0) { // checking if string is odd by checking if the module 2 is not 0.
			System.out.println("The second string's length is even");
		} else {
			System.out.println("The second string's length is odd");
		}
		
		if(stringOne.equals(stringTwo)) { // checking if both strings are equal
			System.out.println("The two strings are the same");
		} else {
			System.out.println("The two strings are different");
		}
		
		if(stringOne.length() == stringTwo.length()) { // checking is both string lengths are equivalent 
			System.out.println("The two strings are lexically equivalent");
		} else if(stringOne.length() > stringTwo.length()) { 
			System.out.println("The first string is lexically larger");
		} else if(stringOne.length() < stringTwo.length()) {
			System.out.println("The second string is lexically larger");
		}
		
		
		
		strOneLetterCaps = stringOne.charAt(stringOne.length() - 1); // Checking for last character of string one 
		strOneLetterCaps -= 32; //Making that character capital
		strTwoLetterCaps = stringTwo.charAt(stringTwo.length() - 1); // Checking for last character of string two
		strTwoLetterCaps -= 32; //Making that character capital
		System.out.println("The last character of the first string is " + strOneLetterCaps); // printing out both statements
		System.out.println("The last character of the second string is " + strTwoLetterCaps);
		
		
		bothCombinedCaps = stringOne.toUpperCase() + stringTwo.toUpperCase(); // combining both characters and making it capital
		System.out.println("The concatenation of two string is \"" + bothCombinedCaps + "\""); // printing out the concatenation
	
		System.out.println("The first string using lower case letters: " + stringOne.toLowerCase()); // printing out first string in lowercase
		System.out.println("The second string using lower case letters: " + stringTwo.toLowerCase()); // printing out second string in lowercase
		
		
		
		
		
	}
}
