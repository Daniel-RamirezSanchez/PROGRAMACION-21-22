package com.company.entregableherencia2122;

import com.company.pizzeria.Ingrediente;

import java.util.Arrays;

public class Registro {
    private Propiedad[] propiedades;
    private static int numpropiedad=0;

    public Registro(Propiedad[] propiedades) {
        this.propiedades = new Propiedad[0];
        numpropiedad++;
    }

    public Propiedad[] getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(Propiedad[] propiedades) {
        this.propiedades = propiedades;
    }

    public static int getNumpropiedad() {
        return numpropiedad;
    }

    public static void setNumpropiedad(int numpropiedad) {
        Registro.numpropiedad = numpropiedad;
    }

    public void numPropiedad(){
        System.out.println(Registro.getNumpropiedad());
    }

    public void addPropiedad(Propiedad propiedad){
        Propiedad[] resultado=Arrays.copyOf(propiedades, propiedades.length+1);
        resultado[resultado.length-1]=propiedad;
        propiedades=resultado;
    }

    public boolean estaPropiedad(Propiedad propiedad){
        for (Propiedad p:this.propiedades) {
            if (p.getDireccion()==(propiedad.getDireccion())){
                return true;
            }

        }
        return false;
    }

    public boolean deletePropiedad(Propiedad propiedad){
        if (estaPropiedad(propiedad)){
            Propiedad[] resultado= new Propiedad[0];
            for (Propiedad p:propiedades) {
                if (!p.equals(propiedad)){
                    resultado= Arrays.copyOf(resultado,resultado.length+1);
                    resultado[resultado.length-1]=p;
                }

            }
            propiedades=resultado;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Registro: " +
                "propiedades=" + Arrays.toString(propiedades) +
                "\n";
    }
}
