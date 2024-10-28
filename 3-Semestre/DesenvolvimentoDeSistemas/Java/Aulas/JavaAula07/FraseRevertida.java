import java.util.Scanner;

/**
 * 4-ESCREVA UM PROGRAMA QUE SOLICITE AO USUÁRIO UMA FRASE E EXIBA A FRASE DE TRÁS PARA FRENTE
 */
public class FraseRevertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        scanner.close();
        for (int i = frase.length() - 1; i >= 0 ; i--) {
            char letra = frase.charAt(i);
            System.out.print(letra);
        }
    }
    
}
