package modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.NewUser;
import modelo.User;


public class Sqlusuarios extends Conexion {
    
    public boolean registrar(NewUser usr){
        
        PreparedStatement ps = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx
        
        String sql = "INSERT INTO usuarios (usuario, password, nombre, apellidos, id_tipo) VALUES (?,?,?,?)";
        try {
            ps = (PreparedStatement) con.prepareStatement(sql); ///(PreparedStatement) xxxxx
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getApellidos());
            ps.setInt(5, usr.getId_tipo());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Sqlusuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean login(User usr) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx
		
        String sql = "SELECT u.id_usuario, u.usuario, u.password, u.nombre, u.id_tipo, t.nombre FROM usuarios AS u INNER JOIN tipo_usuario AS t ON u.id_tipo=t.id WHERE usuario = ?";
		
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();
			
            if (rs.next()){
                
                if(usr.getPassword().equals(rs.getString(3))){
                    
                    /*Actualisa la ultima sesion iniciada (las_session)*/
                    String sqlUpdate = "UPDATE usuarios SET last_session = ? WHERE id_usuario=?";
                    ps = (PreparedStatement) con.prepareStatement(sqlUpdate);
                    ps.setString(1, usr.getLast_session());
                    ps.setInt(2, rs.getInt(1));
                    ps.execute();
                    
                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    usr.setId_tipo(rs.getInt(5));
                    usr.setNombre_tipo(rs.getString(6));
                    
                    return true;
                }else{
                    return false;
                }
            }
			
            return false;
			
	} catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
	} finally {
            try {
                con.close();
	} catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
			}
		}
    }
    
    public int existeUsuario(String usuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx
		
        String sql = "SELECT count(id_usuario) FROM usuarios WHERE usuario = ?";
		
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx
            ps.setString(1, usuario);
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
    
    /*Validacion si es un formato de correro electronico*//*Resive el correo, regresa un boliano*/
    public boolean esEmail(String correo) {

            // Patrón para validar el email
            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

            Matcher mather = pattern.matcher(correo);

            return mather.find();		
    }
    
        public DefaultTableModel mostrarUsuarios(){
        String []  nombresColumnas = {"Id","Usuario","Nombre", "Apellidos", "Ultima sesion", "Tipo de usuario"};
        String [] registros = new String[6];
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) Conectar(); ///(Conection) xxxxxx

        String sql = "SELECT * FROM usuarios";
        
        try
        {
            ps = (PreparedStatement) con.prepareStatement(sql);///(PreparedStatement) xxxxx                     
            
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("id_usuario");
                registros[1] = rs.getString("usuario");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("apellidos");
                registros[4] = rs.getString("last_session");
                
                switch(rs.getString("id_tipo")){
                        case "1":
                            registros[5] = "Administrador";
                        break;
                        case "2":
                            registros[5] = "Encargado";
                        break;
                }

                
                modelo.addRow(registros);
                
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar");  
            System.out.println("Error: " + e.toString());
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
    
   
}
