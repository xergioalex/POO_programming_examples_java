package sudoku;


public class Sudoku
{
    

    /**
     * @param args the command line arguments
 
     * @param args the command line arguments
     */
    public static void main(String[] args){

        int[][] puzzle ={
            {0,6,2, 3,0,0, 9,0,0},
            {0,0,0, 0,8,0, 0,0,7},
            {8,0,0, 0,0,0, 0,0,4},

            {0,0,5, 0,2,0, 0,0,6},
            {0,3,0, 9,4,6, 0,5,0},
            {4,0,0, 0,0,0, 7,0,0},

            {7,0,0, 6,0,0, 0,0,3},
            {5,0,0, 0,3,0, 0,0,0},
            {0,0,3, 0,0,7, 8,9,0}
        };

        int[][] puzzle1 ={
            {1,0,0,  0,0,7,  0,9,0},
            {0,3,0,  0,2,0,  0,0,8},
            {0,0,9,  6,0,0,  5,0,0},

            {0,0,5,  3,0,0,  9,0,0},
            {0,1,0,  0,8,0,  0,0,2},
            {6,0,0,  0,0,4,  0,0,0},

            {3,0,0,  0,0,0,  0,1,0},
            {0,4,0,  0,0,0,  0,0,7},
            {0,0,7,  0,0,0,  3,0,0}
        };

        int[][] puzzle2 ={
            {0,0,2, 8,0,1, 0,0,0},
            {0,7,0, 0,2,0, 6,9,0},
            {8,0,0, 0,0,9, 5,2,1},

            {3,0,1, 9,4,6, 7,8,0},
            {0,8,6, 0,3,7, 9,1,4},
            {0,9,7, 0,8,5, 0,0,3},

            {6,0,0, 0,0,3, 8,0,0},
            {0,4,3, 5,0,8, 1,0,9},
            {0,0,8, 0,9,0, 3,5,0}
        };

        int[][] puzzle3 ={
            {0,0,9, 8,0,0, 1,3,4},
            {0,3,6, 4,7,5, 0,0,8},
            {0,8,4, 0,1,3, 0,7,0},

            {4,5,0, 0,0,0, 0,0,3},
            {3,9,0, 5,0,0, 2,0,1},
            {0,2,1, 0,9,0, 0,0,7},

            {8,0,0, 1,3,4, 7,0,0},
            {0,0,3, 0,5,6, 0,0,0},
            {0,4,5, 2,8,0, 3,1,0}
        };

        int[][] puzzle4 ={
            {0,6,0, 1,0,4, 0,5,0},
            {0,0,8, 3,0,5, 6,0,0},
            {2,0,0, 0,0,0, 0,0,1},

            {8,0,0, 4,0,7, 0,0,6},
            {0,0,6, 0,0,0, 3,0,0},
            {7,0,0, 9,0,1, 0,0,4},

            {5,0,0, 0,0,0, 0,0,2},
            {0,0,7, 2,0,6, 9,0,0},
            {0,4,0, 5,0,8, 0,7,0}
        };

        int[][] puzzle5 ={
            {0,0,3, 4,9,0, 0,0,5},
            {0,0,6, 0,0,8, 3,0,0},
            {2,0,0, 0,6,0, 0,0,0},

            {0,4,5, 0,0,6, 0,9,8},
            {0,2,0, 0,0,0, 0,5,0},
            {8,6,0, 9,0,0, 2,4,0},

            {0,0,0, 0,3,0, 0,0,7},
            {0,0,2, 1,0,0, 9,0,0},
            {6,0,0, 0,4,9, 5,0,0}
        };


        Board sudoku= new Board();
        sudoku.setup(puzzle5);
        System.out.println(sudoku);
        System.out.println(backtracking(sudoku));

 

    }

    
    //ALGORITMO VUELTA ATRAS.
    public static Board backtracking(Board a){
        Board solucion;
        if(a.isSolve()){
                return a;
         }

         for(int i=0; i<9;i++){
            for(int j=0; j<9;j++){
               
                if(a.getCellValue(i, j) == -1){
                             return null;
                }
                if(!a.getCell(i, j).isSolve()){
                     Board c=new Board(a);

                     for(int x:c.getCell(i, j)){
                         a.setCellValue(i, j, x);
                         solucion= backtracking(a);
                         if(solucion!=null){
                             solucion=new Board(solucion);
                             return solucion;
                         }
                         a=new Board(c);
                      }
                      if(a.getCellValue(i, j)==0){
                         return null;
                      }

                 }
            }
         }

         return null;
    }


}
