package exemplos;

public class Exemplo01 {

    public static void main(String[] args) {
        linha();
        System.out.println("Aplicação v0.1");
        linha();
        System.out.println("Menu");
        linha2(4);
        int tam = 10;
        linha2(tam);
        linha3(10, '*');
        linha3(20, '_');
    }

    static void linha() {
        System.out.println("---------------");
    }

    static void linha2(int tamanho) {
        for(int i=1; i <= tamanho; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    static void linha3(int tamanho, char simbolo) {
        for(int i=1; i <= tamanho; i++){
            System.out.print(simbolo);
        }
        System.out.println();
    }
    
}
