package com.carla.cursojava.lab14_15;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a letra F ou M");
		
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		} else if (letra.equalsIgnoreCase("m")) {
			 System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo inv�lido");
		}

	} 

}
