package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int TOTAL_NUMEROS = 10; // constante, não pode alterar o valor
        int numero, pares = 0;
        double media = 0;

        for (int i = 1; i <= TOTAL_NUMEROS; i++) {
            System.out.printf("Digite o %dº número: ", i);
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                pares++;
                media = media + numero;
            }
        }
        
        media = media / pares;
        System.out.println("A média dos pares: " + media);
        System.out.printf("Porcentagem de impares: %.2f %%\n", (double)(TOTAL_NUMEROS-pares) / TOTAL_NUMEROS * 100 );

        teclado.close();
    }
}
