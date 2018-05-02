/*
 * Esta Clase Posee metodos para hacer operaciones con 2 matrices complejas.
 * 
 */

package matrices;

/**
 *
 * @author Sergio
 */
public class OpMatricesComplejas {
    private OpMatrizCompleja m = new OpMatrizCompleja();

    public boolean sonIgualTam(MatrizCompleja m1,MatrizCompleja m2){
        if(this.m.columnas(m1) == this.m.columnas(m2) && this.m.filas(m1) == this.m.filas(m2))
            return true;
        return false;
    }

    public boolean sonIguales(MatrizCompleja m1,MatrizCompleja m2){
        if(this.sonIgualTam(m1, m2)){
           for(int i=0;i<this.m.filas(m1);i++ ){
              for(int j=0;j<this.m.columnas(m1);j++ ){
                  if(m1.getMreal()[i][j] != m2.getMreal()[i][j]) return false;
                  if(m1.getMcompleja()[i][j] != m2.getMcompleja()[i][j]) return false;
              }
           }return true;
        }else return false;

    }


    //  Suma dos Matrices: Las matrices deben poseer el mismo numero de filas y columnas
    public MatrizCompleja sumarM(MatrizCompleja m1,MatrizCompleja m2){
        MatrizCompleja m3 = null;
        if(this.sonIgualTam(m1, m2)){
           m3 = new MatrizCompleja(new float[this.m.filas(m1)][this.m.columnas(m1)],new float[this.m.filas(m1)][this.m.columnas(m1)]);
           for(int i=0;i<this.m.filas(m1);i++ ){
              for(int j=0;j<this.m.columnas(m2);j++ ){
                  m3.getMreal()[i][j] = m1.getMreal()[i][j] + m2.getMreal()[i][j];
                  m3.getMcompleja()[i][j] = m1.getMcompleja()[i][j] + m2.getMcompleja()[i][j];
              }
           }
        }
        return m3;
    }

    public MatrizCompleja restarM(MatrizCompleja m1,MatrizCompleja m2){
        MatrizCompleja m3 = null;
        if(this.sonIgualTam(m1, m2)){
           m3 = new MatrizCompleja(new float[this.m.filas(m1)][this.m.columnas(m1)],new float[this.m.filas(m1)][this.m.columnas(m1)]);
           for(int i=0;i<this.m.filas(m1);i++ ){
              for(int j=0;j<this.m.columnas(m2);j++ ){
                  m3.getMreal()[i][j] = m1.getMreal()[i][j] - m2.getMreal()[i][j];
                  m3.getMcompleja()[i][j] = m1.getMcompleja()[i][j] - m2.getMcompleja()[i][j];
              }
           }
        }
        return m3;
    }


    public MatrizCompleja multipM(MatrizCompleja m1,MatrizCompleja m2){
        MatrizCompleja m3 = null;
        if(this.m.columnas(m1)==this.m.filas(m2)){
           m3 = new MatrizCompleja(new float[this.m.filas(m1)][this.m.columnas(m2)],new float[this.m.filas(m1)][this.m.columnas(m2)]);
           for(int i=0;i<this.m.filas(m1);i++ ){
              for(int j=0;j<this.m.columnas(m2);j++ ){
                  for(int z=0;z<this.m.columnas(m1);z++ ){
                      m3.getMreal()[i][j] += m1.getMreal()[i][z] * m2.getMreal()[z][j] - m1.getMcompleja()[i][z] * m2.getMcompleja()[z][j];
                      m3.getMcompleja()[i][j] += m1.getMreal()[i][z] * m2.getMcompleja()[z][j]+ m2.getMreal()[z][j] * m1.getMcompleja()[i][z] ;
                  }
              }
           }
        }
        return m3;
    }
}
