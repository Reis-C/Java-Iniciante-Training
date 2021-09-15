package com.carla.cursojava.aula15_labs;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero:");
		
		int numero = scan.nextInt();
		
		if(numero >= 0) {
			System.out.println("O n�mero informado � positivo.");
		} else {
			System.out.println("O n�mero informado � negativo.");
		}

	}

}
