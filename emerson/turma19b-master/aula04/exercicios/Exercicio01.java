package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
/*         boolean resultado ;

        resultado = ehPar(12); */

        if(ehPar(12)) { // resultado: true->true, resultado : false->false
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

    }

/*     static boolean ehPar(int numero) {
        boolean res;
        if(numero % 2 == 0) {
            res = true;
        } else {
            res = false;
        }
        return res;
    } */

/*     static boolean ehPar(int numero) {
        if(numero % 2 == 0) {
            return true;
        } 
        return false;
    } */

    static boolean ehPar(int numero) {
        return (numero % 2 == 0);
    }

}
