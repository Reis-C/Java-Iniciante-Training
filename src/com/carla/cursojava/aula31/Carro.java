package com.carla.cursojava.aula31;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
   private double consumoCombustivel; //consumo de combustivel por km



    public void exibirAutonomia() {

        System.out.println("A autonomia do carro e: " + this.capCombustivel * this.consumoCombustivel + " km");
    }


    public double obterAutonomia() {
        System.out.println("Metodo obterAutonomia foi chamado.");
        return this.capCombustivel * this.consumoCombustivel;
    }


    private double divideKmPorConsumoCombustivel(double km) {
        return km / this.consumoCombustivel;

    }

    public double calcularCombustivel(double km) {//nao tem a info de km dentro da classe - passar como parametro
        return this.divideKmPorConsumoCombustivel(km);
    }
}
