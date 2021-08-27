package com.carla.cursojava.lab14_15;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com uma letra:");
		
		String alfabeto = scan.next();
		
		/*if(alfabeto.equalsIgnoreCase("a") || alfabeto.equalsIgnoreCase("e") || 
				alfabeto.equalsIgnoreCase("i") || alfabeto.equalsIgnoreCase("o") || 
				alfabeto.equalsIgnoreCase("u")) {
			System.out.println("A letra informada � uma vogal.");
		} else {
			System.out.println("A letra informada � uma consoante.");
		}*/
		
		if(alfabeto.length() > 1) {
			System.out.println("N�o � uma letra v�lida");
		}else {
			switch(alfabeto) {
			case "A":
			case "E":
			case "I":
			case "O":
			case "U	":
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": System.out.println("A letra informada � uma vogal."); break;
			default: System.out.println("A letra informada � uma consoante.");		
		}
		}
		
		
	}

}
