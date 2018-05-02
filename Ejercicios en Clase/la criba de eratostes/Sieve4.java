
/**
 * Write a description of class Sieve4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sieve4 implements Sieve
{
    private Sieve src;
    
    public Sieve4(Sieve src){
        this.src = src;
    
    }
    
    public int nextNumber(){
        int i;
        do{
            i = src.nextNumber();
        
        }
        while (i % 5 ==0 && i!= 5 && i!=0);
        return i;
    }
        
}
