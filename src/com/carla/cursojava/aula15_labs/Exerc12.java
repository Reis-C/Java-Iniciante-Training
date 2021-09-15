package com.carla.cursojava.aula15_labs;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora trabalhada:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas no m�s:");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		
		int percentualIR = 0;
		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		} else if (salarioBruto < 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		} else if (salarioBruto > 2500) {
			percentualIR = 20;
		}
		
		double descontoIR = (salarioBruto / 100) * percentualIR;
		double INSS = salarioBruto * 0.10;
		double FGTS = salarioBruto * 0.11;
		double descontos = descontoIR + INSS;
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("----------------------");
		System.out.println("  FOLHA DE PAGAMENTO  ");
		System.out.println("----------------------");
		System.out.println("Sal�rio Bruto: R$ " + salarioBruto);
		System.out.println("IR (" + percentualIR  + "%): R$ " + descontoIR);
		System.out.println("INSS (10%): R$ " + INSS);
		System.out.println("FGTS (11%): R$ " + FGTS);
		System.out.println("Total de descontos: R$ " + descontos);
		System.out.println("Sal�rio L�quido: R$ " + salarioLiquido);
		
		
		
		
		
		
		
		

	}

}