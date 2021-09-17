package com.carla.cursojava.aula27_labs_oo2;


public class Exer02_ContaCorrente {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "0123";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
        
        boolean saqueEfetuado = conta.realizarSaque(10);

        if(saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Nao foi possivel realizar saque. Saldo insuficiente.");
        }

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais");

        if(saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Nao foi possivel realizar saque. Saldo insuficiente.");
        }

        System.out.println("Deposito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();

        if(conta.verificarUsoChequeEspecial()) {
            System.out.println("Esta usando cheque especial.");
        } else {
            System.out.println("Nao esta usando cheque especial.");
        }

        conta.realizarSaque(600);
        conta.consultarSaldo();
        if(conta.verificarUsoChequeEspecial()) {
            System.out.println("Esta usando cheque especial.");
        } else {
            System.out.println("Nao esta usando cheque especial.");
        }

    }
}
