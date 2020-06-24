

// CSE240 Spring 2020 HW 7 & 8
// Name: Vishwas Mani
// Write the compiler used: GCC

// READ BEFORE YOU START:
// You are given a partially completed program that creates a linked list of student information.
// The global linked list 'list' is a list of students with each node being struct 'studentList'.
// 'studentList' consists of struct 'student' which has: student name, ID number, and a linked list of 'courses'.
// The linked list of courses has each node containing simply the name of the course.
// HW7 ignores the 'courses' linked list since there is no operation/manipulation to be done on 'courses' list in HW7.
// HW8 has operations/manipulations to be done with 'courses' list like add a course, display last added course.

// To begin, you should trace through the given code and understand how it works.
// Please read the instructions above each required function and follow the directions carefully.
// If you modify any of the given code, the return types, or the parameters, you risk getting compile error.
// Yyou are not allowed to modify main ().
// You can use string library functions.

// ***** WRITE COMMENTS FOR IMPORANT STEPS OF YOUR CODE. *****
// ***** GIVE MEANINGFUL NAMES TO VARIABLES. *****
// ***** Before implementing any function, see how it is called in executeAction() *****


#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#pragma warning(disable: 4996) // for Visual Studio

#define MAX_NAME 30

// global linked list 'list' contains the list of students (pointers of student node and next)
struct studentList {
	struct student *student;
	struct studentList *next;
} *list = NULL;				// currently empty list

// structure "student" contains the student's name, ID number and linked list of courses
struct student {
	char name[MAX_NAME];
	unsigned int IDNumber;
	struct course *courses;		// linked list 'courses' contains names of courses
};

//  structure 'course' contains course's name and next pointer
struct course {
	char name[MAX_NAME];
	struct course *next;
};

// forward declaration of functions (already implmented)
void flushStdIn();
void executeAction(char);

// functions that need implementation:
// HW 7
void addStudent(char* studentNameInput, unsigned int IDNumInput); // 15 points
void displayStudentList(struct studentList* tempList);		// 10 points
struct student* searchStudent(char* studentNameInput);	  // 10 points
void removeStudent(char* studentNameInput);				  // 15 points
//HW 8
void addCourse(char* studentNameInput, char* courseNameInput);	// 15 points
char* lastCourse(char* studentNameInput);					// 15 points
void displayStudentAndCourseList(struct studentList* tempList);	// 10 points
// edit removeStudent()										// 10 points

