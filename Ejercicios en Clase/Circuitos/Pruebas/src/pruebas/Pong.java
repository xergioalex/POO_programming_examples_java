/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

/**
 *
 * @author Sergio
 */
public class Pong extends Thread {
    @Override
  public void run() {
    while(true) {
      System.out.print("PONG ");
      yield();
    }
    }
}
