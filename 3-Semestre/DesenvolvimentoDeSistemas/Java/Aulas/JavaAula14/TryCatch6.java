package JavaAula14;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TryCatch6 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Aluno\\Downloads\\teste.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.err.println("ERRO: "+ e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
