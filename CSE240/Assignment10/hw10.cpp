
//CSE240 Spring 2020 HW10
// Vishwas Mani
// Visual Studio


// READ BEFORE YOU START:
// You are given a partially completed program that creates a list of rooms.
// Each room has name, number of rooms and library type (hayden or noble).
// This information is stored as an object of Room class. Class defined in room.h
// The classes Hayden and Noble are child classes of the Room class.
// When adding a new room, these child classes are used to make the room node of the list.
// So each node in the list is actually an object of either Hayden or Noble class.

//
// To begin, you should trace through the given code and understand how it works.
// Please read the instructions above each required function and follow the directions carefully.
// Do not modify given code.

// You can assume that all input is valid:
// Valid name:	String containing alphabetical letters
// Valid number: a positive integer

#include <iostream>
#include <fstream>
#include <string>
#include "Container.h"
#include "room.h"
#include "noble.h"
#include "hayden.h"

using namespace std;

// functions already implemented:
void executeAction(char c);
Room* searchRoom(string name_input);


// functions that need implementation:
void addRoom(string name_input, int no_input, libraryType type);			// 7 points
void displayList();							// 4 points
void save(string fileName);					// 7 points
void load(string fileName);					// 7 points

Container* list = NULL;				// global list

int main()
{
	char c = 'i';				// initialized to a dummy value

  // During first execution, there will be no list.txt in source directory. list.txt is generated by save() while exiting the program.
	load("list.txt");			
	do {
		cout << "\nCSE240 HW10\n";
		cout << "Please enter your selection:\n";
		cout << "\t a: add a new room\n";
		cout << "\t d: display room list\n";
		cout << "\t c: change library type\n";
		cout << "\t q: quit\n";
		cin >> c;
		cin.ignore();
		executeAction(c);
	} while (c != 'q');

	save("list.txt");

	list = NULL;

	return 0;
}

// Ask for details from user for the given selection and perform that action
// Read the function case by case
void executeAction(char c)
{
	string name_input;
	int no_input;
	int type_input = 2;
	libraryType type;
	Room* roomResult = NULL;

	switch (c)
	{
	case 'a':	// add room
				// input room details from user
		cout << endl << "Enter room name: ";
		getline(cin, name_input);
		cout << "Enter number of rooms: ";
		cin >> no_input;
		cin.ignore();

		while (!(type_input == 0 || type_input == 1))
		{
			cout << "Enter library type: " << endl;
			cout << "0. Hayden " << endl;
			cout << "1. Noble" << endl;
			cin >> type_input;
			cin.ignore();
		}
		type = (libraryType)type_input;

		// searchRoom() will return the room object if found, else returns NULL
		roomResult = searchRoom(name_input);
		if (roomResult == NULL)
		{
			addRoom(name_input, no_input, type);
			cout << endl << "Room added to list!" << endl << endl;
		}
		else
			cout << endl << "Room already present in the list!" << endl << endl;

		break;

	case 'd':		// display the list
		displayList();
		break;

	case 'c':		// change number of rooms
		cout << endl << "Enter room name: ";
		getline(cin, name_input);
		// searchRoom() will return the room node if found, else returns NULL
		roomResult = searchRoom(name_input);
		if (roomResult == NULL)
		{
			cout << endl << "Room not in list!" << endl << endl;
		}
		else
		{
			// if room exists in the list, then ask user for new number of rooms
			cout << endl << "Enter new library type: "<<endl;
                        cout << "0. Hayden " << endl;
                        cout << "1. Noble" << endl;
			cin >> type_input;
			cin.ignore();
			type = (libraryType)type_input;
			// Q3c Call changeLibraryType() here   (1 point)
			// 'roomResult' contains the room whose Library Type is to be changed..
			// Call the function with appropriate arguments.


			cout << endl << "Library type changed!" << endl << endl;
		}
		break;

	case 'q':		// quit
		break;

	default: cout << c << " is invalid input!\n";
	}

}

// No implementation needed here, however it may be helpful to review this function
Room* searchRoom(string name_input)
{

	Container* tempList = list;			// work on a copy of 'list'

	while (tempList != NULL)			// parse till end of list
	{
		if (tempList->room->getName() == name_input)
		{
			return tempList->room;	// return the room if found
		}

		tempList = tempList->next;		// parse the list
	}

	return NULL;						// return NULL if room not found in list
}

// Q3b: Define Friend Function changeLibraryType()  (3 points)
// Define the function changeLibraryType()that is declared in room.h file.
// This function sets the new 'no' of the room. The room object and new number of rooms is to be passed as function arguments.
// Use 'd' display option after using 'c' option to verify.
// You will need to implement add() and displayList() before you test this function.
void changeLibraryType(Room* room, int newLibraryType) 
{
	//parsing  integer to enum to simplify the whole process, making each step a lot more affordable
	if (newLibraryType == 0) {
		room->lib = hayden; // changing the room to hayden
	}
	else { // else operation
		room->lib = noble; // changing the room to noble
	}
}

