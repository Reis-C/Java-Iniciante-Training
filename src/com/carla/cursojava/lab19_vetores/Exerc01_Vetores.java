package com.carla.cursojava.lab19_vetores;

import java.util.Scanner;
// criar um vetor A com 5 elementos inteiros.
// construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos de vetor A, ou seja, B[i] = A[i].
public class Exerc01_Vetores {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++) {

            System.out.println("Entre com o valor da posicao: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];
        }
       /* for (int i=0; i<vetorA.length; i++) {
            vetorB[i] = vetorA[i];
        }*/ //ou colocar o vetorB[i] = vetorA[i]; como acima

        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();//pular linha

        System.out.print("Vetor B = ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

    }

}
