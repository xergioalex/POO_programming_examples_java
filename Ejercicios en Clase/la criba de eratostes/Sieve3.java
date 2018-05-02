
/**
 * Write a description of class Sieve3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sieve3 implements Sieve
{
    private Sieve src;
    
    public Sieve3(Sieve src){
        this.src = src;
    
    }
    
    public int nextNumber(){
        int i;
        do{
            i = src.nextNumber();
        
        }
        while (i % 3 ==0 && i!= 3 && i!=0);
        return i;
    }
}
