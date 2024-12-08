import java.util.Scanner;

/**
 * 5-ESCREVA UM PROGRAMA QUE LEIA UMA SEQUÊNCIA DE CARACTERES E INDIQUE SE A MESMA É UM PALÍDROMO OU NÃO
 */
public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        scanner.close();
        String fraseRevertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseRevertida += frase.charAt(i);
        }
        if (fraseRevertida.equals(frase)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }
    
    }
}
