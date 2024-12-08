//1-Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class ImparParOuNeutro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        scanner.close();
        if (n == 0) {
            System.out.println(n + " É um número neutro");
        }
        else if (n%2 == 0) {
            System.out.println(n+" É um número par");

         }
        else {
            System.out.println(n+" É um número impar");
        }
    }
    
}