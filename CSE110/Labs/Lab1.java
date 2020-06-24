import java.util.Scanner;

/*
 * AUTHOR: Vishwas Mani
 * FILENAME: Lab1.java
 * SPECIFICATION: Asking user for 3 grades and returning the average of the values
 * FOR: CSE 110- Lab 1
 * TIME SPENT: 10 minutes
 */
public class Lab1 {
	public static void main(String[] args) {
		
		 Scanner user = new Scanner(System.in); // Establishing a scanner
		 System.out .print("Enter the score on the first test: "); // Asking user for first test score
		 double score1 = user.nextInt(); // saving first test score
		 System.out .print("Enter the score on the second test: "); // Asking user for second test score
		 double score2 = user.nextInt(); // saving second test score
		 System.out.print("Enter the score on the third test: "); // Asking user for third test score
		 double score3 = user.nextInt(); // // saving third test score
		 double average = ((score1 + score2 + score3) / 3); // calcualting average
		 System.out.print("Your average score is: " + average);
	}
}
