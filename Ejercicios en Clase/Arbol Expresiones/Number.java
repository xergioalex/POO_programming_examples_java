
/**
 * Write a description of class Number here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Number implements Node {
    private double value;

    public Number(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
