package Modulo1;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestResizes extends SetupTests {

    @Test
    public void testCircleResizes() {
        Shape resizedCircle1,resizedCircle2,resizedCircle3;

        resizedCircle1 = circle1.resize(2.5);
        resizedCircle2 = circle2.resize(0);
        resizedCircle3 = circle3.resize(10);

        assertEquals(2.5*circle1.area(),resizedCircle1.area(),0.001);
        assertEquals(0*circle2.area(),resizedCircle2.area(),0.001);
        assertEquals(10*circle3.area(),resizedCircle3.area(),0.001);

        testAreasOfOriginalObjects();
    }

    @Test
    public void testRectResizes() {
        Shape resizedRect1, resizedRect2;

        resizedRect1 = rect1.resize(12.5);
        resizedRect2 = rect2.resize(0.001);

        assertEquals(12.5*rect1.area(),resizedRect1.area(),0.001);
        assertEquals(0.001*rect2.area(),resizedRect2.area(),0.001);

        testAreasOfOriginalObjects();
    }

}
