
package Modulo2;

public class Fibonacci {
    
    public static int fibonacci(int valor){
        
        if (valor <2) {

            return valor;
        } else {
            return fibonacci(valor - 1) + fibonacci(valor - 2);
        }

    }
    
}
