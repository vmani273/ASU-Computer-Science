#include <stdio.h>

#pragma warning(disable : 4996)


#define subm(a,b) a-b // defining macros 

#define cubem(a) a * a * a

#define minm(a,b) (a <= b) ? a : b

#define oddm(a) (a % 2 == 1) ? 1 : 0


int subf(int a, int b) { // subf method decleration
    return a - b; // subtraction method 
}

int cubef(int a) { // cubef method decleration
    return a *  a * a; // method to cube value
}

int minf(int a, int b) { // minf method decleration
    if(a <= b) { // method to return minimum value
        return a;
    }else {
        return b;
    }
}




int oddf(int a) { //oddf method decleration
    if (a % 2 == 1) { // method to check if number is odd or even
        return 1;
    }
    else {
        return 0;
    }
}

int main() {
    int a = 3, b = 6; // initializing int a and b 
    printf("subf(a, b) = %d\n", subf(a, b)); // printing the following functions 
    printf("subm(a, b) = %d\n", subm(a, b));
    printf("subf(a++, b--) = %d\n", subf(a++, b--));
    a = 3; b = 6; // reset a,b values
    printf("subm(a++, b--) = %d\n", subm(a++, b--)); // printing fubm for a++ and b--
    a = 3; b = 6;
    printf("cubef(a) = %d\n", cubef(a)); // printing cubef(a)
    printf("cubem(a) = %d\n", cubem(a));
    printf("cubef(--a) = %d\n", cubef(--a));
    a = 3; b = 6; // reset a,b values
    printf("cubem(--a) = %d\n", cubem(--a)); // printing -aa in the cube function
    a = 3; b = 6; // reset a,b values
    printf("minf(a, b) = %d\n", minf(a, b)); // printing them minimum of a and b 
    printf("minm(a, b) = %d\n", minm(a, b));
    printf("minf(--a, --b) = %d\n", minf(--a, --b));
    a = 3; b = 6; // reset a,b values
    printf("minm(--a, --b) = %d\n", minm(--a, --b));
    a = 2; b = 6; // reset a,b values
    printf("oddf(a) = %d\n", oddf(a)); // printing if the fuction is odd or not 
    printf("oddm(a) = %d\n", oddm(a));
    printf("oddf(a++) = %d\n", oddf(a++));
    a = 2; b = 6; // reset a,b values
    printf("oddm(a++) = %d\n", oddm(a++));
    
}
