package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int nFuncionarios;

    public Gerente(String nome, double salario, int nFuncionarios) {
        super(nome, salario); // chamada ao construtor da superclasse ='FUNCIONARIO'
        this.nFuncionarios = nFuncionarios;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + " : " + nFuncionarios;
    }

    @Override
    public void aumentarSalario(double perc) {
        super.aumentarSalario(perc + 0.2);
    }

    @Override
    public String toString() {
        return super.toString() + " : " + nFuncionarios;
    }

}
