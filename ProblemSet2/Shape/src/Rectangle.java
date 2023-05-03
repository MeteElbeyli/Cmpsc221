public class Rectangle implements Shape
{

    private double length;
    private double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double newL) {
        length = newL;
    }
    public void setWidth(double newW) {
        width = newW;
    }

    public double area() {
        return length * width;
    }
}
