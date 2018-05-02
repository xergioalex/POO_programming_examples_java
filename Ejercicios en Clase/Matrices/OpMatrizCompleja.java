/*
 * Esta Clase Posee metodos para obtener informacion de una matriz Compleja.
 * 
 */

package matrices;

/**
 *
 * @author Sergio
 */
public class OpMatrizCompleja {
    public int filas(MatrizCompleja matriz){
        return matriz.getMreal().length;
    }

    public int columnas(MatrizCompleja matriz){
        return matriz.getMreal()[0].length;
    }

    public boolean esCuadrada(MatrizCompleja matriz){
        if(columnas(matriz)==filas(matriz))
            return true;
        return false;
    }


    public void mostrarMatriz(MatrizCompleja matriz){
        if(matriz== null) System.out.println("La matriz es nula");
        else
        for(int i=0;i<this.filas(matriz);i++ ){
              for(int j=0;j<this.columnas(matriz);j++ )
                System.out.print(matriz.getMreal()[i][j]+"+"+matriz.getMcompleja()[i][j]+"i"+"  ");
            System.out.println();
         }
    }

}
