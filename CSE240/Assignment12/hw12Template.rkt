;Your Name: Vishwas Mani
;Course: CSE 240


;Q1 (3 points)
; enter your code here:
(define (AND-GATE a b) (if (and (= a 1) (= b 1)) 1 0 ) ) ;defining an and gate with if values according to use cases and tranmistio
(define (OR-GATE a b) (if (and (= a 0) (= b 0)) 0 1) ) ; checking if the or gate is present for a and b and if how how that would get implimented
(define (NOT-GATE a) (if (= a 0) 1 0)) ; implimenting ot gate 

; Test cases
(newline)
(Display "AND-Gate Output\n")
(AND-GATE 0 0)
(AND-GATE 0 1)
(AND-GATE 1 0)
(AND-GATE 1 1)
; Expected outputs
;0
;0
;0
;1
; Test cases
(newline)
(Display "OR-Gate Output\n")
(OR-GATE 0 0)
(OR-GATE 0 1)
(OR-GATE 1 0)
(OR-GATE 1 1)
; Expected outputs
;0
;1
;1
;1
; Test cases
(newline)
(Display "NOT-Gate Output\n")
(NOT-GATE 0)
(NOT-GATE 1)
; Expected outputs
;1
;0

; Q2 (2 points)
; enter your code here:
(define (XOR-GATE a b) (if (= a b) 0 1)) ; testing code definition with appropriate gates and connotations.
; Test cases
(newline)
(newline)
(Display "XOR-Gate Output\n")
(XOR-GATE 0 0)
(XOR-GATE 0 1)
(XOR-GATE 1 0)
(XOR-GATE 1 1)
; Expected outputs
;0
;1
;1
;0

;Q3.1 (5 points)
; enter your code here:
(define (halfAdder x a b) ; defining function for half adder and implimenting it for the given values and proportions
  (XOR-GATE x (XOR-GATE a b))) ;implimenting xor gate to futher enhance current situation

;Q3.2 (5 points)
; enter your code here:
(define (carry-out x a b) ; defining carry out x and a and b while utilizing the or gate
  (OR-GATE (AND-GATE x (XOR-GATE a b)) (AND-GATE a b))) ;  using the or gate to further enhance the method 


;Q3.3 (5 points)
; enter your code here:
(define (fullAdder x a b) ; defining full adder
  (cons (carry-out x a b)(halfAdder x a b))); using carry out function

; Test cases
(newline)
(Display "halfAdder Output\n")
(halfAdder 0 0 0) 	
(halfAdder 0 0 1) 	
(halfAdder 0 1 0) 	
(halfAdder 0 1 1)	
(halfAdder 1 0 0) 	
(halfAdder 1 0 1)	
(halfAdder 1 1 0) 	
(halfAdder 1 1 1)

; Expected outputs
;0
;1
;1
;0
;1
;0
;0
;1


; Test cases
(newline)
(Display "fullAdder Output\n")
(fullAdder 0 0 0) 	
(fullAdder 0 0 1) 	
(fullAdder 0 1 0) 	
(fullAdder 0 1 1)	
(fullAdder 1 0 0) 	
(fullAdder 1 0 1)	
(fullAdder 1 1 0) 	
(fullAdder 1 1 1)

; Expected outputs
;(0 . 0)
;(0 . 1)
;(0 . 1)
;(1 . 0)
;(0 . 1)
;(1 . 0)
;(1 . 0)
;(1 . 1)


;Q4.1 (4 points)
; enter your code here:
(define (tail lst) ;  defining the tail list for the function
  (if (null? (cdr lst)) ; if it is null, do one thing, if not do other
      (car lst) ; car lst initalizing
      (tail (cdr lst)))) ; tail end function

;Q4.2 (4 points)
(define (rmtail lst) ; defining initial function
  (if (null? (cdr lst)) '() ; callback drive to if statement
      (cons (car lst) ; cons concacting
            (rmtail (cdr lst))))) ; retirecting rmtail

;Q4.3
; Step 1 size-n problem: Lines of code
; ----> first three lines

; Step 2 Stopping condition: Lines of code
; ----> second set of lines

; Step 3 size-m problem: Lines of code
; ----> 7 - 10

; Step 4: Lines of code
; ----> 11- 15


;Q4.4 (18 points)
; enter your code here:
(define (n-bit-adder A B n)(recursiveAdd A B 0)) ;defining intial functions with appropriate adders and sub
(define (recursiveAdd A B c) (if (null? A) (list (list c)) (cons (car (fullAdder (tail A) (tail B) c)) (recursiveAdd (rmtail A) (rmtail B) (cdr (fullAdder (tail A) (tail B) c))) ))) ; series of if statements describing the pool and according coordinates to format

;Test cases
(define X1 '(0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0) )	
(define X2 '(1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1) )	
(define X3 '(0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1) )	
(define X4 '(1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0) )
(define X5 '(1 1 0 1 0 1 0 1 0 1 0 1 0 1 1 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 1 1) )	
(define X6 '(1 1 1 0 0 0 1 1 1 0 0 0 1 1 1 0 0 0 1 1 1 0 0 0 1 1 1 0 0 0 1 0) )


(newline)
(Display " n-bit-adder Output\n")
( n-bit-adder  X1 X2 32)
( n-bit-adder  X3 X4 32)
( n-bit-adder  X5 X6 32)
( n-bit-adder  X2 X3 32)
( n-bit-adder  X4 X5 32)
( n-bit-adder  X1 X6 32)
; Expected outputs
;(0 (1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1))
;(0 (1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1))
;(1 (1 0 1 1 1 0 0 0 1 1 1 0 0 1 0 1 1 0 0 0 1 1 1 0 0 0 1 1 1 0 0 1))
;(1 (0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 0))
;(1 (1 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1))
;(0 (1 1 1 0 0 0 1 1 1 0 0 0 1 1 1 0 0 0 1 1 1 0 0 0 1 1 1 0 0 0 1 0))
