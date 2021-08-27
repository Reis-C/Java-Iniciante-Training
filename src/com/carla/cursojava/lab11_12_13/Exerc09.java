package com.carla.cursojava.lab11_12_13;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit:");
		double farenheit = scan.nextDouble();
		
		double celsius = (5 * (farenheit - 32) / 9);
		System.out.println(farenheit + " �F � igual a " + celsius + " �C");
	}

}
