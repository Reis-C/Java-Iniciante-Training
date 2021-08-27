package com.carla.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		//for normal
		//incremento
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println("i tem valor: " + i);
		}
		
		System.out.println("--------------");
		//decremento
		for (int i = 5; i > 0 ; i--) {
			System.out.println("i tem valor: " + i);
		}
		
		System.out.println("--------------");
		
		//com duas variáveis
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}
		
		System.out.println("--------------");
		
		//com partes ausentes
		int count = 0;
		for( ; count < 10; ) {
			System.out.println("valor de count: " + count);
			count +=2;
		}
		
		System.out.println("--- igual a ---");
		
		//for normal
		for (int cont = 0 ;cont < 10; cont += 2) {
			System.out.println("valor de count: " + cont);
		}
		
		System.out.println("--------------");
		
		
		//for sem corpo
		int soma = 0;
		for (int i = 1; i < 5; soma += i++);
		System.out.println("O valor da soma é: " + soma);

	}

}
