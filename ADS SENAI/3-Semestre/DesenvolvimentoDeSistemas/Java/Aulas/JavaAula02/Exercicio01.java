package JavaAula02;


import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char x = scanner.next().charAt(0);
        scanner.close();
        System.out.printf("Você digitou " + x);
    }

}
