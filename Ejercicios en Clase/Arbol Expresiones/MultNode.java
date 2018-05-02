
/**
 * Write a description of class MultNode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MultNode extends BinNode{
    public MultNode(Node left,Node right){
        super(left,right);
    }

    @Override
    public void accept(Visitor v){
        v.visit(this);
    }
}
