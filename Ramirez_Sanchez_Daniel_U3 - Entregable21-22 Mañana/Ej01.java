package com.company;

import java.util.Arrays;

public class Ej01 {
    public static void main(String[] args) {

        int[] v1= {9, 3, 1 , 6, 5};
        int[] v2= {9, 4, 2, 7, 5};

        System.out.println(Arrays.toString(interseccionVectores(v1,v2)));


    }
    public static int[]interseccionVectores(int[] v1, int[] v2){
        int[] resultado= new int[0];

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (v1[i]==v2[j]){
                    resultado= Arrays.copyOf(resultado,resultado.length+1);
                    resultado[resultado.length-1]=v1[i];
                }
            }
        }
        Arrays.sort(resultado);
        return resultado;
    }
}
