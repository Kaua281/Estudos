import java.util.Scanner;

/**
  * 1-ESCREVA UM PROGRAMA QUE SOLICITE A USUÁRIO UM NÚMERO E EXIBA OS SEUS DIVISORES.
  */
public class Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número x: ");
        int x = scanner.nextInt();
        scanner.close();
        System.out.print(x+" é divisivel por");
        for (int i = 1; i < x+1; i++) {
            if (x % i == 0) {
                System.out.print(" "+i);
            }
        }
    }    
    
}