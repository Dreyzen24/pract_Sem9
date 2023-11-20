package com.example.appfragmentrecycle;

public class Android {

    private int id;
    private int imagen;
    private String nombre;
    private String version;

    public Android(int id, int imagen, String nombre, String version) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
