
package vistas;
import java.awt.Point;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;

public class ViewGestionarProductos extends javax.swing.JFrame {

    /*
     * Creates new form GestionarProductos
     */
    File archivo= new File("data/Nombre");
    File archivoComboID = new File("data/ID");
    String opcionBoton= null;
    int numeroEditar=0;
    int numeroEliminar=0;
    public ViewGestionarProductos() throws IOException {
        initComponents();
        verificarArchivo();
        asignarEventoMouse();
        IniciarCajasTextos();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtProductoID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioUnidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtBuscarProductos = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("GESTIÓN DE PRODUCTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 330, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Producto ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtProductoID.setEnabled(false);
        jPanel1.add(txtProductoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 180, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtNombre.setEnabled(false);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 180, -1));

        jLabel4.setText("Descripción");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtDescripcion.setEnabled(false);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 180, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Cantidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        txtCantidad.setEnabled(false);
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 180, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Precio/Unidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtPrecioUnidad.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPrecioUnidad.setEnabled(false);
        txtPrecioUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioUnidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecioUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Total");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        txtTotal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtTotal.setEnabled(false);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 180, -1));

        btnAgregar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        btnEditar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        btnCerrar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, -1, -1));
        jPanel1.add(txtBuscarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, -1));

        btnBuscar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "ID", "Nombre", "Descripción", "Cantidad", "Precio/unidad", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setMinWidth(40);
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblProductos.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 790, 250));

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
               habilitarCajasTextos(true);
        IniciarCajasTextos();
        btnAgregar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(true);
        txtProductoID.setFocusable(true);
        opcionBoton = "Agregar";
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         String buscar = String.valueOf(txtBuscarProductos.getText());
        String[][] datos = new String[tblProductos.getRowCount()][11];
        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            for (int j = 0; j < 11; j++) {
                datos[i][j] = String.valueOf(tblProductos.getValueAt(i, j));
            }
        }
        DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
        limpiarTabla(modelo);
        for (int i = 0; i < datos.length; i++) {
            if (datos[i][1].equals(buscar)) {
                modelo.addRow(new Object[]{datos[i][0], datos[i][1], datos[i][2], datos[i][3], datos[i][4], datos[i][5], datos[i][6], datos[i][7], datos[i][8], datos[i][9], datos[i][10]});
            }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtPrecioUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioUnidadActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         if (!(txtProductoID.getText().equals("") || txtNombre.getText().equals("") || txtDescripcion.getText().equals("") || txtCantidad.getText().equals("") || txtPrecioUnidad.getText().equals("") || txtTotal.getText().equals("") )) {
            if (opcionBoton.equals("Agregar")) {
                ingresarPersonal();
            } else if (opcionBoton.equals("Editar")) {
                efectuarEdicion();
                almacenarFichero();
                JOptionPane.showMessageDialog(null, "Se editó el producto satisactoriamente");
            }
            habilitarCajasTextos(false);
            IniciarCajasTextos();
            btnAgregar.setEnabled(true);
            btnGuardar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnCancelar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "No deje espacios vacíos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
             opcionBoton = "Editar";
        habilitarCajasTextos(true);
        btnAgregar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
             habilitarCajasTextos(false);
        IniciarCajasTextos();
        btnAgregar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
                int respuesta = JOptionPane.showConfirmDialog(null, "¿En serio desea eliminar este producto?", "Eliminar personal", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
            for (int i = 0; i < tblProductos.getRowCount(); i++) {
                if (numeroEliminar == Integer.parseInt(String.valueOf(tblProductos.getValueAt(i, 0)))) {
                    modelo.removeRow(i);
                }
            }
            JOptionPane.showMessageDialog(null, "Se ha eliminado el producto seleccionado");
            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);

            almacenarFichero();
        } else {
            System.out.println("No se ha eliminado nada");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewGestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewGestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewGestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewGestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                new ViewGestionarProductos().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(ViewGestionarProductos.class
                .getName()).log(Level.SEVERE, null, ex);
            }        
        }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBuscarProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioUnidad;
    private javax.swing.JTextField txtProductoID;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    /**
     *
     */


    private void agregarCampo() {
          BufferedWriter escribirArchivo = null;
        try {
            try {
                escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "utf-8"));
            } catch (UnsupportedEncodingException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            try {

                escribirArchivo.write("PRODUCTO ID" + "," + "NOMBRE" + "," + "DESCRIPCION" + "," + "CANTIDAD" + "," + "PRECIO/UNIDAD" + "," + "TOTAL" + "," + "\n");

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            System.out.println("Campos agregado correctamente");
            try {
                escribirArchivo.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } finally {
      try {
            if (escribirArchivo != null) {
                escribirArchivo.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
}
     private void leerArchivo() throws FileNotFoundException, IOException {

        String linea = null;
        int numeroRegistros = 0;
        BufferedReader leerFichero = new BufferedReader(new FileReader(archivo));

        while ((linea = leerFichero.readLine()) != null) {

            numeroRegistros += 1;

        }

        leerFichero.close();

        if (numeroRegistros == 0) {

            System.out.println("No existen registros en el archivo");

        } else {

            String delimitador = ",";
            leerFichero = new BufferedReader(new FileReader(archivo));
            String strLine = "";
            StringTokenizer st = null;
            int lineNumber = 0, tokenNumber = 0;
            String[][] datos = new String[numeroRegistros][10];
            int posicion = 0;

            while ((strLine = leerFichero.readLine()) != null) {

                lineNumber++;
                st = new StringTokenizer(strLine, delimitador);

               while (st.hasMoreTokens()) {
    tokenNumber++;
    datos[posicion][0] = st.nextToken().trim();  
    if (st.hasMoreTokens()) { 
        datos[posicion][1] = st.nextToken().trim();
        datos[posicion][2] = st.nextToken().trim();
        datos[posicion][3] = st.nextToken().trim();
        datos[posicion][4] = st.nextToken().trim();
        datos[posicion][5] = st.nextToken().trim();
  
    }


                }
                tokenNumber = 0;
            }

            leerFichero.close();

            DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
            limpiarTabla(modelo);
            for (int i = 1; i < datos.length; i++) {
                String[] data = new String[11];
                data[0] = String.valueOf(i + 1);
                for (int j = 0; j < datos[i].length; j++) {
                    data[(j + 1)] = datos[i][j];
                }
                modelo.addRow(data);
            }

        }
    }
      private void verificarArchivo() {

        if (!archivo.exists()) {

            try {
                archivo.createNewFile();
                System.out.println("Archivo de base de datos creado correctamente");

                agregarCampo();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }

        } else {
            System.out.println("El archivo existe");
            try {
                leerArchivo();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }
         public void limpiarTabla(DefaultTableModel modelo) {
        for (int i = tblProductos.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
             public final void asignarEventoMouse() {
        tblProductos.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent Mouse_event) {
                JTable tabla = (JTable) Mouse_event.getSource();
                Point point = Mouse_event.getPoint();
                int row = tabla.rowAtPoint(point);
                if (Mouse_event.getClickCount() == 2) {
                    btnEditar.setEnabled(true);
                    btnEliminar.setEnabled(true);

                    numeroEditar = Integer.parseInt("" + tabla.getValueAt(tabla.getSelectedRow(), 0));
                    numeroEliminar = numeroEditar;
                    txtProductoID.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 1));
                    txtNombre.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 2));
                    txtDescripcion.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 3));
                    txtCantidad.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 4));
                    txtPrecioUnidad.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 5));
                    txtTotal.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 6));
                     
                }
            }
        });
    }
      public void habilitarCajasTextos(boolean estado) {
        txtProductoID.setEnabled(estado);
        txtNombre.setEnabled(estado);
        txtDescripcion.setEnabled(estado);
        txtCantidad.setEnabled(estado);
        txtPrecioUnidad.setEnabled(estado);
        txtTotal.setEnabled(estado);
    }  
      public void IniciarCajasTextos() {
        txtProductoID.setText(null);
        txtNombre.setText(null);
        txtDescripcion.setText(null);
        txtCantidad.setText(null);
        txtPrecioUnidad.setText(null);
        txtTotal.setText(null);
     
    }
       private void ingresarProducto() {
        BufferedWriter escribirArchivo = null;
        try {
            try {
                escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "utf-8"));
            } catch (UnsupportedEncodingException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            try {

                escribirArchivo.write(txtProductoID.getText() + "," + txtNombre.getText() + "," + txtDescripcion.getText() + "," + txtCantidad.getText() + "," + txtPrecioUnidad.getText() + "," + txtTotal.getText() + "," + "\n");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Personal ingresado correctamente");
            try {
                escribirArchivo.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            try {
                leerArchivo();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } finally {
            try {
                escribirArchivo.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }
        public void almacenarFichero() {
        try {
            archivo.delete();
            archivo.createNewFile();
            agregarCampo();

            BufferedWriter escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "utf-8"));
         
            for (int i = 0; i < tblProductos.getRowCount(); i++) {
                escribirArchivo.write(tblProductos.getValueAt(i, 1) + "," + tblProductos.getValueAt(i, 2) + "," + tblProductos.getValueAt(i, 3) + "," + tblProductos.getValueAt(i, 4) + "," + tblProductos.getValueAt(i, 5) + "," + tblProductos.getValueAt(i, 6) + "," + tblProductos.getValueAt(i, 7) + "," + tblProductos.getValueAt(i, 8) + "," + tblProductos.getValueAt(i, 9) + "," + tblProductos.getValueAt(i, 10) + "\n");
            }
            escribirArchivo.close();
            leerArchivo();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

      public void efectuarEdicion() {
        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            if (numeroEditar == Integer.parseInt((String) tblProductos.getValueAt(i, 0))) {
                tblProductos.setValueAt(numeroEditar, i, 0);
                tblProductos.setValueAt(txtProductoID.getText(), i, 1);
                tblProductos.setValueAt(txtNombre.getText(), i, 2);
                tblProductos.setValueAt(txtDescripcion.getText(), i, 3);
                tblProductos.setValueAt(txtCantidad.getText(), i, 4);
                tblProductos.setValueAt(txtPrecioUnidad.getText(), i, 5);
                tblProductos.setValueAt(txtTotal.getText(), i, 6);
                break;
            }
        }
    } 
      
}
