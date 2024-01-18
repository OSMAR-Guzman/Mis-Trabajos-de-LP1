package clases;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Osmar Guzman
 */
public class Controlador extends Conexion {

    ResultSet resultado = null;

    //constructor
    public Controlador() {
    }

    public void desconectar() {
      System.out.println("SQLite desconectado...!");
        try {
        sentencia.close();
        conexion.close();
        
    } catch (SQLException ex) {
        reportarError(ex);
    }
}

    public void reportarError(SQLException ex) {
        System.err.println("ERROR ACTUALIZANDO: " + ex);
    }

    public void imprimirSQL(String sql) {
        System.err.println(sql);
    }

    public boolean actualizar(String cadenaSQL) {
        //INSERT INTO  //UPDATE    //DELETE FROM
        boolean valor = false;
        conectar();
          try {
            imprimirSQL(cadenaSQL);
            sentencia.executeUpdate(cadenaSQL);
        } catch (SQLException ex) {
            System.err.println("ERROR ACTUALIZANDO 1: " + ex);
            
            valor = true;
        }
        desconectar();
        return valor;
    }

    public ResultSet consultar(String cadenaSQL) {
        //SELECTs
        resultado = null;
        conectar();
         try {
            resultado = sentencia.executeQuery(cadenaSQL);
            imprimirSQL(cadenaSQL);
        } catch (SQLException ex) {
        System.err.println("ERROR ACTUALIZANDO 2: " + ex);
        }
        return resultado;
    }

    public int generarCodigo(String objeto, String id) {
        int codigo = 1;
        resultado = null;
        String cadenaSQL = "SELECT MAX(" + id + ") FROM " + objeto;
        try {
            resultado = consultar(cadenaSQL);
            if (resultado.next()) {
                codigo = resultado.getInt(1) + 1;
            }
        } catch (SQLException ex) {
          System.err.println("ERROR ACTUALIZANDO 3: " + ex);
        }
        desconectar();
        return codigo;
    }

    public void cargarJTabla(DefaultTableModel tablaAuxiliar, String cadenaSQL) {
        resultado = null;
        tablaAuxiliar.setRowCount(0);
        tablaAuxiliar.setColumnCount(0);
        try {
            resultado = consultar(cadenaSQL);
            if (resultado != null) {
                int nCol = resultado.getMetaData().getColumnCount();
                for (int n = 1; n <= nCol; n++) {
                    tablaAuxiliar.addColumn(resultado.getMetaData().getColumnName(n).toUpperCase());
                }
                while (resultado.next()) {
                    Object[] fila = new Object[nCol];
                    for (int o = 1; o <= nCol; o++) {
                        fila[o - 1] = resultado.getObject(o);
                    }
                    tablaAuxiliar.addRow(fila);
                }
            }
        } catch (SQLException ex) {
         System.err.println("ERROR ACTUALIZANDO 4: " + ex);
        }
        desconectar();
    }

   public void CargarJComboBox(JComboBox comboAuxiliar, String cadenaSQL) {
        resultado = null;
        DefaultComboBoxModel comboTemporal = new DefaultComboBoxModel();
        try {
            resultado = consultar(cadenaSQL);
            while (resultado.next()) {
                ComboBox objeto = new ComboBox();
                objeto.setId(resultado.getString(1));
                objeto.setNombre(resultado.getString(2));
                comboTemporal.addElement(objeto);
            }
            comboAuxiliar.setModel(comboTemporal);
        } catch (SQLException ex) {
            reportarError(ex);
        }
        desconectar();
    }
   public void CargarJComboBoxTres(JComboBox comboAuxiliar, String cadenaSQL) {
        resultado = null;
        DefaultComboBoxModel comboTemporal = new DefaultComboBoxModel();
        try {
            resultado = consultar(cadenaSQL);
            while (resultado.next()) {
                ComboBoxT objeto = new ComboBoxT();
                objeto.setId(resultado.getString(1));
                objeto.setNombre(resultado.getString(2));
                objeto.setPrecio(resultado.getString(3));
                comboTemporal.addElement(objeto);
            }
            comboAuxiliar.setModel(comboTemporal);
        } catch (SQLException ex) {
            reportarError(ex);
        }
        desconectar();
    }
}
