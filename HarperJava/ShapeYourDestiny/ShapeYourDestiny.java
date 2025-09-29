package ShapeYourDestiny;

public class ShapeYourDestiny {

    public static void main(String[] args) {

        System.out.println("Starting the shape calculations!");

        double rectL = 5.0;
        double rectW = 10.0;
        Rectangle myRectangle = new Rectangle(rectL, rectW);
        System.out.println("\nI made a rectangle with length " + myRectangle.length + " and width " + myRectangle.width);
        System.out.println("The area of the rectangle is " + myRectangle.getArea());
        System.out.println("The perimeter of the rectangle is " + myRectangle.getPerimeter());
        System.out.println("And it has " + myRectangle.sideCount + " sides");

        double triL = 3.0;
        double triW = 4.0;
        rightTriangle myTriangle = new rightTriangle(triL, triW);
        System.out.println("\nNow for a triangle with Lengths " + myTriangle.legL + " and " + myTriangle.legW);
        System.out.println("The area of the triangle is " + myTriangle.getArea());
        System.out.println("The perimeter of the triangle is " + myTriangle.getPerimeter());
        myTriangle.printInfo();

        double squareSide = 7.0;
        Square mySquare = new Square(squareSide);
        System.out.println("\nNext, a square with side " + squareSide);
        System.out.println("The area of the square is " + mySquare.getArea());
        System.out.println("The perimeter of the square is " + mySquare.getPerimeter());
        mySquare.printInfo();

        double isoLength = 6.0;
        IsocelesRightTriangle myIsoTriangle = new IsocelesRightTriangle(isoLength);
        System.out.println("\nHow about an isosceles right triangle with Length " + isoLength);
        System.out.println("The area is " + myIsoTriangle.getArea());
        System.out.println("The perimeter is " + myIsoTriangle.getPerimeter());
        myIsoTriangle.printInfo();

        double circleRadius = 8.0;
        Circle myCircle = new Circle(circleRadius);
        System.out.println("\nFinally, a circle with radius " + myCircle.radius);
        System.out.println("The area of the circle is " + myCircle.getArea());
        System.out.println("The perimeter of the circle is " + myCircle.getPerimeter());
        System.out.println("Oops, circles don't have sides, so we can't use the Polygon interface.");
    }
}
