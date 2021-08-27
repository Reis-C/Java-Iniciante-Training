package com.carla.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1; //count ou cont
		int max = 10;
		
		System.out.println("Contando at�: " + max);
		
		while (i <= max) { //primeiro avalia a express�o e depois executa o bloco
			System.out.println("Valor de i: " + i);
			i++; // i = i + 1; ou 1 += 1;
		}
		
		System.out.println(i); // valor de 11
		System.out.println("--------------");
		
		do { // primeiro executa o c�digo
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 15); // e depois avalia a express�o
		
		System.out.println(i);

	}

}
