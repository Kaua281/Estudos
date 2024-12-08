import java.util.ArrayList;

public class Array07 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("Elementos do ArrayList de inteiros:");
        for (Integer n : numeros) {
            System.out.print(" "+n);
        }
        int tamanho = numeros.size();
        System.err.println("\nO arraylist tem: " + tamanho + " elementos");
        
        boolean existeElemento30 = numeros.contains(30);
        System.out.println("Existe o número 30? " + existeElemento30);
        numeros.remove(Integer.valueOf(30));
        System.out.println("Após a remoção do elemento 30: ");
        for (Integer n : numeros) {
            System.out.println(n);
        }
    }   
}
