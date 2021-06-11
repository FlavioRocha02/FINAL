package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int resultado;

        resultado = soma(10, 5);
        System.out.println("Resultado = " + resultado);
        
        resultado = subtracao(10, 5);
        System.out.println("Resultado = " + resultado);

        System.out.println("Resultado = " + soma(20, 30));

        System.out.print("Resultado = ");
        multiplicacao(3, 2);
    }

    static int soma(int n1, int n2) {
        int resposta;
        resposta = n1 + n2;
        return resposta;
    }

    static int subtracao(int n1, int n2) {
        int resposta;
        resposta = n1 - n2;
        return resposta;
    }

    static void multiplicacao(int n1, int n2) {
        int resposta;
        resposta = n1 * n2;
        System.out.println(resposta);
    }

}
