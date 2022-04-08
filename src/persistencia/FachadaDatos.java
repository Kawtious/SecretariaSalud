/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Exceptions.DAOException;
import entidades.Expediente;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.UUID;

public class FachadaDatos implements IDatos {

    private final RepUsuario repoUsuario = new RepUsuario();

    @Override
    public Usuario getUsuario(UUID id) {
        try {
            return repoUsuario.get(id);
        } catch (DAOException ex) {
            System.err.println(ex.getMessage());
        }

        return null;
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        try {
            repoUsuario.save(usuario);
        } catch (DAOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void updateUsuario(UUID id, Usuario usuario) {
        try {
            repoUsuario.update(usuario);
        } catch (DAOException ex) {
            System.err.println(ex.getMessage());
            System.out.println("Sucedio algo raro");
        }
    }

    @Override
    public void removeUsuario(Usuario usuario) {
        try {
            repoUsuario.remove(usuario);
        } catch (DAOException ex) {
            System.err.println(ex.getMessage());
            System.out.println("Sucedio algo raro");
        }
    }

    @Override
    public ArrayList<Usuario> getUsuarios() {
        try {
            return repoUsuario.retrieveAll();
        } catch (DAOException ex) {
            System.err.println(ex.getMessage());
            System.out.println("Sucedio algo raro");
        }
        return null;
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
