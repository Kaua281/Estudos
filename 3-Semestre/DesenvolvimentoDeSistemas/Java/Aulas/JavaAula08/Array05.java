import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos do vetor: ");
        int quantidade = scanner.nextInt();
        int[] numeros = new int[quantidade];

        System.out.println("Digite os elementos do vetor: ");        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Elemento de indice[" + i + "]+: ");
            numeros[i] = scanner.nextInt();
        }
        scanner.close();
        int somaTotal = 0;
        for (int i = 0; i < numeros.length; i++) {
            somaTotal += numeros[i];
        }
        double media = somaTotal / numeros.length;
        System.out.println("A média dos elementos do array é "+ media);
    }
}

