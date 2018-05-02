/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arboldeexpresiones;

/**
 *
 * @author Sergio
 */
public interface Visitor {

    public void visit(Number n);
    public void visit(AddNode n);
    public void visit(SubNode n);
    public void visit(DivNode n);
    public void visit(MultNode n);

    
}
