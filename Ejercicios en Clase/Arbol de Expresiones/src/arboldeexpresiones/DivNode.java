/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arboldeexpresiones;

/**
 *
 * @author Sergio
 */
class DivNode extends BinNode{
    public DivNode(Node left,Node right){
        super(left,right);
    }

    @Override
    public void accept(Visitor v){
        v.visit(this);
    }
}
