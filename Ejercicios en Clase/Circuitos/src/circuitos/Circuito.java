/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package circuitos;

/**
 *
 * @author Sergio
 */
public abstract class Circuito {
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
