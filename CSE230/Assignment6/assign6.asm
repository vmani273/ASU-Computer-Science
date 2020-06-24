#Vishwas Mani
#Class ID: 788
#Assignment 6
.data 
# declaring and initializing variables
   array:   .space   20
   sum: .space 4
   average1: .space 4
   int: .word 5
   nameInput: .asciiz "Vishwas Mani\n"
   numberInput: .asciiz "Enter a number "
   nextLine: .asciiz "\n"
.text
.globl main
main:
#printing the same input
   li $v0,4 # loading 4 into $v0
   la $a0,nameInput # saving name input into $a0 register
   syscall # calling syscall function


   li $t0,3   # signifies that this is repeated three times
  
tracker:
   li $t1,5   # loading 5 into $t1 register
   la $t2,array #calling array in $t2 register
  
looper:  

   beq $t1,$0,next   #if looper condition is met, jump to next funtion
   li $v0,4 # asking user for integer
   la $a0,numberInput # numberInput is loaded into $a0
   syscall #calling syscall function

# reading what user enters
   li $v0,5
   syscall
   sw $v0,0($t2)
  
   addi $t2,$t2,4

   addi $t1,$t1,-1 #Subtracting 1 from the tracker

   j looper   #jumping back to the top of looper        

next:
   li $t1,5  #loading 5 into $t1 register
   la $t2,array #putting array variable into $t2 register
   li $t3,0   #loading 0 into $t3 register

sumFunction:
#Using this method to calculate the sum of number
   beq $t1,$0,averageFunction # comparing averageFunction with 0
  
   lw $t4,0($t2) #loading into memory

   add $t3,$t3,$t4
  
   addi $t2,$t2,4
   addi $t1,$t1,-1
   j sumFunction #jumping to sumFunction function

averageFunction:

   sw $t3,sum #Calls sum value and puts it in $t3

   div $t3,$t3,5 #used to calculate average value
   sw $t3,average1
  
  

   li $v0,1
   lw $a0,sum # gives sum of numbers
   syscall

   li $v0,4
   la $a0,nextLine # makes the average numbers into an integer
   syscall
   li $v0,1
   lw $a0,average1 # loading average1
   syscall

   li $v0,4
   la $a0,nextLine # makes format into single precision
   syscall

   lwc1 $f0,sum
   lwc1 $f1,int
   div.s $f12,$f0,$f1 # used to calculate average value
   li $v0,2
   syscall

   li $v0,4
   la $a0,nextLine
   syscall

   addi $t0,$t0,-1
   bne $t0,$0,tracker # checks if loop is run three times
  

   li $v0,10
   syscall # ending program
