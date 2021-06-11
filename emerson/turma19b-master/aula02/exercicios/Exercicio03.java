package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;

        // entrada
        System.out.println("Digite os dois números:");
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();

        // processamneto / saída
        if (n1 > n2) {
            System.out.println(n1 + ", " + n2);
        } else {
            System.out.printf("%.2f, %.2f\n", n2, n1);
        }

        entrada.close();
    }

}
