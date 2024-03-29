/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos.intereface;

import java.util.List;

/**
 *
 * @author UsuaRIO
 */
public interface CrudSimple<T> {
    public List<T> listar(String texto);
    public boolean insert(T obj);
    public boolean actualizar(T obj);
    public boolean desactivar(T obj);
    public boolean activar(int id);
    public int total();
    public boolean existe(String texto);
}
