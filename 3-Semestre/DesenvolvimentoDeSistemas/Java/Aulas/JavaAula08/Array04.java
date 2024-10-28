import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos do vetor: ");
        int quantidade = scanner.nextInt();
        int[] numeros = new int[quantidade];

        System.out.println("Digite os elementos do vetor: ");        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Elemento de indice [" + i + "] :");
            numeros[i] = scanner.nextInt();
        }
        scanner.close();
        int maior = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior elemento do array é "+ maior);
    }
}
