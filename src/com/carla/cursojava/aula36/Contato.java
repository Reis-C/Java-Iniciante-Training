package com.carla.cursojava.aula36;

public class Contato {

    private String nome;
    //relacionamento tem-um, declara o tipo da classe, ao inves de declarar atributo simples, como int, boolean...
    private Endereco endereco;
    //relacionamento tem-muitos, utiliza-se array
    private Telefone[] telefones;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
}
