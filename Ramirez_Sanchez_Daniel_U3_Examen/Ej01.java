package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector1;
        int[] vector2;
        int tamanyo1;
        int tamanyo2;

        System.out.println("Introduce la longitud del vector1:");
        tamanyo1= sc.nextInt();
        System.out.println("Introduce la longitud del vector2:");
        tamanyo2= sc.nextInt();

        vector1=new int[tamanyo1];
        vector2=new int[tamanyo2];

        for (int i = 0; i < tamanyo1; i++) {
            System.out.println("introduce el numero de la posicion "+i+" del vector 1");
            vector1[i]=sc.nextInt();
        }
        for (int i = 0; i < tamanyo2; i++) {
            System.out.println("introduce el numero de la posicion "+i+" del vector 2");
            vector2[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(vector1));
        System.out.println(Arrays.toString(vector2));


        System.out.println(Arrays.toString(mediaVectores(vector1,vector2)));




    }public static float[] mediaVectores(int[]vector1, int[] vector2){
        float[]resultado=new float[0];

        if (vector1.length> vector2.length){
            resultado= new float[vector1.length];
            for (int i = 0; i < vector2.length; i++) {
                resultado[i]= (float) (vector1[i]+vector2[i])/2;
            }
            for (int i = vector2.length; i < vector1.length ; i++) {
                resultado[i]= (float) vector1[i];
            }

        }else {
            resultado=new float[vector2.length];
            for (int i = 0; i < vector1.length; i++) {
                resultado[i]= (float) (vector1[i]+vector2[i])/2;
            }
            for (int i = vector1.length; i < vector2.length ; i++) {
                resultado[i]= (float) vector2[i];
            }
        }

        return resultado;

    }
}
