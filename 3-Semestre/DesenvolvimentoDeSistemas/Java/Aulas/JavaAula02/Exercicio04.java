package JavaAula02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digte um número: ");
        double x = scanner.nextDouble();
        System.out.print("Digte outro número: ");
        double y = scanner.nextDouble();
        scanner.close();
        System.out.println("A média aritmética desses dois números é = " + (x + y) / 2);
    }

}
