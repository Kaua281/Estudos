/*
2-Faça um programa em que o usuário  digite diversos números positivos, Se digitar um número negativo o programa termina
 */

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        int n = 1;
        Scanner scanner = new Scanner(System.in);
        while (n >= 0 ) {
            System.out.print("Digite um número: ");
            n = scanner.nextInt();
        }
        scanner.close();
    }    
}
