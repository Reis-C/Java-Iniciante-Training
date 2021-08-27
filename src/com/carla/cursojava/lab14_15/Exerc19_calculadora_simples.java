package com.carla.cursojava.lab14_15;

import java.util.Scanner;

public class Exerc19_calculadora_simples {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Entre com o primeiro n�mero:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero:");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com a opera��o (+ - * /):");
		String operacao = scan.next();
		
		double resultado = 0;
		
		//flag - se for valida tem que mostrar se � positivo ou negativo. se n�o for, n�o mostra nada.
		boolean valida = true; 
		
		switch(operacao) {
			case "+": resultado = num1 + num2; break;
			case "-": resultado = num1 - num2; break;
			case "*": resultado = num1 * num2; break;
			case "/": resultado = num1 / num2; break;
			default: 
				System.out.println("Opera��o inv�lida"); 
				valida = false;
		}
		
		if (valida) {
			
			System.out.println("Resultado: " + resultado);
			
			if (resultado >= 0) {
				System.out.println("Resultado positivo");
			} else {
				System.out.println("Resultado negativo");
			}
			// % mod
			if (resultado % 2 == 0){
				System.out.println("Resultado par");
			} else {
				System.out.println("Resultado �mpar");
			}
		}

	}

}
