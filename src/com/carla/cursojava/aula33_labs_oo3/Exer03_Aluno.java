package com.carla.cursojava.aula33_labs_oo3;

import java.util.Scanner;

public class Exer03_Aluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.setNome(scan.next());

        System.out.println("Entre com o nome do curso");
        aluno.setNomeCurso(scan.next());

        System.out.println("Entre com a matricula");
        aluno.setMatricula(scan.next());

        // aluno.nomesDisciplinas = new String[3]; //instanciar o array. quando apenas se declara na classe
        for (int i=0; i<aluno.getNomesDisciplinas().length; i++) {
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.setNomeDisciplinaPosicao(i, scan.next());
        }

        for(int i=0; i<aluno.getNotasDisciplinas().length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.getNomesDisciplinas()[i]);
            for(int j=0; j<aluno.getNotasDisciplinas()[i].length; j++) {
                System.out.println("Entre com a nota " + (j+1));
                aluno.setNotasPosicaoIJ(i, j, scan.nextDouble());
            }

        }

        aluno.mostrarInfo();

        for(int i=0; i<aluno.getNotasDisciplinas().length; i++) {
            if(aluno.verificarAprovado(i)) {
                System.out.println("Media em "+ aluno.getNomesDisciplinas()[i] + " = " + aluno.obterMedia(i));
                System.out.println("Disciplina " + aluno.getNomesDisciplinas()[i] + " foi aprovado.");
            } else {
                System.out.println("Media em "+ aluno.getNomesDisciplinas()[i] + " = " + aluno.obterMedia(i));
                System.out.println("Disciplina " + aluno.getNomesDisciplinas()[i] + " foi reprovado.");

            }
        }

    }

}
