/*
AUTHOR: <Vishwas Mani>
ILENAME: Assignment7.java
SPECIFICATION: <Using an IntList class to modify and array in various ways with the given options>
LAB LETTER FOR CLOSED LAB: F
FOR: CSE 110 - > Assignment 7 - Monday, Wednesday, Friday 2:00 to 2:50pm
TIME SPENT: <2 hours>
*/
public class IntList {
	private int[] arr;
	
	
	public IntList(int size) { // constructor that initializes new array
		arr = new int[size];	
	}
	
		private int IndexOf(int searchingNum) { // return index of the value that user inputed
	
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == searchingNum) {
					return i;
				}
			}
			return -1;
		 
		}
		
		public void addInt(int num) { // method to add integer to array
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == 0) {
					arr[i] = num;
					break;
				}
				
			}        
		}
		
		private void doubleArrayCapacity() { // method to double array capacity
			int[] arrNew = new int[arr.length * 2];
			arr = arrNew;
		}
		
		public int findMax() { // method to find max of array
			int max = arr[0];
			for(int z = 0; z < arr.length; z++) {
				if(arr[z] > max) {
					max = arr[z];
				}
			}
			return max;
		}
		
		public int findMin() { // method to find min of array
			int min = arr[0];
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] < min) {
					min = arr[i];
				}
			}
			return min;
		}
		
		public void removeFirst(int num) { // method to remove first occurence of the value the user inputed
			boolean isFound = false; // boolean to see if user gives valid input
			for(int t = 0; t < arr.length - 1; t++) { // removing element that user requested 

				if(arr[t] == num) {
					isFound = true;
					for(int z = t; z < arr.length - 1; z++ ) {	
							arr[z] = arr[z + 1];
					}
					arr[arr.length - 1] = 0;
					break;
				}
				
			}
		}
		
		public void removeAll(int num) { // method to remove all occurences of value that user inputed
			for(int t = 0; t < arr.length - 1; t++) { // removing element that user requested 
				if(arr[t] == num) {
				
					for(int z = t; z < arr.length - 1; z++ ) {	
							arr[z] = arr[z + 1];
					}
					arr[arr.length - 1] = 0;
				}
				
			}
		}
		
		public int[] countNumbers(int num) { // method find values that are greater than the value that the user inputed
			int counter = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > num) {
					counter++;
				}
			}
					
	
			int numbers[] = new int[counter];
			
			int counter1 = 0;
			
			for(int z = 0; z < arr.length; z++) { // imputing values into array
				if(arr[z] > num) {
					numbers[counter1] = arr[z];
					counter1++;
				}
			}
			
			return numbers;
				
		}
		
		
		public String toString() { // method to print out current array as a String
			String nums = "[";
			for(int i = 0; i < arr.length; i++) {
				if(i == arr.length - 1) {
					nums += arr[i];
				} else {
					nums += arr[i] + ", ";
				}
				
			}
			nums += "]";
			return nums;
		}
		
	
}
