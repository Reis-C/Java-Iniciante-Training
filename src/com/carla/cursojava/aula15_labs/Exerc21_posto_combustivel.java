package com.carla.cursojava.aula15_labs;

import java.util.Scanner;

public class Exerc21_posto_combustivel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de litros vendidos:");
		double litros = scan.nextDouble();
		
		System.out.println("Insira o tipo do combust�vel:");
		String tipo = scan.next();
		
		double precoGas = 2.5;
		double precoAlcool = 1.9;
		int percDesconto = 0;
		double total = 0;
		double totalDesconto = 0;
		
		if (tipo.equalsIgnoreCase("a")) {
			
			if (litros <= 20) {
				percDesconto = 3;
			} else {
				percDesconto = 5;
			}
			
		 total =  litros * precoAlcool;
		}
		
		if (tipo.equalsIgnoreCase("g")) {
			
			if (litros <= 20) {
				percDesconto = 4;
			} else {
				percDesconto = 6;
			}
			
			total =  litros * precoGas;
		}
		
		totalDesconto = (total / 100) * percDesconto;
		
		double precoAPagar = total - totalDesconto;
		
		System.out.println("Valor a ser pagar: " + precoAPagar);

	}

}
