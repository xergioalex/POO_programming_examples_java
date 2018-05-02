/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package circuitos;

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
        //System.out.println("hola");
        Circuito a = new Resistencia(5,7);
        Circuito b = new Serie(new Resistencia(3,6),new Resistencia(2,6));
        Circuito c = new Serie(new Resistencia(3,6),new Resistencia(2,6));
        Circuito d = new Paralelo(b,c);

        Circuito e = new Paralelo(d,a);
        System.out.println(e.getResistencia());



    }

}
