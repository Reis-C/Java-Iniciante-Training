package com.carla.cursojava.aula29;

import javax.imageio.ImageReader;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel; //consumo de combustivel por km

//Construtores
    Carro() {
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;
    }

    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }

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
