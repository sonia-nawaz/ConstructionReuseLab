package software.reuse.lspbad;

public class Square extends Rectangle {
    @Override
    public void setDimensions(int w, int h) {
        if (w != h) {
            throw new IllegalArgumentException("Square requires w == h");
        }
        super.setDimensions(w, h);
    }
}