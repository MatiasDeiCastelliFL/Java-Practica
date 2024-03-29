
package Controllers;

import database.ConexionDB;
import datos.intereface.CrudSimple;
import entidades.Rol;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RolDato implements CrudSimple<Rol>{
    private final ConexionDB CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    public RolDato() {
        this.CON = ConexionDB.getInstancia();
    }
    
    @Override
    public List<Rol> listar(String texto) {
        List<Rol> registro = new ArrayList();
        
        try {
            ps= CON.conectar().prepareStatement("SELECT * FROM rol WHERE nombre LIKE ?");
            ps.setString(1,"%" + texto + "%");
            rs= ps.executeQuery();
            while(rs.next()){
                registro.add(new Rol(rs.getInt(1),rs.getString(2),rs.getBoolean(3)));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } finally{
            ps=null;
            rs=null;
            CON.desconectar();
        }
        return registro;
    }

    @Override
    public boolean insert(Rol obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(Rol obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean desactivar(Rol obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean activar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int total() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean existe(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
