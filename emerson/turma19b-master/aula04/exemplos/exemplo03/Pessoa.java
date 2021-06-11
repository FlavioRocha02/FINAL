package exemplos.exemplo03;

public class Pessoa {
    // atributos
    String nome;
    int telefone;

    // métodos
    Pessoa(String n, int t) {  // construtor
        nome = n;
        telefone = t;
    }

    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
    }

    int obterTelefone() {
        return telefone;
    }

}
