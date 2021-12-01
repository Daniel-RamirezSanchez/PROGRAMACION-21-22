package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura=0;
        int[][] matriz;
        int[] diagonal= new int[0];
        int maximo=18;
        int minimo=65;

        System.out.println("Introduce el tamaño de la matriz");
        altura= sc.nextInt();

        matriz= new int[altura][altura];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
               matriz[i][j]=(int)(Math.random()*47+18);
                if (i==j){
                    diagonal= Arrays.copyOf(diagonal,diagonal.length+1);
                    diagonal[diagonal.length-1]=matriz[i][j];
                }
            }
            System.out.println(Arrays.toString(matriz[i]));



        }
        System.out.println("la diagonal es:");
        System.out.println(Arrays.toString(diagonal));

        for (int i = 0; i < diagonal.length; i++) {
            if (maximo<diagonal[i]){
                maximo=diagonal[i];

            }
        }
        System.out.println("el mayor es:"+maximo);

        for (int i = 0; i < diagonal.length; i++) {
            if (minimo>diagonal[i]){
                minimo=diagonal[i];

            }
        }
        System.out.println("el menor es:"+minimo);

        double suma=0;
        for (int i = 0; i < diagonal.length; i++) {
            suma+=diagonal[i];
        }
        System.out.println("La media es: "+suma/10);

    }
}
