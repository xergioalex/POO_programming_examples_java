
/**
 * Write a description of class AddNode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AddNode extends BinNode{
    
    public AddNode(Node left,Node right){
        super(left,right);
    }

    @Override
    public void accept(Visitor v){
        v.visit(this);
    }
}
