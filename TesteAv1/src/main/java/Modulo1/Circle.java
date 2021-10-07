package Modulo1;

public class Circle extends AbstractShape {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(new Point2D(x, y));
        this.radius = radius;
    }

    public Circle(double radius) {
        super(new Point2D(0, 0));
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Shape resize(double factor) {
        return new Circle(reference.getX(), reference.getY(), Math.sqrt(factor) * radius);
    }


    public String toString() {
        return String.format("Circle: center (%.3f,%.3f) radius %.3f",
                this.reference.getX(), this.reference.getY(), this.radius);
    }

    @Override
    protected boolean equalsCircle(Circle other) {
        return Math.abs(this.reference.dist(other.reference)) < 0.001 && Math.abs
                (this.radius - other.radius) < 0.001;
    }

    public boolean equals(Object other) {
        if (other instanceof AbstractShape) {
            AbstractShape ashape = (AbstractShape) other;
            //we know that this is a rectangle, so we check rectangle equality
            return ashape.equalsCircle(this);
        }
        return false; //since it is not AbstractShape it is not a circle either, so return false
    }
}