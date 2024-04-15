/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Entidades.Producto;
import Entidades.Rubro;
import java.util.TreeSet;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emanu
 */
public class ConPrecio extends javax.swing.JInternalFrame {
     private TreeSet<Producto> productos;
     private DefaultTableModel modelo=new DefaultTableModel();

    public ConPrecio(TreeSet<Producto> productos) {
        initComponents();
        this.productos=productos;
        
        armarCabecera(); 
    }
   
     private void armarCabecera(){
       
         modelo.addColumn("Codigo");
         modelo.addColumn("Descripcion");
         modelo.addColumn("Precio");
         modelo.addColumn("Stock");
         modelo.addColumn("Rubro");
         jTabla.setModel(modelo);
     }
     
     private void borrarFilas(){
     
         int filas=modelo.getRowCount()-1;
         for(int f=filas;f >= 0;f--){
         
             modelo.removeRow(f);
         }
     }
      private boolean validaReal(String nro){
        Pattern patron=Pattern.compile("^\\d+(\\.\\d+)?$");
        Matcher m=patron.matcher(nro);
        return m.matches();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFPreini = new javax.swing.JTextField();
        jTFPrefin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("Consulta por precio");

        jLabel2.setText("Entre $:");

        jLabel3.setText("y");

        jTFPrefin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFPrefinKeyReleased(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(jTFPreini, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFPrefin, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPreini, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTFPrefin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFPrefinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPrefinKeyReleased
       if(validaReal(jTFPreini.getText())&& validaReal(jTFPrefin.getText()))
       {    borrarFilas();
           
           
           for(Producto prod:productos){
         
            if(prod.getPrecio()>=Double.parseDouble(jTFPreini.getText())&&(prod.getPrecio()<=Double.parseDouble(jTFPrefin.getText())))
            
            {
                
                Vector renglon=new Vector();
                renglon.add(prod.getCodigo());
                renglon.add(prod.getDescripcion());
                renglon.add(prod.getPrecio());
                renglon.add(prod.getStock());
                renglon.add(prod.getRubro());
                modelo.addRow(renglon);
                System.out.println(renglon);
                
                
            }
          
           
       }
    }//GEN-LAST:event_jTFPrefinKeyReleased
       else{
            if(!(jTFPrefin.getText().isEmpty()))
            {
           JOptionPane.showMessageDialog(this, "ingrese numeros");
                jTFPreini.setText("");
                jTFPrefin.setText("");
                jTFPreini.requestFocus();
                borrarFilas();
            }
            else{
                return;
            
            }
       
       
       }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFPrefin;
    private javax.swing.JTextField jTFPreini;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
