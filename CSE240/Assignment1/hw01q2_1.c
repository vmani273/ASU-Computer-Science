/* This C program demonstrates the switch statement without using breaks. */
#include <stdio.h>
int main() {
	char ch = '+';
	int a = 10, b = 20;
	double f;
	printf("ch = %c\n", ch);
	switch (ch) {
		case '+':f = a + b; printf("f = %f\n", f);
		break;		
		case '-': f = a - b; printf("f = %f\n", f);
		break;
		case '*': f = a * b; printf("f = %f\n", f);
		break;
		case '/': f = a / b; printf("f = %f\n", f);
		break;
		default: printf("invalid operator\n");		
	}
	ch = '-';
	printf("ch = %c\n", ch);
	switch (ch) {
		case '+': f = a + b; printf("f = %f\n", f);
		break;
		case '-': f = a - b; printf("f = %f\n", f);
		break;
		case '*': f = a * b; printf("f = %f\n", f);
		break;
		case '/': f = a / b; printf("f = %f\n", f);
		break;
		default: printf("invalid operator\n");
		
	}
	ch = '*';
	printf("ch = %c\n", ch);
	switch (ch) {
		case '+': f = a + b; printf("f = %f\n", f);
		break;
		case '-': f = a - b; printf("f = %f\n", f);
		break;
		case '*': f = a * b; printf("f = %f\n", f);
		break;
		case '/': f = a / b; printf("f = %f\n", f);
		break;
		default: printf("invalid operator\n");
	}

	ch ='/';
	printf("ch = %c\n", ch);
	switch (ch) {
		case '+': f = a + b; printf("f = %f\n", f);
		break;
		case '-': f = a - b; printf("f = %f\n", f);
		break;
		case '*': f = a * b; printf("f = %f\n", f);
		break;
		case '/': f = a / (double)b; printf("f = %f\n", f);
		break;
		default: printf("invalid operator\n");
	} ch = '%';
	printf("ch = %c\n", ch);
	switch (ch) {
		case '+': f = a + b; printf("f = %f\n", f);
		break;
		case '-': f = a - b; printf("f = %f\n", f);
		break;
		case '*': f = a * b; printf("f = %f\n", f);
		break;
		case '/': f = a / b; printf("f = %f\n", f);
		break;
		default: printf("invalid operator\n");
	}

} 


