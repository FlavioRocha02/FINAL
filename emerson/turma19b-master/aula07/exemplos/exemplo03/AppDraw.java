package exemplos.exemplo03;

public class AppDraw {
    public static void main(String[] args) {
        Drawable d1 = new Rectangle();
        Drawable d2 = new Circle();

        d1.draw();
        d2.draw();
        d1.msg();
        d2.msg();
    }
    
}
