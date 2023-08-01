package org.example.modelos;

public class Herramienta {
    private String nombre;
    private Integer daño;

    public Herramienta() {
    }

    public Herramienta(String nombre, Integer daño) {
        this.nombre = nombre;
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Herramienta{" +
                "nombre='" + nombre + '\'' +
                ", daño=" + daño +
                '}';
    }
}
