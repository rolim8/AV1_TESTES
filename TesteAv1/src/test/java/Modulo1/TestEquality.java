package Modulo1;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestEquality extends SetupTests {

    @Test
    public void testCircleEquality() {
        //Assert True
        assertEquals(circle1, circle1);
        assertEquals(circle2, circle2);
        assertEquals(circle3, circle3);

        //Assert False
        assertNotEquals(circle1, circle2);
        assertNotEquals(circle2, circle1);
        assertNotEquals(circle1, circle3);
        assertNotEquals(circle3, circle1);
        assertNotEquals(circle3, circle2);
        assertNotEquals(circle2, circle3);
    }

    @Test
    public void testRectEquality() {
        //Assert True
        assertEquals(rect1, rect1);
        assertEquals(rect2, rect2);

        //Assert False
        assertNotEquals(rect1, rect2);
        assertNotEquals(rect2, rect1);
    }

}
