package com.carla.cursojava.lab11_12_13;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor em metro");
		double metro = scan.nextDouble();
		
		double centimetro = metro * 100;
	    System.out.println(metro + " m � igual a " + centimetro + " cm.");

	}

}
