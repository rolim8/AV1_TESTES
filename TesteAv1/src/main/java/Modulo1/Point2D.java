package Modulo1;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double dist(Point2D other) {
        return Math.sqrt((this.x - other.x) * (this.x - other.x) + (this.y - other.y) *
                (this.y - other.y));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) {
            return true;
        }

        if (!(o instanceof Point2D)) {
            return false;
        }

        Point2D other = (Point2D)o;
        return this.dist(other)<0.001;
    }
}