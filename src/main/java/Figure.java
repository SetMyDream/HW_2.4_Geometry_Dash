public abstract class Figure {
    private Color color;
    private double area;

    public Figure(Color color, double area) {
        this.color = color;
        this.area = area;
    }

    protected Figure() {
    }

    public abstract double getArea();

    public abstract void setColor(Color color);

    public abstract Color getColor();

    public abstract void refactorRandom();

    public abstract void setCoords(double a, double b);

    public abstract void draw();
}
