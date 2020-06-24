import java.util.Scanner;
/*
AUTHOR: <Vishwas Mani>
FILENAME: Lab8.java
SPECIFICATION: <Using a student class to create instances  and call various methods from the class>
LAB LETTER FOR CLOSED LAB: F
FOR: CSE 110 - > Lab 8
TIME SPENT: <1 hour 30 minutes>
*/
public class Lab8 {
	public static void main(String[] args) {
		String firstName1; // establishing all variables and scanner
		String lastName1;
		Scanner scan;
		String firstName2;
		String lastName2;
		String major2;
		int gradePoints2;
		int totalCreds2;
		
		scan = new Scanner(System.in); // creating new scanner
		System.out.println("Enter first name: "); //asking user one for first name
		firstName1 = scan.next(); // saving user input
		System.out.println("Enter last name: "); //asking user one for last name
		lastName1 = scan.next(); // saving user input
		Student s1 = new Student(firstName1, lastName1); // creating new student object with given values
		System.out.println("FIRST STUDENT INFORMATIONS");
		
		System.out.println();
		
		System.out.println("The name of the student is: " + s1.getFullName()); // printing out student informations with given values by the user
		System.out.println("Major is: " + s1.getMajor());
		System.out.println("Student's number of points is: " + s1.getPoints());
		System.out.println("Number of earned credits is: " + s1.getCredits());
		 
		System.out.println();
		
		System.out.println("ENTER SECOND STUDENT INFORMATION"); // asking for second student information
		
		System.out.println("Enter first name: "); // asking for first Name
		firstName2 = scan.next(); // saving first name 
		System.out.println("Enter last name: "); // asking for last name
		lastName2 = scan.next(); // saving last name
		System.out.println("Enter your major: ");
		major2 = scan.next(); //  saving major in variable major2
		major2 += scan.nextLine(); 
		System.out.println("Enter your total grade points: "); // asking and saving total grade points
		gradePoints2 = scan.nextInt();
		System.out.println("Enter your total credits: "); // asking and saving total credits
		totalCreds2 = scan.nextInt();
		Student s2 = new Student(major2,totalCreds2, gradePoints2, firstName2, lastName2 );
		System.out.println("FIRST STUDENT INFORMATIONS");
		
		System.out.println();
		
		
		System.out.println("The name of the student is: " + s2.getFullName()); // printing second student information
		System.out.println("Major is: " + s2.getMajor());
		System.out.println("Student's number of points is: " + s2.getPoints());
		System.out.println("Number of earned credits is: " + s2.getCredits());
		
		s2.changeMajor("INFORMATIONS"); // changing major on second student
		
		System.out.println();
		
		System.out.println(s2.getFullName() + " has changed the major to " + s2.getMajor()); // printing out the updated major
		
		System.out.println();
		
		System.out.println("Student Helper Functions"); 
		
		System.out.println("Iterate from 1 till 30 with 3 steps and find sum"); // using the looperHelp function to formulate an answer to this problem
		s2.loopHelper(1, 30, 3);
		
		System.out.println();
		
		System.out.println("Iterate from 1 till 30 with 3 steps and find sum"); // // using the looperHelp function to formulate an answer to this problem
		s2.loopHelper(5, 28, 2);
		
		scan.close();
		
	}
}
