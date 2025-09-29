package ShapeYourDestiny;

class Rectangle extends Shape {

    public double length;
    public double width;

    public Rectangle(double l, double w) {
        super(4, "Rectangle");
        this.length = l;
        this.width = w;

        area = this.length * this.width;
        perimeter = 2 * (this.length + this.width);
    }
}
