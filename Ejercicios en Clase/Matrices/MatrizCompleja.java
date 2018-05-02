/*
 * Esta Clase es la fabrica de construccion de matrices complejas.
 * 
 */

package matrices;

/**
 *
 * @author Sergio
 */
public class MatrizCompleja {
    private float[][] mreal;
    private float[][] mcompleja;

    public MatrizCompleja(float[][] mreal,float[][] mcompleja){
        this.mreal = mreal;
        this.mcompleja = mcompleja;
    }

    public void setMreal(float[][] mreal){
         this.mreal = mreal;
    }

    public void setMcompleja(float[][] mcompleja){
         this.mcompleja=mcompleja;
    }

    public float[][] getMreal(){
         return this.mreal;
    }

    public float[][] getMcompleja(){
        return this.mcompleja;
    }
}
