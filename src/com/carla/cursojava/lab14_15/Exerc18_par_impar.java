package com.carla.cursojava.lab14_15;

import java.util.Scanner;

public class Exerc18_par_impar {
	
	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero: ");
		int num = scan.nextInt();
		
		//o resto(%) da divis�o do num por 2 deve ser 0.
		if (num % 2 == 0) {
			System.out.println(num + " � par.");
		} else {
			System.out.println(num + " � �mpar.");
		}
	}

}
