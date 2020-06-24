// CSE240 Spring 2020 HW6
// Vishwas Mani
// GCC

// READ BEFORE YOU START:
// You are given a partially completed program that creates a linked list of patient records.
// Each record(struct) has this information: student's name, major, school year of student, ID number.
// The struct 'studentRecord' holds information of one student. School year is enum type.
// A linked list called 'list' is made to hold the list of students.
// To begin, you should trace through the given code and understand how it works.
// Please read the instructions above each required function and follow the directions carefully.
// You should not modify any of the given code, the return types, or the parameters, you risk getting compile error.
// You are not allowed to modify main ().
// You can use string library functions.
// ***** WRITE COMMENTS FOR IMPORANT STEPS OF YOUR CODE. 10% deduction for not using comments *****
// ***** GIVE MEANINGFUL NAMES TO VARIABLES. *****

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#pragma warning(disable: 4996) // for Visual Studio Only

#define MAX_NAME_LENGTH 25

typedef enum { freshman = 0, sophomore, junior, senior } schoolYearType; // enum type 

struct studentRecord {
	char studentName[MAX_NAME_LENGTH];
	char major[MAX_NAME_LENGTH];
	schoolYearType schoolYear;
	unsigned int IDNumber;
	struct studentRecord* next;	// pointer to next node
} *list = NULL;					// Declare linked list 'list'

// forward declaration of functions (already implmented)
void flushStdIn();
void executeAction(char);

// functions that need implementation:
int addSort(char* studentName_input, char* major_input, char* schoolYear_input, unsigned int IDNumber_input); // 20 points
void displayList();						// 10 points
int countNodes();						// 5 points
int deleteNode(char* studentName_input);	// 10 points
void swapNodes(struct studentRecord* node1, struct studentRecord* node2);	// 5 points


int main()
{	
	char selection = 'i';		// initialized to a dummy value
	printf("\nCSE240 HW6\n");
	do
	{
		printf("\nCurrently %d student(s) on the list.", countNodes());	// NOTE: countNodes() called here
		printf("\nEnter your selection:\n");
		printf("\t a: add a new student\n");
		printf("\t d: display student list\n");
		printf("\t r: remove a student from the list\n");
		printf("\t q: quit\n");
		selection = getchar();
		flushStdIn();
		executeAction(selection);
	} while (selection != 'q');

	return 0;
}

// flush out leftover '\n' characters
void flushStdIn()
{
	char c;
	do c = getchar(); 
	while (c != '\n' && c != EOF);
}

// Ask for details from user for the given selection and perform that action
// Read the code in the function, case by case
void executeAction(char c)
{
	char studentName_input[MAX_NAME_LENGTH], major_input[MAX_NAME_LENGTH];
	unsigned int IDNumber_input, result = 0;
	char schoolYear_input[20];
	switch (c)
	{
	case 'a':	// add student
		// input student details from user
		printf("\nEnter student name: ");
		fgets(studentName_input, sizeof(studentName_input), stdin);
		studentName_input[strlen(studentName_input) - 1] = '\0';	// discard the trailing '\n' char
		printf("Enter major: ");
		fgets(major_input, sizeof(major_input), stdin);
		major_input[strlen(major_input) - 1] = '\0';	// discard the trailing '\n' char

		printf("Enter whether student is 'freshman' or 'sophomore' or 'junior' or 'senior': ");
		fgets(schoolYear_input, sizeof(schoolYear_input), stdin);
		schoolYear_input[strlen(schoolYear_input) - 1] = '\0';	// discard the trailing '\n' char
		printf("Please enter ID number: ");
		scanf("%d", &IDNumber_input);
		flushStdIn();

		// add the student to the list
		result = addSort(studentName_input, major_input, schoolYear_input, IDNumber_input);
		if (result == 0)
			printf("\nStudent is already on the list! \n\n");
		else if (result == 1)
			printf("\nStudent successfully added to the list! \n\n");
		
		break;

	case 'd':		// display the list
		displayList();
		break;

	case 'r':		// remove a student
		printf("\nPlease enter student name: ");
		fgets(studentName_input, sizeof(studentName_input), stdin);
		studentName_input[strlen(studentName_input) - 1] = '\0';	// discard the trailing '\n' char

		// delete the node
		result = deleteNode(studentName_input);
		if (result == 0)
			printf("\nStudent does not exist! \n\n");
		else if (result == 1)
			printf("\nStudent successfully removed from the list. \n\n");
		else
			printf("\nList is empty! \n\n");
		break;

	case 'q':		// quit
		break;
	default: printf("%c is invalid input!\n",c);
	}
}

// Q1 : addSort 
// This function is used to insert a new student into the list. You can insert the new student to the end of the linked list.
// Do not allow the student to be added to the list if that student already exists in the list. You can do that by checking the names of the students already in the list.
// If the student already exists then return 0 without adding student to the list. If the student does not exist in the list then go on to add the student at the end of the list and return 1.
// NOTE: You must convert the string 'schoolYear_input' to an enum type and store it in the list because the struct has enum type for school year.
// Sorting should happen within the list. That is, you should not create a new linked list of students having sorted students.
// Hint: One of the string library function can be useful to implement this function because the sorting needs to happen by student name which is a string.
//       Use swapNodes() to swap the nodes in the sorting logic

void listSort() {
	if(list->next == NULL || list == NULL ){ //making sure that this is a possibility
		return;
	} 
	// in order to compare things
	struct studentRecord* temp = list;
	struct studentRecord* swap;

	while(temp != NULL) { // looping through the array
		swap = temp -> next;
		while(swap != NULL) {
			if (strcmp(temp -> studentName, swap -> studentName) > 0) { // checks which node is greater
				swapNodes(temp, swap); // swapping nodes
			}
			swap = swap -> next; //second struct goes forward 
 		}
		temp = temp -> next; //first struct goes forward 
	}
}

