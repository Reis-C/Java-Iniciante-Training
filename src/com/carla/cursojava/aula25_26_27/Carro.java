package com.carla.cursojava.aula25_26_27;

//1 Classe
public class Carro {

//2 Atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel; //capacidade do tanque de combustivel
    double consumoCombustivel; //consumo de combustivel por km

//3 Metodos
    //tipo de retorno; nome do metodo
    //metodo sem retorno
    void exibirAutonomia() {
        System.out.println("A autonomia do carro e: " + capCombustivel * consumoCombustivel + " km");
    }
    //metodo com retorno
    double obterAutonomia() {
        System.out.println("Metodo obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }

    //metodo com parametro. o tipo de retorno pode ser qualquer um
    double calcularCombustivel(double km) {//nao tem a info de km dentro da classe - passar como parametro
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }

}
