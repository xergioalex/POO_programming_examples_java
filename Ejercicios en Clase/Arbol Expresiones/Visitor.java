
/**
 * Write a description of interface Visitor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Visitor
{
    public void visit(Number n);
    public void visit(AddNode n);
    public void visit(SubNode n);
    public void visit(MultNode n);
    public void visit(DivNode n);
    
}
