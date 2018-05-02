%LatinSquare para una matriz 3x3
%ABC
%DEF
%GHI
declare
proc {LatinSquare Sol }
    sol(a:A b:B c:C d:D e:E f:F g:G h:H i:I)= Sol
in
 
   %Dominio
   Sol ::: 1#3
   % Restriciones
  

   % Restricciones
   %..Sobre Filas
   A \=: B   A \=: C   B \=: C
   D \=: E   D \=: F   E \=: F
   G \=: H   G \=: I   H \=: I

   %..Sobre las Columnas
   A \=: D   A \=: G   D \=: G
   B \=: E   B \=: H   E \=: H
   C \=: F   C \=: I   F \=: I
      
   %Distribucion
   {FD.distribute ff Sol}
end

{ExploreAll LatinSquare}