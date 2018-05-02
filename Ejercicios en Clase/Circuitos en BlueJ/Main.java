
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("hola");
        /*Circuito a = new Paralelo(new Resistencia(6),new Resistencia(3));
        Circuito b = new Serie(a,new Resistencia(2));
        Circuito c = new Serie(new Resistencia(3),new Resistencia(3));
        Circuito d = new Serie(b,c);
        d.setVoltaje(9);
        System.out.println(d.getCorriente());*/
        
        
        Circuito a = new Paralelo(new Resistencia(6),new Resistencia(3));
        Circuito b = new Serie(a,new Resistencia(2));
        Circuito c = new Serie(new Resistencia(3),new Resistencia(3));
        Circuito d = new Paralelo(b,c);
        d.setVoltaje(9);
        
        //Circuito e = new Resistencia(d.getResistencia()); 
        
        System.out.println("Resistencia: "+d.getResistencia());
        System.out.println("Corriente: "+d.getCorriente());



    }
    
}

