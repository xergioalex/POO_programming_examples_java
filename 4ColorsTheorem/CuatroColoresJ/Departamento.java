 

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven Pineda
 */
import java.util.List;

public class Departamento
{
    private String nombre;
    private List<Departamento> vecinos;
    private int color=0;

    public Departamento(String nombre)
    {
        this.nombre=nombre;      
    }

    public void setVecinos(List<Departamento> vecinos) {
        this.vecinos = vecinos;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
    public int getColor(){
        return color;    
    }


    public boolean compararVecinos(int color)
    {
        for(int i=0;i<this.vecinos.size();i++)
        {
            if(this.vecinos.get(i).getColor()==color)
                return true;
        }
        return false;
    }

    public boolean estaPintado(){
        return !(color==0);
    }
    
    public void deshacerColor(){
        this.color=0;
    }

    public void imprimirDpto()
    {
        System.out.print(this.nombre + ".  Color: "+color+".  Vecinos: ");
        for(int i=0;i<this.vecinos.size();i++)
            System.out.print(this.vecinos.get(i).nombre+" ");
        System.out.println();
    }

}