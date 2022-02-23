package com.company.entregableherencia2122;

import java.util.Calendar;

public class LocalComercial extends Local implements MostraPrecio{
    private String actividadcomercial;

    public LocalComercial(int year, String direccion, Double superficie, Persona propietario, Double precio, String actividadcomercial) {
        super(year, direccion, superficie, propietario, precio);
        this.actividadcomercial=actividadcomercial;
    }

    public String getActividadcomercial() {
        return actividadcomercial;
    }

    public void setActividadcomercial(String actividadcomercial) {
        this.actividadcomercial = actividadcomercial;
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println("Propiedad:"+this.getClass()+"fecha:"+ Calendar.getInstance().getTime());

    }

    @Override
    public void mostrarPrecioVenta(Propiedad p) {
        System.out.println("Soy un LocalComercial que me dedico a: "+getActividadcomercial()+" y valgo: "+getPrecio());
    }

    @Override
    public String toString() {
        return super.toString() +
                "actividadcomercial='" + actividadcomercial + '\'' +
                "\n";
    }
}
