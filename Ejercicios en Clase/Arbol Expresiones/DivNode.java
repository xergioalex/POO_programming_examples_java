
/**
 * Write a description of class DivNode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DivNode extends BinNode{
    public DivNode(Node left,Node right){
        super(left,right);
    }

    @Override
    public void accept(Visitor v){
        v.visit(this);
    }
}
