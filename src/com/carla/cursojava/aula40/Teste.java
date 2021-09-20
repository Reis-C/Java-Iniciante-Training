package com.carla.cursojava.aula40;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno(); //aluno do tipo Pessoa, porem instancia do tipo Aluno
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num 2");
        professor.setEndereco("Rua 3, num 3");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());//chama o metodo a partir da instancia(acima) da classe Aluno; faz a saida sobrescrita da classe Aluno
        System.out.println(professor.obterEtiquetaEndereco());


    }
}
