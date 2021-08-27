package com.carla.cursojava.lab14_15;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero.");
		
		int numero1 = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero.");
		
		int numero2 = scan.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O n�mero 1 � maior que o n�mero 2.");
		} else if(numero2 > numero1) {
			System.out.println("O n�mero 2 � maior que o n�mero 1.");
		} else {
			System.out.println("O n�mero 1 e 2 s�o iguais.");
		}
		

	}

}
