
/**
 * Write a description of class ArbolBin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArbolBin
{
    public static void main(String[] args){
         
            Calculate calcular = new Calculate();
            Dibujar paint = new Dibujar();
            Node arbol= new AddNode(new Number(1),new MultNode(new Number(2),new DivNode(new Number(3),new Number(4))));
            arbol.accept(calcular);
            arbol.accept(paint);
            
            System.out.println("\nLa suma del arbol es: "+calcular.getValue());
            
            
    }
}
