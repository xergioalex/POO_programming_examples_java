solve(Sol):-
	%Sol= [Pareja1,Pareja2,Pareja3,Pareja4],
	Sol= [[1,_,_,_,_],[2,_,_,_,_],[3,_,_,_,_],[4,_,_,_,_]],
	%Pareja= [Posicion,Caballero,Dama,DisfrazDama,DisfrazHombre],

	%RESTRICCIONES

	%La gata llego con su marido Matt, Dos parejas ya estaban alli
	member([A,matt,_,_,gata],Sol),  A>2,

	%Un hombre Vestido de Oso
	member([B,_,_,oso,_],Sol),  B<4,

	%El primero no era vicent, pero llego antes del principe
	member([C,D,_,_,_],Sol),  (C=2;C=3), %D\=vicent,
	member([E,_,_,principe,_],Sol),  E>2,
	member([O,vicent,_,_,_],Sol), (O=2;O=3),

	%La bruja no era Sue, casada con Chuck, disfrazado de pato donald
	member([_,chuck,F,patodonald,bruja],Sol),  %F\=sue,

	%Mary llego despues de Lou, both estaban antes de Sue
	member([G,_,mary,_,_],Sol), (G=2;G=3),
	member([H,lou,_,_,_],Sol),  H<3,
	member([I,_,sue,_,_],Sol),  I>2,

	%La gitana llego antes que Ann, que no esta casada con Batman
	member([J,_,_,_,gitana],Sol),  J<4,
	member([K,_,ann,L,_],Sol),  K>1,
	member([_,_,_,batman,_],Sol),

	%blanca nieves llego despues de Test
	member([M,_,_,_,blancanieves],Sol),  M>1,
	member([N,_,tess,_,_],Sol),  N<4,

	D\=vicent,
	F\=sue,
	L\=batman.
