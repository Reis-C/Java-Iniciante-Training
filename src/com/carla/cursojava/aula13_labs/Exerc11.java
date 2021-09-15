package com.carla.cursojava.aula13_labs;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros inteiros e um n�mero real:");
		double numero1 = scan.nextInt();
		double numero2 = scan.nextInt();
		double numero3 = scan.nextDouble();
		
		double produtodobro1metade2 = (numero1 * 2) * (numero2 / 2);
		double somatriplo1com3 = (numero1 * 3) + numero3;
		double terceiroaocubo = Math.pow(numero3, 3);
		
		System.out.println("O produto do dobro do 1� com metade do 2� �: " + produtodobro1metade2);
		System.out.println("A soma do triplo do 1� com o terceiro �: " + somatriplo1com3);
		System.out.println("O resultado do 3� ao cubo �: " + terceiroaocubo);

	}

}
