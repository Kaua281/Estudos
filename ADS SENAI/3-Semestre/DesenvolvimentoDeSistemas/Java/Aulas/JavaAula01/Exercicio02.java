package JavaAula01;

import java.util.Locale;

public class Exercicio02 {
    public static void main(String[] args) {
        final double numero = 10.37584;
        System.out.println(numero);
        System.out.printf("%2f%n",numero);
        System.out.printf("%4f%n",numero);
        Locale.setDefault(Locale.US);
        System.out.printf("%4f%n",numero);
    
        System.out.println("Resultado = "+numero+" Metros");
        System.out.printf("Resultado = %.2f metros%n", numero);
    
    }
}
