/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
        /*final int pi;
        pi =5;

        int x=5;
        String y;

        y= Integer.toString(x);
        System.out.println(y);*/


        /* HILOS EN JAVA
        Ping p= new Ping();
        Pong po= new Pong();
        po.start();
        p.start();
         *
         */

         /* Listas
        Ping p= new Ping();
        Ping q= new Ping();
        Ping r= new Ping();
        Ping s= new Ping();

        ArrayList<Ping> lista = new ArrayList<Ping>();

        lista.add(p);
        lista.add(q);
        lista.add(r);
        lista.add(s);

        System.out.println(lista.get(1));
          *
          */

        /*Cell celda= new Cell();

        for(int x:celda){
            System.out.println(x);

        }

        int x = 1;
        String y= Integer.toString(x);
        System.out.println(y);*/




    }



    for (a=1;a<=filas;a++)
	{
  	    for (b=1;b<=columnas;b++)
        {
		    contador=-1;                                          // Contador esta en -1 pensando en que se contara a si mismo una ves si esta viva
			for (c=a-1;c<=a+1;c++)
			{
			    for (d=b-1;d<=b+1;d++)
				{
                    if (vida[c][d]==0)                                  // Reviso si hay celulas vivas alrededor
					    contador++;
                }
            }

}
