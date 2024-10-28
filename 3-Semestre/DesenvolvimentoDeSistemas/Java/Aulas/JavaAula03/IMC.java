import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        double Imc = peso/(altura*altura);
        System.out.printf("Seu IMC é de : "+ "%.2f", Imc);

        scanner.close();
    }
}
