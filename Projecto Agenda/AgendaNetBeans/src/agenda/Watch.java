/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFrameAgenda.java
 *
 * Created on 29-sep-2011, 12:58:56
 */
package agenda;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonzalo
 */
public class Watch extends javax.swing.JFrame {
    static Agenda principal = new Agenda();
    String nombreaeliminar="";
    int nombreamodificar=-1;
    
    /** Creates new form JFrameAgenda */
    public Watch() {        
        initComponents();
        this.setLocationRelativeTo(null); //Centro la ventana
        this.setResizable(false);
        listarTabla();
        this.mensajeEliminar.setVisible(false);
        this.eliminarsi.setVisible(false);
        this.eliminarno.setVisible(false);
        
        limpiar.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                campoayuda.setText("Limpia los campos de texto");               
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                campoayuda.setText(null);
            }           
        });
        
        datospersona.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                campoayuda.setText("Cargan las coincidencia al campo\n nombre");               
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                campoayuda.setText(null);
            }           
        });
        
        salir.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                campoayuda.setText("Este Boton Cierra el programa");               
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                campoayuda.setText(null);
            }           
        });
        
        adicionar.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                campoayuda.setText("Este Boton Sirve para Adiccionar una \npersona");               
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                campoayuda.setText(null);
            }           
        });
        
        modificar.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                campoayuda.setText("Este Boton Sirve para Modificar una \npersona");               
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                campoayuda.setText(null);
            }           
        });
        
        eliminar.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                campoayuda.setText("Este Boton Sirve para eliminar una \npersona");               
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                campoayuda.setText(null);
            }           
        });
        
        camponombre.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                campoayuda.setText("En este campo se ingresa el Nombre\n del contacto");               
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                campoayuda.setText(null);
            }           
        });
        
        campodireccion.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                campoayuda.setText("En este campo se ingresa la direccion\n del contacto");               
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                campoayuda.setText(null);
            }           
        });
        
        campotelefono.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                campoayuda.setText("En este campo se ingresa el telefono\n del contacto");               
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                campoayuda.setText(null);
            }           
        });
        
        campoemail.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                campoayuda.setText("En este campo se ingresa la direccion\n email del contacto");               
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                campoayuda.setText(null);
            }           
        });
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreagenda = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        nota = new javax.swing.JLabel();
        opciones = new javax.swing.JLabel();
        adicionar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        camponombre = new javax.swing.JTextField();
        campodireccion = new javax.swing.JTextField();
        campotelefono = new javax.swing.JTextField();
        campoemail = new javax.swing.JTextField();
        datospersona = new javax.swing.JButton();
        msnayuda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoayuda = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        eliminarsi = new javax.swing.JButton();
        eliminarno = new javax.swing.JButton();
        mensajeEliminar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreagenda.setText("AGENDA TELEFÓNICA");

        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        nota.setText("NOTA:  Para buscar, modificar o eliminar una persona debe ingresar el nombre exacto.");

        opciones.setText("Opciones");

        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        nombre.setText("Nombre:");

        direccion.setText("Direccion:");

        telefono.setText("Teléfono:");

        email.setText("Email:");

        camponombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponombreActionPerformed(evt);
            }
        });

        campotelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campotelefonoActionPerformed(evt);
            }
        });

        datospersona.setText("Ver datos de la persona");
        datospersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datospersonaActionPerformed(evt);
            }
        });

        msnayuda.setText("Mensaje de ayuda");

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Direccion", "Telefono", "Email"
            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        jLabel1.setText("Lista de Contactos");

        limpiar.setText("Limpiar todos los cuadros de texto");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        campoayuda.setColumns(20);
        campoayuda.setRows(5);
        jScrollPane2.setViewportView(campoayuda);

        jButton1.setText("jButton1");

        eliminarsi.setBackground(new java.awt.Color(204, 0, 0));
        eliminarsi.setForeground(new java.awt.Color(255, 255, 255));
        eliminarsi.setText("Si");
        eliminarsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarsiActionPerformed(evt);
            }
        });

        eliminarno.setBackground(new java.awt.Color(51, 255, 51));
        eliminarno.setForeground(new java.awt.Color(0, 0, 255));
        eliminarno.setText("No");
        eliminarno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarnoActionPerformed(evt);
            }
        });

        mensajeEliminar.setText("ESTA SEGURO?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(nota, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(nombreagenda, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addComponent(salir))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opciones)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(eliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adicionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eliminarsi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eliminarno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(mensajeEliminar)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(email)
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefono)
                                    .addComponent(direccion))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoemail)
                    .addComponent(campotelefono)
                    .addComponent(campodireccion)
                    .addComponent(camponombre, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(msnayuda))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datospersona))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombreagenda, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir))
                .addGap(8, 8, 8)
                .addComponent(nota)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opciones)
                    .addComponent(limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre)
                            .addComponent(camponombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datospersona))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(direccion)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campodireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(msnayuda)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(telefono)
                                    .addComponent(campotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(email)
                                    .addComponent(campoemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mensajeEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eliminarsi)
                            .addComponent(eliminarno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)))
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void campotelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campotelefonoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_campotelefonoActionPerformed

