%LatinSquare para una matriz nxn
%Se le hicieron unas pequeñas variaciones a la solucion del MagicSquare que se
%encontraba en la pagina del tuturial de Mozart.
declare
fun {MagicSquare N}
   NN  = N*N
   L1N = {List.number 1 N 1}  % [1 2 3 ... N]
in 
   proc {$ Square}
      fun {Field I J}
         Square.((I-1)*N + J)
      end 
      proc {Assert F}
         % {F 1} + {F 2} + ... + {F N} =: Sum
         {FD.distinct {Map L1N F} }
      end 
   in 
      {FD.tuple square NN 1#N Square}
      %%Restricciones
      %% Columns
      {For 1 N 1
       proc {$ I} {Assert fun {$ J} {Field I J} end} end}
      %% Rows
      {For 1 N 1
       proc {$ J} {Assert fun {$ I} {Field I J} end} end}
       
      {FD.distribute ff Square}
   end 
end

{ExploreAll {MagicSquare 3}}