package com.carla.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

    public static void main(String[] args) {

       /* Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int num = scan.nextInt();

        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        //o primeiro numero divisivel por 7 que esteja entre num e max
        for (int i = num; i <= max ; i++) {
            System.out.println(i);
            if (i % 7 == 0) {
                System.out.println("O valor de i e:" + i);
                break; //utilizando um break para sair de um for
            }

        }*/
        //break com rotulos: (go to) nao e boa pratica. usado no assembly.
        /*for (int i = 0; i<4; i++) {
            rotulo1: {
                rotulo2: {
                    rotulo3: {
                        if (i == 1) {
                            break rotulo1;
                        }
                        if (i == 2) {
                            break rotulo2;
                        }
                        if (i == 3) {
                            break rotulo3;
                        }
                        System.out.println("rotulo3");

                    }
                    System.out.println("rotulo2");
                }
                System.out.println("rotulo1");

            }
            System.out.println(i);
        }*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int num = scan.nextInt();

        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        for (int i = num; i <= max ; i++) {
            if (i % 7 == 0) {
                continue;//se o num for multiplo de 7, nao executa o codigo abaixo e continua a executar o de cima
            }
            System.out.println("O valor de i e:" + i);

        }

    }

}

