package modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yova_
 */
public class SqlReporte extends Conexion {
    
    public DefaultTableModel consultarMes() {
                
        Date date = new Date();
        DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); // Configuramos la fecha que se recibe
        calendar.roll(Calendar.MONTH, 1);// numero de horas a añadir, o restar en caso de horas<0
        date = calendar.getTime(); // Devuelve el objeto Date con las nuevas horas añadidas
        
        String[] nombresColumnas = {"ID", "Fecha", "Productos", "Total",};
        String[] registros = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT * FROM ventas WHERE fecha <= ?";
        String sql2 = "SELECT * FROM detalle_venta_producto WHERE id_venta = ?";
        
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx                     
            ps.setString(1, fechaHora.format(date));
            
            rs = ps.executeQuery();

            while (rs.next()) {
                String productos = "";
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("fecha");
                
                ps2 = (PreparedStatement) con.prepareStatement(sql2);///(PreparedStatement) xxxxx                     
                ps2.setInt(1, Integer.parseInt(registros[0]));
            
                rs2 = ps2.executeQuery();
                
                while (rs2.next()){
                    productos = productos + rs2.getString("nombre") + "-$" + rs2.getString("precio")+ " / " ;
                }
                
                registros[0] = rs.getString("id");
                registros[2] = productos;
                registros[3] = rs.getString("total");
                

                modelo.addRow(registros);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar");
            System.out.println("El error es:" + e.toString());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return modelo;
    }
    
    public DefaultTableModel consultarDia(String dia) {
                
        String[] nombresColumnas = {"ID", "Fecha", "Productos", "Total",};
        String[] registros = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT * FROM ventas WHERE dia = ?";
        String sql2 = "SELECT * FROM detalle_venta_producto WHERE id_venta = ?";
        
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx                     
            ps.setString(1, dia);
            
            rs = ps.executeQuery();
            
            String productos = "";
            
            

            while (rs.next()) {
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("fecha");
                
                ps2 = (PreparedStatement) con.prepareStatement(sql2);///(PreparedStatement) xxxxx                     
                ps2.setInt(1, Integer.parseInt(registros[0]));
            
                rs2 = ps2.executeQuery();
                
                while (rs2.next()){
                    productos = productos + rs2.getString("nombre") + "-$" + rs2.getString("precio")+ " / " ;
                }
                
                registros[0] = rs.getString("id");
                registros[2] = productos;
                registros[3] = rs.getString("total");
                

                modelo.addRow(registros);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar");
            System.out.println("El error es:" + e.toString());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        
        return modelo;
    }
}
