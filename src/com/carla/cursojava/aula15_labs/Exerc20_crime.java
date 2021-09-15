package com.carla.cursojava.aula15_labs;

import java.util.Scanner;

public class Exerc20_crime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a v�tima?:");
		String resposta1 = scan.next();
		
		System.out.println("Esteve no local do crime?:");
		String resposta2 = scan.next();
		
		System.out.println("Mora perto da v�tima?:");
		String resposta3 = scan.next();
		
		System.out.println("Devia para a v�tima?:");
		String resposta4 = scan.next();
		
		System.out.println("J� trabalhou com a v�tima?:");
		String resposta5 = scan.next();
		
		int contador = 0;// contar o n�mero de "sim"
		
		if (resposta1.equalsIgnoreCase("S")) {
			contador++;
		}
		
		if (resposta2.equalsIgnoreCase("S")) {
			contador++;
		}
		
		if (resposta3.equalsIgnoreCase("S")) {
			contador++;
		}
		
		if (resposta4.equalsIgnoreCase("S")) {
			contador++;
		}
		
		if (resposta5.equalsIgnoreCase("S")) {
			contador++;
		}
		
		if (contador == 2) {
			System.out.println("Suspeita");
		} else if (contador == 3 || contador == 4) {
			System.out.println("C�mplice");
		} else if (contador == 5) {
			System.out.println("Assassino");
		} else if (contador == 0){
			System.out.println("Inocente");
		}

	}

}
