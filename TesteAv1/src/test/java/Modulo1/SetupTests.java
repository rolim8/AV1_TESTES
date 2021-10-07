package Modulo1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SetupTests {

    Shape circle1,circle2,circle3;
    Shape rect1,rect2;

    @Before
    public void setup() {
        circle1 = new Circle(3,4,5);
        circle2 = new Circle(10.32,10.43,10);
        circle3 = new Circle(20);

        rect1 = new Rectangle(5,6,2.5,2);
        rect2 = new Rectangle(2,3,10,10);
    }

    @Test
    public void testAreasOfOriginalObjects(){
        Assert.assertEquals(2*Math.PI*5,circle1.perimeter(),0.001);
        Assert.assertEquals(2*Math.PI*10,circle2.perimeter(),0.001);
        Assert.assertEquals(2*Math.PI*20,circle3.perimeter(),0.001);

        Assert.assertEquals(9,rect1.perimeter(),0.001);
        Assert.assertEquals(40,rect2.perimeter(),0.001);
    }

}