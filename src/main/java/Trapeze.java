import java.util.Random;

public class Trapeze extends Figure {
    private double upperSide;
    private double downSide;
    private double height;
    private Color color;

    public Trapeze() {
        this.upperSide = 0;
        this.downSide = 0;
        this.height = 0;
        this.color = Color.Red;
    }

    public Trapeze(double xCorner, double yCorner, double upSize, double downSize, double height, Color recolor) {
        this.upperSide = upSize;
        this.downSide = downSize;
        this.height = height;
        this.color = recolor;
    }

    public void setSize(double a, double b, double c) {
        this.upperSide = a;
        this.downSide = b;
        this.height = c;
    }

    public double getArea() {
        return ((upperSide + downSide / 2) * height);
    }

    public void setColor(Color recolor) {
        this.color = recolor;
    }

    public Color getColor() {
        return color;
    }

    public void refactorRandom() {
        Random random = new Random();
        this.upperSide = 14*random.nextDouble();
        this.downSide = 10*random.nextDouble();
        this.height = random.nextDouble();
        this.color = Color.values()[random.nextInt(Color.values().length)];
    }

    public String isStable() {
        return upperSide > downSide ?" is tend to be upside down":" is stable";
    }

    public void draw() {
        System.out.println(color + " trapeze is created, area =" + getArea() + this.isStable());
    }
}
