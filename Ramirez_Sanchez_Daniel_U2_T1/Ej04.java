package com.company;

import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero;

        do {
            System.out.println("introduce un numero que tenga un numero de cifras pares");
            numero= sc.nextLine();


        }while (numero.length()%2!=0);


    }
}
