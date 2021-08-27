package com.carla.cursojava.lab11_12_13;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo para download:");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Digite o velocidade da Internet:");
		double velocidadeInternet = scan.nextDouble();
		
		double tempodownload = tamanhoArquivo / velocidadeInternet;
		
		System.out.println("O tempo aproximado de download �: " + tempodownload);

	}

}
