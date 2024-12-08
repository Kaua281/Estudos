package JavaAula14;

import java.util.Scanner;

public class TryCatch5 {
    public static void main(String[] args) {
        int[] array = {0 ,1, 2, 3 , 4, 5};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n +""+ array);
        try {
            System.out.println("Elemento no índice ");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fora dos limites do array.");

        }
        scanner.close();

        
    }
}
