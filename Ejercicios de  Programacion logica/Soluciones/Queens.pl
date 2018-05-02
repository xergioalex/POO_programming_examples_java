alldiferents(A,B,C,D,E,F,G,H):-
	A\=B, A\=C, A\=D, A\=E, A\=F, A\=G, A\=H,
	B\=C, B\=D, B\=E, B\=F, B\=G, B\=H,
	C\=D, C\=E, C\=F, C\=G, C\=H,
	D\=E, D\=F, D\=G, D\=H,
	E\=F, E\=G, E\=H,
	F\=G, F\=H,
	G\=H
.

solve(Sol):-
	Sol=[Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8],
	%Definicion de dominios
	member(Q1,[1,2,3,4,5,6,7,8]),
	member(Q2,[1,2,3,4,5,6,7,8]),
	member(Q3,[1,2,3,4,5,6,7,8]),
	member(Q4,[1,2,3,4,5,6,7,8]),
	member(Q5,[1,2,3,4,5,6,7,8]),
	member(Q6,[1,2,3,4,5,6,7,8]),
	member(Q7,[1,2,3,4,5,6,7,8]),
	member(Q8,[1,2,3,4,5,6,7,8]),

	%Todas diferentes
	alldiferents(Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8),

	%Restricciones
	 abs(Q1-Q2) =\=1,
	 abs(Q1-Q3) =\=2,
	 abs(Q1-Q4) =\=3,
	 abs(Q1-Q5) =\=4,
	 abs(Q1-Q6) =\=5,
	 abs(Q1-Q7) =\=6,
	 abs(Q1-Q8) =\=7,
	 abs(Q2-Q3) =\=1,
	 abs(Q2-Q4) =\=2,
	 abs(Q2-Q5) =\=3,
	 abs(Q2-Q6) =\=4,
	 abs(Q2-Q7) =\=5,
	 abs(Q2-Q8) =\=6,
	 abs(Q3-Q4) =\=1,
	 abs(Q3-Q5) =\=2,
	 abs(Q3-Q6) =\=3,
	 abs(Q3-Q7) =\=4,
	 abs(Q3-Q8) =\=5,
	 abs(Q4-Q5) =\=1,
	 abs(Q4-Q6) =\=2,
	 abs(Q4-Q7) =\=3,
	 abs(Q4-Q8) =\=4,
	 abs(Q5-Q6) =\=1,
	 abs(Q5-Q7) =\=2,
	 abs(Q5-Q8) =\=3,
	 abs(Q6-Q7) =\=1,
	 abs(Q6-Q8) =\=2,
	 abs(Q7-Q8) =\=1
.



