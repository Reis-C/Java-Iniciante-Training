package com.carla.cursojava.aula17_labs;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		
		
	boolean infoValida = false;
		
		do {
			
			System.out.println("Entre com o nome:");
			nome = scan.next();
			
			if (nome.length() > 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa no maximo 3 caracteres.");
			}
			
		} while (!infoValida);//torna-se false. flag mudou para true acima.
		
		
	infoValida = false;
		
		do {
			
			System.out.println("Entre com a idade:");
			idade = scan.nextInt();
			
			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150.");
			}
			
		} while (!infoValida);
		
		
	infoValida = false;
		
		do {
			
			System.out.println("Entre com o salario:");
			salario = scan.nextDouble();
			
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salario precisa ser maior que 0.");
			}
			
		} while (!infoValida);
		
		
	infoValida = false;
		
		do {
			
			System.out.println("Entre com o sexo:");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("Sexo precisa ser 'f' ou 'm'.");
			}
			
		} while (!infoValida);
		
		
	infoValida = false;
		
		do {
			
			System.out.println("Entre com o estado civil:");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("s") || 
					estadoCivil.equalsIgnoreCase("c") || 
					estadoCivil.equalsIgnoreCase("v") || 
					estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("O estado civil precisa ser 's','c', 'v' ou 'd'.");
			}
			
		} while (!infoValida);
		
		
		System.out.println("As seguintes informacoes foram coletadas:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: R$" + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);

	}

}
