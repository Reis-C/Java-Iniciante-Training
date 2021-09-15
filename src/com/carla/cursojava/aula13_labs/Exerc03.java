package com.carla.cursojava.aula13_labs;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.println("A soma desses dois n�meros � " + resultado);

	}

}
