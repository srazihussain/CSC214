package ShapeYourDestiny;

class rightTriangle extends Shape {
    public double legL;
    public double legW;

    public rightTriangle(double l, double w) {
        super(3, "RightTriangle");
        this.legL = l;
        this.legW = w;
        area = 0.5 * legL * legW;
        perimeter = legL + legW + Math.sqrt(legL * legL + legW * legW);
    }
}