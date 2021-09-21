package com.carla.cursojava.aula43_labs.exer01;

public class ContaEspecial extends ContaBancaria {

    protected double limite;

    public ContaEspecial() {
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = "ContaEspecial {";
        s += "limite: " + limite;
        s += "; " + super.toString();
        s += "}";
        return s;
    }

    public boolean sacar(double valor) {

        double saldoComLimite = this.getSaldo() + limite;

        if (saldoComLimite - valor >= 0) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }

        return false;
    }

}
