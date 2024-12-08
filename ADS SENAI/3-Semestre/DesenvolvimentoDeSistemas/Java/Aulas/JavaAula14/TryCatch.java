package JavaAula14;

public class TryCatch {
    public static void main(String[] args) {
        int x = 0;

        try {
            int y = 100 / x;
            System.out.println("Resultado: " + y);
            
            
        } catch (ArithmeticException e) {
            System.out.println("Operação inválida");
            System.out.println("\nDetalhes do erro: "+e.getMessage());
        }
    }
}
