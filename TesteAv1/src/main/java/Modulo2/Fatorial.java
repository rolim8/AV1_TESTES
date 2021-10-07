
package Modulo2;


public class Fatorial {
    
    public static int fatorial(int valor){
        
        int valorFatorial = valor;
        int resultado = valorFatorial;
        
        while (valorFatorial > 1) {            
            resultado = resultado * (valorFatorial - 1);
            valorFatorial--;
        }
        
        return resultado;
    }
    
}
