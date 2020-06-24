
// Q2b: Define displayRoom() for Noble class (5 points)
// Define the function displayRoom() that you declared within the Noble class in the header file
// See expected output in question file.

// (displayList() function in hw10.cpp should call this function.)
// Include necessary header files


#include "room.h"
#include "noble.h"

#include <iostream>

void Noble::displayRoom()
{
	// notice that no function call is needed becasue we know this is Hayden class function
	// we can jump directly to the next part
    cout << "Name: " << getName() << "\n";


    cout << "Number: " << getNo() << "\n";


    //Parse library type to string

    if (getLibraryType() == 0) 
	{ 
		// going through library type to make the string conversion.  This is a curcial step
        cout << "Library: Hayden"; // making cout library to Hayden
    }


    else { // instating the else function
        cout << "Library: Noble"; //making cout library to noble
    }
}
