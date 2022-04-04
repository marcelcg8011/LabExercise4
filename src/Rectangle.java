public class Rectangle {
    private final double breadth;
    private final double length;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public double getArea()
    {
        return breadth * length;
    }

    public double getPerimeter()
    {
        double WidthPerimeter = breadth * 2;
        double LengthPerimeter = length * 2;
        return WidthPerimeter + LengthPerimeter;
    }
}
