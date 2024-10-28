package JavaAula14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Digite o númerador x: ");
            int x = scanner.nextInt();
            System.out.print("Digite o denominador y: ");
            int y = scanner.nextInt();
            int z = x / y;
            System.out.println("Resultado: "+z);

        } catch (ArithmeticException e) {
            System.out.println("Operação inválida");
            System.out.println("\nDetalhes do erro: " + e.getMessage());
        
        } catch (InputMismatchException e) {
            System.out.println("Formato Inválido");
            System.out.println("Detalhes do erro: " + e.getMessage());
    
        }
        scanner.close();
        
    }
}
