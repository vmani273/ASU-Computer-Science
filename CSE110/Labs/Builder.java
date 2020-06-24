/*
AUTHOR: <Vishwas Mani>
ILENAME: Builder.java
SPECIFICATION: <Using a builder class as well as a main method to build a row and a pyramid based on user input>
LAB LETTER FOR CLOSED LAB: F
FOR: CSE 110 - > Lab 7 
TIME SPENT: <2 hours>
*/
public class Builder {
	String userName;
	String star = "*";
	
	public Builder(String name) { // creating constructor for Builder class
		userName = name; // setting userNamme equal to name
	}
	
	public String getName() { // method to get name
		return userName;
	}
	public String makeRow(int m, String s) { // method to make a row using a for loop
		String ans = "";
		for(int i = 0; i < m; i++) {
			ans += s + " ";
		}
		return ans;
	}
	
	public void makePyramid(int m, String s) { // method to make a pyramid
		
		double start =  m / 2 ; // adding start and finish to add endpoints for pyramid per row
		double finish = m / 2 + 2;
		for(int i = 0; i < m / 2 + 0.5; i++) { //  forloop for each row 
			for(int x  = 1 ; x <= m; x++) { // nested double forloop for the column
				if(x <= start || x >= finish) { 
					System.out.print("=");
				} else {
					System.out.print("*");
				}
			}
			
			System.out.println("");  // going to next line
			start--; // decreasing starting bounds
			finish++; // increasing ending bound 
		}
		
	}
 
	

}