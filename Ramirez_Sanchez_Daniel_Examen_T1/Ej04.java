package com.company;

import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double anchura, altura, superficie, precioBase, precioTotal;
        String respuesta;
        double envios=3.25;
        double precioEscudo;
        boolean bordado= false;


        System.out.println("Introduce la altura de la bandera en cm:");
        altura=sc.nextDouble();
        System.out.println("Introduce la anchura de la bandera en cm:");
        anchura=sc.nextDouble();
        sc.nextLine();
        System.out.println("¿Quiere escudo bordado? (s/n)");
        respuesta=sc.nextLine();

        superficie=altura*anchura;
        precioBase=superficie*0.10;

        if (respuesta.equals("s")){
            bordado=true;
            precioEscudo=2.50;
        }else {
            precioEscudo=0;
        }

        precioTotal=precioBase+precioEscudo+envios;

        System.out.println("Gracias. aquí tiene el desglose de su compra");
        System.out.println("bandera de "+superficie+" cm2: "+precioBase+"€");
        if (bordado){
            System.out.println("con escudo: "+precioEscudo+"€");
        }else {
            System.out.println("sin escudo: "+precioEscudo+"€");
        }
        System.out.println("gastos de envios: "+envios+"€");
        System.out.println("TOTAL: "+precioTotal+"€");

    }
}
