
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] arg){
        /*SieveSouve s1 = new SieveSouve();
        Sieve2 s2 = new Sieve2(s1);
        Sieve3 s3 = new Sieve3(s2);
        Sieve4 s4 = new Sieve4(s3);*/
        Sieve src = new Sieve7(new Sieve4(new Sieve3(new Sieve2(new SieveSouve()))));
        int i;
        
        for(;;){
            i = src.nextNumber();
            
            
            if(i == -1) break;
            System.out.println(i + " " );
        }
    
    }
}
