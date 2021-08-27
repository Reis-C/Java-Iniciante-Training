package com.carla.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com sua idade");
		
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade.");
		} else {
			System.out.println("Não é maior de idade.");
		}
		
		System.out.println("Digite o valor do item.");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println ("Está barato. Pode comprar!");
		} else if (valor > 10 && valor < 15) {
			System.out.println ("Não está caro, mas pode diminuir. Que tal pedir um desconto?");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("O preço não está legal. É melhor pesquisar mais.");
		} else {
			System.out.println("Está muito caro!");
		}

	}

}
