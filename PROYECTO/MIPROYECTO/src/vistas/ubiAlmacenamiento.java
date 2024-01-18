
package vistas;
import clases.ComboBox;
import clases.ComboBoxT;
import clases.Controlador;
import clases.Funciones;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author Osmar Guzman
 */
public class ubiAlmacenamiento extends javax.swing.JFrame {
    ResultSet resultado;
    Controlador controlador;
    Funciones funciones;
    String objeto = "ubiAlmacenamiento";
    String id = "id";
    String cadenaSQL = null;
    boolean editar = false;
    int estado = 0;
    int gencod = 0;
    /** 
     * Creates new form ubiAlmacenamiento
     */
    public ubiAlmacenamiento() {
        initComponents();
         setTitle("Ubicacion de Almacenamiento");
        setLocationRelativeTo(null);
        controlador = new Controlador();
        funciones = new Funciones();
        inicializar();
    }
        public void inicializar() {
        gencod = controlador.generarCodigo(objeto, id);
        txtID.setText(String.valueOf(gencod));
        txtESTANTE.setText("0");
        txtFILA.setText("1");
        txtSECCION .setText("0");
        cadenaSQL = "SELECT ID,PRODUCTO FROM productos ORDER BY id";
        controlador.CargarJComboBox(cboPRODUCTOS, cadenaSQL);
        tabPRODUCTOS.setSelectedIndex(1);
        recuperarPedidos();

    }
         public void recuperarValorCombo(JComboBox combo, String dato) {
        for (int i = 0; i < combo.getItemCount(); i++) {
            if (combo.getItemAt(i).toString().equals(dato)) {
                combo.setSelectedIndex(i);
            }
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPRODUCTOS = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtESTANTE = new javax.swing.JTextField();
        txtFILA = new javax.swing.JTextField();
        txtSECCION = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtCANCELAR = new javax.swing.JButton();
        cboPRODUCTOS = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUBICACION = new javax.swing.JTable();
        btnMODIFICAR = new javax.swing.JButton();
        btnELIMINAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel12.setText("FILA");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 20));

