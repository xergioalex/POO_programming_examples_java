/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;

/**
 *
 * @author XergioAleX
 */
public class Agenda {
     private LinkedList<Persona> list ;

     public Agenda() {
        this.list = new LinkedList<Persona>();
     }

     public Persona verPersona(int i){
         return list.get(i);
     }

     public void verPersonas(){
         for (Persona x: list) {
             System.out.println(x);
         }
     }

     public boolean adicionar(Persona persona){
         //validarPersona();

         list.add(persona);
         return true;
     }



     public void modificar(int i,Persona p){
         Persona persona = list.get(i);
         persona.setNombre(p.getNombre());
         persona.setTelefono(p.getTelefono());
         persona.setDireccion(p.getDireccion());
         persona.setEmail(p.getEmail());
     }

     public int verificarPersona(String nombre){
         int n = list.size();
         for (int i = 0; i < list.size(); i++) {
             Persona x = list.get(i);
             if(x.getNombre().equals(nombre)){
                 return i;
             }
         }
         return -1;

     }

     public void eliminarPersona(String nombre){
         int n = list.size();
         for (int i = 0; i < list.size(); i++) {
             Persona x = list.get(i);
             if(x.getNombre().equals(nombre)){
                 list.remove(i);
                 break;
             }
         }

     }



     public Persona getPersona(int i){
         return list.get(i);
     }

     public int size(){
         return list.size();
     }

     public boolean verificarRedundancia(String nombre,int i){
         for (int j = 0; j < list.size(); j++) {
             if(i!=j){
                Persona x = list.get(j);
                if(x.getNombre().equals(nombre)){
                    return true;
                }
             }
         }
         return false;
     }



}
