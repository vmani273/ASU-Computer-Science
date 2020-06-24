/*
AUTHOR: <Vishwas Mani>
ILENAME: Geek.java
SPECIFICATION: <Using a geek class to make an object that returns various actions, given different cases chosen by the user>
LAB LETTER FOR CLOSED LAB: F
FOR: CSE 110 - > Geek - Monday, Wednesday, Friday 2:00 to 2:50pm
TIME SPENT: <2 hours>
*/
public class Geek {
	private String name;
	private static int numOfQ = 0;
	
	public Geek(String name) { // constructor that takes in a string for name
		this.name = name;
	}
	

	public String getName() { // get method that returns the name
		return name;
	}
	
	public static int getNumberofQuestions() {
		return numOfQ;
	}
	
	public boolean allDifferent(int num1, int num2, int num3) { // method the checks if 3 integers are different
		numOfQ++;
		if(num1 != num2 && num1 != num3 && num2 != num3) {
			return true;
		} else {
			return false;
		}
	}
	
	public String reverse(String text) { // method that returns the reversed inputed string
		numOfQ++;
		String rev = "";
		for(int i = text.length() - 1; i >= 0; i--) { // for loop that iterates through string backwards and returns the reversed string
			rev += text.charAt(i);
		}
		return rev;
	}
	
	public int gcd(int num1, int num2) { // method that returns gcd
		numOfQ++;
		while (num1 != num2) { 
			if (num1 > num2) {
				num1 = num1 - num2;
			} else {
				num2 = num2 - num1;
			}
		}
		return num1;
	}
	
	public int countVowels(String str) { // method that returns number of vowels in an inputed string
		numOfQ++;
		int counter = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				counter++;
			}
		}
		return counter;
	}
	
	public boolean isPalindrom(String str) { // method that returns if given input is a palindrome
		numOfQ++;
		String str2 = reverse(str);
		if(str.equals(str2)) { // checks if reversed string is equal to original string
			return true;
		} else {
			return false;
		}
	}
	
	public int digits(int num) { // method that returns number of digits in the inputed number
		numOfQ++;
		String num1 = Integer.toString(num);
		int digits = 0;
		for(int i = 0; i < num1.length(); i++) { // goes through number - converted to string
			digits++;
		}
		return digits;
	}
	
	public String middle(String str) { // returns the middle portion of an inputed string
		numOfQ++;
		String str3 = "";
		if(str.length() % 2 == 0) { // checks if number of digits is odd or even
			str3 += str.charAt(str.length() / 2 - 1);
			str3 += str.charAt(str.length() / 2);
		} else {
			str3 += str.charAt((str.length() / 2) + 1);
		}
		
		return str3; 
	}

	
}
