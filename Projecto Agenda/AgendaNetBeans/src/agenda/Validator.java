/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hgiacoman
 */
public class Validator {

    public Validator() {
        String correo = "helmy23.gb@gmail.com";
        if(isEmail(correo)){
            System.out.println("Mail correcto");
        }else{
            System.out.println("Mail incorrecto");
        }
        
        String nombre= "GonzAlo Dadads sadfas";
        if(isNombre(nombre)){
            System.out.println("Nombre correcto");
        }else{
            System.out.println("Nombre incorrecto");
        }
        
        String numero= "33y4543";
        if(isNumero(numero)){
            System.out.println("Numero correcto");
        }else{
            System.out.println("Numero incorrecto");
        }
    }
    
    public boolean isNombre(String nombre){
        Pattern pat = null;
        Matcher mat = null;        
        pat = Pattern.compile("^([A-Z]+[a-zA-Z ]*)$");
        mat = pat.matcher(nombre);
        if (mat.find()) {
            System.out.println("[" + mat.group() + "]");
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isNumero(String numero){
        Pattern pat = null;
        Matcher mat = null;        
        pat = Pattern.compile("^([0-9]*)$");
        mat = pat.matcher(numero);
        if (mat.find()) {
            System.out.println("[" + mat.group() + "]");
            return true;
        }else{
            return false;
        }
    }

    //metodo para validar correo electronio
    public boolean isEmail(String correo) {
        Pattern pat = null;
        Matcher mat = null;        
        pat = Pattern.compile("^([a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            System.out.println("[" + mat.group() + "]");
            return true;
        }else{
            return false;
        }        
    }

    public static void main(String args[]) {
        new Validator();
    }
}
