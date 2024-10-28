//ESCREVA UM PROGRAMA QUE EXIBA OS NÚMERO PARES DE 1  A 50 E O ÍMPARES DE 51 A 100 UTILIZANDO O LAÇO DE REPETIÇÃO WHILE.

public class ParesImpares {
    public static void main(String[] args) {
        int x = 0;
        while (x <= 100) {
            if (x % 2 == 0 && x <= 50) {
                System.out.println(x);
            } else if (x % 2 != 0 && x > 50) {
                System.out.println(x);
            }
            x++;
        }

    }
    
    
    
}