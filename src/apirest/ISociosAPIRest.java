/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apirest;

import entidades.Trabajador;
import java.util.List;

@FunctionalInterface
public interface ISociosAPIRest {

    public List<Trabajador> obtenerSocios();
}
