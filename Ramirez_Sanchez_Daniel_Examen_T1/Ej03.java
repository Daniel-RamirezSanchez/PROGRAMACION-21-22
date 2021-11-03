package com.company;

public class Ej03 {
    public static void main(String[] args) {
        double palos= Math.random();
        double carta= Math.random();

        if (palos==1){
            System.out.println("corazones");
        }else if (palos==2){
            System.out.println("diamanates");
        }else if(palos==3){
            System.out.println("treboles");
        }else {
            System.out.println("picas");
        }

    }
}
