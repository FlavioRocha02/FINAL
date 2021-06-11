package exemplos;

public class Exemplo01 {

    public static void main(String[] args) {
        int cont;

        cont = 10; // inicialização = início
        while (cont >= 1) { //condição, enquanto for verdadeiro repete
            System.out.println(cont);
            // cont++; // passo 
            cont--;
            // cont = cont - 2;
        }

        System.out.println("fim: " + cont);
    }
}