;incrimenting character

(define charEncrypt(lambda (ch) ; implimenting the define function in this system
                     
(if (or (char-alphabetic? ch) ; if statement, then instide checking if char alphabetic is equivalent
        
        (and (> (char->integer ch) 47) ; and function to initiate car
             
             (< (char->integer ch) 58)))
    (integer->char (+ (char->integer ch) Key)) ; if the car value is present, then shift by key value
    (if(= (char->integer ch) 32)
       
       (integer->char 35)
       ch
       )
    )
                   )
  )

;incrimenting string

(define encrypt (lambda (s) ; defining the function
                  
(list->string (map charEncrypt(string->list s))) ; decraring a list from which we can work
                  
                  )
  ) ; ending braces for function

; decrementing character

(define charDecrypt(lambda (ch) ; defining function
(if (or (char-alphabetic? ch) ; if statement
        
        (and (> (char->integer ch) 47); comparing and greater than
             
             (< (char->integer ch) 58))); if less than operation valid
    (integer->char (- (char->integer ch) Key)); finding the negative inverse
    
    (if(= (char->integer ch) 35) ; if statement initializing 
       (integer->char 32) ; checking if integer is greater than
       (if(or (= (char->integer ch) 123) (= (char->integer ch) 124) (= (char->integer ch) 125)); if comparison
          (integer->char (- (char->integer ch) Key)) ; intiger validation
          ch
          )
       )
    )                     
                     )
  )

; decrementing string
(define decrypt (lambda (s) ; defining function
(list->string (map charDecrypt (string->list s))) ; making list
                  
))


(define Key (read)); incription key

;TEST CASES:

(display (encrypt "Is a zebra a horse?"))
(newline)
(display (decrypt (encrypt "Is a zebra a horse?")))
(newline)
(display (encrypt "function f(x) != g(y)"))
(newline)
(display (decrypt (encrypt "function f(x) != g(y)")))




