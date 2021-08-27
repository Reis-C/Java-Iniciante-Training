package com.carla.cursojava.lab11_12_13;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do c�rculo:");
		double raio = scan.nextDouble();
		
		double areacirculo = Math.PI * Math.pow(raio, 2); //pow (raio, pot�ncia)
		System.out.println("A �rea do c�rculo �: " + areacirculo);
		
		

	}

}
