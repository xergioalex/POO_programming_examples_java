declare
proc {MagicSquare Root }
   A B C D E F G H I
in
   Root = [A B C D E F G H I]
   %%
   %% Root = sol(a:A b:B c:C d:D e:E f:F g:G h:H i:I)
   %%
   %% Establecer el dominio
   Root ::: 1#9
   % Restriciones
   {FD.distinct Root}

   % Restricciones
   %..Sobre Filas
   A + B + C =: 15
   D + E + F =: 15
   G + H + I =: 15
   
   %..Sobre las Columnas
   A + D + G =: 15
   B + E + H =: 15
   C + F + I =: 15
   
   %..Sobre las Diagonales
   A + E + I =: 15
   G + E + C =: 15

   %Forma de Busqueda First Fail
   {FD.distribute ff Root}
end

{ExploreAll MagicSquare}