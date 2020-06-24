#include <stdio.h>
int main() {
	char c;
	int a = 10, b = 20;
	double f;
	for (int i = 0; i < 5; i++)
	{
		printf("Enter a math opperation:");
		scanf("%c", &c);
		switch (c) {
		case '+':f = a + b; printf("f = %f\n", f);
		break;		
		case '-': f = a - b; printf("f = %f\n", f);
		break;
		case '*': f = a * b; printf("f = %f\n", f);
		break;
		case '/': f = a / (double)b; printf("f = %.1f\n", f);
		break;
		default: printf("invalid operator\n");
		break;

	}

	c = getchar();
	

	}

	return 0;
}