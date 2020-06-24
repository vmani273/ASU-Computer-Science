import java.util.Scanner; 

/*
Name: Vishwas Mani
Title: Assignment1.java
Description: Evaluating expressions as well as using variables and user input from a scanner to run and compile a program. 
Time & dates of your lab: 1:40am on Thursday, August 23 2018.
Time spent: 1 hour
Date: 8/23/2018

Part 1:

1)
	int mystery;
	mystery = 2;
	mystery = -3 + 5
	mystery = 2

		The value of mystery is 2.

2)
	a. n /10 + n % 10
	   1.9 + 9
	   = 10
  
	b. n % 2 + m % 2
	   1   +  0
	   = 1
	
	c. (m + n) / 2
	   (36 + 19) / 2
	   = 27
	   
	d. (m + n) / 2.0
	   = (36 + 19) / 2.0
	   = 27.5
	   
	e. (int) (0.5 * (m + n))
	   (0.5) * (19 + 36)
	   = 27.5
	   = 27
		
	
	f. (int) Math.round(0.5 * (m + n))
	   (0.5) * (19 + 36)
	   =27.5
	   = 28



*/
public class Assignment1 {
	public static void main(String[] args) {
		 Scanner user = new Scanner(System.in); // Establishing a scanner named user
		 
		 System.out.print("What is your name? "); // Asking user what their name is
		 String name = user.nextLine(); // storing user input in name variable
		 
		 System.out.println("What is your height? "); //Asking user what their height is
		 System.out.print("Feet: "); // In terms of feet
		 int feet = user.nextInt();// storing user input in feet variable
		 
		 
		 System.out.print("Inches: ");// In terms of inches
		 int inches = user.nextInt(); // storing user input in inches variable
		 
		 double convert2Meters = ((feet * 12) + inches) * (2.54 / 100); // converting feet and inches to meters
		 String answerRounded = String.format("%.2f", convert2Meters); // rounding answer to 2 decimal places
		 System.out.println(name + ", your height in meters is " + answerRounded); // Final Answer
		 
		 
		
		 

		 
	}
	
}
