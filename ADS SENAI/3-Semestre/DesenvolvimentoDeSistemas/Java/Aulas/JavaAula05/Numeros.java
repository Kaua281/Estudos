/*
Desenvolva um algoritmo que: –Leia 4 números;
–Calcule o quadrado de cada um;
– Some todos os quadrados; 
– Apresente o resultado.
*/

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número a: ");
        int a = scanner.nextInt();
        System.out.print("Digite um número b: ");
        int b = scanner.nextInt();
        System.out.print("Digite um número c: ");
        int c = scanner.nextInt();
        System.out.print("Digite um número d: ");
        int d = scanner.nextInt();
        scanner.close();
        int resultadoFinal = (a * a) + (b * b) + (c * c) + (d * d);
        System.out.println("A soma dos quadrados dos números digitados é "+resultadoFinal);
        
    }
}
