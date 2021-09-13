package com.carla.cursojava.lab16_17;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		int popA = 80000;
		int popB = 200000;
		int cont = 0;//anos
		
		while (popA < popB) {
			
			popA += (popA / 100) * 3;
			popB += (popB / 100) * 1.5;
			cont++;
		}
		
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Qtd anos: " + cont);

	}

}
