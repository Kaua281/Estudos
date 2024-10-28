import java.util.Scanner;

public class MaiorOuMenorDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.close();
        if (idade < 18) {
            System.out.println("Você não é maior de idade");
        }
        else {
            System.out.println("Você é maior de idade");
        }
    }
}
