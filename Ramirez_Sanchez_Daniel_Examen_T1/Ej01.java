package com.company;

import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int altura, numHuecos;
        int numX=1;
        int estrella=1;
        int tronco=1;
        int anchura;


        do {
            System.out.println("Introduce la altura del árbol(mayor o igual que 4)");
            altura=sc.nextInt();
        }while (altura<4);



        numHuecos=altura-3;

        for (int i = 0; i <1 ; i++) {
            for (int j = 0; j < numHuecos; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < estrella; j++) {
                System.out.print("*");
            }

        }
        System.out.println();
        for (int i = 1; i < altura-1; i++) {


            if (i == altura - 2) {
                for (int j = 0; j < numX; j++) {
                    System.out.print("V");
                }
            }else {
                for (int j = 0; j < numHuecos; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < numX; j++) {
                    if (j==0 || j==numX-1){
                        System.out.print("V");
                    }else {
                        System.out.print(" ");
                    }

                }
            }

            numHuecos--;
            numX+=2;
            System.out.println();

        }
        numHuecos=altura-3;

        for (int i = altura-1; i <altura ; i++) {
            for (int j = 0; j < numHuecos; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < tronco; j++) {
                System.out.print("Y");
            }

        }
        System.out.println();


    }
}
