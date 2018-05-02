/*
 * Esta Clase Posee metodos para hacer operaciones con 2 matrices.
 * 
 */

package matrices;

/**
 *
 * @author Sergio
 */
public class OpMatrices {
    private OpMatriz m = new OpMatriz();

    public boolean sonIgualTam(float[][] m1,float[][] m2){
        if(this.m.columnas(m1) == this.m.columnas(m2) && this.m.filas(m1) == this.m.filas(m2))
            return true;
        return false;
    }
    
    public boolean sonIguales(float[][] m1,float[][] m2){
        if(this.sonIgualTam(m1, m2)){
           for(int i=0;i<this.m.filas(m1);i++ ){
              for(int j=0;j<this.m.columnas(m1);j++ ){
                  if(m1[i][j] != m2[i][j]) return false;
              }
           }return true;
        }else return false;

    }
    

    //  Suma dos Matrices: Las matrices deben poseer el mismo numero de filas y columnas
    public float[][] sumarM(float[][] m1,float[][] m2){
        float[][] m3 = null;
        if(this.sonIgualTam(m1, m2)){
           m3 = new float[this.m.filas(m1)][this.m.columnas(m1)];
           for(int i=0;i<this.m.filas(m1);i++ ){
              for(int j=0;j<this.m.columnas(m2);j++ ){
                  m3[i][j] = m1[i][j] + m2[i][j];
              }
           }
        }
        return m3;
    }

    public float[][] restarM(float[][] m1,float[][] m2){
        float[][] m3 = null;
        if(this.sonIgualTam(m1, m2)){
           m3 = new float[this.m.filas(m1)][this.m.columnas(m1)];
           for(int i=0;i<this.m.filas(m1);i++ ){
              for(int j=0;j<this.m.columnas(m2);j++ ){
                  m3[i][j] = m1[i][j] - m2[i][j];
              }
           }
        }
        return m3;
    }
    

    public float[][] multipM(float[][] m1,float[][] m2){
        float[][] m3 = null;
        if(this.m.columnas(m1)==this.m.filas(m2)){
           m3 = new float[this.m.filas(m1)][this.m.columnas(m2)];
           for(int i=0;i<this.m.filas(m1);i++ ){
              for(int j=0;j<this.m.columnas(m2);j++ ){
                  for(int z=0;z<this.m.columnas(m1);z++ )
                      m3[i][j] += m1[i][z] * m2[z][j];
              }
           }
        }
        return m3;
    }

}
