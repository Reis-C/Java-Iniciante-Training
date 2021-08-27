package com.carla.cursojava.lab11_12_13;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua altura:");
		double altura = scan.nextDouble();
		
		double pesoideal = (72.7 * altura) - 58;
		System.out.println("Seu peso ideal �: " + pesoideal);

	}

}
