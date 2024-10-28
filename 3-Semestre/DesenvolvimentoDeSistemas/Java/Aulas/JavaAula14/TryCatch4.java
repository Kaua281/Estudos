package JavaAula14;



public class TryCatch4 {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        int indice = 5;
        
        try {
            System.out.println("Elemento no índice "+indice+": "+array[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fora dos limites do array.");
        
        }

        
    }
}
