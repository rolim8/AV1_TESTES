
package Modulo2;

import Modulo2.Cupo;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestCupo {
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void cupoTest01() {
    
        int valorEperado = 25;
        int resultado = Cupo.ladoArea(5);
        
        assertEquals(valorEperado, resultado);
    }
    
    @Test
    public void cupoTest02() {
    
        int valorEperado = 100;
        int resultado = Cupo.latealArea(5);
        
        assertEquals(valorEperado, resultado);
    }
    
    @Test
    public void cupoTest03() {
    
        int valorEperado = 150;
        int resultado = Cupo.totalArea(5);
        
        assertEquals(valorEperado, resultado);
    }
    
    @Test
    public void cupoTest04() {
    
        int valorEperado = 125;
        int resultado = Cupo.volumeArea(5);
        
        assertEquals(valorEperado, resultado);
    }
    
    @Test
    public void cupoTest05() {
    
        int valorEperado = 36;
        int resultado = Cupo.ladoArea(6);
        
        assertEquals(valorEperado, resultado);
    }
    
    @Test
    public void cupoTest06() {
    
        int valorEperado = 216;
        int resultado = Cupo.volumeArea(6);
        
        assertEquals(valorEperado, resultado);
    }
}
