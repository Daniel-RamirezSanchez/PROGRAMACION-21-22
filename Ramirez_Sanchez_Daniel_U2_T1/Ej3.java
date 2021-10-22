package com.company;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPersonas;
        double descuento=0;
        String dia;
        String respuestaTarjeta;
        boolean tarjeta=false;
        double precioBase;
        double precioPareja=11;
        double precioFinal;

        System.out.println("introduce el nunmero de personas:");
        numPersonas= sc.nextInt();
        sc.nextLine();
        System.out.println("introdcue el dia de la semana:");
        dia = sc.nextLine();
        sc.nextLine();
        System.out.println("Tiene tarjeta CineCamp? si/no");
        respuestaTarjeta = sc.nextLine();
        sc.nextLine();



        if (dia.equals("miercoles")){
            precioBase=5.0*numPersonas;
        }else if (dia.equals("jueves")){
            precioBase=(numPersonas/2*precioPareja)+(numPersonas%2*8);
        }else {
            precioBase=8.0*numPersonas;
        }

        tarjeta = respuestaTarjeta.equals("si");

        if (tarjeta){
            descuento=0.1;
        } else {
            descuento=0;
        }

        precioFinal=precioBase-(descuento*precioBase);

        System.out.println("el precio base es "+precioBase);
        System.out.println("el descuento es: "+descuento*precioBase);
        System.out.println("el precio total es: "+precioFinal);



    }
}
