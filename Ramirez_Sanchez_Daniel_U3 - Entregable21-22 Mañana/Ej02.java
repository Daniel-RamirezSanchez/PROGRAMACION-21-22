package com.company;

import java.util.Arrays;

public class Ej02 {
    public static void main(String[] args) {
        int[] numero= new int[20];
        int[] cuadrado= new int[20];
        int[] cubo= new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i]= (int)(Math.random()*100+1);
            cuadrado[i]= numero[i]*numero[i];
            cubo[i]=cuadrado[i]*numero[i];
            System.out.print(Integer.toString(numero[i])+" ");
            System.out.print(Integer.toString(cuadrado[i])+" ");
            System.out.print(Integer.toString(cubo[i])+" ");
            System.out.println();
        }

    }
}
