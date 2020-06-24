/* 1.1 - Used 4 Colors*/

state(California).
state(Nevada).
state(Arizona).
state(Oregon).
state(Washington).
state(NewMexico).
state(Utah).
state(Hawaii).
state(Wyoming).
state(Idaho).
state(Colorado).
state(Montana).
state(Alaska).

/* neighbors */

neighbor(Nevada, Utah).
neighbor(Nevada, Idaho).
neighbor(Nevada, Oregon).


neighbor(Arizona, Nevada).
neighbor(Arizona, California).
neighbor(Arizona, Colorado).
neighbor(Arizona, Utah).
neighbor(Arizona, NewMexico).


neighbor(California, Oregon).

neighbor(California, Nevada).

neighbor(Oregon, Washington).

neighbor(Oregon, Idaho).

neighbor(Colorado, NewMexico).
neighbor(Colorado, Utah).

neighbor(Idaho, Utah).


neighbor(Washington, Idaho).

neighbor(Montana, Wyoming).
neighbor(Montana, Idaho).

neighbor(Wyoming, Idaho).
neighbor(Wyoming, Colorado).
neighbor(Wyoming, Utah).


neighbor(NewMexico, Utah).


/* Colors*/


color(Utah, Blue).

color(Arizona, Orange).

color(California, Red).

color(NewMexico, Red).

color(Idaho, Orange).

color(Hawaii, Red).

color(Montana, Yellow).

color(Colorado, Yellow).

color(Nevada, Yellow).

color(Washington, Blue).

color(Oregon, Yellow).

color(Alaska, Red).

color(Wyoming, Red).
















