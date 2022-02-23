package com.company.entregableherencia2122;

import java.util.Calendar;

public class EquipamientoServicio extends Propiedad{
    private TipoServicio tipo;

    public EquipamientoServicio(int year, String direccion, Double superficie,TipoServicio tipo) {
        super(year, direccion, superficie);
        this.tipo=tipo;
    }

    public TipoServicio getTipo() {
        return tipo;
    }

    public void setTipo(TipoServicio tipo) {
        this.tipo = tipo;
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println("Propiedad:"+this.getClass()+"fecha:"+ Calendar.getInstance().getTime());

    }

    @Override
    public String toString() {
        return super.toString() +
                "tipo=" + tipo +"\n";
    }
}
