
/**
 * Write a description of class Dibujar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dibujar implements Visitor
{
    private int contador=0;    
    
    public void visit(Number n) {
        for(int i=0;i<contador;i++)
             System.out.print("  ");
        System.out.println("|-"+n.getValue());
    }

    public void visit(AddNode n){
        for(int i=0;i<contador;i++)
             System.out.print("  ");
        System.out.println("|- +");
        contador++;
        n.getLeft().accept(this);
        n.getRight().accept(this);
    }

    public void visit(SubNode n) {
        for(int i=0;i<contador;i++)
             System.out.print("  ");
        System.out.println("|- -");
        contador++;
        n.getLeft().accept(this);
        n.getRight().accept(this);
    }

    public void visit(MultNode n) {
        for(int i=0;i<contador;i++)
             System.out.print("  ");
        System.out.println("|- *");
        contador++;
        n.getLeft().accept(this);
        n.getRight().accept(this);
    }

    public void visit(DivNode n) {
        for(int i=0;i<contador;i++)
             System.out.print("  ");
        System.out.println("|- /");
        contador++;
        n.getLeft().accept(this);
        n.getRight().accept(this);
    }
}
