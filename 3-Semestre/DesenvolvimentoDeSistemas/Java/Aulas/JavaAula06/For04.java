import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double x = scanner.nextDouble();
        System.out.print("Digite a operação ( +, -, *, / ): ");
        String op = scanner.next();
        scanner.close();
        for (int i = 1; i < 11; i++) {
            if (op.equals("+")) {
                System.out.printf("\n"+ x + " + " + i + " = " + "%.2f", (x + i));
            } else if (op.equals("-")) {
                System.out.printf("\n"+ x + " - " + i + " = " + "%.2f", (x - i));
            } else if (op.equals("*")) {
                System.out.printf("\n"+ x + " * " + i + " = " + "%.2f", (x * i));
            } else if (op.equals("/")) {
                System.out.printf("\n"+ x + " / " + i + " = " + "%.2f", (x / i));
            }
        }
    }
}
