import java.util.Scanner;

public class MenorMaiorOuIgual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número x: ");
        int x = scanner.nextInt();
        System.out.print("Digite um número y: ");
        int y = scanner.nextInt();
        scanner.close();
        if (x < y) {
            System.out.println("O número "+x+" é menor que "+y);
        } else if (y < x) {
            System.out.println("O número " + y + " é menor que " + x);
        }
        else {
            System.out.println("Os números são iguais");
        }
    }
}
