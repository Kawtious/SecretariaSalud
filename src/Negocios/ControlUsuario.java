/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocios;

import entidades.Usuario;
import java.util.ArrayList;
import java.util.UUID;
import persistencia.FachadaDatos;
import persistencia.IDatos;

public class ControlUsuario {

    private final IDatos datos = new FachadaDatos();

    public void saveUsuario(Usuario usuario) {
        datos.saveUsuario(usuario);
    }

    public Usuario getUsuario(UUID id) {
        return datos.getUsuario(id);
    }

    public void updateUsuario(UUID id, Usuario usuario) {
        datos.updateUsuario(id, usuario);
    }

    public void removeUsuario(Usuario usuario) {
        datos.removeUsuario(usuario);
    }

    public ArrayList<Usuario> getUsuarios() {
        return datos.getUsuarios();
    }

}
