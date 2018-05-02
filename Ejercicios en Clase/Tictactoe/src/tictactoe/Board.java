/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;

/**
 *
 * @author Sergio
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Board implements Iterable<Integer> {

    private char[] pieces = new char[10];
    private int[]  names  = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    /*Constructor, Inicializa el tablero con espacios blancos ' '*/
    public Board() {

        for (int i = 0; i < 9; i++)
            pieces[i] = ' ';
    }

    /*Constructor, Inicializa el tablero en funcion de otro tablero ya inicializado */
    public Board(Board b) {
        for (int i = 0; i < 9; i++)
            pieces[i] = b.getPieces(i);
    }


    /* Examina el tablero en busca de un ganador, y retorna el caracter del ganador, si no hay ganador retorna ' ' */
    public char winner() {
        for (int i = 0; i < 3; i++)
            if (pieces[i] != ' ' && pieces[i] == pieces[i+3] && pieces[i] == pieces[i+6])
                return pieces[i];
        for (int i = 0; i < 9; i+=3)
            if (pieces[i] != ' ' && pieces[i] == pieces[i+1] && pieces[i] == pieces[i+2])
                return pieces[i];
        if (pieces[0] != ' ' && pieces[0] == pieces[4] && pieces[0] == pieces[8])
            return pieces[0];
        if (pieces[2] != ' ' && pieces[2] == pieces[4] && pieces[2] == pieces[6])
            return pieces[2];
        return ' ';
    }

    /* Examina el tablero para saber si ya ha terminado, no hay mas movimientos */
    public boolean gameOver() {
        for (int i = 0; i < 9; i++)
            if (pieces[i] == ' ') return false;
        return true;
    }

    /* Se usa para agregar una jugada al tablero, recibe la posicion, y un caracter que represente al jugador que juega*/
    public void makeMove(int move, char player) {
        pieces[move] = player;
    }

    /* Retorna el valor asignado a una posicion dentro del arreglo names*/
    public int getMoveName(int move) {
        return names[move];
    }

    /* Recibe un valor y retorna lo que hay en el tablero en esa posicion   */
    public char getPieces(int i) {
        return pieces[i];
    }

    /* Devuelve una cadena describiendo el objeto  */
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < 9; i+=3) {
            str += String.format(" %c | %c | %c \n", pieces[i], pieces[i+1],pieces[i+2]);
            if (i != 6) str += "---|---|---\n";
        }
        return str + "\n";
    }
    @Override
    public Iterator<Integer> iterator() { return new BoardIterator(); }

    
    private class BoardIterator implements Iterator<Integer> {

        private int current = -1;

        public BoardIterator() {
            while (current < 9)
                if (pieces[++current] == ' ') return;
        }
        @Override
        public boolean hasNext() { return current >= 0 && current < 9; }

        @Override
        public Integer next() {
            if (!hasNext()) throw new NoSuchElementException();
            int pos = current;
            while (current < 9)
                if (pieces[++current] == ' ') break;
            return pos;
        }

        @Override
        public void remove() { throw new UnsupportedOperationException(); }
    }



}
