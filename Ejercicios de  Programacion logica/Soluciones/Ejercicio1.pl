diferents(P,H):-
	P\=H.

solve(Sol):-

	Sol=[[Smith,H1],[Baker,H2],[Carpenter,H3],[Tailor,H4]],

	%Restriccion: Los padres no tienen la misma profesion de su apellido
	member(Smith,    [panadero,carpintero,sastre]),
	member(Baker,    [herrero,carpintero,sastre]),
	member(Carpenter,[herrero,panadero,sastre]),
	member(Tailor,   [herrero,panadero,carpintero]),

	%Restriccion: Los hijos tampoco tienne la misma profesion de su apellido
        H1= panadero,
	member(H2,[herrero,carpintero,sastre]),
	member(H3,[herrero,panadero,sastre]),
	member(H4,[herrero,panadero,carpintero]),

	%Los hijos tienen una profesion distinta a la de sus padres
	diferents(Smith,H1),
	diferents(Baker,H2),
	diferents(Carpenter,H3),
	diferents(Tailor,H4),


	%Baker tiene la misma profesion del hijo de Carpenter
	Baker=H3.






