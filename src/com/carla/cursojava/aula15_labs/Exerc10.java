package com.carla.cursojava.aula15_labs;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o turno que voc� estuda (M ou V ou N):");
		
		String turno = scan.next();
		
		switch(turno) {
		case "m":
		case "M": System.out.println("Bom Dia!"); break;
		case "v":
		case "V": System.out.println("Boa Tarde!"); break;
		case "n":
		case "N": System.out.println("Boa Noite!"); break;
		default: System.out.println("Valor Inv�lido!");
		}

	}

}
