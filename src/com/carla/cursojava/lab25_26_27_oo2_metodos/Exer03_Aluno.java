package com.carla.cursojava.lab25_26_27_oo2_metodos;

import java.util.Scanner;

public class Exer03_Aluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do curso");
        aluno.nomeCurso = scan.next();

        System.out.println("Entre com a matricula");
        aluno.matricula = scan.next();

       // aluno.nomesDisciplinas = new String[3]; //instanciar o array. quando apenas se declara na classe
        for (int i=0; i<aluno.nomesDisciplinas.length; i++) {
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.nomesDisciplinas[i] = scan.next();
        }

        for(int i=0; i<aluno.notasDisciplinas.length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.nomesDisciplinas[i]);
            for(int j=0; j<aluno.notasDisciplinas[i].length; j++) {
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }

        }

        aluno.mostrarInfo();

        for(int i=0; i<aluno.nomesDisciplinas.length; i++) {
            if(aluno.verificarAprovado(i)) {
                System.out.println("Media em "+ aluno.nomesDisciplinas[i] + " = " + aluno.obterMedia(i));
                System.out.println("Disciplina " + aluno.nomesDisciplinas[i] + " foi aprovado.");
            } else {
                System.out.println("Media em "+ aluno.nomesDisciplinas[i] + " = " + aluno.obterMedia(i));
                System.out.println("Disciplina " + aluno.nomesDisciplinas[i] + " foi reprovado.");

            }
        }

    }
}
