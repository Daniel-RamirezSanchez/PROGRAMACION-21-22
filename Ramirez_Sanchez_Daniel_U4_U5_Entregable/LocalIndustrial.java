package com.company.entregableherencia2122;

import java.util.Calendar;

public class LocalIndustrial extends Local implements MostraPrecio{
    private Double consumo;

    public LocalIndustrial(int year, String direccion, Double superficie, Persona propietario, Double precio,Double consumo) {
        super(year, direccion, superficie, propietario, precio);
        this.consumo=consumo;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println("Propiedad:"+this.getClass()+"fecha:"+ Calendar.getInstance().getTime());


    }

    @Override
    public void mostrarPrecioVenta(Propiedad p) {
        System.out.println("Soy un LocalIndustrial con un consumo máximo de: "+getConsumo()+" y valgo: " +getPrecio());
    }

    @Override
    public String toString() {
        return super.toString() +
                "consumo=" + consumo +
                "\n";
    }

}
