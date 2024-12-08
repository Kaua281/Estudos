/*Crie uma classe TesteArrayListNumero que possui
um método main.
2. Dentro do main crie um ArrayList de Integer.
3. Adicione 10 números informados pelo usuário.
4. Se o usuário tiver digitado os números 10, 100 ou
1000 mostre uma mensagem informando que ele
ganhou um bônus de R$ 50,00.*/

import java.util.ArrayList;
import java.util.Scanner;

public class ExArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números:");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite o elemento de indice[" + i + "]");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        scanner.close();
        for (Integer n : numeros) {
            if ((n == 10) || (n == 100) || (n == 1000)) {
                System.out.println("Você ganhou um bônus de R$50,00");
            }    
        }

    }
}
