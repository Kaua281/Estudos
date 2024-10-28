import java.util.Scanner;

public class calculoTrabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a força aplicada(F): ");
        double F = scanner.nextDouble();
        System.out.print("Digite a distancia D(m): ");
        double D = scanner.nextDouble();
        double T = F * D;
        System.out.println("O trabalho realizado é de "+ T);

        scanner.close();
    }
}