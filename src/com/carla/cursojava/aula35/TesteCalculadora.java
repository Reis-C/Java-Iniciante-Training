package com.carla.cursojava.aula35;

import java.util.Scanner;

public class TesteCalculadora {

    public static void main(String[] args) {

        int farorialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(farorialNR);

        int fatorialR = Calculadora.fatorialRecursivo(5);
        System.out.println(fatorialR);

    }
}