
public class Person {
	String nameFirst; // establishing all variables for this class
	String nameLast;
	int yearBirth;
	public Person(String firstName, String lastName, int birthYear) { // creating the constructor or
		nameFirst = firstName;
		nameLast = lastName;
		yearBirth = birthYear;
	}
	
	public String getFirstName() { // creating method to get user's first name
		return nameFirst;
	}
	
	public void getlastName() { //  creating method to get user's last name
		
	}
	
	public int getAge(int currentYear) { // creating method to get user's age with the parameter of the current year
		return currentYear - yearBirth;
	}
	
}
