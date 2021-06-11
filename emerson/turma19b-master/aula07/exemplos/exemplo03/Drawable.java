package exemplos.exemplo03;

public interface Drawable {
    void draw();
    default void msg() {
        System.out.println("Mensagem padrão");
    }
}
