package com.carla.cursojava.aula33_labs_oo3;

public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomesDisciplinas; //declarando e instanciando
    private double[][] notasDisciplinas;

    public Aluno() {
        nomesDisciplinas = new String[3];
        notasDisciplinas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String nomeCurso, String[] nomesDisciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomesDisciplinas = nomesDisciplinas;
        this.notasDisciplinas = notasDisciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getNomesDisciplinas() {
        return nomesDisciplinas;
    }

    public void setNomesDisciplinas(String[] nomesDisciplinas) {
        this.nomesDisciplinas = nomesDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

   public void mostrarInfo() {
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

   public double obterMedia(int indice) {
        double soma = 0;

        for(int i=0; i< notasDisciplinas[indice].length; i++) { //basta interar o indice da linha
            soma+= notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        return media;
    }

   public boolean verificarAprovado(int indice) { //ja esta informando o indice da coluna

        if (obterMedia(indice) >= 7) {
            return true;
        }

        return false;
    }

    public void setNomeDisciplinaPosicao(int pos, String nomeDisciplina) {
        this.nomesDisciplinas[pos] = nomeDisciplina;
    }

    public void setNotasPosicaoIJ(int posI, int posJ, double nota) {
        this.notasDisciplinas[posI][posJ] = nota;
    }
}
