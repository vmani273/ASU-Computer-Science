#include <stdio.h>
#pragma warning(disable : 4996) // needed in VS

// CSE 240 Spring 2020 Homework 2 Question 3 (25 points)
// Note: You may notice some warnings when you compile in GCC or VS, that is okay.

#define isPositive(x) ((x > 0) ? x : 0);

#define polyMacro(a, b) (a*a + 8*a- 3*a*b + b*b)

int polyFunc(int a, int b) { 
	return (a*a + 8*a - 3*a*b + b*b);
}

// Part 1:
// We want to pass the value of 10 to isPositive and expect the result of isPositive to be 10, why is the result 11? Correct the error (5 points)
void part1(int x) {

	int result;
	
	result = isPositive(++x);
	printf("isPositive(10) = %d \n\n", result);
	
	// Why did this error occur? Please provide the answer in your own words below.
	printf("Explanation: It was pre incremented, while it should be post incremented.  Marcos use text substitution, meaning that the same statement is the same as isPositive(++x) = ++x > 0 ? ++ : 0.  The value x incremented twice.\n\n\n"); // (2.5 points)
}


// Part 2:
// We want to pass incremented values of x and y to the macro and function to compare their outputs in VS and GCC.
// Run this program in Visual Studio(VS) and then again in GCC. Fill the blanks below with the output values for polyFunc and polyMacro.
// Then correct/edit this function so that polyFunc and polyMacro produce same correct output of 36.			// (5 points)
// 
void part2(int x, int y) {
	int x_copy = x, y_copy = y;

	printf(" polyFunc(x, y) = %d \n polyMacro(x, y) = %d \n\n", polyFunc(++x, ++y), polyMacro(++x_copy, ++y_copy));


	// Replace the 4 blank spaces below with the actual output observed when running the code in VS and GCC.
	// The blanks should have the answers of unedited program. Keep the answers in blanks as they were, after editing the program.
	printf("In VS : the result of polyFunc = 36 and polyMacro = 25 \n"); 			// (5 points)
	printf("In GCC: the result of polyFunc = 36 and polyMacro = 28\n\n"); 		// (5 points)

	// Explain in a short sentence why VS and GCC could possibly produce a different value for the same program and for the same input.
	printf("Explanation: GCC and VS use different variation in compilers that could result in a difference in output being produced\n\n"); //  (2.5 points)
}

// Do not edit main()  
int main()
{
	int x = 9, y = 5;

	printf("Part 1:\n\n");
	part1(x);
	printf("Part 2:\n\n");
	part2(x, y);

	while (1);	// needed to keep console open in VS
	return 0;
}
