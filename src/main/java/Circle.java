import java.util.Random;

public class Circle extends Figure {
    private double diam;
    private double xC;
    private double yC;
    private Color color;

    @Override
    public double getArea() {
        double pi = 3.1415926535;
        return (Math.pow(diam, 2) * pi / 4);
    }

    public Circle() {
        diam = 0;
        xC = 0;
        yC = 0;
        color = Color.White;
    }

    public Circle(double xCenter, double yCanter, double diameter, Color recolor) {
        diam = diameter;
        xC = xCenter;
        yC = yCanter;
        color = recolor;

    }

    public void setColor(Color recolor) {
        color = recolor;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void refactorRandom() {
        Random random = new Random();
        diam = 25*random.nextDouble();
        xC = 15*random.nextDouble();
        yC = 12*random.nextDouble();
        color = Color.values()[random.nextInt(Color.values().length)];
    }

    public void draw() {
        System.out.println(color + " circle is created. " +
                "Center is in X:" + xC + " Y:" + yC + ", area =" + getArea());
    }

    public void setCoords(double x, double y) {
        xC = x;
        yC = y;
    }
}
