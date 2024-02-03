package JavaAula02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite algo: ");
        String x = scanner.next();
        
        System.out.print("Digite um número y: ");
        int y = scanner.nextInt();

        System.out.print("Digite um número z: ");
        double z = scanner.nextDouble();
        scanner.close();

        System.out.println("Dados digitados: ");
         
        Locale.setDefault(Locale.US);
        
        System.out.println(x);
        System.out.printf("%d%n",y);
        System.out.printf("%.2f%n",z);
                
    }
}
