package com.carla.cursojava.aula27_labs_oo2_metodos;

public class Lampada {

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
