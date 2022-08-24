public class Square extends Figura {
    private static final String NAME = "Square";

    private double width;
    private double height;

    public Square(double width, double height) {
        extracted(width, height);
    }

    private void extracted(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}