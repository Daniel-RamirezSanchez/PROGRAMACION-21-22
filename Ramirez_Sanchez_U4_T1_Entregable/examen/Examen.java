package com.company.examen;

import com.company.pizzeria.Ingrediente;
import com.company.pizzeria.Pizza;

import java.util.Arrays;
import java.util.Calendar;

public class Examen {
    private Calendar fecha;
    private String consejeria;
    private String url;
    private Sede[] sedes;
    private Pregunta[] preguntas;
    private static final Integer PREGUNTA_MAXIMA=100;


    public Examen( String consejeria, String url, Sede[] sedes, Pregunta[] preguntas) {
        this.fecha = Calendar.getInstance();
        this.consejeria = consejeria;
        this.url = url;
        this.sedes = new Sede[0];
        this.preguntas = new Pregunta[0];
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getConsejeria() {
        return consejeria;
    }

    public void setConsejeria(String consejeria) {
        this.consejeria = consejeria;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Sede[] getSedes() {
        return sedes;
    }

    public void setSedes(Sede[] sedes) {
        this.sedes = sedes;
    }

    public Pregunta[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Pregunta[] preguntas) {
        this.preguntas = preguntas;
    }

    public boolean addPregunta(Pregunta pregunta){
        if (preguntas.length< PREGUNTA_MAXIMA){
            Pregunta[] resultado=Arrays.copyOf(preguntas, preguntas.length+1);
            resultado[resultado.length-1]=pregunta;
            preguntas=resultado;
            return true;
        }
        return false;
    }

    public boolean addSede(Sede sede){
        Sede[] resultado=Arrays.copyOf(sedes,sedes.length+1);
        resultado[resultado.length-1]=sede;
        sedes=resultado;
        return true;
    }

    public boolean deleteSede(Sede sede){
        Sede[] resultado=new Sede[0];
        for (int i = 0; i <sedes.length; i++) {
            if (sedes[i]!=sede) {
                resultado= Arrays.copyOf(sedes,sedes.length+1);
            }
            sedes=resultado;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "fecha=" + fecha +
                ", consejeria='" + consejeria + '\'' +
                ", url='" + url + '\'' +
                ", sedes=" + Arrays.toString(sedes) +
                ", preguntas=" + Arrays.toString(preguntas) +
                '}';
    }
}
