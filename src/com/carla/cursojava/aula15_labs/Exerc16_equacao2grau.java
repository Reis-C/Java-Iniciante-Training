package com.carla.cursojava.aula15_labs;

import java.util.Scanner;

public class Exerc16_equacao2grau {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor de a: ");
		int a = scan.nextInt();
		
		if (a == 0) {
			System.out.println("N�o � equa��o de 2� grau.");
		}else {
			
			System.out.println("Insira o valor de b: ");
			int b = scan.nextInt();
			
			System.out.println("Insira o valor de c: ");
			int c = scan.nextInt();
			
			double delta = (b * b) - (4 * a * c);
			
			if (delta < 0) {
				System.out.println("Delta negativo. A equa��o n�o possui ra�zes.");
			} else {
				
				System.out.println("delta: " + delta);
				//Math.sqrt - para calcular raiz quadrada
				double x1 = ((- b) + Math.sqrt(delta)) / (2 * a);
				double x2 = ((- b) - Math.sqrt(delta)) / (2 * a);
				
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
				
			}
			
		}
		

	}

}
