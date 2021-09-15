package com.carla.cursojava.aula13_labs;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado do quadrado:");
		double lado = scan.nextDouble();
		
		double areaquadrado = Math.pow(lado, 2);
		double dobroarea = areaquadrado * 2;
		
		System.out.println("�rea do quadrado: " + areaquadrado);
		System.out.println("Dobro da �rea: " + dobroarea);

	}

}