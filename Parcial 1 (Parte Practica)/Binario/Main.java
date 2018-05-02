
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Binary a= new Binary("00011110");
        Binary b= new Binary("01010000");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a.length() = " + a.length());
        System.out.println("a.not() = "+ a.not());
        System.out.println("a.xor(b) = " + a.xor(b));
        System.out.println("a.leadingZeros() = " + a.leadingZeros());
        System.out.println("a.isGreatherThan(b) = "+a.isGreaterThan(b));
            
    }

}
