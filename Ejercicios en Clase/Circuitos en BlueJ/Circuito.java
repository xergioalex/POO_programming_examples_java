
/**
 * Abstract class Circuito - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Circuito
{
    public abstract double getResistencia();
    public abstract double getVoltaje();
    public abstract void setVoltaje(double v);

    public double getCorriente(){
        return getVoltaje()/getResistencia();
    }

    public double getPotencia(){
        return getVoltaje()*getCorriente();
    }
}
