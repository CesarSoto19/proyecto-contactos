
package Modelo;

import java.util.Date;

public class Persona {
    int id;
    String nom;
    String telp ;
    String telo;
    String cp;
    String co;
    String fecha;

    public Persona() {
    }

    public Persona(int id, String nom, String telp, String telo, String cp, String co, String fecha) {
        this.id = id;
        this.nom = nom;
        this.telp = telp;
        this.telo = telo;
        this.cp = cp;
        this.co = co;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getTelo() {
        return telo;
    }

    public void setTelo(String telo) {
        this.telo = telo;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    
}
