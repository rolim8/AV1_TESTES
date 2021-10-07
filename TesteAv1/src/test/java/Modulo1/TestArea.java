package Modulo1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestArea extends SetupTests {

    @Test
    public void testCircleArea() {
        assertEquals(Math.PI*25,circle1.area(),0.001);
        assertEquals(Math.PI*100,circle2.area(),0.001);
        assertEquals(Math.PI*400,circle3.area(),0.001);
    }

    @Test
    public void testRectArea() {
        assertEquals(5,rect1.area(),0.001);
        assertEquals(100,rect2.area(),0.001);
    }

}
