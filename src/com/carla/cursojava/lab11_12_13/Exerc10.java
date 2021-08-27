package com.carla.cursojava.lab11_12_13;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius:");
		double celsius = scan.nextDouble();
		
		double farenheit = (celsius * 1.8) + 32;
		System.out.println(celsius + " �C � igual a " + farenheit + " �F");

	}

}
