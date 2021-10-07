
package Modulo2;

import Modulo2.Fatorial;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestFatorial {
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void fatorialTest01() {
        
        int valorEperado = 120;
        int resultado = Fatorial.fatorial(5);
        
        assertEquals(valorEperado, resultado);
    }
    
    @Test
    public void fatorialTest02() {
        
        int valorEperado = 3628800;
        int resultado = Fatorial.fatorial(10);
        
        assertEquals(valorEperado, resultado);
    }

    @Test
    public void fatorialTest03() {

        int valorEperado = 40320;
        int resultado = Fatorial.fatorial(8);

        assertEquals(valorEperado, resultado);
    }
}
