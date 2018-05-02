/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arboldeexpresiones;

/**
 *
 * @author Sergio
 */
public class Dibujar implements Visitor{
    
    

    public void visit(Number n) {
        System.out.println("|-"+n.getValue());
    }

    public void visit(AddNode n){
        System.out.println("+\n|");

        n.getLeft().accept(this);
        n.getRight().accept(this);
    }

    public void visit(SubNode n) {
        System.out.println("-\n|");

        n.getLeft().accept(this);
        n.getRight().accept(this);
    }

    public void visit(MultNode n) {
        System.out.println("*\n|");

        n.getLeft().accept(this);
        n.getRight().accept(this);
    }

    public void visit(DivNode n) {
        System.out.println("/\n|");

        n.getLeft().accept(this);
        n.getRight().accept(this);
    }
}
