package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, novoSalario;

        /* ENTRADA */
        System.out.println("Informe o valor do salário:");
        salario = entrada.nextDouble();

        /* PROCESSAMENTO */

        // novoSalario =  salario + salario * 0.25;
        novoSalario =  salario * 1.25;

        /* SAÍDA */
        System.out.println("Novo salário: " + novoSalario);

        entrada.close();
    }
}
