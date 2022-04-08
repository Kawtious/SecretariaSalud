/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apirest;

import entidades.Trabajador;
import java.util.ArrayList;
import java.util.List;

public class SociosDummyAPIRest implements ISociosAPIRest {

    private List<Trabajador> socios;

    public SociosDummyAPIRest() {
        this.socios = new ArrayList<>();
//        this.socios.add(new Trabajador(UUID.randomUUID(), "John", "ASD1515654"));
//        this.socios.add(new Trabajador(UUID.randomUUID(), "Steve", "STE848745"));
//        this.socios.add(new Trabajador(UUID.randomUUID(), "Bruce", "BRE541205"));
    }

    @Override
    public List<Trabajador> obtenerSocios() {
        return this.socios;
    }
}