// Q4: addRoom  (7 points)
// This function is used to add a new room to the global linked list 'list'. You may add the new room to head or tail of the list. (Sample solution adds to tail)
// libraryType 'type' can be hayden or noble. You will need to use the function argument �type� to determine which constructor to use to create new room node.
// For example, if the user enters type as 'noble', then you need to use Noble class and constructor to create new room node and add it to the list.
// NOTE: In executeAction(), searchroom() is called before this function. Therefore no need to check here if the room exists in the list.
//       See how this fucntion is called in case 'a' of executeAction()

void addRoom(string name_input, int no_input, libraryType type) 
{
	Container* tempList = list;				// work on a copy of 'list'
	Room* newRoom;
	if (type == 0) {// depending on the library type, we change the room either hayden or noble subclass
		newRoom = new Hayden(name_input, no_input, type); // making the new room into hayden
	} else { // instating the else function
		newRoom = new Noble(name_input, no_input, type); // making the new room into noble
	}

	if (tempList == NULL){ // if this is empty, it is added to the front of the list 
	
		tempList = new Container(); // making temp list a new container
		tempList->room = newRoom; // moving the node to a new room
		list = tempList; // making list into temp list
	} else { 
		tempList = new Container();// adding to the next position
		tempList->room = newRoom;
		tempList->next = list;
		list = tempList;
	}
}

// Q5: displayList	(4 points)
// This function displays the list of room and their details (name, no, library name)
// Parse the list and use the class member function to display the room info.
// See expected output in the question file.
// No implementation needed here, however it may be helpful to review this function

void displayList()
{
	Container *tempList = list;			// work on a copy of 'list'
	cout << " " << endl; // cout to the end
	if (tempList == NULL) { 
		//checking if the list contains anything
		return;
	} else {
		while (tempList != NULL) {
			tempList->room->displayRoom(); // calling the displayRoom function until the list ends

			
			tempList = tempList->next; // going through the list

			cout << "\n " << endl; // cout to the end

		}
	}
}

// Q6: save  (7 points)
// Save the linked list of rooms to a file list.txt using ofstream.
// You will need to save the number of rooms in linked list. That will help in load() when reading the file.
// One format to store is:
// <no. of rooms>
// <Room1 name>
// <Room1 no>
// <Room type>
// <Room2 name>
// <Room2 no>
// <Room2 type>
// and so on..
// You may store the list in another format if you wish. You need to read the file in load () the same way that it is saved in save().
// This function is called when exiting the program (end of main() ).
// Hint: You may want to cast the enum �libraryType� to an int before writing it to the file.


void save(string fileName)
{
	int counter = 0; // creating a counter to keep track of the number we're at

	Container* tempList = list; // creating a copy of list to work with

	ofstream fileVar; // making offstream readable


	while (tempList != NULL) {// using the counter variable to see how long the list is
		tempList = tempList->next;
		counter++;
	}

	fileVar.open(fileName); // used to open the file
	
	if (fileVar.is_open()) {// if the file is opened, run the following command

		tempList = list; // setting temp list to list
		fileVar << counter << endl; // making file var counter to the end

		while (tempList != NULL) // looping through list
		{
			
			fileVar << tempList->room->getName() << endl; // interating through rooms
			fileVar << tempList->room->getNo() << endl;
			libraryType lib = tempList->room->getLibraryType(); // letting leb to following command
			if (lib == 0){  // checking if lib is equal to zero
				fileVar << "hayden" << endl; // making firevar haden into end
			}
			else { // instating the else function
				fileVar << "noble" << endl; //making firevar noble into end
			}
			
			tempList = tempList->next; // going through list
		}
		fileVar.close(); // closing the filestream
	}
	
}

// Q7: load (7 points)
// Load the linked list of rooms from the file using ifstream.
// You will need to create the linked list in the same order that is was saved to the file in save().
// First, read the number of rooms saved in the file.
// Then, for every room you will need to create a new Room node depending on room type. You may add the room to head or tail of the list. 
// Hint: If you casted the enum 'libraryType' to an int, you will need to cast it back to 'libraryType' when making the room node.
// This function is called at the beginning of main().

void load(string fileName)
{
	int counter = 0; // creating a counter to keep track of the number we're at

	Container* tempList = list; // creating a copy of list to work with
	
	ifstream fileVar;

	fileVar.open(fileName); // opening the file

	if (fileVar.is_open()) // if the file is opened, run the following command
	{
		fileVar >> counter; // finding out how many times to iterate through
		
		for (int i = 0; i < counter; i++) // forloop to iterate though list
		{			
			Container* newNode = new Container(); // making a new container
			string name; // new string called name
			int no; // new int called no
			string lib; // new string called lib
			
			getline(fileVar,name); // to fix the extra line
			getline(fileVar,name);

			fileVar >> no; // setting fileVar to no
			fileVar >> lib; // setting filevar to lib

		
			libraryType libType; // establishing libtype
			if (lib == "hayden") { // if the library is equal to hayden
				libType = hayden; // the library type is set to hayden
			}
			else { // instating the else function
				libType = noble; // library is set to noble
			}
			addRoom(name, no, libType); // adding a room
		}
	}
	fileVar.close(); // closing file
	
}