private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
    limpiarCampos();
}//GEN-LAST:event_limpiarActionPerformed

private void camponombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponombreActionPerformed
// TODO add your handling code here:
   
}//GEN-LAST:event_camponombreActionPerformed

private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
    String nombre = camponombre.getText();    
    if(!nombre.equals("")){        
        if(!principal.verificarRedundancia(nombre,-1)){
            String direccion = campodireccion.getText();
            String telefono = campotelefono.getText();
            String email = campoemail.getText();
            Persona p = new Persona(nombre,direccion,telefono,email);
        
            String validar = p.validarPersona();
            if(validar.equals("")){
                if(principal.adicionar(p))
                    JOptionPane.showMessageDialog(null, "Se Adicionado el Contacto correctamente","Notificacion de Exito", JOptionPane.INFORMATION_MESSAGE);            
                limpiarCampos();
                listarTabla();
                try {
                    escribirArchivo();
                } catch (IOException ex) {
                    Logger.getLogger(Watch.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Los siguientes datos estan incorrectos:\n"+validar,"Notificacion de Exito", JOptionPane.WARNING_MESSAGE);            
            }
        }else{
            JOptionPane.showMessageDialog(null, "Este contacto ya existe","ERROR", JOptionPane.WARNING_MESSAGE); 
        }
    }
    else{
        JOptionPane.showMessageDialog(null, "Ingrese Datos","Error", JOptionPane.ERROR_MESSAGE);    
    }
    
}//GEN-LAST:event_adicionarActionPerformed

private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
    System.exit(0);    
}//GEN-LAST:event_salirActionPerformed

private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
   String nombre = camponombre.getText();
   int index = principal.verificarPersona(nombre);
   if(index != -1){
        this.campotelefono.setText(principal.getPersona(index).getTelefono());
        this.campodireccion.setText(principal.getPersona(index).getDireccion());
        this.campoemail.setText(principal.getPersona(index).getEmail());
        this.mensajeEliminar.setVisible(true);
        this.eliminarsi.setVisible(true);
        this.eliminarno.setVisible(true);
        this.nombreaeliminar = nombre;        
    }
    else
        JOptionPane.showMessageDialog(null, "No se encontro el contacto","Error de Eliminacion", JOptionPane.ERROR_MESSAGE);    
}//GEN-LAST:event_eliminarActionPerformed

private void eliminarsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarsiActionPerformed
    principal.eliminarPersona(nombreaeliminar);
    JOptionPane.showMessageDialog(null, "Se elimino el Contacto con exito","Notificacion de exito", JOptionPane.INFORMATION_MESSAGE);    
    listarTabla();
    this.mensajeEliminar.setVisible(false);
    this.eliminarsi.setVisible(false);
    this.eliminarno.setVisible(false);
    limpiarCampos();
    try {
        escribirArchivo();
    } catch (IOException ex) {
        Logger.getLogger(Watch.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_eliminarsiActionPerformed

private void eliminarnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarnoActionPerformed
    this.mensajeEliminar.setVisible(false);
    this.eliminarsi.setVisible(false);
    this.eliminarno.setVisible(false);
}//GEN-LAST:event_eliminarnoActionPerformed

private void datospersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datospersonaActionPerformed
    String nombre = this.camponombre.getText();    
    int index=principal.verificarPersona(nombre);
    this.nombreamodificar = index;
    if(index != -1){
        JOptionPane.showMessageDialog(null, "Datos Encontrados","Notificacion de exito", JOptionPane.INFORMATION_MESSAGE);    
        this.campodireccion.setText(principal.getPersona(index).getDireccion());
        this.campotelefono.setText(principal.getPersona(index).getTelefono());
        this.campoemail.setText(principal.getPersona(index).getEmail());
    }
    else{
        JOptionPane.showMessageDialog(null, "La persona no existe","Error", JOptionPane.ERROR_MESSAGE);    
    }
}//GEN-LAST:event_datospersonaActionPerformed

