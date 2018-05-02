
/**
 * Write a description of class Serie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Serie extends Circuito{
    private Circuito a;
    private Circuito b;

    public Serie(Circuito a,Circuito b){
        this.a=a;
        this.b=b;
    }

    @Override
    public double getResistencia() {
        return a.getResistencia()+b.getResistencia();
    }

    @Override
    public double getVoltaje() {
        return a.getVoltaje()+b.getVoltaje();
    }

    @Override
    public void setVoltaje(double v) {
        double i = v/getResistencia();
        a.setVoltaje(i*a.getResistencia());
        b.setVoltaje(i*b.getResistencia());
    }

}
