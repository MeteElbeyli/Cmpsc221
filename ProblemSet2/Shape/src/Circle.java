public class Circle implements Shape
{
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newR) {
        radius = newR;
    }
    public double area() {
        return radius * radius * Math.PI;
    }
}