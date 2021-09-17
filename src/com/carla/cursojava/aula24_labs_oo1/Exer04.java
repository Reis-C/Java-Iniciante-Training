package com.carla.cursojava.aula24_labs_oo1;

import java.util.Date;

public class Exer04 {

    public static void main(String[] args) {

        LivroBiblioteca livro = new LivroBiblioteca();

        livro.nome = "Harry Potter e a Pedra Filosofal";
        livro.autor = "J.K. Rowling";
        livro.anoLancamento = 1997;
        livro.qtdPaginas = 264;
        livro.isbn = "85-325-1101-5";

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.cliente = "Carla";

        System.out.println("Nome do livro = " + livro.nome);
        System.out.println("Nome do autor = " + livro.autor);
        System.out.println("Ano de lancamento = " + livro.anoLancamento);
        System.out.println("Quantidade de paginas = " + livro.qtdPaginas);
        System.out.println("Numero do ISBN = " + livro.isbn);
        System.out.println("Emprestado? " + livro.emprestado);
        System.out.println("Data de entrega = " + livro.emprestado);
        System.out.println("Nome do cliente = " + livro.cliente);

    }
}
