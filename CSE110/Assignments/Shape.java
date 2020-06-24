/*
AUTHOR: <Vishwas Mani>
ILENAME: Shape.java
SPECIFICATION: <Initiating and object shape1 using the shape class and finding various descriptions and features of that particular shape>
LAB LETTER FOR CLOSED LAB: F
FOR: CSE 110 - > Assignment 5 - Monday, Wednesday, Friday 2:00 to 2:50pm
TIME SPENT: <2 hours>
*/

public class Shape {
	private int side1; // establishing all variables
	private int side2;
	private int side3;
	private int side4;
	public Shape(int s1, int s2, int s3, int s4) { // creating constructor shape
		side1 = s1;
		side2 = s2; // initializing parameters 
		side3 = s3;
		side4 = s4;
		
	} 
	private int longest() { // method that returns largest longest side
		int largest = side1;
		if(side2 > largest) {
			largest = side2;
		} else if(side3 > largest) {
			largest = side3;
		} else if(side4 > largest) {
			largest = side4;
		} 
		return largest;
	}
	
	private int shortest() { // method that returns shortest side
		int shorter = side1;
		if(side2 < shorter) {
			shorter = side2;
		} else if(side3 < shorter) {
			shorter = side3;
		} else if(side4 < shorter) {
			shorter = side4;
		} 
		return shorter;
	}
	
	public boolean isSquare() { // method that checks if the sides make up a square
		if(side1 == side2 && side2 == side3 && side3 == side4) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isRectangle() { // method that checks if the sides make up a square
		if(isSquare()) {
			return false;
		}else if(side1 == side2 || side1 == side3 || side1 == side4 || side2 == side3 || side2 == side4 || side3 == side4 ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean differentSides() { // method that checks if all the sides are different
		if(side1 != side2 && side1 != side3 && side1 != side4 && side2 != side3 && side2 != side4 && side3 != side4){
			return true;
		} else {
			return false;
		}
	}
	
	public int findPerimiter() { // method to find the perimiter given the 4 sides
		return side1 + side2 + side3 + side4;
	}
	
	public int findArea() { // method to find the area given the 4 sides
		if(isSquare()) {
			return side1 * side2;
		} else {
			return (shortest() * longest());
		}
	}
	
	public int getSide1() { // getting side 1
		return side1;
	}
	
	public int getSide2() { // getting side 2
		return side2;
	}
	
	public int getSide3() { // getting side 3
		return side3;
	}
	
	public int getSide4() { // getting side 4
		return side4;
	}
	
	public void setSide1(int s) { // setting side 1 to a different value s
		side1 = s;
	}
	
	public void setSide2(int s) { // setting side 2 to a different value s
		side2 = s;
	}
	
	public void setSide3(int s) { // setting side 3 to a different value s
		side3 = s;
	}
	
	public void setSide4(int s) { // setting side 4 to a different value s
		side4 = s;
	}
	
	public String toString() { //smethod to print out each side as a string
		return (side1 + ":" + side2 + ":" + side3 + ":" + side4); 
	}
	
}
