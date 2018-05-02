/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arboldeexpresiones;

/**
 *
 * @author Sergio
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
