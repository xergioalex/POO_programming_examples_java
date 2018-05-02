/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

/**
 *
 * @author Sergio
 */


public class Ping extends Thread {
   @Override
   public void run() {
       while(true) {
          System.out.print("Ping ");
          yield();
       }
   }
    @Override
   public String toString(){
        return "TIC TOC";

   }


}


