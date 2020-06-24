import java.util.Scanner;
import java.util.*;
import java.io.*;
/*
AUTHOR: <Vishwas Mani>
ILENAME: Assignment8.java
SPECIFICATION: <Using an Employee class create multiple employees, save it in an array, and make modifications / print out elements>
LAB LETTER FOR CLOSED LAB: F
FOR: CSE 110 - > Assignment 8 - Monday, Wednesday, Friday 2:00 to 2:50pm
TIME SPENT: <2 hours>
*/
public class Assignment8 {
	public static void main(String[] args) {
		Scanner scan; // establishing scanner, array, and variables
		String choice = "";
		String ln;
		Employee[] arr = new Employee[10];
		
		scan = new Scanner(System.in); // creating new scanner
		            
		FileReader file = new FileReader("employeeData.txt"); // importing text file
		BufferedReader read = new BufferedReader(file);
		
		for(int z = 0; z <= 9; z++) { // loading elements in text into an array of type Employee called arr 
			ln = read.readLine();
			if(ln!= null) {
				String[] word = ln.split(" "); 
				arr[z] = new Employee(word[0], Integer.parseInt(word[1]), Integer.parseInt(word[2]));
			}
			
		}
		
		
		System.out.println("Command Options\n" +  // printing out command options
				"-----------------------------------\n" + 
				"'d': prints info for all Employees\n" + 
				"'s': prints all employees sorted by last name\n" + 
				"'r': raise salary by percent\n" + 
				"'y': increment the years of experience\n" + 
				"'f': find an employee\n" + 
				"'m': who makes more\n" + 
				"'?': Displays the help menu\n" + 
				"'q': quits");	
		
		do {
			
			System.out.println("Please enter a command or type ? "); // asking user for a command
			choice = scan.next(); // saving user input in variable choice
			
			switch(choice) { // switch statement for various options
			case "s":
				Employee.sortArray(arr); // sorting array
				
				for(int i = 0; i < arr.length; i++) { // printing out contents of array after sorted
					System.out.println(arr.toString());
				}
				break;
			case "d":
				int m = 0;
				while(m <= 9) { // going through array and printing out the contents of each employee
					System.out.println(arr[m].toString());
					m++;
				}
				break;
			case "r":
				System.out.println("Enter the amount of raise: "); // asking user for the amount of raise
				int per = scan.nextInt(); 
				int i = 0;
				while(i < arr.length) {// loop going through array and adding raise using raiseSalary method
					arr[i].raiseSalary(per);
					i++;
				}
				break;
			case "y":
				for(int z = 0; z < arr.length; z++) { //  going through array and incrementing every element
					arr[z].setYears();
				}
				break;
			case "f":
				System.out.println("Enter the name of the employee you are searching for: "); // asking user for employee they want ot search for
				String emp = scan.next();
				if(Employee.search(arr, emp) != -1) { //if employee exists, prints out his information
					System.out.println(arr[Employee.search(arr, emp)].toString());
				} else { 
					System.out.println("The employee doesn't exist!"); // if employee does not exist, prints this statement
				}
				break;
			case "m":
				System.out.println("Enter the name of the first employee"); //asking user for first employee; 
				String first = scan.next();
				System.out.println("Enter the name of the second employee"); // asking user for second employee;
				String second = scan.next();
				System.out.print(Employee.makesMore(arr[Employee.search(arr, first)], arr[Employee.search(arr, second)])); // comparing two employes using makesmore method
			}
			
		} while(choice != "q");
	}
	
	
}
