/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocios;

public class Fabrica {

    /**
     * Atributo instancia
     */
    private FachadaRN instancia;

    /**
     * Obtiene la instancia existente. Si no existe una entonces se crea una nueva
     *
     * @return Regresa la instancia actual si es que existe, o la instancia nueva si es que no existia una instancia previa
     */
    public INegocios getInstance() {
        if (instancia == null) {
            instancia = new FachadaRN();
        }

        return instancia;
    }
}
