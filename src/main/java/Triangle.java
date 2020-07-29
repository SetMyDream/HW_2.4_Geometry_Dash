import java.util.Random;

public class Triangle extends Figure {
    private double xC;
    private double yC;
    private double sA;
    private double sB;
    private double sC;
    private Color color;

    public Triangle() {
        xC = 0;
        yC = 0;
        sA = 0;
        sB = 0;
        sC = 0;
        color = Color.Black;
    }

    public Triangle(double xCorner, double yCorner, double sizeA, double sizeB, double sizeC, Color recolor) {
        xC = xCorner;
        yC = yCorner;
        sA = sizeA;
        sB = sizeB;
        sC = sizeC;
        color = recolor;
    }

    public void setSize(double a, double b, double c) {
        sA = a;
        sB = b;
        sC = c;
    }

    public double getArea() {
        double p = (Math.abs(sA) + Math.abs(sB) + Math.abs(sC)) / 2;
        return ((double) Math.sqrt(p * (sA - p) * (sB - p) * (sC - p)));
    }

    public void setColor(Color recolor) {
        color = recolor;
    }

    public Color getColor() {
        return color;
    }

    public void refactorRandom() {
        Random random = new Random();
        xC = 10 * random.nextDouble();
        yC = 10 * random.nextDouble();
        sA = 15 * random.nextDouble();
        sB = 15 * random.nextDouble();
        sC = 15 * random.nextDouble();
        color = Color.values()[random.nextInt(Color.values().length)];
    }

    public void setCoords(double a, double b) {
        xC = a;
        yC = b;
    }

    public void draw() {
        System.out.println(color + " triangle is created. " +
                "Corner is in X:" + xC + " Y:" + yC + ", area =" + getArea());
    }
}
