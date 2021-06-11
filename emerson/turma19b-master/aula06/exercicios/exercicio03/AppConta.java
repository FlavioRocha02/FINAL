package exercicios.exercicio03;

import java.util.Scanner;

import exercicios.exercicio03.modelo.Conta;
import exercicios.exercicio03.util.GerenciaContas;

public class AppConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu;
        int numeroConta;
        double valor, limite;

        GerenciaContas contas = new GerenciaContas();

        do {
            System.out.print("\033[H\033[2J"); // "limpar" a tela
            System.out.println("1-Nova Conta Corrente");
            System.out.println("2-Nova Conta Especial");
            System.out.println("3-Nova Conta Poupança");
            System.out.println("4-Saque");
            System.out.println("5-Depósito");
            System.out.println("6-Saldo");
            System.out.println("7-Sair");
            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    contas.novaContaCorrente(numeroConta);
                    break;

                case 2:
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o limite:");
                    limite = entrada.nextDouble();
                    contas.novaContaEspecial(numeroConta, limite);
                    break;

                case 3:
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;

                case 4:
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Qual o valor do saque?");
                    valor = entrada.nextDouble();
                    if (contas.sacar(numeroConta, valor)) {
                        System.out.println("Saque realizado");
                    } else {
                        System.out.println("Falha na operação");
                    }
                    break;

                case 5:
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Qual o valor do depósito?");
                    valor = entrada.nextDouble();
                    if (contas.depositar(numeroConta, valor)) {
                        System.out.println("Depósito realizado");
                    } else {
                        System.out.println("Falha na operação");
                    }
                    break;

                case 6:
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    Conta conta = contas.getConta(numeroConta);  

                    if (conta != null) {
                        System.out.println(conta);
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;

                case 7:
                    break;

                default: // caso contrário
                    System.out.println("Opção inválida!");
            }

            System.out.println("Tecle ENTER para continuar...");
            entrada.nextLine();
            entrada.nextLine();

        } while (menu != 7);

        entrada.close();
    }
}
