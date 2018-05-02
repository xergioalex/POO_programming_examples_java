import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Iterator;


public class Cell extends Observable implements Observer, Iterable<Integer>
{
	private List<Integer> values = new ArrayList<Integer>();
	private boolean isSolved = false;
	private int row;
	private int col;

	public Iterator<Integer> iterator() { return values.iterator();};

	public Cell(int row, int col)
	{
		this.row = row;
		this.col = col;
		for (int n = 1; n <= 9; n++)
			values.add(n);
	}

	// adiciona celdas que estan en la misma linea, cuadro como observadores
	public synchronized void addObserver(Cell[][] cells)
	{
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++) {
				boolean isSame = (i == row) && (j == col);
				boolean isSameLine = (i == row) || (j == col);
				boolean isSecondary = (i/3 == row/3) && (j/3 == col/3);
				if (!isSame && (isSameLine || isSecondary))
					super.addObserver(cells[i][j]);
			}
	}

	// adiciona valores conocidos despues de limpiar y notificar
	public void setValue(int value)
	{
		values.clear();
		values.add(value);
		isSolved = true;

		super.setChanged();
		super.notifyObservers(value);
	}

	// Sobre escribe el tablero con otro nuevo
	@Override
	public void update(Observable o, Object arg)
	{
		values.remove(arg);
		if (!isSolved && values.size() == 1) {
			int value = values.get(0);
			setValue(value);
		}
	}

	// una celda es solved si solo tiene un valor
	public int getValue() {
		return (values.size() == 1) ? values.get(0) : (values.size() == 0)? -1: 0;
	}

        public boolean isSolve() {
		return this.isSolved;
	}



}