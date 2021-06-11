package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Gol", "VW", 12.5);
        
        v.exibir();

        // v.consumo = -12;
        v.setConsumo(-13);
        
        // System.out.println("Consumo: " + v.consumo);
        System.out.println("Consumo: " + v.getConsumo());

    }

}
