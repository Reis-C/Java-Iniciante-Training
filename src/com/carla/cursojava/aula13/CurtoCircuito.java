package com.carla.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & 
				verdadeiro; 
		boolean resultado2 = falso && //o 1 já é falso, ñ analisa o 2, pois já sabeque o resultado será falso.
				verdadeiro;
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado);
	}

}
