package Modulo1;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDistanceFromOrigin extends SetupTests {

    @Test
    public void testDistanceFromOrigin() {
        Assert.assertEquals(Math.sqrt(3*3+4*4),
                circle1.distToOrigin(),0.001);

        Assert.assertEquals(Math.sqrt(10.32*10.32+10.43*10.43),
                circle2.distToOrigin(),0.001);

        Assert.assertEquals(0,circle3.distToOrigin(),0.001);

        Assert.assertEquals(Math.sqrt(5*5+6*6),
                rect1.distToOrigin(),0.001);

        Assert.assertEquals(Math.sqrt(2*2+3*3),
                rect2.distToOrigin(),0.001);
    }

}
