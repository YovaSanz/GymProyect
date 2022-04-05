package modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.NewSocio;
import modelo.User;

public class SqlSocio extends Conexion {

    public DefaultTableModel mostrarClientes(){
        String []  nombresColumnas = {"Numero de Socio","Nombre","Apellidos", "Tipo de Membresia", "Fecha de inscripcio", "Ultimo Pago", "Ultima Entrada"};
        String [] registros = new String[7];
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT * FROM socios";
        
        try
        {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx                     
            
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("numeroSocio");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("apellidoP") + " " +rs.getString("apellidoM");
                registros[3] = rs.getString("tipoMembresia");
                registros[4] = rs.getString("fechaInscripcion");
                registros[5] = rs.getString("fechaMembresia");
                registros[6] = rs.getString("ultimaEntrada");
                
                modelo.addRow(registros);
                
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar : " + e);  
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
       
         return modelo;
    }
    
    public DefaultTableModel buscar( String texto){
        String []  nombresColumnas = {"Numero de Socio","Nombre","Primer Apellido", "Segundo Apellido", "Tipo de Membresia", "Fecha de inscripcio", "Ultimo Pago", "Ultima Entrada"};
        String [] registros = new String[8];
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT * FROM socios WHERE numeroSocio LIKE '%"+ texto +"%' OR nombre LIKE '%"+ texto +"%' OR apellidoP LIKE '%"+ texto +"%' OR apellidoM LIKE '%"+ texto +"%'";
        
        try
        {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx                     
            
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("numeroSocio");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("apellidoP");
                registros[3] = rs.getString("apellidoM");
                registros[4] = rs.getString("tipoMembresia");
                registros[5] = rs.getString("fechaInscripcion");
                registros[6] = rs.getString("fechaMembresia");
                registros[7] = rs.getString("ultimaEntrada");
                
                modelo.addRow(registros);
                
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar");  
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    }
  
    public DefaultTableModel mostrarClientesDia(String fecha) {
        
        String[] nombresColumnas = {"Num. Socio", "Nombre", "Apellidos", "Fecha de Vencimiento", "Ultima Entrada"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT * FROM socios WHERE fechaMembresia >= ?";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx                     
            ps.setString(1, fecha);
            
            rs = ps.executeQuery();
          

            while (rs.next()) {
                registros[0] = rs.getString("numeroSocio");
                registros[1] = rs.getString("nombre");
                registros[2] = " " + rs.getString("apellidoP") + "  " + rs.getString("apellidoM");
                registros[3] = rs.getString("fechaMembresia");
                registros[4] = rs.getString("ultimaEntrada");
                

                modelo.addRow(registros);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar");
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
    
    public DefaultTableModel mostrarClientesVencidos(String fecha) {
        String[] nombresColumnas = {"Num. Socio", "Nombre", "Primer Apellido", "Segundo Apellido", "Vencha de Vencimiento"};
        String[] registros = new String[5];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT * FROM socios WHERE fechaMembresia < ?";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx                     
            ps.setString(1, fecha);
            
            rs = ps.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("numeroSocio");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("apellidoP");
                registros[3] = rs.getString("apellidoM");
                registros[4] = rs.getString("fechaMembresia");

                modelo.addRow(registros);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar");
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
    
    public boolean registrarEntrada(String numeroSocio, User usr, String fechaHora) {

        PreparedStatement ps = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "UPDATE socios SET ultimaEntrada=? WHERE numeroSocio=?";
        try {
            ps = (PreparedStatement) con.prepareStatement(sql); ///(PreparedStatement) xxxxx
            ps.setString(1, fechaHora);
            ps.setString(2, numeroSocio);

            ps.execute();

            return true;
            //return registrar(scio, usr);

        } catch (SQLException ex) {
            Logger.getLogger(Sqlusuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean renovarMembresia(String numeroSocio, String membresia, String fechaMembresia) {

        PreparedStatement ps = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "UPDATE socios SET tipoMembresia = ?, fechaMembresia=? WHERE numeroSocio=?";
        try {
            ps = (PreparedStatement) con.prepareStatement(sql); ///(PreparedStatement) xxxxx
            ps.setString(1, membresia);
            ps.setString(2, fechaMembresia);
            ps.setString(3, numeroSocio);

            ps.execute();

            return true;
            //return registrar(scio, usr);

        } catch (SQLException ex) {
            Logger.getLogger(Sqlusuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean editSocio(String numeroSocio, String nombre, String apellidoP, String apellidM) {

        PreparedStatement ps = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "UPDATE socios SET nombre = ?, apellidoP=?, apellidoM=? WHERE numeroSocio=?";
        try {
            ps = (PreparedStatement) con.prepareStatement(sql); ///(PreparedStatement) xxxxx
            ps.setString(1, nombre);
            ps.setString(2, apellidoP);
            ps.setString(3, apellidM);
            ps.setString(4, numeroSocio);

            ps.execute();

            return true;
            //return registrar(scio, usr);

        } catch (SQLException ex) {
            Logger.getLogger(Sqlusuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean registrarSocio(NewSocio scio, User usr) {

        PreparedStatement ps = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "INSERT INTO socios (numeroSocio, nombre, apellidoP, apellidoM, tipoMembresia, fechaInscripcion, fechaMembresia, ultimaEntrada) VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps = (PreparedStatement) con.prepareStatement(sql); ///(PreparedStatement) xxxxx
            ps.setString(1, scio.getNumeroSocio());
            ps.setString(2, scio.getNombre());
            ps.setString(3, scio.getApellidoP());
            ps.setString(4, scio.getApellidoM());
            ps.setString(5, scio.getTipoMembresia());
            ps.setString(6, scio.getFechaInscripcion());
            ps.setString(7, scio.getFechaMembrecias());
            ps.setString(8, scio.getUltimaEntrada());
            ps.execute();

            scio.setId(idSocio(scio.getNumeroSocio()));
            return true;
            //return registrar(scio, usr);

        } catch (SQLException ex) {
            Logger.getLogger(Sqlusuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean registrarVisita(String Nombre, String apellido1, String apellido2, String fecha) {

        PreparedStatement ps = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "INSERT INTO visita (nombre, apellidoP, apellidoM, fecha) VALUES (?,?,?,?)";
        try {
            ps = (PreparedStatement) con.prepareStatement(sql); ///(PreparedStatement) xxxxx
            ps.setString(1, Nombre);
            ps.setString(2, apellido1);
            ps.setString(3, apellido2);
            ps.setString(4, fecha);

            ps.execute();

            return true;
            //return registrar(scio, usr);

        } catch (SQLException ex) {
            Logger.getLogger(Sqlusuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    private int idSocio(String num){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT id_socio FROM socios WHERE numeroSocio = ?";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx
            ps.setString(1, num);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    public int existeSocio(NewSocio scio) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT count(id_socio) FROM socios WHERE nombre = ? AND apellidoP = ? AND apellidoM = ?";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx
            ps.setString(1, scio.getNombre());
            ps.setString(2, scio.getApellidoP());
            ps.setString(3, scio.getApellidoM());

            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public boolean eliminar(String numeroSocio, User usr) {

        PreparedStatement ps = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "DELETE FROM socios WHERE numeroSocio=?";
        try {
            ps = (PreparedStatement) con.prepareStatement(sql); ///(PreparedStatement) xxxxx
            ps.setString(1, numeroSocio);

            ps.execute();

            return true;
            //return registrar(scio, usr);

        } catch (SQLException ex) {
            Logger.getLogger(Sqlusuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
