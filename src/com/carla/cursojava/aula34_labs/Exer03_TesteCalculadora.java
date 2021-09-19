package com.carla.cursojava.aula34_labs;

import java.util.Scanner;

public class Exer03_TesteCalculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;

        do {

            System.out.println("Entre com um numero positivo");
            num = scan.nextInt();

            if(num < 0) {
                System.out.println("Numero invalido, entre novamente");
            }

        } while (num < 0);

        System.out.println(Calculadora.fatorial(num));

    }

}
