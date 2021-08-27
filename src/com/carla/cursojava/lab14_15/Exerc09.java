package com.carla.cursojava.lab14_15;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero:");
		double num1 = scan.nextDouble();
		
		System.out.println("Entre com o segundo n�mero:");
		double num2 = scan.nextDouble();
		
		System.out.println("Entre o terceiro n�mero:");
		double num3 = scan.nextDouble();
		
		if (num1 >= num2 && num1 >= num3 && num2 >= num3) {
			System.out.println(num1 + "; " + num2 + "; " + num3);//123
		} else if (num1 >= num2 && num1 >= num3 && num3 >= num2) {
			System.out.println(num1 + "; " + num3 + "; " + num2);//132
		} else if (num2 >= num1 && num2 >= num3 && num1 >= num3) {
			System.out.println(num2  + "; " + num1 + "; " + num3);//213
		} else if (num2 >= num1 && num2 >= num3 && num3 >= num1) {
			System.out.println(num2  + "; " + num1 + "; " + num3);//231
		} else if (num3 >= num1 && num3 >= num2 && num1 >= num2) {
			System.out.println(num3  + "; " + num1 + "; " + num2);//312
		} else if (num3 >= num1 && num3 >= num2 && num2 >= num1) {
			System.out.println(num3  + "; " + num2 + "; " + num1);//321
		} else {
			System.out.println("Caso n�o previsto.");
		}

	}

}