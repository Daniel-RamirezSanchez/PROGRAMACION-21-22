package com.company;

import java.util.Arrays;

public class Ej02 {
    public static void main(String[] args) {
        int[] vector= {3,4,6,7,8};


        System.out.println(Arrays.toString(insertarValor(vector,0,0)));
        System.out.println(Arrays.toString(insertarValor(vector,5,2)));
        System.out.println(Arrays.toString(insertarValor(vector,9,5)));


    }public static int[] insertarValor(int[]vector, int valor, int pos){
        int[] resultado= new int[vector.length+1];

        for (int i = 0; i < resultado.length; i++) {
            if (i<pos){
                resultado[i]=vector[i];
            }else if (i==pos){
                resultado[i]=valor;
            }else {
                resultado[i]=vector[i-1];
            }
        }
        return resultado;
    }
}
