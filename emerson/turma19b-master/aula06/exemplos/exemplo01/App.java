package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Emerson", 1000);
        Funcionario func2 = new Funcionario("Ricardo");
        Gerente ger = new Gerente("Arnaldo", 1000, 10);

        func.aumentarSalario(0.1);
        func2.aumentarSalario(0.1);
        ger.aumentarSalario(0.1);

        System.out.println(func.imprimir());
        System.out.println(func2.imprimir());
        System.out.println(ger.imprimir());

        System.out.println(func);
        System.out.println(ger);
    }
}
