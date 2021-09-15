package com.carla.cursojava.aula15_labs;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota");
		double nota1 = scan.nextDouble();
		
		System.out.println("Insira a segunda nota");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/ 2;
		
		String conceito = "";
		if (media >= 9 && media <=10) {
			conceito = "A";
		} else if (media < 9 && media >= 7.5) {
			conceito = "B";
		} else if (media < 7.5 && media >= 6) {
			conceito = "C";
		} else if (media < 6 && media >= 4) {
			conceito = "D";
		} else {
			conceito = "E";
		}
		
		System.out.println("--------------------");
		System.out.println("  BOLETIM DE NOTAS  ");
		System.out.println("--------------------");
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("M�dia: " + media);
		System.out.println("Conceito: " + conceito);
		
		switch (conceito) {
		case "A":
		case "B":
		case "C": System.out.println("APROVADO"); break;
		case "D":
		case "E": System.out.println("REPROVADO"); break;
		}
	}

}
