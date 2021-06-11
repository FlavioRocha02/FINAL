package exercicios.exercicio02;

public class AppPessoa {
    public static void main(String[] args) {
        // Pessoa p = new Pessoa("nome Pessoa", "11111111");
        Estudante e = new Estudante("nome estudante", "22222222", "Comutação");
        Professor prof = new Professor("nome professor", "33333333", 2000);

        // System.out.println(p);
        System.out.println(e);
        System.out.println(prof);
    }
}
