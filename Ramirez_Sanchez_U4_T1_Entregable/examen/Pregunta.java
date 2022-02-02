package com.company.examen;

import com.company.pizzeria.Ingrediente;
import com.company.pizzeria.Pizza;

import java.util.Arrays;

public class Pregunta {
    private String enunciado;
    private Opcion[] opciones;
    private static final Integer OPCIONES_MAXIMA=3;

    public Pregunta(String enunciado, Opcion[] opciones) {
        this.enunciado = enunciado;
        this.opciones = new Opcion[0];
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Opcion[] getOpciones() {
        return opciones;
    }

    public void setOpciones(Opcion[] opciones) {
        this.opciones = opciones;
    }

    public boolean addOpciones(Opcion opcion){
        if (opciones.length< Pregunta.OPCIONES_MAXIMA){
            Opcion[] resultado=Arrays.copyOf(opciones, opciones.length+1);
            resultado[resultado.length-1]=opcion;
            opciones=resultado;
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "enunciado='" + enunciado + '\'' +
                ", opciones=" + Arrays.toString(opciones) +
                '}';
    }
}
