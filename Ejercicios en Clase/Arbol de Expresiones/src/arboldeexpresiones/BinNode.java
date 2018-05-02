/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arboldeexpresiones;

/**
 *
 * @author Sergio
 */
public abstract class BinNode implements Node{
    private Node left,right;

    public BinNode(Node left,Node right){
        this.left = left;
        this.right = right;
    }

    public Node getLeft(){ return left; }
    public Node getRight(){ return right; }

    public void accept(Visitor v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

}
