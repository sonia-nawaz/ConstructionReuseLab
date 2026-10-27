package software.reuse.lspbad;

public class BadClient {
    public static void main(String[] args) {
        Rectangle r = new Square();
        System.out.println("Setting w=5, h=10 on a Rectangle reference...");
        r.setDimensions(5, 10);
        System.out.println("Area: " + r.area());
    }
}