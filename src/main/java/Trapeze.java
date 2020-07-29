import java.util.Random;

public class Trapeze extends Figure {
    private double xC;
    private double yC;
    private double uS;
    private double dS;
    private double h;
    private Color color;

    public Trapeze() {
        xC = 0;
        yC = 0;
        uS = 0;
        dS = 0;
        h = 0;
        color = Color.Red;
    }

    public Trapeze(double xCorner, double yCorner, double upSize, double downSize, double height, Color recolor) {
        xC = xCorner;
        yC = yCorner;
        uS = upSize;
        dS = downSize;
        h = height;
        color = recolor;
    }

    public void setSize(double a, double b, double c) {
        uS = a;
        dS = b;
        h = c;
    }

    public double getArea() {
        return ((uS + dS / 2) * h);
    }

    public void setColor(Color recolor) {
        color = recolor;
    }

    public Color getColor() {
        return color;
    }

    public void refactorRandom() {
        Random random = new Random(25);
        xC = random.nextDouble();
        yC = random.nextDouble();
        uS = random.nextDouble();
        dS = random.nextDouble();
        h = random.nextDouble();
        color = Color.values()[random.nextInt(Color.values().length)];
    }

    public void setCoords(double a, double b) {
        xC = a;
        yC = b;
    }

    public void draw() {
        System.out.println(color + " trapeze is created. " +
                "Corner is in X:" + xC + " Y:" + yC + ", area =" + getArea());
    }
}
