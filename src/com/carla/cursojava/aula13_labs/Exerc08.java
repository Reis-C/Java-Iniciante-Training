package com.carla.cursojava.aula13_labs;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora?");	
		double valorhora = scan.nextDouble();	
		
		System.out.println("Quantas horas trabalhadas no m�s?");
		double horastrabalhadas = scan.nextDouble();
		
		double salario = valorhora * horastrabalhadas;	
		System.out.println("O sal�rio mensal � de : " + salario);

	}

}
