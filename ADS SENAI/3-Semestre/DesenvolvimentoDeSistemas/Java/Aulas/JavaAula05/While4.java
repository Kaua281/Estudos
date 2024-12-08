/*
 Faça um programa em que o usuário digite 2 valores  e se a soma deles for maior que 15 o programa encerra, caso contrário, solicitanovas entradas ao usuário.
 */

import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Digite um número a: ");
            int a = scanner.nextInt();
            System.out.print("Digite um número b: ");
            int b = scanner.nextInt();
            if ((a + b) > 15) {
                System.out.println("A soma de " + a + " + " + b + " foi maior que 15 (" + (a + b) + ")");
                break;
            } else {
                System.out.println("A soma não alcançou um valor superior a 15");
            }
        }
        scanner.close();
    }
}
