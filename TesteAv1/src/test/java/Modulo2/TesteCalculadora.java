package Modulo2;

import Modulo2.Calculadora;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteCalculadora {
    @Test
    public void testarsomar(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+1+3");
        assertEquals(5,soma);
    }

    @Test
    public void testasomar2(){
        Calculadora calc = new Calculadora();
        int soma1 = calc.somar02("1+3+5");
        assertEquals(10,soma1);
    }

    @Test
    public void testasomar3(){
        Calculadora calc = new Calculadora();
        int soma3 = calc.somar03("75");
        assertEquals(100,soma3);
    }

    @Test
    public void testasomar4(){
        Calculadora calc = new Calculadora();
        int soma4 = calc.somar04("50");
        assertEquals(95,soma4);
    }

}
