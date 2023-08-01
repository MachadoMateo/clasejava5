package org.example.validaciones;

import org.example.utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {
    private Util util = new Util();

    //metodos ordinarios
    public Boolean validarNombre(String nombres) throws Exception {

        if(!util.buscarCoincidencia(nombres,"^[a-zA-Z]+$")){
            throw new Exception("Revise el formato del nombre");
        }
        if(nombres.length()<10){
            throw new Exception("Numero de caracteres debe ser mayor a 10");

        }
        return true;
    }

    public Boolean validarUbicacion(Integer ubicacion) {

        return true;
    }

    public Boolean validarCorreo(String correoelectronico) throws Exception {

        String expresionRegular = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$\"";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(correoelectronico);
        if (coincidencia.matches()) {
            return true;
        } else {
            throw new Exception("Usuario el nombre solo puede contener numeros");
        }
    }
}
