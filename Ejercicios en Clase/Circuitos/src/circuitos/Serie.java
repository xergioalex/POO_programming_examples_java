/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package circuitos;

/**
 *
 * @author Sergio
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
