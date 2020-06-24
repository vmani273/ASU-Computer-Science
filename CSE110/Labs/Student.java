/*
AUTHOR: <Vishwas Mani>
FILENAME: Student.java
SPECIFICATION: <Using a student class to create instances  and call various methods from the class>
LAB LETTER FOR CLOSED LAB: F
FOR: CSE 110 - > Lab 8
TIME SPENT: <1 hour 30 minutes>
*/
public class Student {
	
	private String firstName; // establishing all instance variables
	private String lastName;
	private String majorStudent;
	private int creds;
	private int pointValues;
	public Student(String fName, String lName) { // creating the first constructor
		firstName = fName;
		lastName = lName;
		
		this.majorStudent = "general studies";
		this.pointValues = 0;
		this.creds = 0;
		
	}
	
	public Student(String major, int credits, int points, String fName, String lName) { // creating another more detailed constructor
		firstName = fName;
		lastName = lName;
		majorStudent = major;
		creds = credits;
		pointValues = points;
	}
	
	public String getMajor() { // method to return the major
		return majorStudent;
	}
	
	public int getPoints() { // method to return the points
		return pointValues;
	}
	
	public int getCredits() { // method to return credits
		return creds;
	}
	
	public String getFullName() { // method to return full name
		return firstName + " " + lastName;
	}
	
	public void changeMajor(String newMajor) { // method that taken in a new Major and change the student's major to the new major
		majorStudent = newMajor;
	}
	
	
	
	public void loopHelper(int start, int end, int incBy) { // student helper function that taken in 3 values and prints out the sum.
		
		int sum = 0;
		for(int i = start; i < end; i+=incBy) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("Sum is: " + sum);
	}
}
