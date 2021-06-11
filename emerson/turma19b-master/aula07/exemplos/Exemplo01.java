package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");

        try {
            numero = Integer.parseInt( entrada.nextLine() );
            System.out.println("Você digitou " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida.");
        } catch (NumberFormatException e) {
            System.out.println("Número inválido.");
            System.err.println("Msg: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            entrada.close();
            System.out.println("Conexão encerrada....");
        }

        System.out.println("Final...");
       
    }

}