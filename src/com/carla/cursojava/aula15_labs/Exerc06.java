package com.carla.cursojava.aula15_labs;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número:");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro número:");
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + ": O primeiro número � o maior entre os tr�s números informados.");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + ": O segundo número � o maior entre os tr�s números informados.");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + ": O terceiro número � o maior entre os tr�s números informados.");
		} else if (num1 == num2 && num1 == num3) {
			System.out.println("Os tr�s números informados s�o iguais.");
		} else if (num1 == num2 || num1 == num3 || num2 == num3){
			System.out.println("Dois dos tr�s n�meros informados s�o iguais.");
		} else {
			System.out.println("Caso não previsto.");
		}

	}

}
