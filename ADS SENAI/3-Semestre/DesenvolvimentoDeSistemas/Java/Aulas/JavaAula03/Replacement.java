import java.util.Scanner;

public class Replacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        scanner.close();
        System.out.println(frase.replace("a", "e"));
    }
}
