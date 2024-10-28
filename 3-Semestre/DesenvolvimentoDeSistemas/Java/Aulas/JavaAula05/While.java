/*
1- Faça um algoritmo que escreva 100 vezes  o texto: “Nunca mais vou  fazer bagunça”, utilizando uma  estrutura de repetição.
 */

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        while (n <= 100) {
            System.out.println(n+": Nunca mais vou fazer bagunça");
            n++;
        }
    }
}
