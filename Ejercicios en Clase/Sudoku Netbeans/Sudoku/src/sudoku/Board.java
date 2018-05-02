package sudoku;

import javax.swing.JPanel;

public class Board extends JPanel {

    private Cell[][] cells = new Cell[9][9];

    public void construirTablero() {
        //this.setLayout(new java.awt.GridLayout(9, 9));
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cells[i][j] = new Cell(i, j);

            }
        }


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cells[i][j].addObserver(cells);
                this.add(cells[i][j].getPanel());
            }
        }

    }

    public Board() {
        construirTablero();
    }

    public Board(Board a) {
        construirTablero();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a.getCellValue(i, j) != 0) {
                    this.cells[i][j].setValue(a.getCellValue(i, j));
                }
            }
        }

    }

    public void setup(int[][] puzzle) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (puzzle[i][j] != 0) {
                    setCellValue(i, j, puzzle[i][j]);
                }
            }
        }
        //cells[i][j].setValue(puzzle[i][j]);
    }

    //Obtiene el valor que contiene una celda, si aun hay varios candidatos en la celda devuelve 0
    public int getCellValue(int i, int j) {
        return cells[i][j].getValue();

    }

    //Inserta un valor en el contenido de una celda, elminando los demas candidatos ***
    public void setCellValue(int i, int j, int value) {
        getCell(i, j).setValue(value);
    }

    //Retorna una celda del tablero
    public Cell getCell(int i, int j) {
        return cells[i][j];

    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                string += String.format("%s ", Integer.toString(getCellValue(i, j)));
                if (j == 2 || j == 5) {
                    string += "| ";
                }
            }
            string += "\n";
            if (i == 2 || i == 5) {
                string += "---------------------\n";
            }
        }
        return string;
    }

    //Retorna Verdadero si el tablero esta resuelto
    public boolean isSolve() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (getCellValue(i, j) == 0 || getCellValue(i, j) == -1) {
                    return false;
                }

            }
        }
        return true;
    }
}
