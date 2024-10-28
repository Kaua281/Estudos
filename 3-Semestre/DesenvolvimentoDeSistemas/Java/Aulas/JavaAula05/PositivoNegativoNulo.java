/*Elaborar um programa que permita ler um número a partir do teclado, e apresentar a indicação de que é positivo, negativo ou nulo.
 Entradas: Num 
Saídas: mensagens Descrição do problema: 
Se N = 0 então  N é nulo
 Se N > 0 então  N é positivo; 
senão  N é negativo */

import java.util.Scanner;

public class PositivoNegativoNulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int Num = scanner.nextInt();
        scanner.close();
        if (Num == 0) {
            System.out.println("O número "+Num+" é nulo");
        } else if (Num < 0) {
            System.out.println("O número "+Num+" é negativo");
        } else {
            System.out.println("O número "+Num+" é positivo");
        }
    }
}
