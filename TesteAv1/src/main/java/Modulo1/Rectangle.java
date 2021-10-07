package Modulo1;

public class Rectangle extends AbstractShape {
    protected double width, height;

    public Rectangle(double x, double y, double width, double height) {
        super(new Point2D(x, y));
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public Shape resize(double factor) {
        double sqrtFactor = Math.sqrt(factor);
        return new Rectangle(
                this.reference.getX(),
                this.reference.getY(), sqrtFactor *
                this.width,
                sqrtFactor * this.height);
    }

    public String toString() {
        return String.format("Rectangle: LL corner (%.3f,%.3f) width %.3f height " +
                        "%.3f",
                this.reference.getX(), this.reference.getY(), this.width, this
                        .height);
    }

    @Override
    protected boolean equalsRectangle(Rectangle other) {
        return this.reference.equals(other.reference)
                && Math.abs(this.width - other.width) < 0.001
                && Math.abs(this.height - other.height) < 0.001;
    }

    public boolean equals(Object other) {
        if (other instanceof AbstractShape) {
            AbstractShape ashape = (AbstractShape) other;
            //we know that this is a rectangle, so we check rectangle equality
            return ashape.equalsRectangle(this);
        }
        return false; //since it is not AbstractShape it is not a rectangle either,
        // so return false
    }
}