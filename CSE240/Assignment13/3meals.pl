/* Database for the meals of lunch and dinner. It consists of facts and rules. */

/* Facts */

/* Question 3.1 */
entre(lunch, sandwich). /* making an entre*/
entre(dinner, spaghetti). /* making an entre*/
side(lunch, chips). /* making lunch*/
side(lunch, lemonade). /* making lunch*/
side(dinner, greentea). /* making dinner*/
side(diner, bread). /* making diner*/

/* ingredients */
ingredient(chips, potato). /*ingredients */
ingredient(chips, salt)./* ingredients */
ingredient(lemonade, lemon)./* ingredients */
ingredient(lemonade, sugar)./* ingredients */
ingredient(bread, egg). /* ingredients */
ingredient(bread, flour). /* ingredients */
ingredient(greentea, green). /* ingredients */
ingredient(greentea, tea). /* ingredients */
 

/* Question 3.2 */
meal(X,Y) :- entre(X,Y).
meal(X,Y) :- side(X,Y).

/* Question 3.3 */
shoppinglist(X,Y) :- entre(X,Z), ingredient(Z,Y). 
