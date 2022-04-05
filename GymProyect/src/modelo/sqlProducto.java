package modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.User;

public class sqlProducto extends Conexion {

    public int nuevaVenta(double total) {

        Date date = new Date();
        DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PreparedStatement ps = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        try {
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO ventas (total, fecha, dia) VALUES (?,?, CURDATE())", Statement.RETURN_GENERATED_KEYS); ///(PreparedStatement) xxxxx
            ps.setDouble(1, total);
            ps.setString(2, fechaHora.format(date));

            ps.executeUpdate();

            ResultSet resultado = ps.getGeneratedKeys();
            resultado.next();

            return resultado.getInt(1);

        } catch (SQLException ex) {
            Logger.getLogger(Sqlusuarios.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public void detalleVenta(int idVenta, int codigo, int cantidad) {

        String nombre;
        Double precio;

        PreparedStatement ps, psI, psU = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        try {
            ps = (PreparedStatement) con.prepareStatement("SELECT nombre, precio FROM producto WHERE idproducto=?"); ///(PreparedStatement) xxxxx
            ps.setDouble(1, codigo);

            rs = ps.executeQuery();

            while (rs.next()) {

                nombre = rs.getString("nombre");
                precio = rs.getDouble("precio");

                psI = (PreparedStatement) con.prepareStatement("INSERT INTO detalle_venta_producto (id_venta, id_producto, nombre, precio, cantidad) VALUES (?,?,?,?,?)");
                psI.setInt(1, idVenta);
                psI.setInt(2, codigo);
                psI.setString(3, nombre);
                psI.setDouble(4, precio);
                psI.setInt(5, cantidad);
                
                psI.executeUpdate();
                
                
                psU = (PreparedStatement) con.prepareStatement("UPDATE producto SET stock=(stock-?) WHERE idproducto=?");
                psU.setInt(1, cantidad);
                psU.setInt(2, codigo);
                
                psU.executeUpdate();

            }

        } catch (SQLException ex) {
            Logger.getLogger(Sqlusuarios.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
    }

    /*SQL PARA TABLA PRODCUTOS*/
    public DefaultTableModel mostrar() {
        String[] nombresColumnas = {"CODIGO", "NOMBRE", "PRECIO", "STOCK", "DESCRIPCION"};
        Object[] registros = new Object[5];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT * FROM producto";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx                     

            rs = ps.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getInt("idproducto");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getDouble("precio");
                registros[3] = rs.getInt("stock");
                registros[4] = rs.getString("descripcion");

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

    public DefaultTableModel buscar(String texto) {
        String[] nombresColumnas = {"CODIGO", "NOMBRE", "PRECIO", "STOCK", "DESCRIPCION"};
        Object[] registros = new Object[5];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT * FROM producto WHERE idproducto LIKE '%" + texto + "%' OR nombre LIKE '%" + texto + "%' OR descripcion LIKE '%" + texto + "%'";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx                     

            rs = ps.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getInt("idproducto");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getDouble("precio");
                registros[3] = rs.getInt("stock");
                registros[4] = rs.getString("descripcion");

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

    public Producto buscarProdcuto(Producto pdto, int codigo) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = null;

        try {

            con = (Connection) Conectar();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM producto WHERE idproducto = ?");
            ps.setInt(1, codigo);

            rs = ps.executeQuery();

            if (rs.next()) {

                pdto.setIdProducto(rs.getInt("idproducto"));
                pdto.setNombre(rs.getString("nombre"));
                pdto.setPrecio(rs.getDouble("precio"));
                pdto.setStock(rs.getInt("stock"));
                pdto.setDescripcion(rs.getString("descripcion"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el Producto");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
        return pdto;
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

    public boolean editar(Producto pdto, User usr) {

        PreparedStatement ps = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "UPDATE producto SET nombre = ?, precio=?, stock=?, descripcion=? WHERE idproducto=?";
        try {
            ps = (PreparedStatement) con.prepareStatement(sql); ///(PreparedStatement) xxxxx
            ps.setString(1, pdto.getNombre());
            ps.setDouble(2, pdto.getPrecio());
            ps.setInt(3, pdto.getStock());
            ps.setString(4, pdto.getDescripcion());
            ps.setInt(5, pdto.getIdProducto());

            ps.execute();

            return true;
            //return registrar(scio, usr);

        } catch (SQLException ex) {
            Logger.getLogger(Sqlusuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean nuevo(NewProducto newpdto, User usr) {

        PreparedStatement ps = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "INSERT INTO producto (nombre, precio, stock, descripcion) VALUES (?,?,?,?)";
        try {
            ps = (PreparedStatement) con.prepareStatement(sql); ///(PreparedStatement) xxxxx
            ps.setString(1, newpdto.getNombre());
            ps.setDouble(2, newpdto.getPrecio());
            ps.setInt(3, newpdto.getStock());
            ps.setString(4, newpdto.getDescripcion());

            ps.execute();

            return true;

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

    public int existe(NewProducto newpdto) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT count(idproducto) FROM producto WHERE nombre = ?";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx
            ps.setString(1, newpdto.getNombre());

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

    public int existeid(int codigo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT count(idproducto) FROM producto WHERE idproducto = ?";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx
            ps.setInt(1, codigo);

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

    public boolean eliminar(int id, User usr) {

        PreparedStatement ps = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "DELETE FROM producto WHERE idproducto=?";
        try {
            ps = (PreparedStatement) con.prepareStatement(sql); ///(PreparedStatement) xxxxx
            ps.setInt(1, id);

            ps.execute();

            return true;
            //return registrar(scio, usr);

        } catch (SQLException ex) {
            Logger.getLogger(Sqlusuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
