/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Gonzalo
 */
public class Persona {

    //ATRIBUTOS
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    //CONSTRUCTORES
    public Persona() {}

    public Persona(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    //METODOS ASESORES
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    //METODOS MODIFICADORES
    public void setNombre(String n) {
        nombre = n;
    }

    public void setDireccion(String d) {
        direccion = d;
    }

    public void setTelefono(String t) {
        telefono = t;
    }

    public void setEmail(String e) {
        email = e;
    }

    public String validarPersona(){
        String error="";
        if(!validarNombre())
            error += "Nombre Incorrecto\n";
        if(!validarTelefono())
            error += "Telefono Incorrecto\n";
        if(!validarCorreo())
            error += "Correo Incorrecto\n";
        return error;
    }


    public boolean validarCorreo(){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^([a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(email);
        if (mat.find()) {
            return true;
        }else{
            return false;
        }
    }

    public boolean validarNombre(){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^([A-Z]+[a-zA-Z ]*)$");
        mat = pat.matcher(nombre);
        if (mat.find()) {
            return true;
        }else{
            return false;
        }
    }

    public boolean validarTelefono(){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^([0-9]*)$");
        mat = pat.matcher(telefono);
        if (mat.find()) {
            //System.out.println("[" + mat.group() + "]");
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return nombre+" "+direccion+" "+telefono+" "+email;
    }
}
