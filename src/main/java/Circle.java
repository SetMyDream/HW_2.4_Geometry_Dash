import java.util.Random;

public class Circle extends Figure {
    private double radius;
    private Color color;

    @Override
    public double getArea() {
        return (Math.pow(radius, 2) * Math.PI);
    }

    public Circle() {
        this.radius = 0;
        this.color = Color.WHITE;
    }

    public Circle(double xCenter, double yCenter, double radius, Color color) {
        this.radius = radius;
        this.color = color;

    }

    public void setColor(Color recolor) {
        this.color = recolor;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void refactorRandom() {
        Random random = new Random();
        this.radius = 25*random.nextDouble();
        this.color = Color.values()[random.nextInt(Color.values().length)];
    }

    public void draw() {
        System.out.println(color + " circle is created, area =" + getArea() + " Also it`s round!");
    }
}

