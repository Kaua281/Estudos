package JavaAula14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite x: ");
            int x = scanner.nextInt();
            int y = 100 / x;
            System.out.println("Resultado: "+y);

        } catch (ArithmeticException e) {
            System.out.println("Operação inválida");
            System.out.println("\nDetalhes do erro: " + e.getMessage());
        
        } catch (InputMismatchException e) {
            System.out.println("Formato Inválido");
            System.out.println("Detalhes do erro: " + e.getMessage());
        
        }finally {
            System.out.println("Conexão Estabelecida");
        }
        scanner.close();
        
    }
}
