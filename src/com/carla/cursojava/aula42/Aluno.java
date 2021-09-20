package com.carla.cursojava.aula42;

public class Aluno {

    private String curso;
    private double[][] notas;

    public Aluno() {
        super();//chama o construtor da superclasse Pessoa
    }

    public Aluno(String nome, String endereco, String telefone, String cpf, String telefoneCelular, String curso) {
       // super(nome, endereco, telefone, cpf, telefoneCelular);
        this.curso = curso;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {

        return 0;
    }

    public boolean verificarAprovado() {

        return true;
    }

    public String obterEtiquetaEndereco() {

        String s = "Endereco do Aluno: ";
    //    s += this.getEndereco();

        return s;
    }

  //  @Override
    public void imprimirEtiquetaEndereco() {

        System.out.println(this.obterEtiquetaEndereco());
    }
}
