

#ifndef _NOBLE_H_
#define _NOBLE_H_
// Q1b: Create Noble class (5 points)
// Part 1: Create a child class of the Room class named 'Noble'
class Noble : public Room // creating a class called Hayden, and making it a public room
{
    public: // establishing the public variable to ensure stability in code
    Noble(string roomName, int noOfRooms, libraryType libType) : Room(roomName, noOfRooms, libType) {} // initializing method

    // Part 3: Re-declare the method displayRoom (virtual method found inside of parent class Room)
    void displayRoom(); // declaring the method
};
#endif
