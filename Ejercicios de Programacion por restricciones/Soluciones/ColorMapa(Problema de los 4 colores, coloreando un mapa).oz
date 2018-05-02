%%
%% Coloreando el mapa de Colombia (1=amarillo 2=azul 3=rojo 4=rosado)
%%

declare
fun {ColorMapa Dato}
    Deptos = {Map Dato fun {$ D#_} D end} 
in
    proc {$ Color}
       NroColores = {FD.decl}
    in
       {FD.distribute naive [NroColores]}
       %% Color: Deptos --> 1#NroColores
       {FD.record color Deptos 1#NroColores Color}
       {ForAll Dato
	proc {$ A#Ds}
	   {ForAll Ds proc {$ D} Color.A \=: Color.D end}
	end
	}
       {FD.distribute ff Color}
    end
end

Colombia = [ amazonas     # [caqueta putumayo vaupes]
             antioquia    # [bolivar boyaca caldas cordoba choco risaralda santander]
             arauca       # [boyaca casanare vichada]
             atlantico    # [bolivar magdalena]
             bolivar      # [cesar cordoba magdalena santander sucre]
             boyaca       # [casanare cundinamarca nsantander santander]
             caldas       # [cundinamarca risaralda tolima]
             caqueta      # [cauca guaviare huila meta putumayo vaupes]
             casanare     # [meta vichada]
             cauca        # [huila nariño putumayo tolima valle]
             cesar        # [guajira magdalena nsantander santander]
             cordoba      # [sucre]
             cundinamarca # [huila meta tolima]
             choco        # [risaralda valle]
             guainia      # [guaviare vaupes vichada]
             guajira      # [magdalena]
             guaviare     # [meta vaupes vichada]
             huila        # [meta tolima]
             magdalena    # nil
             meta         # [vichada]
             nariño       # [putumayo]
             nsantander   # [santander]
             putumayo     # nil
             quindio      # [risaralda tolima valle]
             risaralda    # [tolima valle]
             sanandres    # nil
             santander    # nil
             sucre        # nil
             tolima       # [valle]
             valle        # nil
             vaupes       # nil
             vichada      # nil ]

{ExploreAll {ColorMapa Colombia}}
