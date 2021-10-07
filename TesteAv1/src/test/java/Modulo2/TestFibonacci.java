
package Modulo2;

import Modulo2.Fibonacci;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestFibonacci {
    
    // TODO add test methods here.

    @Test
    public void fibonacciTest01() {
        
        int valorEperado =8 ;
        int resultado = Fibonacci.fibonacci(6);
        
        assertEquals(valorEperado, resultado);
    }
    
    @Test
    public void fibonacciTest02() {
        
        int valorEperado = 55;
        int resultado = Fibonacci.fibonacci(10);
        
        assertEquals(valorEperado, resultado);
    }
    
    @Test
    public void fibonacciTest03() {
        
        int valorEperado = 89;
        int resultado = Fibonacci.fibonacci(11);
        
        assertEquals(valorEperado, resultado);
    }
    @Test
    public void fibonacciTest04() {

        int valorEperado = 1;
        int resultado = Fibonacci.fibonacci(1);

        assertEquals(valorEperado, resultado);
    }
    @Test
    public void fibonacciTest05() {

        int valorEperado = 2;
        int resultado = Fibonacci.fibonacci(3);

        assertEquals(valorEperado, resultado);
    }


}
