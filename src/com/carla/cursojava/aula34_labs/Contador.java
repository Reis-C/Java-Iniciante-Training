package com.carla.cursojava.aula34_labs;

public class Contador {

    public Contador() {
        cont++;
    }
//o atributo static sera compartilhado por todas as as instancias da classe. o valor sera o mesmo.
   private static int cont;

    public static void incrementar() {
        cont++;
    }

    public static void zerar() {
        cont = 0;
    }

    public static int obterValor() {
        return cont;
    }
}
