package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tabuada, cont;

        System.out.println("Digite o número:");
        tabuada = teclado.nextInt();

        cont = 0;
        while (cont <= 10) {
            // System.out.println(tabuada + " X " + cont + " = " + (tabuada * cont));
            System.out.printf("%d X %02d = %2d\n",  tabuada, cont, (tabuada * cont));
            cont++;
        }

        teclado.close();
    }
}
