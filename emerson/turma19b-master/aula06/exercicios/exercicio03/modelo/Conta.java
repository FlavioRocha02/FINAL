package exercicios.exercicio03.modelo;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }
    
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }
    
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return numero + " : " + saldo;
    }

    public boolean depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if(valor > 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

}
