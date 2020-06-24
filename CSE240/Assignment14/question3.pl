qsort([],[]):- !.

qsort([X], [X]). % defining quick sort algorithm

qsort([Head|[Pivot|Tail]],Sorted):- % pivoting head and tail

split(Pivot,[Head|Tail],Less,Greater), % less or greater than

qsort(Less,SortedLess), % transitional 

qsort(Greater,SortedGreater), % sorting greater than

append(SortedLess,[Pivot|SortedGreater],Sorted).

split(_,[],[],[]). % splitting 

split(Pivot,[X|T],[X|Less],Greater):-

X=<Pivot,split(Pivot,T,Less,Greater).

split(Pivot,[X|T],Less,[X|Greater]):-

X>Pivot,split(Pivot,T,Less,Greater).		