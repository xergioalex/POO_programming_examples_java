
/**
 * Write a description of class Sieve2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sieve2 implements Sieve
{
    private Sieve src;
    
    public Sieve2(Sieve src){
        this.src = src;
    
    }
    
    public int nextNumber(){
        int i;
        do{
            i = src.nextNumber();
        
        }
        while (i % 2 ==0 && i!= 2 && i!=0);
        return i;
    }
    
}
