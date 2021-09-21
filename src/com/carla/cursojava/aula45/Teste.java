package com.carla.cursojava.aula45;

public class Teste {

    public static void main(String[] args) {

//        Aluno aluno = new Aluno();
//        Pessoa pessoaAluno = aluno; //upcasting = transformando uma classe do tipo menor (Aluno), em um tipo de classe maior (Pessoa).
//                        //conversao Java
//        Pessoa aluno2 = (Pessoa) new Aluno();
//
//        Pessoa aluno3 = new Pessoa();
//        Aluno aluno4 = (Aluno) aluno3; //downcasting //ex de downcasting vai falhar em execucao


        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor prof = new Professor();

        if (pessoa instanceof Pessoa) {//verificar tipo
            System.out.println("e do tipo Pessoa");
        }

        if (aluno instanceof Aluno) {//verificar tipo
            System.out.println("e do tipo Aluno");
        }

        if (prof instanceof Pessoa) {//verificar tipo
            System.out.println("e do tipo Professor");
        }

    }
}
