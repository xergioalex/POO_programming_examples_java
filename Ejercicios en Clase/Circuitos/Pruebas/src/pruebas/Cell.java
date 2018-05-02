/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Sergio
 */
public class Cell implements Iterable<Integer>{
    private List<Integer> values = new ArrayList<Integer>();
    private boolean isSolved = false;
    private int row;
    private int col;
	
    public Iterator<Integer> iterator() { return values.iterator();};

    public Cell()
    {
	for (int n = 1; n <= 9; n=n+2)
		values.add(n);
    }

}
