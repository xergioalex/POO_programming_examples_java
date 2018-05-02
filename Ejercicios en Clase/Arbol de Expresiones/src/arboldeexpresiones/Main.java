/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arboldeexpresiones;

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
        Calculate calcular = new Calculate();
        Dibujar paint =new Dibujar();
        Node suma= new AddNode(new Number(1),new Number(3));
        Node arbol= new AddNode(new Number(1),new MultNode(new Number(2),new DivNode(new Number(3),new Number(4))));
        arbol.accept(calcular);

        arbol.accept(paint);

        //System.out.println(calcular.getValue());

    }

}
