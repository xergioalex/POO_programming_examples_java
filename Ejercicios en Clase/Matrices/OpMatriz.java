/*
 * Esta Clase Posee metodos para obtener informacion de una matriz.
 * 
 */

package matrices;

/**

 * @author Sergio
 */
public class OpMatriz {
    public int filas(float[][] matriz){
        return matriz.length;
    }

    public int columnas(float[][] matriz){
        return matriz[0].length;
    }

    public boolean esCuadrada(float[][] matriz){
        if(columnas(matriz)==filas(matriz))
            return true;
        return false;
    }


    public void mostrarMatriz(float[][] matriz){
        if(matriz== null) System.out.println("La matriz es nula");
        else
        for(int i=0;i<this.filas(matriz);i++ ){
              for(int j=0;j<this.columnas(matriz);j++ )
                System.out.print(matriz[i][j]+"   ");
            System.out.println();
         }
    }
}
