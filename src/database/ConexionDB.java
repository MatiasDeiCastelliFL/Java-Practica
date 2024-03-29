
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionDB {
    public Connection conexion;
    private Config CONFIG;
    public static ConexionDB instancia;

    private  ConexionDB(){
        this.CONFIG = new Config();
        this.conexion = null;
    }

    public Connection conectar(){
        try {
            
            Class.forName(CONFIG.getDrive());
            this.conexion= DriverManager.getConnection(CONFIG.getHost(),CONFIG.getUser(),CONFIG.getPass());
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return this.conexion;
    }
    
    public void desconectar(){
        try {
            this.conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public synchronized static ConexionDB getInstancia(){
        if(instancia == null){
            instancia= new ConexionDB();
        }
        return instancia;
    }
  
}
