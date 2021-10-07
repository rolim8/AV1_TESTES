package Modulo1;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestObjectData extends SetupTests {

    @Test
    public void testCircleObjectData() {
        Assert.assertEquals("Circle: center (3,000,4,000) radius 5,000",
                circle1.toString());
        Assert.assertEquals("Circle: center (10,320,10,430) radius 10,000",
                circle2.toString());
        Assert.assertEquals("Circle: center (0,000,0,000) radius 20,000",
                circle3.toString());
    }


    @Test
    public void testRectObjectData() {
        Assert.assertEquals("Rectangle: LL corner (5,000,6,000) width 2,500 height 2,000",
                rect1.toString());
        Assert.assertEquals("Rectangle: LL corner (2,000,3,000) width 10,000 height 10" + ",000",
                rect2.toString());
    }

}
