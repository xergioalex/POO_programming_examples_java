

public class Main
{
  
    
    
    public static void main(String[] args){
        int move;
        SimpleInput cin = new SimpleInput();
        Board triki = new Board();
        System.out.println("Bienvenido");
        System.out.println(triki);
        for(int i=0;i<9;i++){
            do{
              move=cin.getInt("Deme un entero 0-8: \n 0 | 1 | 2 \n 3 | 4 | 5 \n 6 | 7 | 8 ");
              if(move<0 || move>8 || triki.getPiece(move) != ' ')
                 System.out.println("Posicion Invalida");
            }while(move<0 || move>8 || triki.getPiece(move) != ' ');
            
            if(i % 2 == 0)
               triki.makeMove(move,'X');
            else
                triki.makeMove(move,'0');
            System.out.println(triki);
            if(triki.winner() != 'e'){
                System.out.println("Ganador= "+triki.winner());
                break;
            }
            
           
        }
        
        if(triki.winner() == 'e'){
           System.out.println("El juego quedo empatado");     
        }
        
        System.out.println("Fin");
        
        
        
    }
    
}
