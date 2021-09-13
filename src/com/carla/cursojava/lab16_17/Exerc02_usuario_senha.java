package com.carla.cursojava.lab16_17;

import java.util.Scanner;

public class Exerc02_usuario_senha {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nomeUsuario;//boa prática: declarar as variáveis fora do loop.
		String senha;
		
		do {
			
			System.out.println("Entre com o nome do usuario:");
			nomeUsuario = scan.next();
			
			System.out.println("Entre com a senha:");
			senha = scan.next();
			
			if (nomeUsuario.equalsIgnoreCase(senha)) {
				//infoValida = false;
				System.out.println("Senha igual ao nome do usuario. Digie outra senha.");
			} else {
				infoValida = true;
				System.out.println("Usuario e senha validos.");
			}
			
		} while (!infoValida);// ! nega o false na flag

	}

}
