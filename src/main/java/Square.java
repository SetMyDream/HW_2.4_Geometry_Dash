import java.util.Random;

public class Square extends Figure {
    private double size;
    private Color color;

    public Square() {
        this.size = 0;
        this.color = Color.WHITE;
    }

    public Square(double xCorner, double yCorner, double size, Color recolor) {
        this.size = size;
        this.color = recolor;
    }

    public void setSize(double a) {

    }

    public double getArea() {
        return (size * size);
    }

    public void setColor(Color recolor) {
        this.color = recolor;
    }

    public Color getColor() {
        return color;
    }

    public void refactorRandom() {
        Random random = new Random();
        this.size = 15 * random.nextDouble();
        this.color = Color.values()[random.nextInt(Color.values().length)];
    }

    public void draw() {
        System.out.println(color + " square is created, area =" + getArea() + "Also it`s diagonal " + (Math.sqrt(2) * size));
    }
}
