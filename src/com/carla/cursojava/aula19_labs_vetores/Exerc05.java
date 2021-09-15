package com.carla.cursojava.aula19_labs_vetores;

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[4];
        int[] vetorB = new int[vetorA.length];

        for(int i=0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posicao: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * i;

        }

        System.out.print("Vetor A = ");
        for(int i=0; i< vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for(int i=0; i< vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

    }
}
