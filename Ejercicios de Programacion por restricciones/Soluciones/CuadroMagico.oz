%% 
%% MagicSquare
%% 
declare
proc {MagicSquare Root}
	A B C D E F G H I
in
	Root = [A B C D E F G]
	%% 
	%% Root = sol(a:A b:B c:C d:D e:E f:F g:G h:H i:I)
	%% Establecer el dominio
	%% 
	Root ::: 1#9

	%% Restricciones
	%% .... Sobre filas
	{FD.distinct Root}
	A + B + C =: 15
	D + E + F =: 15
	G + H + I =: 15
	
	%% .... Sobre columnas
	A + D + G =: 15
	B + E + H =: 15
	C + F + I =: 15

	%% ... sobre diagonales
	A + E + I =: 15
	C + E + G =: 15

	{FD.distribute ff Root}
	


end
	{exploreAll MagicSquare}
	
