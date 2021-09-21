package com.carla.cursojava.aula43;

public class Teste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("Matematica");

        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "effrfrg";
        String s2 = "effrfrG";

        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("Matematica");

        double[] notas2 = {10, 9, 8, 7};
        aluno2.setNotas(notas2);
        // == compara referencias na memoria
        // equals compara atributos
        System.out.println(aluno.equals(aluno2));
    }
}
