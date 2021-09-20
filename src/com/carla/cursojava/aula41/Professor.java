package com.carla.cursojava.aula41;

public class Professor extends Pessoa {

    private String nomeCurso;
    private double salario;

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }

    public String obterEtiquetaEndereco() {

        String s = "Endereco do Professor: ";
        s += this.getEndereco();

        return s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {

        System.out.println("Imprimido endereco do professor");
        System.out.println(this.obterEtiquetaEndereco());

    }

}
