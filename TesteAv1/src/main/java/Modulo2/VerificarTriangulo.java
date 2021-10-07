
package Modulo2;


public class VerificarTriangulo {
    
    public static String verificaTriangulo(int lado1, int lado2, int lado3) {
        
        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
            
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                return "Triangulo Equilátero";
                
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                return "Triangulo Isósceles";
                
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                return "Triangulo Escaleno";
            }
            
        } else {
            return "Não é um Triangulo";
        }
        
        return null;
    }
    
}
