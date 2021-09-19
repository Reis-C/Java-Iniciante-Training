package com.carla.cursojava.aula36_labs;

import java.util.Scanner;

public class Exer01_Teste {

    public static void main(String[] args) {
        
//System.in = entrada de dados pelo teclado/console
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);
//        Agenda agenda = new Agenda();
//        agenda.setNome();

        Contato[] contatos = new Contato[3];

        for (int i = 0; i<3; i++) {
            System.out.println("Entre com as informacoes do contato " + (i+1));
            Contato c = new Contato();

            System.out.println("Entre com o nome");
            nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Entre com o telefone");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o email");
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;//add o objeto criado "c" no array
        }

        agenda.setContatos(contatos);


        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }

    }
}
