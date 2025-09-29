package ShapeYourDestiny;

class Shape extends Polygon {

    public double area;

    public double perimeter;

    public Shape(int sides, String name) {
        super(sides, name);
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
