package com.company;

import java.util.Arrays;

public class Ej04 {
    public static void main(String[] args) {

        int [][]matriz= {
                        {12, 23, 45, 56},
                        {11, 11, 99, 69},
                        {28, 75, 90, 10},
                        {21, 56, 32, 33},
        };

        for (int[] row:matriz) {
            System.out.println(Arrays.toString(row));
        }


        System.out.println(Arrays.deepToString(eliminarFilasPares(matriz)));
        System.out.println(Arrays.deepToString(eliminarFilasImpares(matriz)));


    }
    public static int[][] eliminarFilasPares(int[][] matriz){
        int[][] resultado=new int[matriz.length/2][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (esImpar(i)){
                    resultado=Arrays.copyOf(resultado,resultado.length);
                    resultado[i][j]=matriz[i][j];
                }
            }

        }

        return resultado;

    }
    public static int[][] eliminarFilasImpares(int[][] matriz){
        int[][] resultado=new int[matriz.length/2][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (esPar(i)){
                    resultado=Arrays.copyOf(resultado,resultado.length);
                    resultado[i][j]=matriz[i][j];
                }
            }

        }

        return resultado;

    }public static boolean esPar(int num){
        if (num%2==0){
            return true;
        }
        return false;

    }public static boolean esImpar(int num){
        if (num%2!=0){
            return true;
        }
        return false;
    }
}
