package com.carla.cursojava.aula34;


public class TesteMinhaCalculadora {

    static int resultSoma;

    public static void main(String[] args) {

        resultSoma = MinhaCalculadora.soma(1, 2);

//        MinhaCalculadora calc = new MinhaCalculadora();
//        calc.soma(1,2);

        soma2Valores(1, 2);

    }
// para o public static void main funcionar, fazer acesso a outros metodos, os metodos tambem precisam ser static
    static int soma2Valores(int num1, int num2) {
        return MinhaCalculadora.soma(num1, num2);
    }


}
