package com.carla.cursojava.aula17_labs;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		
		
	boolean valido = false;
		
		do {
			
			System.out.println("Entre com a populacao A:");
			popA = scan.nextDouble();
			
			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("Populacao A precisa ser maior que zero.");
			}
			
		} while (!valido);
		
		
	 valido = false;
		
		do {
			
			System.out.println("Entre com a populacao B:");
			popB = scan.nextDouble();
			
			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("Populacao B precisa ser maior que zero.");
			}
			
		} while (!valido);
		
		
	valido = false;
		
		do {
			
			System.out.println("Entre com a taxa de cresciemnto da populacao A:");
			taxaA = scan.nextDouble();
			
			if (taxaA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de cresciemnto da populacao A precisa ser maior que zero.");
			}
			
		} while (!valido);
		
		
	valido = false;
		
		do {
			
			System.out.println("Entre com a taxa de cresciemnto da populacao B:");
			taxaB = scan.nextDouble();
			
			if (taxaB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de cresciemnto da populacao B precisa ser maior que zero.");
			}
			
		} while (!valido);
		
		int cont = 0;
		while (popA < popB) {
			
			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}
		
		System.out.println("Populacao A: " + popA);
		System.out.println("Populacao B: " + popB);
		System.out.println("Qtd anos: " + cont);
		
		
	}

}
