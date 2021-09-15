package com.carla.cursojava.aula15_labs;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero:");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro n�mero:");
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + ": O primeiro n�mero � o maior entre os tr�s n�meros informados.");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + ": O segundo n�mero � o maior entre os tr�s n�meros informados.");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + ": O terceiro n�mero � o maior entre os tr�s n�meros informados.");
		} else if (num1 == num2 && num1 == num3) {
			System.out.println("Os tr�s n�meros informados s�o iguais.");
		} else if (num1 == num2 || num1 == num3 || num2 == num3){
			System.out.println("Dois dos tr�s n�meros informados s�o iguais.");
		} else {
			System.out.println("Caso n�o previsto.");
		}
		
		if (num1 < num2 && num1 < num3) {
			System.out.println(num1 + ": O primeiro n�mero � o menor entre os tr�s n�meros informados.");
		} else if (num2 < num1 && num2 < num3) {
			System.out.println(num2 + ": O segundo n�mero � o menor entre os tr�s n�meros informados.");
		} else if (num3 < num1 && num3 < num2) {
			System.out.println(num3 + ": O terceiro n�mero � o menor entre os tr�s n�meros informados.");
		} else if (num1 == num2 && num1 == num3) {
			System.out.println("Os tr�s n�meros informados s�o iguais.");
		} else if (num1 == num2 || num1 == num3 || num2 == num3){
			System.out.println("Dois dos tr�s n�meros informados s�o iguais.");
		} else {
			System.out.println("Caso n�o previsto.");
		}

	}

}
