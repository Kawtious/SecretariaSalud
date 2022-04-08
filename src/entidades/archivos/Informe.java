/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.archivos;

public class Informe extends Archivo {
    
    private String contenido;

    public Informe(String contenido, String title) {
        super(title);
        this.contenido = contenido;
    }

    public Informe(String contenido, String title, String description) {
        super(title, description);
        this.contenido = contenido;
    }

    public Informe(String contenido, String title, String brief, String description) {
        super(title, brief, description);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

}
