package org.example.validaciones;

import java.time.LocalDate;

public class OfertaValidacion {
    public Boolean validarTitulo(String titulo){
        return true;
    }
    public Boolean validarFechaIniFin(LocalDate fechaIni, LocalDate fechaFin){
        return true;
    }
    public Boolean validarFormatoFecha(String formatofecha){
        return true;
    }
    public Boolean validarCosto(double costopersona){
        return true;
    }
}
