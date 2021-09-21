package com.carla.cursojava.aula43_labs.exer01;

public class Exer01_Teste {

    public static void main(String[] args) {

        System.out.println("*** Teste ContaBancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente conta simples");
        contaSimples.setNumConta("11111");

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);

        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);

        System.out.println("---------------------------");

        System.out.println("*** Teste ContaPoupanca ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente conta poupanca");
        contaPoupanca.setNumConta("22222");
        contaPoupanca.setDiaRendimento(21);

        contaPoupanca.depositar(100);

        realizarSaque(contaPoupanca, 50);

        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado. Novo saldo de " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje nao e dia de rendimento, novo saldo nao calculado.");
        }

        System.out.println(contaPoupanca);

        System.out.println("---------------------------");

        System.out.println("*** Teste Contaespecial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente conta especial");
        contaEspecial.setNumConta("33333");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial, 70);

        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);


    }

    //polimorfismo = serve tbm para a contaPoupanca (extends ContaBancaria)
    private static void realizarSaque(ContaBancaria conta, double valor) {

        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso. Novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }
    }



}
