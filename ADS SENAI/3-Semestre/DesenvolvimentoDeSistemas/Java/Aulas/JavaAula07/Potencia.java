import java.util.Scanner;

/**
 * 2-ESCREVA UM PROGRAMA QUE CALCULA EXIBA O VALOR DA POTÊNCIA DE UM NÚMERO INFORMADO PELO USUÁRIO ELEVADO A UM EXPOENTE TAMBÉM INFORMADO PELO USUÁRIO, UTILIZANDO LAÇOS DE REPETIÇÃO.
 */
public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da base: ");
        double base = scanner.nextDouble();
        System.out.print("Digite o valor do expoente: ");
        double expoente = scanner.nextDouble();
        scanner.close();
        double resultado = 1;
        
        for (int i = 1; i < expoente+1; i++) {
            resultado *= base;
        }

        System.out.println(base+"^"+expoente+" = "+ resultado);
    }
    
}