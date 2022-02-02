package com.company.examen;

public class Main {
    public static void main(String[] args) {

        Opcion opcion1 = new Opcion("opcion 1",true);
        Opcion opcion2= new Opcion("opcion 2", false);
        Opcion opcion3= new Opcion("opcion 3", true);
        Opcion opcion4= new Opcion("opcion 4", false);
        Opcion opcion5= new Opcion("opcion 5", true);
        Opcion opcion6= new Opcion("opcion 6", false);


        System.out.println(opcion1);
        System.out.println(opcion2);
        System.out.println(opcion3);
        System.out.println(opcion4);
        System.out.println(opcion5);
        System.out.println(opcion6);


        Opcion[] opciones1=new Opcion[0];
        Opcion[] opciones2=new Opcion[0];



        Pregunta pregunta1 = new Pregunta("pregunta 1",opciones2);
        Pregunta pregunta2 = new Pregunta("pregunta 2", opciones1);

        System.out.println(pregunta1);
        System.out.println(pregunta2);

        pregunta1.addOpciones(opcion3);
        pregunta1.addOpciones(opcion2);
        pregunta1.addOpciones(opcion1);
        pregunta2.addOpciones(opcion6);
        pregunta2.addOpciones(opcion5);
        pregunta2.addOpciones(opcion4);

        System.out.println(pregunta1);
        System.out.println(pregunta2);




        Opositor opo1 = new Opositor("Pepe", "Lopez",1998,true,"silla de ruedas");
        Opositor opo2= new Opositor("Rosa","Marquez",1990,false,"");
        Opositor opo3= new Opositor("Ramon","Sanchez",1995,true,"daltonico");
        Opositor opo4= new Opositor("Pedro","Perez",2000,false,"");


        System.out.println(opo1);
        System.out.println(opo2);
        System.out.println(opo3);
        System.out.println(opo4);


        Opositor[] opositores1=new Opositor[0];
        Opositor[] opositores2=new Opositor[0];


        Sede sede1 = new Sede("23232",Ciudades.CADIZ,opositores1);
        Sede sede2 = new Sede("67676",Ciudades.SEVILLA,opositores2);

        sede1.addOpositor(opo1);
        sede1.addOpositor(opo2);
        sede2.addOpositor(opo3);
        sede2.addOpositor(opo4);


        System.out.println(sede1);
        System.out.println(sede2);

        sede1.deleteOpositor(opo1);
        sede2.deleteOpositor(opo4);

        System.out.println(sede1);
        System.out.println(sede2);

        Sede[] sedes=new Sede[0];
        Pregunta[] preguntas = new Pregunta[0];

        Examen ex1 = new Examen("Educacion", "www.consejeriadeeducaion.com",sedes,preguntas);

        ex1.addPregunta(pregunta1);
        ex1.addPregunta(pregunta2);
        ex1.addSede(sede1);

        System.out.println(ex1);








    }
}
