/**
 * Array01
 */
public class Array01 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        for (int i = 1; i <= 5; i++) {
            numeros[i-1] = i;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    
}