
#ifndef _HAYDEN_H
#define _HAYDEN_H
// Q1a: Create Hayden class (5 points)
// Part 1: Create a child class of the Room class named 'Hayden'
class Hayden : public Room // creating a class called Hayden, and making it a public room
{
    public: // establishing the public variable to ensure stability in code
    Hayden(string roomName, int noOfRooms, libraryType libType) : Room(roomName, noOfRooms, libType) {} // initializing method

    // Part 3: Re-declare the method displayRoom (virtual method found inside of parent class Room)
    void displayRoom(); // declaring the method
};
#endif
