package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        double metade;

        System.out.println("Digite o número:");
        numero = entrada.nextInt();

        if (numero > 20) {
            metade = (double)numero / 2; // casting = conversão de tipos
            System.out.printf("Metade = %f\n", metade);
            System.out.println("Metade = " + ((double)numero / 2));
        }

        entrada.close();
    }
}
