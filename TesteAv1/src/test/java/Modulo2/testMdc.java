package Modulo2;

import Modulo2.MathUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class testMdc {
    @Test
    public void tesMdc(){
        int a =6;
        int b =3;
        int esperado =3;
        MathUtil.mdc(a,b);
        int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado,obtido);
    }

    @Test
    public  void testMdc1(){
        int a=9;
        int b=3;
        int esperado =3;
        int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado,obtido);
    }

    @Test
    public  void testMdc2(){
        int a=6;
        int b=2;
        int esperado =2;
        int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado,obtido);
    }



}
