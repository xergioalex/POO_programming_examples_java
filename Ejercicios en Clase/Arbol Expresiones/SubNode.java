
/**
 * Write a description of class SubNode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SubNode extends BinNode{
    public SubNode(Node left,Node right){
        super(left,right);
    }

    @Override
    public void accept(Visitor v){
        v.visit(this);
    }

}
