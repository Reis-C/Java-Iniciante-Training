package com.carla.cursojava.aula24_labs_oo1;

public class Exer03 {

    public static void main(String[] args) {

        LivroLivraria livroLivraria = new LivroLivraria();

        livroLivraria.nome = "Harry Potter e a Pedra Filosofal";
        livroLivraria.autor = "J.K. Rowling";
        livroLivraria.anoLancamento = 1997;
        livroLivraria.qtdPaginas = 264;
        livroLivraria.isbn = "85-325-1101-5";
        livroLivraria.preco = 34.99;

        System.out.println("Nome do livro = " + livroLivraria.nome);
        System.out.println("Nome do autor = " + livroLivraria.autor);
        System.out.println("Ano de lancamento = " + livroLivraria.anoLancamento);
        System.out.println("Quantidade de paginas = " + livroLivraria.qtdPaginas);
        System.out.println("Numero do ISBN = " + livroLivraria.isbn);
        System.out.println("Preco = " + livroLivraria.preco);

    }
}
