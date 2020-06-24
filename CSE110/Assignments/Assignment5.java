import java.util.Scanner;
/*
AUTHOR: <Vishwas Mani>
ILENAME: Assignment5.java
SPECIFICATION: <Initiating and object shape1 using the shape class and finding various descriptions and features of that particular shape>
LAB LETTER FOR CLOSED LAB: F
FOR: CSE 110 - > Assignment 5 - Monday, Wednesday, Friday 2:00 to 2:50pm
TIME SPENT: <2 hours>
*/
public class Assignment5 {
	public static void main(String[] args) {
			int side1;
			int side2;
			int side3;
			int side4;
			String option;
			Scanner scan; // establishing the scanner and all variables
			
			scan = new Scanner(System.in); // creating new scanner
			System.out.println("Command Options\n" +  // printing out the listing of options for the user and asking for the 4 sides
					"-----------------------------------\n" + 
					"a: Is it a square\n" + 
					"b: Is it a rectangle\n" + 
					"c: find perimeter\n" + 
					"d: find area\n" + 
					"e: all sides different?\n" + 
					"f: print sides\n" + 
					"g: change the sides\n" + 
					"?: display the menu again\n" + 
					"q: quit this program\n" + 
					"Enter the sides of the quadrilaterals:");
			
			side1 = scan.nextInt(); // saving side 1 in variable side1
			side2 = scan.nextInt(); // saving side 2 in variable side2
			side3 = scan.nextInt(); // saving side 3 in variable side3
			side4 = scan.nextInt(); // saving side 4 in variable side4
	
			
			Shape Shape1 = new Shape(side1, side2, side3, side4); // creating new object called shape1
			
			
			do { // creating a do loop
				
				System.out.println("Pleast enter a command or type?"); // asking user for a command
				option = scan.next(); // saving command in user option
				
				switch(option){ // creating a switch statement for the various cases
				case "a": // case for checking if shape1 is a square
					if(Shape1.isSquare()) {
						System.out.println("It is a square");;
					} else {
						System.out.println("It is not a square");
					}
					break;
				case "b": // case for checking if shape1 is a rectangle
					if(Shape1.isRectangle()) {
						System.out.println("It is a rectangle");;
					} else {
						System.out.println("It is not a rectangle");
					}
					break;
				case "c": // // case for finding the perimeter of shape1
					System.out.println(Shape1.findPerimiter());
					break;
				case "d": // case for finding the area of shape1
					System.out.println(Shape1.findArea());
					break;
				case "e": // case for checking if each side is the same or different	
					if(Shape1.differentSides()) {
						System.out.println("All 4 sides are different");;
					} else {
						System.out.println("All 4 sides are not different");
					}
					break;
				case "f": // case to print out the 4 sides in a string
					System.out.println(Shape1.toString());
					break;
				case "?": // case to repeat the instructions
					break;
				case "g": // case to change any one side
					int newSide;
					int sideChange;
					System.out.println("Which side are you changing(1, 2, 3, 4)?"); // asking which side user wants to change
					sideChange = scan.nextInt();
					if(sideChange == 1) {
						System.out.println("Enter the length for side 1"); 
						newSide = scan.nextInt();
						Shape1.setSide1(newSide); // modifying side 1 using the method setSide
					} else if(sideChange == 2) {
						System.out.println("Enter the length for side 2");
						newSide = scan.nextInt();
						Shape1.setSide2(newSide); // modifying side 2 using the method setSide
					} else if(sideChange == 3) {
						System.out.println("Enter the length for side 3");
						newSide = scan.nextInt();
						Shape1.setSide3(newSide); // modifying side 3 using the method setSide
					} else if(sideChange == 4) {
						System.out.println("Enter the length for side 4");
						newSide = scan.nextInt();
						Shape1.setSide4(newSide); // modifying side 4 using the method setSide
					}
					break;
				case "q": // case to quit program
					System.exit(0);
				}
				
			} while(option != "q");
		
			
			
	}
	
}
