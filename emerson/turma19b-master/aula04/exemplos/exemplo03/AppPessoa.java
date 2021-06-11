package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Emerson", 12345);
        Pessoa p2 = new Pessoa("Carlos", 54321);

/*         p.nome = "Emerson";
        p.telefone = 12345; */
        p.apresentar();
        System.out.println("Meu telefone é " + p.obterTelefone());

/*         p2.nome = "Carlos";
        p2.telefone = 54321; */
        p2.apresentar();
        System.out.println("Meu telefone é " + p2.obterTelefone());

    }

}
