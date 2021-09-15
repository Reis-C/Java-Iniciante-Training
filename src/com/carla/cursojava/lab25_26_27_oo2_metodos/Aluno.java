package com.carla.cursojava.lab25_26_27_oo2_metodos;

public class Aluno {


    String nome;
    String matricula;
    String nomeCurso;
    String[] nomesDisciplinas = new String[3]; //declarando e instanciando
    double[][] notasDisciplinas = new double[3][4];

    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i=0; i< notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + nomesDisciplinas[i]);
            for(int j=0; j< notasDisciplinas[i].length; j++) {
                System.out.print(notasDisciplinas[i][j] + " ");
            }
                System.out.println();
        }

    }

    double obterMedia(int indice) {
        double soma = 0;

        for(int i=0; i< notasDisciplinas[indice].length; i++) { //basta interar o indice da linha
            soma+= notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        return media;
    }

    boolean verificarAprovado(int indice) { //ja esta informando o indice da coluna

        if (obterMedia(indice) >= 7) {
            return true;
        }

        return false;

    }

}
