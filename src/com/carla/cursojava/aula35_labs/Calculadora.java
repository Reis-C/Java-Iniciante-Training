package com.carla.cursojava.aula35_labs;

public class Calculadora {

    public static int fibonacci (int num) {

        if (num<2) {
            return 1;
        }

        return fibonacci(num-1) + fibonacci(num-2);
    }

    //5 = 5 + somantorio(4)
    //4 = 4 + somantorio(3)
    //3 = 3 + somantorio(2)
    //2 = 2 + somantorio(1)
    //1 = 1
    public static int somatorio (int num) {

        if (num ==1) {
            return 1;
        }

        return num + somatorio(num-1);
    }
}
