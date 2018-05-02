package sudoku;

import java.awt.TextField;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

public class Cell extends Observable implements Observer, Iterable<Integer> {

    private List<Integer> values = new ArrayList<Integer>();
    private boolean isSolved = false;
    private int row;
    private int col;
    JComboBox lista = new JComboBox();
    JTextField valor = new JTextField();
    private JPanel panel ;

    public Iterator<Integer> iterator() {
        return values.iterator();
    }

    ;

    public Cell(int row, int col) {
        panel = new JPanel();
        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(lista, java.awt.BorderLayout.PAGE_START);
        this.row = row;
        this.col = col;

        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int n = 1; n <= 9; n++) {
            values.add(n);
            model.addElement(n);
        }
        lista.setModel(model);

        panel.add(valor,java.awt.BorderLayout.CENTER);
        lista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                valor.setText(""+(Integer)lista.getSelectedItem());
                panel.repaint();
                panel.revalidate();
                setValue((Integer)lista.getSelectedItem());
                
            }
        });

    }

    // adiciona celdas que estan en la misma linea, cuadro como observadores
    public synchronized void addObserver(Cell[][] cells) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boolean isSame = (i == row) && (j == col);
                boolean isSameLine = (i == row) || (j == col);
                boolean isSecondary = (i / 3 == row / 3) && (j / 3 == col / 3);
                if (!isSame && (isSameLine || isSecondary)) {
                    super.addObserver(cells[i][j]);
                }
            }
        }
    }

    // adiciona valores conocidos despues de limpiar y notificar
    public void setValue(int value) {
        values.clear();
        values.add(value);
        valor.setText(""+value);
        isSolved = true;
        lista.setVisible(!isSolved);
        valor.setEnabled(!isSolved);
        valor.setFont(new java.awt.Font("Tahoma", 1, 18));
        valor.setForeground(new java.awt.Color(255, 0, 51));
        valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        super.setChanged();
        super.notifyObservers(value);
        valor.repaint();
    }

    // Sobre escribe el tablero con otro nuevo
    @Override
    public void update(Observable o, Object arg) {
        values.remove(arg);
        if (!isSolved && values.size() == 1) {
            int value = values.get(0);
            setValue(value);
        }
    }

    // una celda es solved si solo tiene un valor
    public int getValue() {
        return (values.size() == 1) ? values.get(0) : (values.size() == 0) ? -1 : 0;
    }

    public boolean isSolve() {
        return this.isSolved;
    }

    /**
     * @return the panel
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * @param panel the panel to set
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
}