int main()
{
	char selection = 'a';		// initialized to a dummy value
	do
	{
		printf("\nCSE240 HW 7,8\n");
		printf("Please enter your selection:\n");
		printf("HW7:\n");
		printf("\t a: add a new student to the list\n");
		printf("\t d: display student list (no courses)\n");
		printf("\t r: remove a student\n");
		printf("\t q: quit\n");
		printf("HW8:\n");
		printf("\t c: add a course of a student\n");
		printf("\t l: display last added course of a student\n");
		printf("\t b: display student list including courses\n");
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
// Read the function case by case
void executeAction(char c)
{
	char studentNameInput[MAX_NAME], courseNameInput[MAX_NAME];
	unsigned int IDNumInput;
	struct student* searchResult = NULL;

	switch (c)
	{
	case 'a':	// add student
				// input student details from user
		printf("\nPlease enter student's name: ");
		fgets(studentNameInput, sizeof(studentNameInput), stdin);
		studentNameInput[strlen(studentNameInput) - 1] = '\0';	// discard the trailing '\n' char
		printf("Please enter ID number: ");
		scanf("%d", &IDNumInput);
		flushStdIn();

		//	if (searchStudent(studentNameInput) == NULL)	// un-comment this line after implementing searchStudent()					
		if (1)									// comment out this line after implementing searchStudent()
		{
			addStudent(studentNameInput, IDNumInput);
			printf("\nStudent successfully added to the list!\n");
		}
		else
			printf("\nThat student is already on the list!\n");
		break;

	case 'd':		// display the list
		displayStudentList(list);
		break;

	case 'r':		// remove student
		printf("\nPlease enter student's name: ");
		fgets(studentNameInput, sizeof(studentNameInput), stdin);
		studentNameInput[strlen(studentNameInput) - 1] = '\0';	// discard the trailing '\n' char

		//if (searchStudent(studentNameInput) == NULL)	// un-comment this line after implementing searchStudent()					
		if (0)									// comment out this line after implementing searchStudent()
			printf("\nStudent name does not exist or the list is empty! \n\n");
		else
		{
			removeStudent(studentNameInput);
			printf("\nStudent successfully removed from the list! \n\n");
		}
		break;

	case 'c':		// add course
		printf("\nPlease enter student's name: ");
		fgets(studentNameInput, sizeof(studentNameInput), stdin);
		studentNameInput[strlen(studentNameInput) - 1] = '\0';	// discard the trailing '\n' char

		//	if (searchStudent(studentNameInput) == NULL)	// un-comment this line after implementing searchStudent()					
		if (0)										// comment out this line after implementing searchStudent()
			printf("\nStudent name does not exist or the list is empty! \n\n");
		else
		{
			printf("\nPlease enter course's name: ");
			fgets(courseNameInput, sizeof(courseNameInput), stdin);
			courseNameInput[strlen(courseNameInput) - 1] = '\0';	// discard the trailing '\n' char

			addCourse(studentNameInput, courseNameInput);
			printf("\nCourse added! \n\n");
		}
		break;

	case 'l':		// last course
		printf("\nPlease enter student's name: ");
		fgets(studentNameInput, sizeof(studentNameInput), stdin);
		studentNameInput[strlen(studentNameInput) - 1] = '\0';	// discard the trailing '\n' char

		//	if (searchStudent(studentNameInput) == NULL)	// un-comment this line after implementing searchStudent()					
		if (0)										// comment out this line after implementing searchStudent()
			printf("\nStudent name does not exist or the list is empty! \n\n");
		else
		{
			printf("\nLast course added: %s\n\n", lastCourse(studentNameInput));
		}
		break;

	case 'b':		// display student details along with course list
		displayStudentAndCourseList(list);
		break;

	case 'q':		// quit
		break;

	default: printf("%c is invalid input!\n", c);
	}
}

// HW7 Q1: addStudent (15 points)
// This function is used to insert a new student in the linked list. 
// You must insert the new student to the head of linked list 'list'.
// You need NOT check if the student already exists in the list because that is taken care by searchStudent() called in executeAction(). Look at how this function is used in executeAction().
// Don't bother to check how to implement searchStudent() while implementing this function. Simply assume that student does not exist in the list while implementing this function.
// NOTE: The function needs to add the student to the head of the list.
// NOTE: This function does not add courses to the student info. There is another function addCourse() in HW8 for that.
// Hint: In this question, no courses means NULL courses.

void addStudent(char* studentNameInput, unsigned int IDNumInput)
{
	struct student *studentNew = malloc(sizeof(struct student)); // making a new struct consisting of student
	
	struct studentList *listNew = malloc(sizeof(struct studentList)); // making a struct for the student list
   

   strcpy(studentNew -> name, studentNameInput); // coppying student input into the name

   studentNew -> IDNumber = IDNumInput; // Adding the id input to the student 

   listNew->student = studentNew; // Adding this new student to linked list
   listNew->student -> courses = NULL;
   listNew->next = list;
   list = listNew;


}

// HW7 Q2: displayStudentList (10 points)
// This function displays the student details (struct elements) of each student.
// Parse through the linked list 'list' and print the student details ( name and ID number) one after the other. See expected output screenshots in homework question file.
// You should not display course names (because they are not added in HW7).
// You MUST use recursion in the function to get full points. Notice that 'list' is passed to the function argument. Use recursion to keep calling this function till end of list.

void displayStudentList(struct studentList* tempList)
{
	if (tempList != NULL) {
       printf("\nName: %s", tempList->student->name); // printing name
       printf("\nID Number: %d\n", tempList->student->IDNumber); // printing ID number
   } else {
       return;
   }

   tempList = tempList -> next; // going to next value 
   displayStudentList(tempList); 
}

// HW7 Q3: searchStudent (10 points)
// This function searches the 'list' to check if the given student exists in the list. Search by student name.
// If it exists then return that 'student' node of the list. Notice the return type of this function.
// If the student does not exist in the list, then return NULL.
// NOTE: After implementing this fucntion, go to executeAction() to comment and un-comment the lines mentioned there which use searchStudent()
//       in case 'a', case 'r', case 'b', case 'l' (total 4 places)
struct student* searchStudent(char* studentNameInput)
{
	struct studentList *tempList = list; // making struct tempList
	while (tempList != NULL) {
		if (strcmp(tempList -> student->name, studentNameInput) == 0) { // if value is equal to a specifc name in the linked list
        	return tempList -> student;  // return that student that the loop is specifically pointing to 
       	}

       tempList = tempList -> next; // going to next node in the sequence
   }

   return NULL; // returning null
}

// HW7 Q4: removeStudent (15 points)
// This function removes a student from the list.
// Parse the list to locate the student and delete that 'student' node.
// You need not check if the student exists because that is done in executeAction()
// NOTE: In HW 8, you will need to add code to this function to remove docotrs of that student as well, when you remove the student.

void removeStudent(char* studentNameInput)
{	
	struct studentList* tempList = list;	// work on a copy of 'list'
	struct studentList *lastList = NULL; // making a prevelant List for the last specific node

	while (tempList != NULL) {
    	if (strcmp(tempList -> student->name, studentNameInput) == 0) { // if the appropriate name is selectied
           if (lastList == NULL) {  // if the last list does not have a value present
               tempList = list; // list is assigned to temp list
               list = list -> next; // list moves on to the next one
           } else {
               tempList = lastList -> next; // goes to next node
               lastList -> next = tempList -> next;
           }

           free(tempList);
       }

       lastList = tempList; // assinging temp list to the last list
       tempList = tempList -> next; // jumping to the next node 
   }
	
}

// HW8 Q1: addCourse (15 points)
// This function adds course's name to a student node.
// Parse the list to locate the student and add the course to that student's 'courses' linked list. No need to check if the student name exists on the list. That is done in executeAction().
// If the 'courses' list is empty, then add the course. If the student has existing courses, then you may add the new course to the head or the tail of the 'courses' list.
// You can assume that the same course name does not exist. So no need to check for existing course names, like we do when we add new student.
// NOTE: Make note of whether you add the course to the head or tail of 'courses' list. You will need that info when you implement lastCourse()
//       (Sample solution has course added to the tail of 'courses' list. You are free to add new docotr to head or tail of 'courses' list.)

void addCourse(char* studentNameInput, char* courseNameInput)
{	
	struct studentList* tempList = list;		// work on a copy of 'list'
		while (tempList != NULL) {
			if (strcmp(tempList->student->name, studentNameInput) == 0) { // if the temp list is equal to the name of the imput
        		struct course *newCourse = malloc(sizeof(struct course)); // refer to this specific node
        		strcpy(newCourse->name, courseNameInput); // copy the course input and refer to the new course
           		newCourse->next = tempList->student->courses; // adding new course to the linked list
           		tempList->student->courses = newCourse; // making the temporary list the new course 
       		}

       		tempList = tempList->next; // going to next node
   }
	
}

// HW8 Q2: lastCourse (15 points)
// This function returns the name of the last (most recently) added course of a student.
// Parse the list to locate the student. No need to check if the student name exists in the list. That is done in executeAction().
// Then parse the course names to return the most recently added course.
// NOTE: Last course does not necessarily mean the tail of 'courses' list. It means the most recently added course. 
//       If you are adding course to the head of the list in addCourse(), then you should return that course accordingly.

char* lastCourse(char* studentNameInput)
{
	
	struct studentList* tempList = list;		// work on a copy of 'list'
	while (tempList != NULL) {
       if (strcmp(tempList->student->name, studentNameInput) == 0) { // if the name matches up with one of the existing names 
           struct course *tempCourse = tempList->student->courses; // make a struct called courses which leads to tha specific point in the linked list
           if (tempCourse != NULL) { // if there is no value
               return tempCourse->name; // just return the name present
           }
       }

       tempList = tempList->next; // going to next
   }

   return "No courses added";

}

// HW8 Q3: displayStudentAndCourseList (10 points)
// This function displays every detail of each student, including courses.
// Parse through the linked list passed as parameter and print the student details ( name and ID number) one after the other. See expected output screenshots in homework question file.
// NOTE: This does not have to be a recursive fucntion. You may re-use HW7 Q2 displayStudentList(list) code here.

void displayStudentAndCourseList(struct studentList* tempList)
{
	if (tempList != NULL) {
		printf("\nName: %s", tempList->student->name); // printing name of temp list and the name associated with that
    	printf("\nID number: %d", tempList->student->IDNumber); // printing the ID number

       	struct course *tempCourse = tempList->student->courses; // making a stuct called course that filters through all courses
    	if (tempCourse == NULL) {
        	
			printf("\nNo Courses\n"); // if no courses are present, print no courses
    	
		} else {
        	printf("\nCourses: "); // otherwise, print courses
        	while (tempCourse != NULL) { // if the temp course is equal to null
            	printf("\n %s", tempCourse->name); // print the name of the course
            	tempCourse = tempCourse->next; // go to next node
        	}

           printf("\n"); // new line
       }
   } else {
	       return;
   }

   tempList = tempList->next; // next node
   displayStudentAndCourseList(tempList); // calling displayStudentAndCourseList method
}

// HW8 Q4: modify removeStudent (10 points)	
// In HW7, removeStudent() is supposed to remove student details like name and ID number. 
// Modify that function to remove courses of the student too.
// When the student is located in the 'list', after removing the student name and ID number, parse the 'courses' list of that student
// and remove the courses. 
