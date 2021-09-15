package com.carla.cursojava.aula13_labs;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora?");	
		double valorhora = scan.nextDouble();	
		
		System.out.println("Quantas horas trabalhadas no m�s?");
		double horastrabalhadas = scan.nextDouble();
		
		double salariobruto = valorhora * horastrabalhadas;	
		double impostorenda = salariobruto * 0.11;
		double inss = salariobruto * 0.08;
		double sindicato = salariobruto * 0.05;
		double totalDescontos = impostorenda + inss + sindicato;
		double salarioliquido = salariobruto - totalDescontos;
		
		System.out.println("Sal�rio bruto: " + salariobruto);
		System.out.println("Imposto de renda: " + impostorenda);
		System.out.println("INSS:" + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Total dos descontos: " + totalDescontos);
		System.out.println("Sal�rio l�quido: " + salarioliquido);

	}

}
