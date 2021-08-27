package com.carla.cursojava.lab14_15;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota");
		double nota1 = scan.nextDouble();
		
		System.out.println("Insira a segunda nota");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/ 2;
		System.out.println("A m�dia � " + media);
		
		if (media == 10){
			System.out.println("Aprovado com Distin��o!!!");
		} else if ((media >= 7) && (media != 10)) {
			System.out.println("Aprovado!!");
		} else {
			System.out.println("Reprovado.");
		}

	}

}
