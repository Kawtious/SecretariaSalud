/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocios;

import entidades.Expediente;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.UUID;

public class FachadaRN implements INegocios {

    private final ControlUsuario controlUsuario = new ControlUsuario();

    //-----------------------------------------------------------------------
    @Override
    public Usuario getUsuario(UUID id) {
        return controlUsuario.getUsuario(id);
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        controlUsuario.saveUsuario(usuario);
    }

    @Override
    public void updateUsuario(UUID id, Usuario usuario) {
        controlUsuario.updateUsuario(id, usuario);
    }

    @Override
    public void removeUsuario(Usuario usuario) {
        controlUsuario.removeUsuario(usuario);
    }

    @Override
    public ArrayList<Usuario> getUsuarios() {
        return controlUsuario.getUsuarios();
    }

    //-----------------------------------------------------------------------
    @Override
    public Expediente getExpediente(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveExpediente(Expediente expediente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateExpediente(UUID id, Expediente expediente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeExpediente(Expediente expediente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Expediente> getExpedientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
