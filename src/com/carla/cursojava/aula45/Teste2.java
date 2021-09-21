package com.carla.cursojava.aula45;

public class Teste2 {

    public static void main(String[] args) {
        //downcasting so funciona quando referecia o tipo em particular, como obj1 e obj2
        Object obj1 = obterString();
        String s1 = (String) obj1; //downcasting Object para String

        Object obj2 = "Minha String";//upcasting String para Object
        String s2 = (String) obj2; //downcasting obj2 referencia uma string diretamente

        Object obj3 = new Object();
        String s3 = (String) obj3; //ex de downcasting vai falhar em execucao
                                    // nao faz referencia a uma string

        Object obj4 = obterInteiro();
        String s4 = (String) obj4;//nao funciona em tempo de execucao
    }

    public static String obterString() {
        return "minha String";
    }

    public static int obterInteiro() {
        return 11;
    }

    
}
