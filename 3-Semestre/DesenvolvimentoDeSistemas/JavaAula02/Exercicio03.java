package JavaAula02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        double y = scanner.nextDouble();
        System.out.print("Digite outro número: ");
        Double x = scanner.nextDouble();
        scanner.close();

        System.out.printf(
                "A soma de " + x + "+" + y + " = " + (y + x) + "\nA subtração de " + x + "-" + y + " = " + (y - x)
                        + "\nA multiplicação de de " + x + "*" + y + " = " + (y * x) + "\nA divisão de " + y + "/" + x
                        + " = " + (String.format("%.2f", (y / x))));
    }

}
