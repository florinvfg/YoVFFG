package com.spring.spring;
import org.springframework.stereotype.Component;


public class Documento implements GestionDocumentos  {
    @Override
    public String getDocumento() {
        return "Presentación del Documenbto";
    }/* este getDocumento y su contenido será la característica común de todos los demás objetos.*/

}