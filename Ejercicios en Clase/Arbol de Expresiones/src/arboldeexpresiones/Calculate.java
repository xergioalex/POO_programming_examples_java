/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arboldeexpresiones;

import java.util.Stack;

/**
 *
 * @author Sergio
 */
public class Calculate implements Visitor{
    private Stack<Double> st = new Stack<Double>();
    public void visit(Number n) {
         st.push(n.getValue());
    }

    public void visit(AddNode n){
        n.getLeft().accept(this);
        n.getRight().accept(this);
        st.push(st.pop()+st.pop());
    }

    public void visit(SubNode n) {
        n.getLeft().accept(this);
        n.getRight().accept(this);
        st.push(-st.pop()+st.pop());
    }

    public void visit(MultNode n) {
        n.getLeft().accept(this);
        n.getRight().accept(this);
        st.push(st.pop()*st.pop());
    }

    public void visit(DivNode n) {
        n.getLeft().accept(this);
        n.getRight().accept(this);
        st.push((1/st.pop())*st.pop());
    }

    public double getValue(){return st.pop();}









}
