/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import entidades.archivos.Informe;
import entidades.archivos.PDF;
import entidades.archivos.Radiografia;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public class Expediente {

    private UUID id;
    private Usuario owner;
    private String title;
    private String brief;
    private String content;
    private ArrayList<Radiografia> radiografia;
    private ArrayList<Informe> informes;
    private ArrayList<PDF> pdfs;

    public Expediente(Usuario owner, String title) {
        this.id = UUID.randomUUID();
        this.owner = owner;
        this.title = title;
    }

    public Expediente(Usuario owner, String title, String brief, String content, ArrayList<Radiografia> radiografia, ArrayList<Informe> informes, ArrayList<PDF> pdfs) {
        this.id = UUID.randomUUID();
        this.owner = owner;
        this.title = title;
        this.brief = brief;
        this.content = content;
        this.radiografia = radiografia;
        this.informes = informes;
        this.pdfs = pdfs;
    }

    public Expediente(UUID id, Usuario owner, String title, String brief, String content, ArrayList<Radiografia> radiografia, ArrayList<Informe> informes, ArrayList<PDF> pdfs) {
        this.id = id;
        this.owner = owner;
        this.title = title;
        this.brief = brief;
        this.content = content;
        this.radiografia = radiografia;
        this.informes = informes;
        this.pdfs = pdfs;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Usuario getOwner() {
        return owner;
    }

    public void setOwner(Usuario owner) {
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<Radiografia> getRadiografia() {
        return radiografia;
    }

    public void setRadiografia(ArrayList<Radiografia> radiografia) {
        this.radiografia = radiografia;
    }

    public ArrayList<Informe> getInformes() {
        return informes;
    }

    public void setInformes(ArrayList<Informe> informes) {
        this.informes = informes;
    }

    public ArrayList<PDF> getPdfs() {
        return pdfs;
    }

    public void setPdfs(ArrayList<PDF> pdfs) {
        this.pdfs = pdfs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
        hash = 31 * hash + Objects.hashCode(this.owner);
        hash = 31 * hash + Objects.hashCode(this.title);
        hash = 31 * hash + Objects.hashCode(this.brief);
        hash = 31 * hash + Objects.hashCode(this.content);
        hash = 31 * hash + Objects.hashCode(this.radiografia);
        hash = 31 * hash + Objects.hashCode(this.informes);
        hash = 31 * hash + Objects.hashCode(this.pdfs);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Expediente other = (Expediente) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.brief, other.brief)) {
            return false;
        }
        if (!Objects.equals(this.content, other.content)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.owner, other.owner)) {
            return false;
        }
        if (!Objects.equals(this.radiografia, other.radiografia)) {
            return false;
        }
        if (!Objects.equals(this.informes, other.informes)) {
            return false;
        }
        return Objects.equals(this.pdfs, other.pdfs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Expediente{");
        sb.append("id=").append(id);
        sb.append(", owner=").append(owner);
        sb.append(", title=").append(title);
        sb.append(", brief=").append(brief);
        sb.append(", content=").append(content);
        sb.append(", radiografia=").append(radiografia);
        sb.append(", informes=").append(informes);
        sb.append(", pdfs=").append(pdfs);
        sb.append('}');
        return sb.toString();
    }

}
