package com.company.entregableherencia2122;

import java.util.Objects;

public abstract class Propiedad {
    private int year;
    private String direccion;
    private Double superficie;

    public Propiedad(int year, String direccion, Double superficie) {
        this.year = year;
        this.direccion = direccion;
        this.superficie = superficie;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propiedad propiedad = (Propiedad) o;
        return direccion.equals(propiedad.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion);
    }

    public abstract void mostrarPropiedad();

    @Override
    public String toString() {
        return "Propiedad: " +
                "year=" + year +
                ", direccion='" + direccion + '\'' +
                ", superficie=" + superficie +
                "\n";
    }
}