        jLabel13.setText("SECCION");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        txtESTANTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtESTANTEActionPerformed(evt);
            }
        });
        jPanel1.add(txtESTANTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 210, -1));

        txtFILA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFILAActionPerformed(evt);
            }
        });
        jPanel1.add(txtFILA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 140, -1));

        txtSECCION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSECCIONActionPerformed(evt);
            }
        });
        jPanel1.add(txtSECCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 150, -1));

        jButton3.setText("GUARDAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 120, 40));

        jLabel14.setText("PRODUCTOS");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, 20));

        txtCANCELAR.setText("CANCELAR");
        txtCANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCANCELARActionPerformed(evt);
            }
        });
        jPanel1.add(txtCANCELAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 120, 40));

        cboPRODUCTOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboPRODUCTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPRODUCTOSActionPerformed(evt);
            }
        });
        jPanel1.add(cboPRODUCTOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel15.setText("ID");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 30, 30));

        jLabel16.setText("ESTANTE");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 60, 20));

        txtID.setText("ID");
        txtID.setEnabled(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 190, 30));

        tabPRODUCTOS.addTab("Agregando", jPanel1);

        tblUBICACION.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblUBICACION);

        btnMODIFICAR.setText("MODIFICAR");
        btnMODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODIFICARActionPerformed(evt);
            }
        });

        btnELIMINAR.setText("ELIMINAR");
        btnELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnELIMINARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnMODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btnELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        tabPRODUCTOS.addTab("Visualizando", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPRODUCTOS, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPRODUCTOS)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtESTANTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtESTANTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtESTANTEActionPerformed

    private void txtFILAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFILAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFILAActionPerformed

    private void txtSECCIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSECCIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSECCIONActionPerformed

    private void cboPRODUCTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPRODUCTOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPRODUCTOSActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String id = txtID.getText();
    String estante = txtESTANTE.getText();
    String fila = txtFILA.getText();
    String seccion = txtSECCION.getText();
    String producto = ((ComboBox) cboPRODUCTOS.getSelectedItem()).getId();

    if (estante.isEmpty() || fila.isEmpty() || seccion.isEmpty()) {
        String mensaje = "Todos los datos son obligatorios!";
        JOptionPane.showMessageDialog(this, mensaje);
        return;
    }

    if (!editar) {
        cadenaSQL = "INSERT INTO ubiAlmacenamiento VALUES (";
        cadenaSQL += id;
        cadenaSQL += ",";
        cadenaSQL += producto;
        cadenaSQL += ",";
        cadenaSQL += estante;
        cadenaSQL += ",'";
        cadenaSQL += fila;
        cadenaSQL += "',";
        cadenaSQL += seccion;
        cadenaSQL += ")";
    } else {
        cadenaSQL = "UPDATE ubiAlmacenamiento SET ";
        cadenaSQL += "id_productos=" + producto;
        cadenaSQL += ", estante=" + estante;
        cadenaSQL += ", fila=" + fila;
        cadenaSQL += ", seccion=" + seccion;
        cadenaSQL += " WHERE id=" + id;
    }
    boolean operacion = controlador.actualizar(cadenaSQL);
    System.err.println("Operacion: " + operacion);
    inicializar();
    tabPRODUCTOS.setSelectedIndex(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCANCELARActionPerformed
       inicializar();
        tabPRODUCTOS.setSelectedIndex(1);
    }//GEN-LAST:event_txtCANCELARActionPerformed

    private void btnMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODIFICARActionPerformed
       int fila = tblUBICACION.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String id = tblUBICACION.getValueAt(tblUBICACION.getSelectedRow(), 0).toString();
        try {
            cadenaSQL = "SELECT * FROM ubiAlmacenamiento WHERE id = " + id;
            resultado = controlador.consultar(cadenaSQL);
            if (resultado.next()) {
                txtID.setText(resultado.getString(1));
                recuperarValorCombo(cboPRODUCTOS, resultado.getString(2));
                txtESTANTE.setText(resultado.getString(3));
                txtFILA.setText(resultado.getString(4));
                txtSECCION.setText(resultado.getString(5));
                tabPRODUCTOS.setSelectedIndex(0);
                editar = true;
            }
        } catch (SQLException ex) {
            System.err.println("ERROR SQL EDICION: " + ex);
        }
        controlador.desconectar();
    }                                            

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int fila = tblUBICACION.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int pregunta = JOptionPane.showConfirmDialog(this, "Borrar Registro?", "ATENCION", JOptionPane.YES_NO_OPTION);
        if (pregunta == JOptionPane.NO_OPTION) {
            return;
        }
        String id = tblUBICACION.getValueAt(tblUBICACION.getSelectedRow(), 0).toString();
        String cadenaSQL = "DELETE FROM ubiAlmacenamiento WHERE id = " + id;
        boolean operacion = controlador.actualizar(cadenaSQL);
        System.err.println("Operacion: " + operacion);
        inicializar();
        tabPRODUCTOS.setSelectedIndex(1);
        
    }//GEN-LAST:event_btnMODIFICARActionPerformed

    private void btnELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnELIMINARActionPerformed
      
        int fila = tblUBICACION.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int pregunta = JOptionPane.showConfirmDialog(this, "Borrar Registro?", "ATENCION", JOptionPane.YES_NO_OPTION);
        if (pregunta == JOptionPane.NO_OPTION) {
            return;
        }
        String id = tblUBICACION.getValueAt(tblUBICACION.getSelectedRow(), 0).toString();
        String cadenaSQL = "DELETE FROM ubiAlmacenamiento WHERE id = " + id;
        boolean operacion = controlador.actualizar(cadenaSQL);
        System.err.println("Operacion: " + operacion);
        inicializar();
        tabPRODUCTOS.setSelectedIndex(1);
        
        
    }//GEN-LAST:event_btnELIMINARActionPerformed

    
        public void recuperarPedidos() {
        String cadenaSQL = "SELECT * FROM UbiAlmacenamiento";
        controlador.cargarJTabla((DefaultTableModel) tblUBICACION.getModel(), cadenaSQL);
        tblUBICACION.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblUBICACION.getColumnModel().getColumn(1).setPreferredWidth(350);
        tblUBICACION.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblUBICACION.getColumnModel().getColumn(3).setPreferredWidth(100);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ubiAlmacenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ubiAlmacenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ubiAlmacenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ubiAlmacenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ubiAlmacenamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnELIMINAR;
    private javax.swing.JButton btnMODIFICAR;
    private javax.swing.JComboBox<String> cboPRODUCTOS;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tabPRODUCTOS;
    private javax.swing.JTable tblUBICACION;
    private javax.swing.JButton txtCANCELAR;
    private javax.swing.JTextField txtESTANTE;
    private javax.swing.JTextField txtFILA;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSECCION;
    // End of variables declaration//GEN-END:variables
}
