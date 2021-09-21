package com.carla.cursojava.aula43_labs.exer01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public ContaPoupanca() { }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        String s = "ContaPoupanca {";
        s += "diaRendimento = " + diaRendimento + "\n";
            s+= super.toString();
            s+= "}";

            return s;
    }

    public boolean calcularNovoSaldo (double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();
                                //para obter apenas o dia
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            //saldo += saldo * taxaRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }

        return false;
    }
}
