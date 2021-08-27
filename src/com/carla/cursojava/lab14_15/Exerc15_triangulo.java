package com.carla.cursojava.lab14_15;

import java.util.Scanner;

public class Exerc15_triangulo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor dos lado 1");
		double lado1 = scan.nextDouble();
		
		System.out.println("Digite o valor dos lado 2");
		double lado2 = scan.nextDouble();
		
		System.out.println("Digite o valor dos lado 3");
		double lado3 = scan.nextDouble();
		
		if ((lado1 + lado2) > lado3 && 
				(lado1 + lado3) > lado2 &&
				(lado3 + lado2) > lado1) {
			
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("� um tri�ngulo Equil�tero: tr�s lados iguais.");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("� um tri�ngulo Is�sceles: quaisquer dois lados iguais.");
			} else if (lado1 != lado2 && lado1 != lado2 && lado2 != lado3) {
				System.out.println("� um tri�ngulo Escaleno: tr�s lados diferentes.");
			}
				
		} else {
			System.out.println("N�o forma um tri�ngulo.");
			}
	}

}
