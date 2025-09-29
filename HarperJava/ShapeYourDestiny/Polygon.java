package ShapeYourDestiny;

class Polygon {
    int sideCount;

    private String nameOfShape;

    public Polygon(int sides, String name) {
        this.sideCount = sides;
        this.nameOfShape = name;
    }

    public int numberOfSides() {
        return sideCount;
    }

    public void printInfo() {
        System.out.println("this is a shape with " + numberOfSides() + " sides it's called " + nameOfShape);
    }
}