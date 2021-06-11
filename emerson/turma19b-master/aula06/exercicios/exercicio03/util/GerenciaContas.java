package exercicios.exercicio03.util;

import java.util.HashMap;

import exercicios.exercicio03.modelo.Conta;
import exercicios.exercicio03.modelo.ContaCorrente;
import exercicios.exercicio03.modelo.ContaEspecial;
import exercicios.exercicio03.modelo.ContaPoupanca;

public class GerenciaContas {
    private HashMap<Integer, Conta> contas;

    public GerenciaContas() {
        contas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        contas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        contas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        contas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public boolean sacar(int numeroConta, double valor) {
        Conta conta = contas.get(numeroConta);
        if (conta == null) {
            return false;
        }
        return conta.sacar(valor);
    }

    public boolean depositar(int numeroConta, double valor) {
        Conta conta = contas.get(numeroConta);
        if (conta == null) {
            return false;
        }
        return conta.depositar(valor);
    }

    public String getSaldo(int numeroConta) {
        Conta conta = contas.get(numeroConta);
        if (conta == null) {
            return "Conta não encontrada";
        }
        return conta.toString();
    }

    public Conta getConta(int numeroConta) {
        Conta conta = contas.get(numeroConta);
        if (conta == null) {
            return null;
        }
        return new Conta(conta.getNumero(), conta.getSaldo());
    }

}
