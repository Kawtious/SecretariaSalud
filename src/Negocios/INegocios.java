/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocios;

import entidades.Expediente;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.UUID;

public interface INegocios {

    public Usuario getUsuario(UUID id);

    public void saveUsuario(Usuario usuario);

    public void updateUsuario(UUID id, Usuario usuario);

    public void removeUsuario(Usuario usuario);

    public ArrayList<Usuario> getUsuarios();

    //-----------------------------------------------------------------------
    public Expediente getExpediente(UUID id);

    public void saveExpediente(Expediente expediente);

    public void updateExpediente(UUID id, Expediente expediente);

    public void removeExpediente(Expediente expediente);

    public ArrayList<Expediente> getExpedientes();

    //-----------------------------------------------------------------------
}
