# Name : Vishwas Mani
# Class ID: 788
# Assignment number: 2

.data
.global main
.text
main:

#Action-1 
addi $s0, $zero, 15 # Initializing 0 by adding 15

#Action-2
addi $s1, $zero, -4 # Initializing 1 by subtracting -4


#Action-3
addi $v0, $zero, 5 #  reading input 
syscall
add $s2, $zero, $v0 # putting answer into $s2

#Action-4
add $s3, $s1, $s2 # assigning $s3 to$ 
sub $s3, $s3, $s0 # s1-$s0+$s2

#Action-5
addi $s4, $zero, -7 # Assigning = and adding 7
add $s4, $s4, $s2
add $s4, $s4, $s3 # $s4to$s3+$s2-7

#Action-6
addi $s5, $zero, 20 # Seting $s5to20+$s1-$s2
add $s5, $s5, $s1
sub $s5, $s5, $s2

#Action-7
add $t0, $zero, $s1 # Exchange and swaping the values in $s0 and $s1
add $s1, $zero, $s0
add $s0, $zero, $t0

#Action-8
add $t1, $zero, $s2 # Assignning $s2 to -$s2
sub $s2, $s2, $t1
sub $s2, $s2, $t1

#Action-9
addi $v0, $zero, 1
add $a0, $s0, $zero # Print the values for $s0, $s1, $s2, $s3, $s4 and $s5
syscall
add $a0, $s1, $zero
syscall
add $a0, $s2, $zero
syscall
add $a0, $s3, $zero
syscall
add $a0, $s4, $zero
syscall
add $a0, $s5, $zero
syscall

#Action-10
addi $v0, $zero, 10
syscall # Ending program