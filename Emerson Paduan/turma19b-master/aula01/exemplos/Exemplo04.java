package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, dobro;

        /* ENTRADA */
        System.out.println("Digite um numero inteiro:");
        numero = entrada.nextInt(); // lendo um número inteiro do teclado e guardando na varia´vel 'numero'

        /* PROCESSAMENTO */
        dobro = numero * 2; 

        /* SAIDA */
        System.out.println("Você digitou " + numero);
        System.out.println("O dobro é " + dobro);

        entrada.close();
    }
}
