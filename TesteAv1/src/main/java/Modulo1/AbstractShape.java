package Modulo1;

public abstract class AbstractShape implements Shape {
    protected Point2D reference;

    protected AbstractShape(Point2D reference) {
        this.reference = reference;
    }

    @Override
    public double distToOrigin() {
        return reference.dist(new Point2D(0, 0));
    }


    @Override
    public int compareTo(Shape s) {
        double areaThis = this.area();
        double areaOther = s.area();

        return Double.compare(areaThis, areaOther);

//        if (areaThis < areaOther) {
//            return -1;
//        } else if (areaOther < areaThis) {
//            return 1;
//        } else {
//            return 0;
//        }
    }

    protected boolean equalsCircle(Circle other) {
        return false; //by default "this" shape is not equal to a circle
    }

    protected boolean equalsRectangle(Rectangle other) {
        return false; //by default "this" shape is not equal to a rectangle
    }
}
