package com.company.entregableherencia2122;

public class Main {
    public static void main(String[] args) {

        Persona persona1= new Persona("3993939X","Maria","Lopez");
        Persona persona2= new Persona("3995585V","Rosa","Perez");
        Persona persona3= new Persona("5050594B","Lucia","Sanchez");
        Persona persona4= new Persona("1018373M","Marcos","Martin");
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println(persona4);

        Persona[] personas=new Persona[0];


        EquipamientoServicio eqs1=new EquipamientoServicio(2003,"Maria Auxiliadora 23",200.40,TipoServicio.SANITARIO);
        System.out.println(eqs1);

        LocalComercial lc1 = new LocalComercial(1994,"Calle Larga 87",100.00,persona4,300000.00,"Bar-Resaturante");
        System.out.println(lc1);

        LocalIndustrial li1=new LocalIndustrial(1999,"Poligono el Manchon 14",450.30,persona3,120000.50, 50.50);
        System.out.println(li1);

        Vivienda v1=new Vivienda(2020,"Pablo Picasso 34", 120.5,3,5,2,200000.00,personas);
        Vivienda v2=new Vivienda(2020,"Pablo Picasso 34", 120.5,3,4,2,200000.00,personas);
        Vivienda v3=new Vivienda(2020,"Pablo Picasso 34", 120.5,3,9,2,200000.00,personas);
        System.out.println(v1);

        v1.addPersona(persona1);
        v1.addPersona(persona2);
        System.out.println(v1);

        v1.deletePersona(persona1);
        System.out.println(v1);

        v1.mostrarPrecioVenta(v1);

        lc1.mostrarPropiedad();
        li1.mostrarPropiedad();

        Propiedad[] propiedades=new Propiedad[0];


        Registro registro=new Registro(propiedades);
        registro.addPropiedad(eqs1);
        registro.addPropiedad(lc1);
        registro.addPropiedad(li1);
        registro.addPropiedad(v1);

        System.out.println(registro);

        registro.deletePropiedad(lc1);
        System.out.println(registro);




    }
}
