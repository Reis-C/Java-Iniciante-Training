package com.carla.cursojava.lab14_15;

import java.util.Scanner;

public class Exerc23_carnesdescontos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o tipo da carne:");
		System.out.println("1 - fil� duplo");
		System.out.println("2 - alcatra");
		System.out.println("3 - picanha");
		
		int tipo = scan.nextInt();
		
		System.out.println("Insira quantidade (kg):");
		double qtdcarne = scan.nextDouble();
		
		double precoKg = 0;
		
		if (tipo == 1) {
			
			System.out.println(qtdcarne + "kg - fil� duplo");
			
			if(qtdcarne < 5) {
				precoKg = 4.9;
			} else {
				precoKg = 5.8;
			}
		} else if (tipo == 2) {
			
			System.out.println(qtdcarne + "kg - alcatra");
			
			if(qtdcarne < 5) {
				precoKg = 5.9;
			} else {
				precoKg = 6.8;
			}
		} else if (tipo == 3) {
			
			System.out.println(qtdcarne + "kg - picanha");
			
			if(qtdcarne < 5) {
				precoKg = 6.9;
			} else {
				precoKg = 7.8;
			}
		} else {
			System.out.println("C�digo inv�lido.");
		}
		
		double total = qtdcarne * precoKg;
		System.out.println(qtdcarne + " kg * " + precoKg + " = " + total);
		
		System.out.println("Compra no cart�o? digite 1 para sim.");
		int cartao = scan.nextInt();
		
		if (cartao == 1) {
			double desconto = (total / 100) * 5;
			
			System.out.println("Desconto de: " + desconto);
			System.out.println("Valor a pagar de: " + (total - desconto));
		} else {
			System.out.println("Valor a pagar de: " + total);
		}

	}

}
