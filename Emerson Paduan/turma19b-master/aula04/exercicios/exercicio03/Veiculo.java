package exercicios.exercicio03;

public class Veiculo {
    // atributos
    private String modelo, marca;
    private double consumo;

    //métodos
    public Veiculo(String modelo, String marca, double consumo ) {
        this.modelo = modelo; // this se refere ao atributo 
        this.marca = marca;
        setConsumo(consumo);
    }

    public void exibir() {
        System.out.printf("Marca: %s Modelo: %s\n", marca, modelo);
    }

    public double getConsumo() {
        return consumo;
    } 

    public void setConsumo(double novoConsumo) {
        if(novoConsumo > 0){
            consumo = novoConsumo;
        }
    }

}
