import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número n: ");
        int n = scanner.nextInt();
        scanner.close();
        int x = 0;
        for (int i = 0; i <= n; i++) {
            x += i;
        }
        System.out.println("A soma de todos os valores de 1 a "+n+" é igual a "+x);
    }
}
