/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package circuitos;

/**
 *
 * @author Sergio
 */
public class Resistencia extends Circuito{
    private double resistencia;
    private double voltaje;

    public Resistencia(double r){
         this.resistencia=r;
    }

    public Resistencia(double r,double v){
         this.resistencia=r;
         this.voltaje=v;
    }

    @Override
    public double getResistencia() {
        return this.resistencia;
    }

    @Override
    public double getVoltaje() {
        return this.voltaje;
    }

    
    public void setResistencia(double r) {
        this.resistencia=r;
    }

    @Override
    public void setVoltaje(double v) {
        this.voltaje=v;
    }



}
