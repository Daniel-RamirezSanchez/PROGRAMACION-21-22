package com.company;

import java.util.Arrays;

public class Ej04 {
    public static void main(String[] args) {
        int[][]matriz= {
                {1,4,6,7,5}
                {2,5,9,3,4}
                {7,9,3,4,2}
        };

        System.out.println(Arrays.toString(desplazarMatriz(matriz,2)));

    }
    public static int[][]desplazarMatriz(int[][] matriz, int desplazacimiento){
        int[][] resultado=new int[matriz.length][matriz[0].length];

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                if (j+desplazacimiento>resultado[i].length){
                    resultado[i][j]=matriz[i][desplazacimiento%resultado.length];
                }else {
                    resultado[i][j]= matriz[i][j+desplazacimiento];
                }
            }

        }return resultado;
}