private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
    String nombre = camponombre.getText();
    if(!nombre.equals("")){
        if(!principal.verificarRedundancia(nombre,this.nombreamodificar)){
            String direccion = campodireccion.getText();
            String telefono = campotelefono.getText();
            String email = campoemail.getText();
            Persona p=new Persona(nombre,direccion,telefono,email);
            String validar = p.validarPersona();
            if(this.nombreamodificar != -1){
                if(validar.equals("") ){
                    principal.modificar(nombreamodificar,p);
                    JOptionPane.showMessageDialog(null, "El contacto se modifico con exito","Notificacion de Exito", JOptionPane.INFORMATION_MESSAGE);    
                    this.nombreamodificar =-1;
                    listarTabla();
                    limpiarCampos();
                    try {
                        escribirArchivo();
                    } catch (IOException ex) {
                        Logger.getLogger(Watch.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Los siguientes datos estan incorrectos:\n"+validar,"Notificacion de Exito", JOptionPane.WARNING_MESSAGE);            
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Este contacto ya existe","ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }
    else{
        JOptionPane.showMessageDialog(null, "Ingrese el campo nombre","Error", JOptionPane.ERROR_MESSAGE);    
    }   
}//GEN-LAST:event_modificarActionPerformed
    
private void listarTabla(){        
    DefaultTableModel modelo = (DefaultTableModel) tabladatos.getModel();  
    int n = modelo.getRowCount();
    for (int i = 0; i < n; i++) {
        modelo.removeRow(modelo.getRowCount()-1);
    }
    for (int i = 0; i < principal.size(); i++) {
        Object[] agenda= { principal.getPersona(i).getNombre(),principal.getPersona(i).getDireccion(),principal.getPersona(i).getTelefono(),principal.getPersona(i).getEmail()};
        modelo.addRow(agenda);
    }            
}

public void limpiarCampos(){
    camponombre.setText(null);
    campodireccion.setText(null);
    campotelefono.setText(null);
    campoemail.setText(null);
    campoayuda.setText(null);
}

public void escribirArchivo() throws IOException{
    BufferedWriter writer = new BufferedWriter(new FileWriter("contactos.txt"));
    for (int i = 0; i < principal.size(); i++) {
        writer.append(principal.getPersona(i).toString());
        writer.flush();
        writer.newLine();
    }               
}

    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException, IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Watch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Watch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Watch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Watch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //LEER DATOS
        BufferedReader input = new BufferedReader(new FileReader("contactos.txt"));
        while(true){
            
            String contacto = input.readLine();
            if(contacto == null)
                break;
            StringTokenizer token = new StringTokenizer(contacto);                        
            principal.adicionar(new Persona(token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken()));
            
        }
        
        


        
        Watch vista = new Watch();                               
        vista.setVisible(true);

    }
    
    
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JTextArea campoayuda;
    private javax.swing.JTextField campodireccion;
    private javax.swing.JTextField campoemail;
    private javax.swing.JTextField camponombre;
    private javax.swing.JTextField campotelefono;
    private javax.swing.JButton datospersona;
    private javax.swing.JLabel direccion;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton eliminarno;
    private javax.swing.JButton eliminarsi;
    private javax.swing.JLabel email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel mensajeEliminar;
    private javax.swing.JButton modificar;
    private javax.swing.JLabel msnayuda;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombreagenda;
    private javax.swing.JLabel nota;
    private javax.swing.JLabel opciones;
    private javax.swing.JButton salir;
    private javax.swing.JTable tabladatos;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
