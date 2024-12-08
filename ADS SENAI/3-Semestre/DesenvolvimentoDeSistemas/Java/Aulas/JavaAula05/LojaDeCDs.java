/*
 Em uma loja e CD ́s existem apenas quatro tipos de preços que estão associados a cores. Assim os CD ́s que ficam na loja não são marcados por preços e sim por cores. Desenvolva o algoritmo que a partir a entrada da cor o software mostre o preço. A loja está atualmente com a seguinte tabela de preços.
*/

import java.util.Scanner;

public class LojaDeCDs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("##--      Menu de cores    --##\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Vermelho          |\n");
        System.out.print("| Opção 2 - Azul              |\n");
        System.out.print("| Opção 3 - Verde             |\n");
        System.out.print("| Opção 4 - Amarelo           |\n");
        System.out.print("| Opção 5 - Branco            |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite o número de uma opção: ");
        int opcao = scanner.nextInt();
        scanner.close();

        switch (opcao) {
            case 1:
                System.out.println("O CD vermelho custa: R$149,90");
                break;
            case 2:
                System.out.println("O CD azul custa: R$154,46");
                break;
            case 3:
                System.out.println("O CD verde custa: R$79,90");
                break;
            case 4:
                System.out.println("O CD Amarelo custa: R$39,90");
                break;
            case 5:
                System.out.println("O CD branco custa: R$199,90");
            break;
            default:
                System.out.println("Você digitou um número inválido");
                break;
        }
    
    
    }    
}
