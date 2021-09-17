package com.carla.cursojava.aula27_labs_oo2;

public class Lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("Lampada esta ligada");
        } else {
            System.out.println("Lampada esta desligada");
        }
    }
//metodos dentro de metodos
    void mudarEstado() {
        if(ligada) {
            desligar();
        } else {
            ligar();
        }
    }

}
