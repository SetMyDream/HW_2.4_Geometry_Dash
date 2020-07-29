import java.util.Random;

public class Triangle extends Figure {
    private double sizeA;
    private double sizeB;
    private double sizeC;
    private Color color;

    public Triangle() {
        this.sizeA = 0;
        this.sizeB = 0;
        this.sizeC = 0;
        this.color = Color.Black;
    }

    public Triangle(double xCorner, double yCorner, double sizeA, double sizeB, double sizeC, Color color) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
        this.color = color;
    }

    public void setSize(double a, double b, double c) {
        this.sizeA = a;
        this.sizeB = b;
        this.sizeC = c;
    }

    public double getArea() {
        double p = (Math.abs(sizeA) + Math.abs(sizeB) + Math.abs(sizeC)) / 2;
        return (Math.sqrt(p * (sizeA - p) * (sizeB - p) * (sizeC - p)));
    }

    public void setColor(Color recolor) {
        this.color = recolor;
    }

    public double[] getAngles() {
        double angA = Math.acos((sizeA * sizeA + sizeB * sizeB - sizeC * sizeC) / 2 * sizeA * sizeB);
        double angB = Math.acos((sizeA * sizeA + sizeC * sizeC - sizeB * sizeB) / 2 * sizeA * sizeC);
        double angC = Math.acos((sizeC * sizeC + sizeB * sizeB - sizeA * sizeA) / 2 * sizeC * sizeB);
        return new double[]{angA, angB, angC};
    }

    public String isRectangular() {
        double[] angles = this.getAngles();
        double maxAngle = angles[0];
        for (double angle : angles) {
            maxAngle = Math.max(maxAngle, angle);
        }
        return (maxAngle == (double) 90) ? " is rectangular!" : " is NOT rectangular!";
    }

    public Color getColor() {
        return color;
    }

    public void refactorRandom() {
        Random random = new Random();
        this.sizeA = 15 * random.nextDouble();
        this.sizeB = 15 * random.nextDouble();
        this.sizeC = 15 * random.nextDouble();
        if (Math.max(Math.max(sizeA, sizeB), sizeC) * 2 - (sizeA + sizeB + sizeC) <= 0) {
            refactorRandom();
        }
        this.color = Color.values()[random.nextInt(Color.values().length)];
    }

    public void draw() {
        System.out.println(this.color + " triangle is created, area =" + this.getArea()+this.isRectangular());
    }
}
