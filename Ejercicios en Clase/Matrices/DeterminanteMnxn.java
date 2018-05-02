/*
 * Esta Clase se encarga de hallar Determinantes de matrices nxn
 *
 *
 */

package matrices;

/**
 *
 * @author Sergio
 */
public class DeterminanteMnxn {
     OpMatriz opm = new OpMatriz();

     public float detM2x2(float[][] m){
         float det = 0;
         det=m[0][0]*m[1][1] - m[0][1]*m[1][0];
         return det;
     }

     //Recibe una matriz nxn y una posocion, y retorna una matriz n-1xn-1
     //Que no esta relacionada con la fila y la columna de dicha posicion.
     public float[][] llenarMatriz(float[][] m,int x,int y){
         int cont=0;
         int contpos=0;
         int bandera=0;
         float[][] mint=new float[this.opm.filas(m)-1][this.opm.columnas(m)-1];
         for(int i=0;i<opm.filas(m)-1;i++){
             for(int j=0;j<opm.columnas(m)-1;j++){
                 for(int k=0;k<opm.filas(m);k++){
                     for(int l=0;l<opm.columnas(m);l++){
                         if(k!=x && l!=y) cont++;
                         if (cont>contpos){
                            if(k!=x && l!=y){
                               mint[i][j]=m[k][l];
                               //System.out.println(mint[i][j]+"    "+contpos+"    "+k+" "+" "+l);
                               bandera=1;
                               break;
                            }else cont--;
                         }
                     }
                     if (bandera==1){
                         cont=0;
                         contpos++;
                         bandera=0;
                         break;
                     }
                 }
             }

         }
         return mint;

     }

     public float detMnxn(float[][] m){
         if(this.opm.filas(m)==2){
            return this.detM2x2(m);
         }
         else if(this.opm.filas(m) == 3){
            return m[0][0]*this.detM2x2(this.llenarMatriz(m, 0, 0))-m[0][1]*this.detM2x2(this.llenarMatriz(m, 0, 1))+m[0][2]*this.detM2x2(this.llenarMatriz(m, 0, 2));
         }
         else return this.sumaDetMnxn(m,0);

     }

     public float sumaDetMnxn(float[][] m,int contpos){
         float det=0;
         for(int i=0;i<opm.filas(m);i++){
             det+= Math.pow(-1,i)*m[0][i]*this.detMnxn(this.llenarMatriz(m, 0, i));
         }
         return det;
     }




}
