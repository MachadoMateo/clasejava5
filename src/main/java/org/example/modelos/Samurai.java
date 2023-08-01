package org.example.modelos;

public class Samurai {

     private String nombre;
     private Integer cantidadPoder;
     Boolean esBueno;

    public Samurai() {
    }


    public Samurai(String nombre, Integer cantidadPoder, Boolean esBueno) {
        this.nombre = nombre;
        this.cantidadPoder = cantidadPoder;
        this.esBueno = esBueno;
    }

    @Override
    public String toString() {
        return "Samurai{" +
                "nombre='" + nombre + '\'' +
                ", cantidadPoder=" + cantidadPoder +
                ", esBueno=" + esBueno +
                '}';
    }
}
