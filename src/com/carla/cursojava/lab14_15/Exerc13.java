package com.carla.cursojava.lab14_15;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o dia da semana [1-7].");
		
		int diaSemana = scan.nextInt();
		
		/*if (diaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda-feira");
		} else if (diaSemana == 3) {
			System.out.println("Ter�a-feira");
		} else if (diaSemana == 4) {
			System.out.println("Quarta-feira");
		} else if (diaSemana == 5) {
			System.out.println("Quinta-feira");
		} else if (diaSemana == 6) {
			System.out.println("Sexta-feira");
		} else if (diaSemana == 7) {
			System.out.println("S�bado");
		} else {
			System.out.println("N�o � um dia da semana v�lido.");
		}*/
		
		switch (diaSemana) {
		case 1: System.out.println("Domingo");break;
		case 2: System.out.println("Segunda-feira"); break;
		case 3: System.out.println("Ter�a-feira"); break;
		case 4: System.out.println("Quarta-feira"); break;
		case 5: System.out.println("Quinta-feira"); break;
		case 6: System.out.println("Sexta-feira"); break;
		case 7: System.out.println("S�bado"); break;
		default:System.out.println("N�o � um dia da semana v�lido.");
		}
		
		switch (diaSemana) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6: System.out.println("Dia �til"); break;
		case 1:
		case 7: System.out.println("Fim de semana"); break;
		default:System.out.println("N�o � um dia da semana v�lido.");
		}
	}
	
}
