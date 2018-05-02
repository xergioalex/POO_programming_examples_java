

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven Pineda
 */
import java.util.List;

public class Pais {
    private String nombre;
    private List<Departamento> dptos;

    public Pais(String nombre)
    {
        this.nombre=nombre;
    }

    public void addDptos(Departamento dpto)
    {
        dptos.add(dpto);
    }

    public List<Departamento> getDptos() {
        return dptos;
    }

    public void setDptos(List<Departamento> dptos)
    {
        this.dptos=dptos;
    }

    public void imprimirDptos()
    {
        for(int i=0;i<this.dptos.size();i++)
            dptos.get(i).imprimirDpto();
    }

    public boolean todosPintados()
    {
        for(int i=0;i<dptos.size();i++)
        {
            if(!dptos.get(i).estaPintado())
                return false;
        }
        return true;
    }

    
    
    public void asignarColores(){
          asignarColores(dptos.get(0),0);
    }

    //Funcion Recursiva
    public void asignarColores(Departamento dpto,int n){
         for(int color=1;color<5;color++){
            dpto.setColor(color);
            if(!dpto.compararVecinos(color)){
                if(n==(dptos.size()-1))
                    break;
                asignarColores(dptos.get(n+1),n+1);
            }
            else
                dpto.deshacerColor();
         }

    }
    /*
    public int asignarColores(){
          return asignarColores(dptos.get(0),0,0);
    }
    
    //Funcion Recursiva
    public int asignarColores(Departamento dpto,int n,int col){
         int color=0;
         for(int i=1;i<10;i++){
            color=i;
            dpto.setColor(color);
            if(!dpto.compararVecinos(color)){
                if(n==(dptos.size()-1))
                    break;
                return asignarColores(dptos.get(n+1),n+1,(color>col)? color:col);  
            }
            else
                dpto.deshacerColor();                                                                                
         }         
         return col;
    
    }*/



}


//Funcion Iterativa
    /*
    public int asignarColores()
    {
        int color = 0;
        while(!todosPintados())
        {
            color++;
            for(int i=0;i<dptos.size();i++)
            {
                if(!dptos.get(i).estaPintado()&&!dptos.get(i).compararVecinos(color))
                    dptos.get(i).setColor(color);
            }
        }
        return color;
    }*/
