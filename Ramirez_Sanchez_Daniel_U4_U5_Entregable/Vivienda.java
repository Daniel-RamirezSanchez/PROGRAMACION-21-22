package com.company.entregableherencia2122;

import java.util.Arrays;
import java.util.Calendar;

public class Vivienda extends Propiedad implements MostraPrecio, Comparable<Vivienda>{
    private int banios;
    private int habitaciones;
    private int capacidad;
    private double precio;
    private Persona[] personas;


    public Vivienda(int year, String direccion, Double superficie, int banios, int habitaciones, int capacidad, double precio, Persona[] personas) {
        super(year, direccion, superficie);
        this.banios = banios;
        this.habitaciones=habitaciones;
        this.capacidad=capacidad;
        this.precio=precio;
        this.personas= new Persona[0];
    }


    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public boolean estaPersona(Persona persona){
        for (Persona p:this.personas) {
            if (p.getId()==(persona.getId())){
                return true;
            }

        }
        return false;
    }

    public boolean addPersona(Persona persona){
        if (!estaPersona(persona) || personas.length<capacidad){
            this.personas=Arrays.copyOf(personas,personas.length+1);
            this.personas[this.personas.length-1]=persona;

        }
        return false;
    }

    public boolean deletePersona(Persona persona){
        if (estaPersona(persona)){
            Persona[] resultado= new Persona[0];
            for (Persona p:personas) {
                if (!p.equals(persona)){
                    resultado= Arrays.copyOf(resultado,resultado.length+1);
                    resultado[resultado.length-1]=p;
                }

            }
            personas=resultado;
            return true;
        }
        return false;
    }


    @Override
    public void mostrarPropiedad() {
        System.out.println("Propiedad:"+this.getClass()+"fecha:"+ Calendar.getInstance().getTime());

    }


    @Override
    public void mostrarPrecioVenta(Propiedad p) {
        System.out.println("Soy una Vivienda con capacidad máxima"+getCapacidad()+" y valgo: "+getPrecio());
    }


    @Override
    public int compareTo(Vivienda v) {
        return this.getHabitaciones()-v.getHabitaciones();

    }

    @Override
    public String toString() {
        return "Vivienda: " +
                "baños=" + banios +
                ", habitaciones=" + habitaciones +
                ", capacidad=" + capacidad +
                ", precio=" + precio +
                ", personas=" + Arrays.toString(personas) +
                "\n";
    }
}
