alldiferents(A,B,C,D,E,F,G,H,I):-
       A\=B, A\=C, A\=D, A\=E, A\=F, A\=G, A\=H, A\=I,
       B\=C, B\=D, B\=E, B\=F, B\=G, B\=H, B\=I,
       C\=D, C\=E, C\=F, C\=G, C\=H, C\=I,
       D\=E, D\=F, D\=G, D\=H, D\=I,
       E\=F, E\=G, E\=H, E\=I,
       F\=G, F\=H, F\=I,
       G\=H, G\=I,
       H\=I
.



solve(Sol):-
     Sol= [S,E,N,D,M,O,R,N,Y],
     member(S,[1,2,3,4,5,6,7,8,9]),
     member(E,[0,1,2,3,4,5,6,7,8,9]),
     member(N,[0,1,2,3,4,5,6,7,8,9]),
     member(D,[0,1,2,3,4,5,6,7,8,9]),
     member(M,[1,2,3,4,5,6,7,8,9]),
     member(O,[0,1,2,3,4,5,6,7,8,9]),
     member(R,[0,1,2,3,4,5,6,7,8,9]),
     member(N,[0,1,2,3,4,5,6,7,8,9]),
     member(Y,[0,1,2,3,4,5,6,7,8,9]),

                1000*S + 100*E + 10*N + D
     +		1000*M + 100*O + 10*R + E
     = 10000*M + 1000*O + 100*N + 10*E + Y
.
