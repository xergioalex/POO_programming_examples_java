/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package circuitos;

/**
 *
 * @author Sergio
 */
public class Paralelo extends Circuito{
    private Circuito a;
    private Circuito b;

    public Paralelo(Circuito a,Circuito b){
        this.a=a;
        this.b=b;
    }

    @Override
    public double getResistencia() {
        return 1.0/(1.0/a.getResistencia()+1.0/a.getResistencia());
    }

    @Override
    public double getVoltaje() {
        if(a.getVoltaje() != b.getVoltaje())
            throw new RuntimeException("Voltajes diferentes en el Circuito Serie, Fatal Error");
        return a.getVoltaje();
    }

    @Override
    public void setVoltaje(double v) {
        a.setVoltaje(v);
        b.setVoltaje(v);
    }



}
