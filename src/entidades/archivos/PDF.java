/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.archivos;

public class PDF extends Archivo {

    private byte[] content;

    public PDF(byte[] image, String title) {
        super(title);
        this.content = image;
    }

    public PDF(byte[] image, String title, String description) {
        super(title, description);
        this.content = image;
    }

    public PDF(byte[] image, String title, String brief, String description) {
        super(title, brief, description);
        this.content = image;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
