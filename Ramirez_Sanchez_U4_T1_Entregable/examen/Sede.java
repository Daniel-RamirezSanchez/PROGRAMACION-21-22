package com.company.examen;

import java.util.Arrays;

public class Sede {
    private String codigo;
    private Ciudades ciudad;
    private Opositor[] opositores;

    public Sede(String codigo, Ciudades ciudad, Opositor[] opositores) {
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.opositores = new Opositor[0];
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Ciudades getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudades ciudad) {
        this.ciudad = ciudad;
    }


    public Opositor[] getOpositores() {
        return opositores;
    }

    public void setOpositores(Opositor[] opositores) {
        this.opositores = opositores;
    }

    public boolean addOpositor(Opositor opo){
            Opositor[] resultado=Arrays.copyOf(opositores,opositores.length+1);
            resultado[resultado.length-1]=opo;
            opositores=resultado;
            return true;
    }

    public boolean deleteOpositor(Opositor opo){
        Opositor[] resultado=new Opositor[0];
        for (int i = 0; i < opositores.length; i++) {
            if (opositores[i]!=opo) {
                resultado=Arrays.copyOf(opositores,opositores.length);
                resultado[resultado.length-1]=opositores[i];


            }
            opositores=resultado;
            return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return "Sede{" +
                "codigo='" + codigo + '\'' +
                ", ciudad=" + ciudad +
                ", opositores=" + Arrays.toString(opositores) +
                '}';
    }
}
