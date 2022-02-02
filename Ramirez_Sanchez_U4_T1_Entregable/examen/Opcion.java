package com.company.examen;

public class Opcion {
    private String texto;
    private boolean respuesta;

    public Opcion(String texto, boolean respuesta) {
        this.texto = texto;
        this.respuesta = respuesta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Opcion{" +
                "texto='" + texto + '\'' +
                ", respuesta=" + respuesta +
                '}';
    }
}
