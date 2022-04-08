/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.UUID;

public class Tutor extends Usuario {

    public Tutor(UUID id, String nombre, String correo, String contrasena, int edad, Tutor tutor) {
        super(id, nombre, correo, contrasena, edad, tutor);
    }

    public Tutor(String nombre, String correo, String contrasena, int edad, Tutor tutor) {
        super(nombre, correo, contrasena, edad, tutor);
    }

    public Tutor(UUID id, String nombre, String correo, String contrasena, int edad) {
        super(id, nombre, correo, contrasena, edad);
    }

    public Tutor(String nombre, String correo, String contrasena, int edad) {
        super(nombre, correo, contrasena, edad);
    }

}
