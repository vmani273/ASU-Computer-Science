import java.util.Scanner;
/*
AUTHOR: <Vishwas Mani>
ILENAME: Assignment6.java
SPECIFICATION: <Using a geek class to make an object that returns various actions, given different cases chosen by the user>
LAB LETTER FOR CLOSED LAB: F
FOR: CSE 110 - > Assignment 6 - Monday, Wednesday, Friday 2:00 to 2:50pm
TIME SPENT: <2 hours>
*/
public class Assignment6 {
	public static void main(String[] args) {
		Scanner scan;  //  establishing all variables and scanner
		String options = "";
		int num1;
		int num2;
		int num3;
		int number1;
		int number2;
		int num4;
		String str;
		String str1;
		String str2;
		String str3;
		
		scan = new Scanner(System.in); // creating new scanner
		Geek guy = new Geek("Geek"); // creating new object geek called guy
		
		System.out.println("Command Options\n" +  // printing out various command options
				"-----------------------------------\n" + 
				"a: get name\n" + 
				"b: number of questions asked\n" + 
				"c: all different\n" + 
				"d: reverse\n" + 
				"e: GCD\n" + 
				"f: count vowels\n" + 
				"g: is palindrome\n" + 
				"h: number of digits\n" + 
				"i: middle string\n" + 
				"?: display the menu again\n" + 
				"q: quit this program");
		
		System.out.println();
		
		
		do {
			System.out.println("Please enter a command or type: "); // askimg user for their command or type
			options = scan.next();
			switch(options) {
			case "a": // case a prints out name of guy
				System.out.println(guy.getName());	
				break;
			case "b": // case b prints out the number of questions asked
				System.out.println(guy.getNumberofQuestions());
				break;
			case "c": // case c prints if the 3 integers entered are different
				System.out.print("Enter three integers: ");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				num3 = scan.nextInt();
				if(guy.allDifferent(num1, num2, num3)) {
					System.out.println("All different");
				} else {
					System.out.println("All not different");
				}
				break;
			case "d": // case d prints the reversed string of what the user inputed
				System.out.print("Enter a string: ");
				str = scan.next();
				System.out.println("String reversed: " + guy.reverse(str));
				break;
			case "e": // case e prints the gcd of two numbers
				System.out.println("Enter the first number: ");
				number1 = scan.nextInt();
				System.out.println("Enter the second number: ");
				number2 = scan.nextInt();
				System.out.println("The GCD of " + number1 + " and " + number2 + " is " + guy.gcd(number1, number2));
				break;
			case "f": // prints out the number of vowels in the string inputed
				System.out.println("Enter a String: ");
				str1 = scan.next();
				System.out.println("String has " + guy.countVowels(str1) + " vowels");
				break;
			case "g": // prints if inputed string is a palindrome or not
				System.out.println("Enter a string: ");
				str2 = scan.next();
				if(guy.isPalindrom(str2)) {
					System.out.println("Your string " + str2 + " is a palindrome");
				} else {
					System.out.println("Your string " + str2 + " is not a palindrome");
				}
				break;
			case "h": // prints the number of digits in an inputd number
				System.out.println("Enter an integer: ");
				num4 = scan.nextInt();
				System.out.println("The integer " + num4 + " has " + guy.digits(num4) + " digits");
				break;
			case "i": // prints the middle string of an inputed string
				System.out.print("Enter a string: ");
				str3 = scan.next();
				System.out.println("The middle string is " + guy.middle(str3));
				break;
			case "?": // prints the options
				System.out.println("Command Options\n" + 
						"-----------------------------------\n" + 
						"a: get name\n" + 
						"b: number of questions asked\n" + 
						"c: all different\n" + 
						"d: reverse\n" + 
						"e: GCD\n" + 
						"f: count vowels\n" + 
						"g: is palindrome\n" + 
						"h: number of digits\n" + 
						"i: middle string\n" + 
						"?: display the menu again\n" + 
						"q: quit this program");
				break;
			case "q": // quits program
				System.exit(0);
				break;
			}
			
				
		} while(options != "q"); // do while loop, while options is not q
		
		scan.close();
	}
}
