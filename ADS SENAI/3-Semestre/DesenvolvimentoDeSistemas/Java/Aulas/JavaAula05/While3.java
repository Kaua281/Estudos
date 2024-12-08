import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite o nome do professor mais fofo do senai: ");
            String prof = scanner.nextLine();
            if (prof.equals("Anderson")) {
                System.out.println("Acertoou");
                break;
            } 
        }
        scanner.close();
    }
}
