import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        while (n >= 0) {
            System.out.print("Digite um número: ");
            n = scanner.nextInt();
        }
        scanner.close();
    }
}
