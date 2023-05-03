public class ShapeTest
{
    public static void main(String args[]) {
        Circle c = new Circle(8);
        Rectangle r = new Rectangle(6, 5);
        ShowArea(c);
        ShowArea(r);
    }
    public static void ShowArea(Shape s) {
        double area = s.area();
        System.out.println("Area of the Shape provided is: " + area);
    }
}