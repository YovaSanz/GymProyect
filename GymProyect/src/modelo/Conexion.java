package modelo;


import java.sql.*;


public class Conexion {
    
    private String host = "localhost";
    private int port = 3306;
    private String db = "databasegym";
    
    //private String url = "jdbc:mysql://localhost:3306/gymanager";
    private String url = String.format("jdbc:mysql://%s:%d/%s?useSSL=false", host, port, db);
    private String user = "root";
    private String password = "";
    private Connection conector = null;
    
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conector = DriverManager.getConnection(url, user, password);        
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en la conexión a la base de datos1:"+ ex);
        }catch (SQLException ex) {
            System.out.println("Error en la conexión a la base de datos2:"+ ex);
        } catch (Exception ex) {
            System.out.println("Error en la conexión a la base de datos3:"+ ex);
        }
         return conector;
    }
    
    public void cerrar() throws SQLException {
        if (conector != null) {
            conector.close();
        }
    }
}
