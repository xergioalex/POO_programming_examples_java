
/**
 * Write a description of class Sieve7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sieve7 implements Sieve
{
    private Sieve src;
    
    public Sieve7(Sieve src){
        this.src = src;
    
    }
    
    public int nextNumber(){
        int i;
        do{
            i = src.nextNumber();
        
        }
        while (i % 7 ==0 && i!= 7 && i!=0);
        return i;
    }
}
