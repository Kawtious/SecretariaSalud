/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.archivos;

public class Radiografia extends Archivo {

    private byte[] image;

    public Radiografia(byte[] image, String title) {
        super(title);
        this.image = image;
    }

    public Radiografia(byte[] image, String title, String description) {
        super(title, description);
        this.image = image;
    }

    public Radiografia(byte[] image, String title, String brief, String description) {
        super(title, brief, description);
        this.image = image;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

}
