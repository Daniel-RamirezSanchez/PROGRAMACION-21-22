package com.company.examen;

public class Opositor {
    private String nombre;
    private String apellidos;
    private Integer anio_nacimiento;
    private boolean adaptacion;
    private String descripcion;
    private static Integer NUM_OPOSITORES=0;
    private static Integer NUM_ADAPTACION=0;

    public Opositor(String nombre, String apellidos, Integer anio_nacimiento, boolean adaptacion,String descripcion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anio_nacimiento = anio_nacimiento;
        this.adaptacion = adaptacion;
        if(this.adaptacion){
            this.descripcion=descripcion;
        } else{
            this.descripcion="";
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getAnio_nacimiento() {
        return anio_nacimiento;
    }

    public void setAnio_nacimiento(Integer anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }

    public boolean isAdaptacion() {
        return adaptacion;
    }

    public void setAdaptacion(boolean adaptacion) {
        this.adaptacion = adaptacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Opositor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", anio_nacimiento=" + anio_nacimiento +
                ", adaptacion=" + adaptacion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
