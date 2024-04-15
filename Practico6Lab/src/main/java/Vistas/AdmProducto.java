
package Vistas;

import Entidades.Producto;
import Entidades.Rubro;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class AdmProducto extends javax.swing.JInternalFrame {
    private TreeSet<Producto> productos;
    private Producto auxiliar=null;

    public AdmProducto(TreeSet<Producto> productos) {
        initComponents();
        this.productos = productos;
        llenarCombo();
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBTBuscar = new javax.swing.JButton();
        jBTSalir = new javax.swing.JButton();
        JBTEliminar = new javax.swing.JButton();
        jBTGuardar = new javax.swing.JButton();
        jBTNuevos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFBuscar = new javax.swing.JTextField();
        jTFCodigo = new javax.swing.JTextField();
        jTFDesc = new javax.swing.JTextField();
        jTFPrecio = new javax.swing.JTextField();
        jTFStock = new javax.swing.JTextField();
        jCBRubro = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Gestion Productos");

        jBTBuscar.setText("BUSCAR");
        jBTBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBuscarActionPerformed(evt);
            }
        });

        jBTSalir.setText("SALIR");
        jBTSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalirActionPerformed(evt);
            }
        });

        JBTEliminar.setText("ELIMINAR");
        JBTEliminar.setEnabled(false);
        JBTEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTEliminarActionPerformed(evt);
            }
        });

        jBTGuardar.setText("GUARDAR");
        jBTGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTGuardarActionPerformed(evt);
            }
        });

        jBTNuevos.setText("NUEVO");
        jBTNuevos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNuevosActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Precio");

        jLabel5.setText("Stock");

        jLabel6.setText("Rubro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBTNuevos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBTGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBTEliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFDesc)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTFStock, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBRubro, 0, 200, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBTSalir)
                    .addComponent(jBTBuscar))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTBuscar)
                    .addComponent(jLabel2)
                    .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTFDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCBRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTSalir)
                    .addComponent(JBTEliminar)
                    .addComponent(jBTGuardar)
                    .addComponent(jBTNuevos))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBTSalirActionPerformed

    private void jBTBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTBuscarActionPerformed
        // TODO add your handling code here:
        int codigo;
        if(validaEntero(jTFBuscar.getText())){
            codigo = Integer.parseInt(jTFBuscar.getText());
        }else {
        
            JOptionPane.showMessageDialog(this, "Ingresar un nro ");
            jTFBuscar.requestFocus();
            return;
        }
        for(Producto prod:productos){
 
            if(codigo==prod.getCodigo()){
                jTFCodigo.setText(prod.getCodigo()+"");
                jTFDesc.setText(prod.getDescripcion());
                jTFPrecio.setText(prod.getPrecio()+"");
                jTFStock.setText(prod.getStock()+"");
                jCBRubro.setSelectedItem(prod.getRubro());
                JBTEliminar.setEnabled(true);
                auxiliar=prod;
                return;
                
            }
        }
        
        JOptionPane.showMessageDialog(this, "Codigo inexistente");
        limpiar();
        
    }//GEN-LAST:event_jBTBuscarActionPerformed

    private void jBTGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTGuardarActionPerformed
        // TODO add your handling code here:
        int codigo;
        String descripcion;
        double precio;
        Rubro rubro;
        int stock;
       
        if(validaEntero(jTFCodigo.getText())){
            codigo = Integer.parseInt(jTFCodigo.getText());
        }else {
        
            JOptionPane.showMessageDialog(this, "Ingresar un nro ");
            jTFCodigo.requestFocus();
            return;
        }
       
        if(validaEntero(jTFStock.getText())){
            stock = Integer.parseInt(jTFStock.getText());
        }else {
        
            JOptionPane.showMessageDialog(this, "Ingresar un nro ");
            jTFStock.requestFocus();
            return;
        }
        
        if(validaReal(jTFPrecio.getText())){
            precio = Double.parseDouble(jTFPrecio.getText());
        }else {
        
            JOptionPane.showMessageDialog(this, "Ingresar un nro ");
            jTFPrecio.requestFocus();
            return;
        }
        
        if(!jTFDesc.getText().isEmpty()){
        
            descripcion = jTFDesc.getText();
        }else {
            JOptionPane.showMessageDialog(this, "Ingresar una descripcion");
            jTFDesc.requestFocus();
            return;
        }
         
         
       rubro = (Rubro)jCBRubro.getSelectedItem();
      
       Producto nvoProd=new Producto(codigo,descripcion,precio,rubro,stock);
       if(productos.add(nvoProd)){
           JOptionPane.showMessageDialog(this, "Producto Agregado");
           limpiar();
       }else {
       
           JOptionPane.showMessageDialog(this, "Ya existe un producto con ese código");
       }
       
        
    }
    
    private void llenarCombo(){
    
        Rubro comestible=new Rubro(1,"Comestible");
        Rubro limpieza=new Rubro(2,"Limpieza");
        Rubro perfumeria=new Rubro(3,"Perfumeria");
        
        jCBRubro.addItem(comestible);
        jCBRubro.addItem(limpieza);
        jCBRubro.addItem(perfumeria);
        
    }

     private void limpiar(){
    
        jTFCodigo.setText("");
        jTFDesc.setText("");
        jTFPrecio.setText("");
        jTFStock.setText("");
        jCBRubro.setSelectedIndex(0);
        JBTEliminar.setEnabled(false);
        jTFBuscar.setText("");
        auxiliar=null;
    }


    private boolean validaReal(String nro){
    Pattern patron=Pattern.compile("^\\d+(\\.\\d+)?$");
        Matcher m=patron.matcher(nro);
        return m.matches();
        
    }
    private boolean validaEntero(String nro){
    
        Pattern patron=Pattern.compile("^[0-9]+$");
        Matcher m=patron.matcher(nro);
        return m.matches();
   
    }//GEN-LAST:event_jBTGuardarActionPerformed

    private void JBTEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTEliminarActionPerformed
                // TODO add your handling code here:
                int opcion=JOptionPane.showConfirmDialog(this, "Confirma Eliminación S/N", "Confirmación",JOptionPane.YES_NO_OPTION);
                if(opcion==JOptionPane.YES_OPTION){
                     productos.remove(auxiliar);
                     JBTEliminar.setEnabled(false);
                    JOptionPane.showMessageDialog(this, "Producto Eliminado ");
                    limpiar();
                    
                    auxiliar=null;
                }
    }//GEN-LAST:event_JBTEliminarActionPerformed

    private void jBTNuevosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNuevosActionPerformed
       limpiar();
       JBTEliminar.setEnabled(false);
    }//GEN-LAST:event_jBTNuevosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTEliminar;
    private javax.swing.JButton jBTBuscar;
    private javax.swing.JButton jBTGuardar;
    private javax.swing.JButton jBTNuevos;
    private javax.swing.JButton jBTSalir;
    private javax.swing.JComboBox<Rubro> jCBRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTFBuscar;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFDesc;
    private javax.swing.JTextField jTFPrecio;
    private javax.swing.JTextField jTFStock;
    // End of variables declaration//GEN-END:variables
}
