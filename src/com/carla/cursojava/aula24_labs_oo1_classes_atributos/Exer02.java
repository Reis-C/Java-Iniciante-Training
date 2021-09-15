package com.carla.cursojava.aula24_labs_oo1_classes_atributos;

public class Exer02 {

    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.nome = "Harry Potter e a Pedra Filosofal";
        livro.autor = "J.K. Rowling";
        livro.anoLancamento = 1997;
        livro.qtdPaginas = 264;
        livro.isbn = "85-325-1101-5";

        System.out.println("Nome do livro = " + livro.nome);
        System.out.println("Nome do autor = " + livro.autor);
        System.out.println("Ano de lancamento = " + livro.anoLancamento);
        System.out.println("Quantidade de paginas = " + livro.qtdPaginas);
        System.out.println("Numero do ISBN = " + livro.isbn);

    }
}
