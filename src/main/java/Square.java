import java.util.Random;

public class Square extends Figure {
    private double s;
    private double xC;
    private double yC;
    private Color color;

    public Square() {
        s = 0;
        xC = 0;
        yC = 0;
        color = Color.White;
    }

    public Square(double xCorner, double yCorner, double size, Color recolor) {
        s = size;
        xC = xCorner;
        yC = yCorner;
        color = recolor;
    }

    public void setS(double a) {

    }

    public double getArea() {
        return (s * s);
    }

    public void setColor(Color recolor) {
        color = recolor;
    }

    public Color getColor() {
        return color;
    }

    public void refactorRandom() {
        Random random = new Random(5);
        s = random.nextDouble();
        xC = random.nextDouble();
        yC = random.nextDouble();
        color = Color.values()[random.nextInt(Color.values().length)];
    }

    public void setCoords(double a, double b) {
        xC = a;
        yC = b;
    }

    public void draw() {
        System.out.println(color + " square is created. " +
                "Corner is in X:" + xC + " Y:" + yC + ", area =" + getArea());
    }
}
