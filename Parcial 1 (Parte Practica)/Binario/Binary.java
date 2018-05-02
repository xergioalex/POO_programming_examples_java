
import java.util.ArrayList;
import java.util.List;


public class Binary
{
    private List<Integer> num=new ArrayList();

    public Binary(String s)
    {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '1')
                throw new RuntimeException("Error: La cadena contiene un caracter invalido diferente de 0 0 1");
            else
                this.num.add(s.charAt(i)- 48);

        }
    }

    public Binary(List<Integer> list){
        this.num=list;
    }

    public List<Integer> getNum(){
         return this.num;
    }

    @Override
    public String toString(){
        String str="";
        for(int i=0;i<num.size();i++){
            str+=Integer.toString(num.get(i));
        }
        return str;
    }

    public int length(){
        return num.size();

    }

    public Binary not(){

        List<Integer> bin=new ArrayList();
        for(int i=0; i<num.size();i++){
            if(num.get(i) == 1)
                bin.add(0);
            else
                bin.add(1);
        }

        return new Binary(bin);

    }

    public Binary xor(Binary b){

        List copia= new ArrayList();

        for(int i=0; i<num.size();i++){
            if(num.get(i) == 1 && b.getNum().get(i)==1)
                copia.add(0);
            else if(num.get(i) == 0 && b.getNum().get(i)==1)
                copia.add(1);
            else if(num.get(i) == 1 && b.getNum().get(i)==0)
                copia.add(1);
            else if(num.get(i) == 0 && b.getNum().get(i)==0)
                copia.add(0);

        }

        return new Binary(copia);

    }

    public int leadingZeros(){
        int cont=0;
        for(int i=0; i<num.size();i++){
            if(num.get(i)==0){
                cont++;
            }
            else break;
        }

        return cont;
    }





    

    public boolean isGreaterThan(Binary b){
       int x=0;
       int y=0;
       for(int i=0; i<num.size();i++){
           x += num.get(i)*Math.pow(2,num.size()-i-1);
       }

       for(int i=0; i<b.getNum().size();i++){
           y += b.getNum().get(i)*Math.pow(2,num.size()-i-1);
       }
       
           System.out.println("a= "+ x + "...b= "+y);

       if(x>y)
         return true;
       else return false;
    }
   


}