package com.company;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura;
        int numEspacios=0;
        int posAsteriscos=1;
        int espacioEntreX=3;
        int espacioEntreDiagonal;


        System.out.println("introduce el tamaño de la Z:");
        altura= sc.nextInt();
        anchura= altura;
        numEspacios=anchura-2;
        espacioEntreDiagonal=(anchura-1)+espacioEntreX;

        for (int i = 0; i < altura; i++) {

            if (i==0 || i==altura-1) {
                for (int j = 0; j < anchura; j++) {
                    System.out.print("*");
                }

                for (int j = anchura; j < anchura+espacioEntreX ; j++) {
                    System.out.print(" ");
                }

                for (int j =anchura+espacioEntreX; j < anchura+espacioEntreX+anchura; j++) {
                    System.out.print("*");

                }

            } else{
                for (int j = 0; j < numEspacios; j++) {
                    System.out.print(" ");

                }
                for (int j = 0; j < posAsteriscos; j++) {
                    System.out.print("*");
                }

                for (int j =posAsteriscos; j <= espacioEntreDiagonal; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < posAsteriscos; j++) {
                    System.out.print("*");
                }


                numEspacios--;
            }

            System.out.println();

        }
    }
}
