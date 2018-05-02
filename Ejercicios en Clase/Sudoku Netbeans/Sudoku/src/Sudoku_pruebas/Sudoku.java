package Sudoku_pruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sudoku
{

    public static void main(String[] args){

        List<Integer> list= new ArrayList<Integer>();
        for (int i = 1; i <= 9; i++)
            list.add(i);
        print(list);
        Collections.shuffle(list);
        print(list);

    }

    public static void print(List<Integer> list){
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i)+" ");
        System.out.println("");


    }
    
    


}

