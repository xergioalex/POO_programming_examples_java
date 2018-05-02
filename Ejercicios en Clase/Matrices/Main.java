/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package matrices;

/**
 *
 * @author Sergio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OpMatrices operar = new OpMatrices();
        OpMatriz m = new OpMatriz();
        DeterminanteMnxn det = new DeterminanteMnxn();
        float[][] x={{1,5,7,4,2,7,1,2,3},
                      {20,-5,2,1,6,9,8,2,5},
                      {6,1,2,3,4,5,4,2,4},
                      {11,10,9,8,7,6,2,4,1},
                      {1,0,1,-1,-2,-3,2,6,8},
                      {-3,3,6,7,0,1,6,6,8},
                      {1,2,3,4,2,4,1,6,4},
                      {5,6,7,8,2,5,8,4,3},
                      {9,10,11,12,5,4,8,8,9},
                      
                     };
        //float[][] x={{1,3,2,2},{1,2,1,2},{3,2,1,2},{6,7,4,2}};
        System.out.println(det.detMnxn(x));;
        //m.mostrarMatriz(y);
        //System.out.println(det.detM2x2(x));




        /*Matrices Complejas
        float[][] r={{5,6,7},{2,4,1},{8,3,4}};
        float[][] c={{1,2,3},{1,2,3},{1,2,3}};

        MatrizCompleja mc1 = new MatrizCompleja(r,c);
        MatrizCompleja mc2 = new MatrizCompleja(r,c);
        MatrizCompleja mc3 = new MatrizCompleja(null,null);
        OpMatrizCompleja opmc = new OpMatrizCompleja();
        OpMatricesComplejas opmces = new OpMatricesComplejas();

        mc3=opmces.multipM(mc1, mc2);
        opmc.mostrarMatriz(mc3);*/

        /*
        OpMatrices operar = new OpMatrices();
        OpMatriz m = new OpMatriz();
        float[][] x={{1,2,3},{1,2,3},{1,2,3}};
        float[][] y={{1,2,3},{1,4,3},{1,2,3}};
        float[][] z = operar.restarM(x, y);
        m.mostrarMatriz(z);
        System.out.println(operar.sonIgualTam(x, y));
        m.mostrarMatriz(y);
        int nfil = x.length;
        int ncol = x[0].length;
        System.out.println(nfil+"   "+ncol);
        */
        

    }



}