int addSort(char* studentName_input, char* major_input, char* schoolYear_input, unsigned int IDNumber_input) // 20 points
{
	struct studentRecord* tempList = list;	// work on a copy of 'list'
	struct studentRecord* before = NULL;

	while(tempList != NULL) { // loops through array
		if(strcmp(tempList->studentName, studentName_input) == 0) {
			return 0;
		}
		//moves forward to next input
		before = tempList;
		tempList = tempList ->next;
	}
	//making a student
	struct studentRecord* node = (struct studentRecord*)malloc(sizeof(struct studentRecord));
	node->IDNumber = IDNumber_input;
	strcpy(node->studentName, studentName_input);
	strcpy(node->major, major_input);
	// enum conversion
	if (strcmp(schoolYear_input, "sophomore") == 0) {
		node->schoolYear = sophomore;
	} else if (strcmp(schoolYear_input, "junior") == 0) {
		node->schoolYear = junior;
	} else if (strcmp(schoolYear_input, "freshman") == 0) {
	node->schoolYear = freshman;
	} else {
		node->schoolYear = senior;
	}
	node->next = NULL;

	if(before == NULL) { // being added to first place
		node -> next = list;
		list = node;
	} else {
		node->next = tempList; // else, it is added between before and previous lists 
		before->next = node;
	}
	listSort();
	return 1; // student is added

	

	return 0;	// edit this line as needed
}


// Q2 : displayList (10 points)
// This function displays the linked list of students, with all details (struct elements). 
// Parse through the linked list and print the student details one after the other. See expected output screenshots in homework question file.
// NOTE: School year is stored in the struct as enum type. You need to display a string for school year.
void displayList()
{
	struct studentRecord* tempList = list;	// work on a copy of 'list'
	// enter code here

	if (tempList != NULL) { // getting result if it is empty
		while(tempList != NULL) {
			printf("\nStudent Name: %s\nStudent major: %s\nSchool Year: ", tempList->studentName, tempList->major); 
			// enum conversion
			if(tempList -> schoolYear == freshman) {
					printf("freshman");
			} else if (tempList -> schoolYear == senior) {
				printf("senior");
			} else if (tempList->schoolYear == junior) {
				printf("junior");
			} else {
				printf("sophomore");
			}
			printf("\nID Number: %u\n", tempList -> IDNumber); 
			tempList = tempList -> next; // moving postiion
		}
		printf("\n");
	} else {
		printf("\nEmpty list\n\n");
	}
}

// Q3: countNodes (5 points)
// This function counts the number of students on the linked list and returns the number.
// You may use this function in other functions like deleteNode(), sortList(), addNode(), if needed. 
// It can helpful to call this function in other functions, but not necessary.
// This function is called in main() to display number of students along with the user menu.
int countNodes()
{
	struct studentRecord* tempList = list;
	int counter = 0;

	while(tempList != NULL) { // going through the list
		counter++; // adding to counter 
		tempList = tempList -> next;
	}
	return counter; // returning counter
}

// Q4 : deleteNode (10 points)
// This function deletes the node specified by the student name.
// Parse through the linked list and remove the node containing this student name.
// NOTE: After you remove the node, make sure that your linked list is not broken.
// (Hint: Visualize the list as: list......-> node1 -> node_to_remove -> node2 -> ...end. 
//        After removing "node_to_remove", the list is broken into "list ....node1" and "node2.... end". Stitch these lists.)

int deleteNode(char* studentName_input)
{	
	struct studentRecord* tempList = list->next;	
	struct studentRecord* before = NULL;			
	while(tempList != NULL) {
		if(strcmp(tempList->studentName, studentName_input) == 0) {
			if(before != NULL) {
				before -> next = tempList -> next; // changing position with the one in front 
			} else  {
				list = list -> next;
			}
			free(tempList);  // making sure the memory is free
			return 1; // after student is deleted
		}
	
		before = tempList;
		tempList = tempList->next;

 	}
	return 0;			// edit this line as needed
}


// Q5 : swapNodes (5 points)
// This function swaps the elements of parameters 'node1' and 'node2' (Here node1 does NOT mean 1st node of the list. 'node1' is just the name of the node)
// This function should not alter the 'next' element of the nodes. Only then will the nodes be swapped.
// Hint: The swap logic is similar to swapping two simple integer/string variables.
// NOTE: This function can be used in the sorting logic in addSort()

void swapNodes(struct studentRecord* node1, struct studentRecord* node2)
{
	// node one to temporary struct
	struct studentRecord* temp= (struct studentRecord*)malloc(sizeof(struct studentRecord));	// needed for swapping structs. Not absolutely necessary to use.
	strcpy(temp -> studentName, node1 -> studentName);
	strcpy(temp -> major, node1 -> major);
	temp -> IDNumber = node1 -> IDNumber;
	temp -> schoolYear = node1 -> schoolYear;

	//copying from node one to node two
	strcpy(node1 -> studentName, node2 -> studentName);
	strcpy(node1 -> major, node2 -> major);
	node1 -> IDNumber = node2 -> IDNumber;
	node1 -> schoolYear = node2- > schoolYear;
	
	// temporary to node one
	strcpy(node2 -> studentName, temp -> studentName);
	strcpy(node2 -> major, temp -> major);
	node2 -> IDNumber = temp -> IDNumber;
	node2 -> schoolYear = temp -> schoolYear;
	
}


