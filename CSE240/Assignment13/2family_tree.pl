/* Database for family tree. It consists of facts and rules. */
/* The section in the highlighted box above has been completed for you */

/* Facts */
male(abe).
male(rob).
male(jim).
female(joy).
female(ana).
father_of(abe, ana). /* abe is the father of ana */
father_of(abe, rob). /* abe is the father of rob */
father_of(abe, jim). /* abe is the father of jim */
father_of(jim, mac). /* jim is the father of mac */
father_of(jim, kim). /* jim is the father of kim */
mother_of(joy, rob). /* joy is the mother of rob */
mother_of(joy, jim). /* joy is the mother of jim */
mother_of(joy, ana). /* joy is the mother of ana */
mother_of(mia, mac). /* mia is the mother of mac */
mother_of(mia, kim). /* mia is the mother of kim */
/* Complete the facts given in the diagram above */

/* 2.1 */
male(mac). /* displaying appropriate part */
male(bud).
male(ben).
male(kai).
male(lee).
male(roy).
male(tex).
female(mia). /* displaying appropriate part */
female(kim).
female(zoe).
female(mae).
female(amy).
female(pam).
female(val).
father_of(bud, zoe). /* bud is zoe's father  */
father_of(bud, val). /*  bud is val's father */
father_of(bud, tex).
father_of(bud, roy).

father_of(ben, bud).

father_of(ben, amy).

father_of(kai, lee).


father_of(kai, pam).


mother_of(ana, zoe).


mother_of(ana, val).

mother_of(ana, tex).
mother_of(ana, roy).

mother_of(mae, amy).
mother_of(mae, bud).
mother_of(amy, lee).
mother_of(amy, pam).

/* Rules */
is_male(X) :-
    male(X);
    father_of(X, _).

/* 2.2 */
is_female(X):-female(X);mother_of(X,_). /* clarifying symbol of isFamily */

/* 2.3 */

grandmother_of(X,Z):-parent_of(X,Y),parent_of(Y,Z),female(X). /*  clarifying grandmother_of */




grandfather_of(X,Z):-parent_of(X,Y),parent_of(Y,Z),male(X). /* clarifying grandfather of */



/* 2.4 */
sibling_of(X,Y):-parent_of(Z,X),parent_of(Z,Y),not(X=Y). /* sibling reation of the parents */


/*  2.5 */
parent_of(X,Y):-father_of(X,Y);mother_of(X,Y),male(X);female(X)./* percentage */

/*  2.6 */
descendent_of(X,Y):-parent_of(Y,X). /* descendent */


descendent_of(X,Y) :- parent_of(Y, Z), descendent_of(Z,X). /* descendent */
