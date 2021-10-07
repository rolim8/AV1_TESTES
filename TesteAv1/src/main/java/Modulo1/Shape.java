package Modulo1;

public interface Shape extends Comparable<Shape> {

    double distToOrigin();

    double area();

    double perimeter();

    Shape resize(double factor);
}