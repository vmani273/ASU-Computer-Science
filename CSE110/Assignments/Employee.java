import java.io.*;
import java.text.*;
/*
AUTHOR: <Vishwas Mani>
ILENAME: Employee.java
SPECIFICATION: <Using an Employee class create multiple employees, save it in an array, and make modifications / print out elements>
LAB LETTER FOR CLOSED LAB: F
FOR: CSE 110 - > Employee.java - Monday, Wednesday, Friday 2:00 to 2:50pm
TIME SPENT: <2 hours>
*/
public class Employee {
	// instance variables
	   private String name;
	   private double salary;
	   private int years;        // years of experience

	  //constructor with passing name, salary and years of experience
	  public Employee(String n, double s, int y)
	   {	name = n;
			salary = s;
			years = y;
	   }

	   //  method to set the years annually
	   public void setYears()      // 	2`to be run annually
	   {  years++;
	   }

	   // mutator method - overloaded
	   public void setYears(int years)
	   {  this.years = years;
	   }

	   /** Computes the raise based on @param byPercent
	    */
	   public void raiseSalary(double byPercent)
	   {	salary *= 1 + byPercent/ 100;
	   }

	   /** Gets an employee object.
	    * @return the string which includes,name, salary and years
	    */
	   public String toString()
	   {   NumberFormat fmt = NumberFormat.getCurrencyInstance();
		   String s = name +" "+ fmt.format(salary) +" "+ years;
	      return s;
	   }

	   // an instance (non static) method to compare two salaries;
	   // returns an object reference of type Employee_2
	   public Employee makesMore(Employee x)    // notice that x is another object
	   {	if (this.salary > x.salary)
	         return this;
	        else
	         return x;
	   }

	    // returns the name
		public String getName() {
	          return name;

	     }
	    // return the salary
		public double getSalary() {
		   return salary;
	   }

	public static Employee makesMore(Employee x, Employee y) { // comparing 2 employee salaraies with if statement
		if(x.salary < y.salary) {
			return x;
		} else {
			return y;
		}
	}
	
	public static void sortArray(Employee [] staff) {  // method to sort array given
		Employee placeHolder;
		for(int y = 0; y < 10; y++) {
			int n = y + 1;
			while(n < 10) { // nested for loop
				if(staff[y].getName().compareTo(staff[n].getName()) >= 1) { // switching the two values
					placeHolder = staff[n];
					staff[n] = staff[y];
					staff[y] = placeHolder;
				
				}
				n++;
			}
		}
	}
	
	public static int search(Employee[] staff, String name) {
		for(int i = 0; i < staff.length; i++) {
			if(staff[i].equals(name)) {
				return i;
			}
		}
		return -1;
	}
}
