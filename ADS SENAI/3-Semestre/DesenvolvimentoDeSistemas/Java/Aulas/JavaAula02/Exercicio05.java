package JavaAula02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String x = scanner.nextLine();
        System.out.print("Digite outra frase: ");
        String y = scanner.nextLine();
        scanner.close();
        System.out.println("A concatenação das frases é\n" +(x+" "+y));
    }
}
