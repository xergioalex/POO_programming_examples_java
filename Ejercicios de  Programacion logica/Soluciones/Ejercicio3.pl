alldiferents(W,X,Y,Z):-
	W\=X, W\=Y, W\=Z,
	X\=Y, X\=Z,
	Y\=Z
.

solve(Sol):-
	Sol=[[N1,C1,andrew],[N2,C2,corey],[N3,C3,doru],[N4,C4,sandy]],

	%RESTRICCIONES
	member(N1,[1,2,3,4]),
	member(N2,[1,2,3,4]),
	N3=1,
	member(N4,[1,2,3,4]),
	member(C1,[1,2,3,4]),
	member(C2,[1,2,3,4]),
	member(C3,[1,2,3,4]),
	member(C4,[1,2,3,4]),

	%Todos diferentes
	alldiferents(N1,N2,N3,N4),
	alldiferents(C1,C2,C3,C4),



	%Andrew no gano ninguna competencion
	N1>1,
	C1>1,

	%EL que gano la competencia de natacion llego de 3 en la de ciclismo
	member([1,3,_],Sol),

	%Andrew fue mejor que corey en la competencia de natacion
	N1<N2,
	C2<C1,

	%Corey nunca llego de ultimo
	N2<4,
	C2<4,

	%Doru gano la competencia de ciclismo, pero sandy fue mejor que el en natacio  C3=1,
        %member([_,1,doru],Sol),
	C4<C3

.
