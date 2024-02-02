package JavaAula02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        String x;
        x = scanner.next();
        
        Integer y;
        y = scanner.nextInt();
        
        double z;
        z = scanner.nextDouble();
        scanner.close();

        System.out.println("Dados digitados: ");
         
        Locale.setDefault(Locale.US);
        
        System.out.println(x);
        System.out.printf("%4f%n",y);
        System.out.printf("%4f%n",z);
                
    }
}
