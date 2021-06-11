package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        // [TIPO] [NOME, NOME2, NOME3, ..];
        int numero; //declarando ou criando uma variável

        numero = 10; // atribuição, guardar um valor na variável

        System.out.println(numero);

        numero = 5; // sobrescreve

        System.out.println(numero);
        // System.out.println(numero + 5); não alatera
        numero = numero + 5;
        System.out.println(numero);

    }
}
