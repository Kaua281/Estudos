//3-Crie um programa Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "São Múltiplos" ou "Não sãoMúltiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número a: ");
        int nA = scanner.nextInt();
        System.out.print("Digite um número b: ");
        int nB = scanner.nextInt();
        scanner.close();
        if (nA < nB) {
            if (nB % nA == 0) {
                System.out.println(nB + " é multiplo de " + nA);
            } else {
                System.out.println(nB+" não é multiplo de "+ nA);
            }
        } else if (nB < nA) {
            if (nA % nB == 0) {
                System.out.println(nA + " é multiplo de " + nB);
            } else {
                System.out.println(nA + " não é multiplo de " + nB);
            }
        }
        
    }
}
