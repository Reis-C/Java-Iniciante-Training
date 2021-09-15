package com.carla.cursojava.aula17_labs;

import java.util.Scanner;

public class Exerc01_notas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;//flag
		
		do {
				System.out.println("Insira uma nota:");
				double nota = scan.nextDouble();
				
				if (nota >= 0 && nota <= 10) {
					notaValida = true;
					System.out.println("Nota: " + nota);
				} else {
					//notaValida = false;
					System.out.println("Nota invalida. Digite novamente.");
				}
				
			} while (!notaValida);// !notaValida = notaValida == false
		}
			

	}
