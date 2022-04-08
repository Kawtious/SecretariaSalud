/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.UUID;

public class Trabajador extends Usuario {

    public Trabajador(UUID id, String nombre, String correo, String contrasena, int edad, Tutor tutor) {
        super(id, nombre, correo, contrasena, edad, tutor);
    }

    public Trabajador(String nombre, String correo, String contrasena, int edad, Tutor tutor) {
        super(nombre, correo, contrasena, edad, tutor);
    }

    public Trabajador(UUID id, String nombre, String correo, String contrasena, int edad) {
        super(id, nombre, correo, contrasena, edad);
    }

    public Trabajador(String nombre, String correo, String contrasena, int edad) {
        super(nombre, correo, contrasena, edad);
    }

}
