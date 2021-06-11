package exercicios.exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio reg = new Relogio(16,5,6);

        // reg.hora = -76;

        reg.setMinuto(-12);
        System.out.println(reg.getHora());
        System.out.println(reg.getMinuto());
        System.out.println(reg.getSegundo());

        System.out.println("Hora atual: " + reg.horaAtual());
    }
    
}
