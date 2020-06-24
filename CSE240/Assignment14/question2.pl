
/*Question 2.1*/

/*Priliminary values*/



pizza(P,M,B,O,C):-

member(C,[0,1,2,3,4,5]),
member(P,[0,1,2,3,4,5,6,7,8,9]), 
member(B,[0,1,2,3,4,5,6]),
member(O,[0,1,2,3,4,5,6,7,8,9,10,11,12,13,1,4,15]),
member(M,[0,1,2,3,4]),



totalWeight is P*5 + M*10 + B*7 +O*3 + C*8, /* signifies the toal weight calculation */
totalWeight = 45. 

q2:- pizza(1,2,2,2,2). /* question 2 function */
q3:- pizza(1,M,1,O,C). /* question 3 function */
q4:- pizza(P,M,B,O,1). /* question 4 function */
 
