import java.util.Scanner;

/*
AUTHOR: <Vishwas Mani>
ILENAME: Lab3.java
SPECIFICATION: <First I ask the user for their homework, midterm, and final exam grade. Then, I calculate the final grade and output if they passed or failed accordingly.>
FOR: CSE 110 - Lab #3
TIME SPENT: <30 minutes>
*/

public class Lab3 {
	public static void main(String[] args) {
		double finalexamGrade; // establishing all variables and constants
		double midtermGrade = 0;
		double homeworkGrade = 0;
		double finalGrade = 0;
		char letterGrade = 'P';
		String PASSED_CLASS = "Student Passed the class";
		String FAILED_CLASS = "Student Failed the class";

		Scanner scan = new Scanner(System.in); // establishing new scanner for user input

		System.out.println("Enter homework grade: "); // asking for homework grade
		homeworkGrade = scan.nextDouble(); // saving homework grade

		System.out.println("Enter midterm grade"); // asking for midterm grade
		midtermGrade = scan.nextDouble(); // saving midterm grade

		System.out.println("Enter final exam grade"); // asking for final grade
		finalexamGrade = scan.nextDouble(); // saving final grade

		if (homeworkGrade >= 0 && homeworkGrade <= 100 && midtermGrade >= 0 && midtermGrade <= 100
				&& finalexamGrade >= 0 && finalexamGrade <= 200) { // Checking if all variables are within 0 to 100
			finalGrade = ((finalexamGrade / 200) * 50) + (midtermGrade * 0.25) + (homeworkGrade * 0.25); // Calculating
																											// final
																											// grade
		} else {
			System.out.println("Invalid input. Homework and midterm grades should be between 0\n"
					+ "and 100 and the final grade should be between 0 and 200"); // Printing an error
			System.exit(0); // exiting program
		}

		if (finalGrade >= 50) { // checking if final grade is more than 50
			letterGrade = 'P'; // setting letter grade to P
		} else {
			letterGrade = 'F'; // else setting letter grade to F
		}

		if (letterGrade == 'P') { // checking if value of letter grade is equal to P
			System.out.println(PASSED_CLASS); // Printing that student passed the class
		} else {
			System.out.println(FAILED_CLASS); // else printing that student failed the class
		}

	}
}
