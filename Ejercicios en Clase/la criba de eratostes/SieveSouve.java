
/**
 * Write a description of class SieveSouve here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SieveSouve implements Sieve
{
    private int i = 1;
    
    public int nextNumber()
    {
        if(i>100) return -1;
        return i++;
    }
}
