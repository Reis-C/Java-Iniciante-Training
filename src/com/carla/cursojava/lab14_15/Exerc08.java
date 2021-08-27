package com.carla.cursojava.lab14_15;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com pre�o do primeiro produto:");
		double preco1 = scan.nextDouble();
		
		System.out.println("Entre com pre�o do segundo produto:");
		double preco2 = scan.nextDouble();
		
		System.out.println("Entre com pre�o do terceiro produto:");
		double preco3 = scan.nextDouble();
		
		if (preco1 < preco2 && preco1 < preco3) {
			System.out.println(preco1 + ": O primeiro produto � o mas barato.");
		} else if (preco2 < preco1 && preco2 < preco3) {
			System.out.println(preco2 + ": O segundo produto � o mais barato.");
		} else if (preco3 < preco1 && preco3 < preco2) {
			System.out.println(preco3 + ": O terceiro nproduto � o mais barato.");
		} else if (preco1 == preco2 && preco1 == preco3) {
			System.out.println("Os produtos t�m o mesmo pre�o.");
		} else if (preco1 == preco2 || preco1 == preco3 || preco2 == preco3){
			System.out.println("Dois dos tr�s produtos t�m o mesmo pre�o.");
		} else {
			System.out.println("Caso n�o previsto.");
		}

	}

}
