/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.archivos;

import java.util.Objects;

public class Archivo {

    private String title;
    private String brief;
    private String description;

    public Archivo(String title) {
        this.title = title;
    }

    public Archivo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Archivo(String title, String brief, String description) {
        this.title = title;
        this.brief = brief;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.title);
        hash = 47 * hash + Objects.hashCode(this.brief);
        hash = 47 * hash + Objects.hashCode(this.description);
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
        final Archivo other = (Archivo) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.brief, other.brief)) {
            return false;
        }
        return Objects.equals(this.description, other.description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Archivo{");
        sb.append("title=").append(title);
        sb.append(", brief=").append(brief);
        sb.append(", description=").append(description);
        sb.append('}');
        return sb.toString();
    }

}
