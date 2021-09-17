package com.carla.cursojava.aula30;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel; //consumo de combustivel por km

    public Carro(String marca, String modelo, int numPassageiros,
                 double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro () { }

    //this = fazer referencia aos proprios atributos e metodos da classe
    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parametros");
    }

    //this = usar como construtor
    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);//chama o construtor de 3 parametros
        System.out.println("Chamando o construtor com 2 parametros");
    }

    //metodo sem retorno
    void exibirAutonomia() {

        System.out.println("A autonomia do carro e: " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    //metodo com retorno
    double obterAutonomia() {
        System.out.println("Metodo obterAutonomia foi chamado.");
        return this.capCombustivel * this.consumoCombustivel;
    }

    //metodo com parametro. o tipo de retorno pode ser qualquer um
    double calcularCombustivel(double km) {//nao tem a info de km dentro da classe - passar como parametro
        double qtdCombustivel = km / this.consumoCombustivel;
        return qtdCombustivel;
    }
}
