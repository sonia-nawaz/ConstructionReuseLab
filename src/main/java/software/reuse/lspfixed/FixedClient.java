package software.reuse.lspfixed;

public class FixedClient {
    public static void main(String[] args) {
        Shape[] shapes = { new Rectangle(5, 10), new Square(4) };
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + " area = " + s.area());
        }
    }
}