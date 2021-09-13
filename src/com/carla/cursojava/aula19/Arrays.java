package com.carla.cursojava.aula19;


public class Arrays {
//armazenar a temperatura diaria por um ano com array
    public static void main(String[] args) {

        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;

        // [] para indicar que e um array
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("O valor da temperatura do dia 3 e: " + temperaturas[2]);

        System.out.println("O tamanho do array: " + temperaturas.length);

        System.out.println("Valores do array: ");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i+1) + " e: " + temperaturas[i]);
        }
        //for melhorado a partir do java5. nao tem acesso ao i-posicao, apenas ao valor
        for (double temp : temperaturas) {
            System.out.println(temp);
        }

    }
}
