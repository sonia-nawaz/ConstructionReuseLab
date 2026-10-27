package software.reuse.lspbad;

public class Rectangle {
    protected int w, h;

    public void setDimensions(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public int area() {
        return w * h;
    }
}