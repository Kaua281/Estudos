import java.util.Scanner;

/**
 * 3- ESCREVA UM PROGRAMA QUE SOLICITE AO USUÁRIO UMA FRASE E EXIBA A QUANTIDADE DE VOGAIS NA FRASE. 
 */

public class VogaisNaFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        scanner.close();
        frase.toLowerCase();
        int Vogal = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                Vogal++;
            }
        }
        System.out.println("Exitem "+ Vogal+" vogais na frase: "+frase);
    
    }
    

}