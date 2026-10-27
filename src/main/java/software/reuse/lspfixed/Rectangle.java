package software.reuse.lspfixed;

public class Rectangle implements Shape {
    private int w, h;

    public Rectangle(int w, int h) {
        setDimensions(w, h);
    }

    public void setDimensions(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public int area() {
        return w * h;
    }
}