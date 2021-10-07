
package Modulo2;

import Modulo2.VerificarTriangulo;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestVerificarTriangulo {
    
    // TODO add test methods here.

    
    @Test
    public void testVerificaTriangulo01() {
        
        String resultadoEsperado = "True";
        String resultado = VerificarTriangulo.verificaTriangulo(5, 6, 10);
        if(resultado.equals("Triangulo Escaleno")){
            resultado = "True";
        }


    assertEquals(resultadoEsperado, resultado);
}
   @Test
    public void testVerificaTriangulo02() {
        
        String resultadoEsperado = "False";
        String resultado = VerificarTriangulo.verificaTriangulo(5, 6, 20);
        if(resultado.equals("Não é um Triangulo")){
            resultado = "False";
        }
        
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testVerificaTriangulo03() {

        String resultadoEsperado = "Não é um Triangulo";        
        String resultado = VerificarTriangulo.verificaTriangulo(5, 6, 20);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testVerificaTriangulo04() {
        
        String resultadoEsperado = "Triangulo Equilátero";
        String resultado = VerificarTriangulo.verificaTriangulo(6, 6, 6);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testVerificaTriangulo05() {
        
        String resultadoEsperado = "Triangulo Isósceles";
        String resultado = VerificarTriangulo.verificaTriangulo(6, 6, 10);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testVerificaTriangulo06() {
        
        String resultadoEsperado = "Triangulo Isósceles";
        String resultado = VerificarTriangulo.verificaTriangulo(6, 10, 6);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testVerificaTriangulo07() {
        
        String resultadoEsperado = "Triangulo Isósceles";
        String resultado = VerificarTriangulo.verificaTriangulo(10, 6, 6);
        assertEquals(resultadoEsperado, resultado);
    }
    
    @Test
    public void testVerificaTriangulo08() {
        
        String resultadoEsperado = "Triangulo Escaleno";
        String resultado = VerificarTriangulo.verificaTriangulo(6, 10, 8);
        assertEquals(resultadoEsperado, resultado);
    }
}
